// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAvailableMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableMetricsResponseBody</p>
 */
public class DescribeAvailableMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeAvailableMetricsResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeAvailableMetricsResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.items = model.items;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1*****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Details of the Enhanced Monitoring metric.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5CD61041-35F7-10F7-BE94-33A48B221218</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of enhanced monitoring metrics that are available for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAvailableMetricsResponseBody build() {
            return new DescribeAvailableMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableMetricsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("GroupKey")
        private String groupKey;

        @com.aliyun.core.annotation.NameInMap("GroupKeyType")
        private String groupKeyType;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("MetricsKey")
        private String metricsKey;

        @com.aliyun.core.annotation.NameInMap("MetricsKeyAlias")
        private String metricsKeyAlias;

        @com.aliyun.core.annotation.NameInMap("SortRule")
        private Integer sortRule;

        @com.aliyun.core.annotation.NameInMap("Unit")
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.description = model.description;
                this.dimension = model.dimension;
                this.groupKey = model.groupKey;
                this.groupKeyType = model.groupKeyType;
                this.method = model.method;
                this.metricsKey = model.metricsKey;
                this.metricsKeyAlias = model.metricsKeyAlias;
                this.sortRule = model.sortRule;
                this.unit = model.unit;
            } 

            /**
             * <p>The description of the Enhanced Monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>OS CPU utilization, equal to the number of OS-consumed CPUs divided by the total number of CPUs</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The category of the Enhanced Monitoring metric. Valid values:</p>
             * <ul>
             * <li><strong>os</strong>: OS metric</li>
             * <li><strong>db</strong>: database metric</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>os</p>
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The key of the group to which the Enhanced Monitoring metric belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>os.cpu_usage</p>
             */
            public Builder groupKey(String groupKey) {
                this.groupKey = groupKey;
                return this;
            }

            /**
             * <p>The name of the group to which the Enhanced Monitoring metric belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU Utilization Rate</p>
             */
            public Builder groupKeyType(String groupKeyType) {
                this.groupKeyType = groupKeyType;
                return this;
            }

            /**
             * <p>The method that is used to aggregate the monitoring data of the Enhanced Monitoring metric. Valid values:</p>
             * <ul>
             * <li><strong>avg</strong>: The system calculates the average value of the Enhanced Monitoring metric.</li>
             * <li><strong>min</strong>: The system calculates the minimum value of the Enhanced Monitoring metric.</li>
             * <li><strong>max</strong>: The system calculates the maximum value of the Enhanced Monitoring metric.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>avg</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The key of the Enhanced Monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>os.cpu_usage.sys.avg</p>
             */
            public Builder metricsKey(String metricsKey) {
                this.metricsKey = metricsKey;
                return this;
            }

            /**
             * <p>The alias of the Enhanced Monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_sys_per_core</p>
             */
            public Builder metricsKeyAlias(String metricsKeyAlias) {
                this.metricsKeyAlias = metricsKeyAlias;
                return this;
            }

            /**
             * <p>The serial number of the Enhanced Monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sortRule(Integer sortRule) {
                this.sortRule = sortRule;
                return this;
            }

            /**
             * <p>The unit of the Enhanced Monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
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
