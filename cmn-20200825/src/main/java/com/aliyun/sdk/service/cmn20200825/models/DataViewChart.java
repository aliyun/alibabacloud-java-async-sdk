// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataViewChart} extends {@link TeaModel}
 *
 * <p>DataViewChart</p>
 */
public class DataViewChart extends TeaModel {
    @NameInMap("ChartType")
    private String chartType;

    @NameInMap("DataViewId")
    private String dataViewId;

    @NameInMap("DataViewSource")
    private String dataViewSource;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Grid")
    private String grid;

    private DataViewChart(Builder builder) {
        this.chartType = builder.chartType;
        this.dataViewId = builder.dataViewId;
        this.dataViewSource = builder.dataViewSource;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.grid = builder.grid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataViewChart create() {
        return builder().build();
    }

    /**
     * @return chartType
     */
    public String getChartType() {
        return this.chartType;
    }

    /**
     * @return dataViewId
     */
    public String getDataViewId() {
        return this.dataViewId;
    }

    /**
     * @return dataViewSource
     */
    public String getDataViewSource() {
        return this.dataViewSource;
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

    /**
     * @return grid
     */
    public String getGrid() {
        return this.grid;
    }

    public static final class Builder {
        private String chartType; 
        private String dataViewId; 
        private String dataViewSource; 
        private String gmtCreate; 
        private String gmtModified; 
        private String grid; 

        /**
         * ChartType.
         */
        public Builder chartType(String chartType) {
            this.chartType = chartType;
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
         * DataViewSource.
         */
        public Builder dataViewSource(String dataViewSource) {
            this.dataViewSource = dataViewSource;
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

        /**
         * Grid.
         */
        public Builder grid(String grid) {
            this.grid = grid;
            return this;
        }

        public DataViewChart build() {
            return new DataViewChart(this);
        } 

    } 

}
