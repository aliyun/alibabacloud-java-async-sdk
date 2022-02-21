// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ColumnStatistics} extends {@link TeaModel}
 *
 * <p>ColumnStatistics</p>
 */
public class ColumnStatistics extends TeaModel {
    @NameInMap("ColumnStatisticsDesc")
    private ColumnStatisticsDesc columnStatisticsDesc;

    @NameInMap("ColumnStatisticsObjList")
    private java.util.List < ColumnStatisticsObj > columnStatisticsObjList;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("IsStatsCompliant")
    private Boolean isStatsCompliant;

    private ColumnStatistics(Builder builder) {
        this.columnStatisticsDesc = builder.columnStatisticsDesc;
        this.columnStatisticsObjList = builder.columnStatisticsObjList;
        this.engine = builder.engine;
        this.isStatsCompliant = builder.isStatsCompliant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnStatistics create() {
        return builder().build();
    }

    /**
     * @return columnStatisticsDesc
     */
    public ColumnStatisticsDesc getColumnStatisticsDesc() {
        return this.columnStatisticsDesc;
    }

    /**
     * @return columnStatisticsObjList
     */
    public java.util.List < ColumnStatisticsObj > getColumnStatisticsObjList() {
        return this.columnStatisticsObjList;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return isStatsCompliant
     */
    public Boolean getIsStatsCompliant() {
        return this.isStatsCompliant;
    }

    public static final class Builder {
        private ColumnStatisticsDesc columnStatisticsDesc; 
        private java.util.List < ColumnStatisticsObj > columnStatisticsObjList; 
        private String engine; 
        private Boolean isStatsCompliant; 

        /**
         * ColumnStatisticsDesc.
         */
        public Builder columnStatisticsDesc(ColumnStatisticsDesc columnStatisticsDesc) {
            this.columnStatisticsDesc = columnStatisticsDesc;
            return this;
        }

        /**
         * ColumnStatisticsObjList
         */
        public Builder columnStatisticsObjList(java.util.List < ColumnStatisticsObj > columnStatisticsObjList) {
            this.columnStatisticsObjList = columnStatisticsObjList;
            return this;
        }

        /**
         * Engine for hive3+
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * IsStatsCompliant for hive3+
         */
        public Builder isStatsCompliant(Boolean isStatsCompliant) {
            this.isStatsCompliant = isStatsCompliant;
            return this;
        }

        public ColumnStatistics build() {
            return new ColumnStatistics(this);
        } 

    } 

}
