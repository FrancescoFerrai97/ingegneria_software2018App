package francescoferrai.ingegneria_software2018app;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BindAdapterGeneral extends RecyclerView.Adapter<BindAdapterGeneral.CustomViewHolder> {

    private List<?> myModel;
    private int nameLayout;
    private int dataSourceVariable;
    private Map<Integer, Object> optionalVariables;
    private int position;

    public BindAdapterGeneral(List<?> objects, int nameLayout, int dataSourceVariable, Map<Integer, Object> optionalVariables) {
        this.myModel = objects;
        this.nameLayout = nameLayout;
        this.dataSourceVariable = dataSourceVariable;
        this.optionalVariables = optionalVariables;
        Log.d("RECYCLERVIEW", "objects size = " + getItemCount());
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), nameLayout, viewGroup, false);//capire se è meglio passare true o false
        return new CustomViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int position) {
        this.position = position;
        ViewDataBinding viewDataBinding = customViewHolder.getViewDataBinding();
        viewDataBinding.setVariable(dataSourceVariable, getItemAtPosition(position));
        if (optionalVariables != null) {
            Set<Integer> keys = optionalVariables.keySet();
            for (Integer key : keys) {
                viewDataBinding.setVariable(key, optionalVariables.get(key));

            }
        }
        viewDataBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return (myModel != null ? myModel.size() : 0);
    }

    public void setList(List<?> objects) {
        this.myModel = objects;
    }

    public Object getItemAtPosition(int position) {
        try {
            return myModel.get(position);
        } catch (Throwable t) {
            return null;
        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding mViewDataBinding;

        public CustomViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());

            mViewDataBinding = viewDataBinding;
//            mViewDataBinding.executePendingBindings();
        }

        public ViewDataBinding getViewDataBinding() {
            return mViewDataBinding;
        }
    }
}