// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceMetricsResponseBody</p>
 */
public class DescribeDBInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBInstanceMetricsResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private java.util.List < Items> items; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * An array consisting of the enhanced monitoring metrics that are enabled for the instance.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of enhanced monitoring metrics that are enabled for the instance.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstanceMetricsResponseBody build() {
            return new DescribeDBInstanceMetricsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Dimension")
        private String dimension;

        @NameInMap("GroupKey")
        private String groupKey;

        @NameInMap("GroupKeyType")
        private String groupKeyType;

        @NameInMap("Method")
        private String method;

        @NameInMap("MetricsKey")
        private String metricsKey;

        @NameInMap("MetricsKeyAlias")
        private String metricsKeyAlias;

        @NameInMap("SortRule")
        private Integer sortRule;

        @NameInMap("Unit")
        private String unit;

        private Items(Builder builder) {
            this.description = builder.description;
            this.dimension = builder.dimension;
            this.groupKey = builder.groupKey;
            this.groupKeyType = builder.groupKeyType;
            this.method = builder.method;
            this.metricsKey = builder.metricsKey;
            this.metricsKeyAlias = builder.metricsKeyAlias;
            this.sortRule = builder.sortRule;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return groupKey
         */
        public String getGroupKey() {
            return this.groupKey;
        }

        /**
         * @return groupKeyType
         */
        public String getGroupKeyType() {
            return this.groupKeyType;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return metricsKey
         */
        public String getMetricsKey() {
            return this.metricsKey;
        }

        /**
         * @return metricsKeyAlias
         */
        public String getMetricsKeyAlias() {
            return this.metricsKeyAlias;
        }

        /**
         * @return sortRule
         */
        public Integer getSortRule() {
            return this.sortRule;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String description; 
            private String dimension; 
            private String groupKey; 
            private String groupKeyType; 
            private String method; 
            private String metricsKey; 
            private String metricsKeyAlias; 
            private Integer sortRule; 
            private String unit; 

            /**
             * The description of the enhanced monitoring metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The category of the enhanced monitoring metric. Valid values:
             * <p>
             * 
             * *   **os**: OS metric
             * *   **db**: database metric
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * The key of the group to which the enhanced monitoring metric belongs.
             */
            public Builder groupKey(String groupKey) {
                this.groupKey = groupKey;
                return this;
            }

            /**
             * The name of the group to which the enhanced monitoring metric belongs.
             */
            public Builder groupKeyType(String groupKeyType) {
                this.groupKeyType = groupKeyType;
                return this;
            }

            /**
             * The method that is used to aggregate the monitoring data of the enhanced monitoring metric. Valid values:
             * <p>
             * 
             * *   **avg**: The system calculates the average value of the enhanced monitoring metric.
             * *   **min**: The system calculates the minimum value of the enhanced monitoring metric.
             * *   **max**: The system calculates the maximum value of the enhanced monitoring metric.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The key of the enhanced monitoring metric.
             */
            public Builder metricsKey(String metricsKey) {
                this.metricsKey = metricsKey;
                return this;
            }

            /**
             * The alias of the enhanced monitoring metric.
             */
            public Builder metricsKeyAlias(String metricsKeyAlias) {
                this.metricsKeyAlias = metricsKeyAlias;
                return this;
            }

            /**
             * The serial number of the enhanced monitoring metric.
             */
            public Builder sortRule(Integer sortRule) {
                this.sortRule = sortRule;
                return this;
            }

            /**
             * The unit of the enhanced monitoring metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
