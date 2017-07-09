package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yccer on 2017/7/9.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省名称
    private int ProvinceCode;//省代号
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return ProvinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.ProvinceCode = provinceCode;
    }



}
