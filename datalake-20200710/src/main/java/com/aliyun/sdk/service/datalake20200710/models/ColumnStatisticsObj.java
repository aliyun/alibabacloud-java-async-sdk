// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ColumnStatisticsObj} extends {@link TeaModel}
 *
 * <p>ColumnStatisticsObj</p>
 */
public class ColumnStatisticsObj extends TeaModel {
    @NameInMap("ColumnName")
    private String columnName;

    @NameInMap("ColumnStatisticsData")
    private ColumnStatisticsData columnStatisticsData;

    @NameInMap("ColumnType")
    private String columnType;

    private ColumnStatisticsObj(Builder builder) {
        this.columnName = builder.columnName;
        this.columnStatisticsData = builder.columnStatisticsData;
        this.columnType = builder.columnType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnStatisticsObj create() {
        return builder().build();
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return columnStatisticsData
     */
    public ColumnStatisticsData getColumnStatisticsData() {
        return this.columnStatisticsData;
    }

    /**
     * @return columnType
     */
    public String getColumnType() {
        return this.columnType;
    }

    public static final class Builder {
        private String columnName; 
        private ColumnStatisticsData columnStatisticsData; 
        private String columnType; 

        /**
         * ColumnName.
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * ColumnStatisticsData.
         */
        public Builder columnStatisticsData(ColumnStatisticsData columnStatisticsData) {
            this.columnStatisticsData = columnStatisticsData;
            return this;
        }

        /**
         * ColumnType.
         */
        public Builder columnType(String columnType) {
            this.columnType = columnType;
            return this;
        }

        public ColumnStatisticsObj build() {
            return new ColumnStatisticsObj(this);
        } 

    } 

    public static class ColumnStatisticsData extends TeaModel {
        @NameInMap("StatisticsData")
        private String statisticsData;

        @NameInMap("StatisticsType")
        private String statisticsType;

        private ColumnStatisticsData(Builder builder) {
            this.statisticsData = builder.statisticsData;
            this.statisticsType = builder.statisticsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnStatisticsData create() {
            return builder().build();
        }

        /**
         * @return statisticsData
         */
        public String getStatisticsData() {
            return this.statisticsData;
        }

        /**
         * @return statisticsType
         */
        public String getStatisticsType() {
            return this.statisticsType;
        }

        public static final class Builder {
            private String statisticsData; 
            private String statisticsType; 

            /**
             * StatisticsData.
             */
            public Builder statisticsData(String statisticsData) {
                this.statisticsData = statisticsData;
                return this;
            }

            /**
             * StatisticsType.
             */
            public Builder statisticsType(String statisticsType) {
                this.statisticsType = statisticsType;
                return this;
            }

            public ColumnStatisticsData build() {
                return new ColumnStatisticsData(this);
            } 

        } 

    }
}
