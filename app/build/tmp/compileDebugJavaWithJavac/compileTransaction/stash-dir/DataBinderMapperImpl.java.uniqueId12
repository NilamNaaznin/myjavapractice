package com.myjavapractice;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.myjavapractice.databinding.ActivityApicallBindingImpl;
import com.myjavapractice.databinding.ActivityGoToAllBindingImpl;
import com.myjavapractice.databinding.CustomPopupDialogBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAPICALL = 1;

  private static final int LAYOUT_ACTIVITYGOTOALL = 2;

  private static final int LAYOUT_CUSTOMPOPUPDIALOG = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myjavapractice.R.layout.activity_apicall, LAYOUT_ACTIVITYAPICALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myjavapractice.R.layout.activity_go_to_all, LAYOUT_ACTIVITYGOTOALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myjavapractice.R.layout.custom_popup_dialog, LAYOUT_CUSTOMPOPUPDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAPICALL: {
          if ("layout/activity_apicall_0".equals(tag)) {
            return new ActivityApicallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_apicall is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYGOTOALL: {
          if ("layout/activity_go_to_all_0".equals(tag)) {
            return new ActivityGoToAllBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_go_to_all is invalid. Received: " + tag);
        }
        case  LAYOUT_CUSTOMPOPUPDIALOG: {
          if ("layout/custom_popup_dialog_0".equals(tag)) {
            return new CustomPopupDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_popup_dialog is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_apicall_0", com.myjavapractice.R.layout.activity_apicall);
      sKeys.put("layout/activity_go_to_all_0", com.myjavapractice.R.layout.activity_go_to_all);
      sKeys.put("layout/custom_popup_dialog_0", com.myjavapractice.R.layout.custom_popup_dialog);
    }
  }
}
