// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataView} extends {@link TeaModel}
 *
 * <p>DataView</p>
 */
public class DataView extends TeaModel {
    @NameInMap("DataViewChartList")
    private java.util.List < DataViewChart > dataViewChartList;

    @NameInMap("DataViewDescription")
    private String dataViewDescription;

    @NameInMap("DataViewId")
    private String dataViewId;

    @NameInMap("DataViewName")
    private String dataViewName;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    private DataView(Builder builder) {
        this.dataViewChartList = builder.dataViewChartList;
        this.dataViewDescription = builder.dataViewDescription;
        this.dataViewId = builder.dataViewId;
        this.dataViewName = builder.dataViewName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataView create() {
        return builder().build();
    }

    /**
     * @return dataViewChartList
     */
    public java.util.List < DataViewChart > getDataViewChartList() {
        return this.dataViewChartList;
    }

    /**
     * @return dataViewDescription
     */
    public String getDataViewDescription() {
        return this.dataViewDescription;
    }

    /**
     * @return dataViewId
     */
    public String getDataViewId() {
        return this.dataViewId;
    }

    /**
     * @return dataViewName
     */
    public String getDataViewName() {
        return this.dataViewName;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    public static final class Builder {
        private java.util.List < DataViewChart > dataViewChartList; 
        private String dataViewDescription; 
        private String dataViewId; 
        private String dataViewName; 
        private String gmtCreate; 
        private String gmtModified; 

        /**
         * DataViewChartList.
         */
        public Builder dataViewChartList(java.util.List < DataViewChart > dataViewChartList) {
            this.dataViewChartList = dataViewChartList;
            return this;
        }

        /**
         * DataViewDescription.
         */
        public Builder dataViewDescription(String dataViewDescription) {
            this.dataViewDescription = dataViewDescription;
            return this;
        }

        /**
         * DataViewId.
         */
        public Builder dataViewId(String dataViewId) {
            this.dataViewId = dataViewId;
            return this;
        }

        /**
         * DataViewName.
         */
        public Builder dataViewName(String dataViewName) {
            this.dataViewName = dataViewName;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        public DataView build() {
            return new DataView(this);
        } 

    } 

}
