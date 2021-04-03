package com.adverse.foodorderkioskapp.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MealCategoriesResponseModel {

    @SerializedName("errorMsg")
    @Expose
    private String errorMsg;
    @SerializedName("errorStatus")
    @Expose
    private Boolean errorStatus;
    @SerializedName("categoryList")
    @Expose
    private List<MealCategoryModel> categoryList = null;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Boolean getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(Boolean errorStatus) {
        this.errorStatus = errorStatus;
    }

    public List<MealCategoryModel> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<MealCategoryModel> categoryList) {
        this.categoryList = categoryList;
    }

}