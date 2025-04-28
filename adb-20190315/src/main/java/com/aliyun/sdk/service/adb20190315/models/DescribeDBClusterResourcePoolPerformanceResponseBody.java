// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeDBClusterResourcePoolPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterResourcePoolPerformanceResponseBody</p>
 */
public class DescribeDBClusterResourcePoolPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Performances")
    private java.util.List<Performances> performances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDBClusterResourcePoolPerformanceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.performances = builder.performances;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterResourcePoolPerformanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return performances
     */
    public java.util.List<Performances> getPerformances() {
        return this.performances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String endTime; 
        private java.util.List<Performances> performances; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterResourcePoolPerformanceResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.endTime = model.endTime;
            this.performances = model.performances;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end of the time range for monitoring the resource group. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-10T07:01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The queried monitoring information about the metrics.</p>
         */
        public Builder performances(java.util.List<Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7EDB8E4-9769-4233-88C7-DCA4C9******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range for monitoring the resource group. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-10T07:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBody build() {
            return new DescribeDBClusterResourcePoolPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterResourcePoolPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterResourcePoolPerformanceResponseBody</p>
     */
    public static class ResourcePoolSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private ResourcePoolSeries(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePoolSeries create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(ResourcePoolSeries model) {
                this.name = model.name;
                this.values = model.values;
            } 

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ResourcePoolSeries build() {
                return new ResourcePoolSeries(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterResourcePoolPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterResourcePoolPerformanceResponseBody</p>
     */
    public static class ResourcePoolPerformances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePoolName")
        private String resourcePoolName;

        @com.aliyun.core.annotation.NameInMap("ResourcePoolSeries")
        private java.util.List<ResourcePoolSeries> resourcePoolSeries;

        private ResourcePoolPerformances(Builder builder) {
            this.resourcePoolName = builder.resourcePoolName;
            this.resourcePoolSeries = builder.resourcePoolSeries;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePoolPerformances create() {
            return builder().build();
        }

        /**
         * @return resourcePoolName
         */
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

        /**
         * @return resourcePoolSeries
         */
        public java.util.List<ResourcePoolSeries> getResourcePoolSeries() {
            return this.resourcePoolSeries;
        }

        public static final class Builder {
            private String resourcePoolName; 
            private java.util.List<ResourcePoolSeries> resourcePoolSeries; 

            private Builder() {
            } 

            private Builder(ResourcePoolPerformances model) {
                this.resourcePoolName = model.resourcePoolName;
                this.resourcePoolSeries = model.resourcePoolSeries;
            } 

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test_pool</p>
             */
            public Builder resourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
                return this;
            }

            /**
             * <p>The sequential monitoring information about the resource groups.</p>
             */
            public Builder resourcePoolSeries(java.util.List<ResourcePoolSeries> resourcePoolSeries) {
                this.resourcePoolSeries = resourcePoolSeries;
                return this;
            }

            public ResourcePoolPerformances build() {
                return new ResourcePoolPerformances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterResourcePoolPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterResourcePoolPerformanceResponseBody</p>
     */
    public static class Performances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ResourcePoolPerformances")
        private java.util.List<ResourcePoolPerformances> resourcePoolPerformances;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Performances(Builder builder) {
            this.key = builder.key;
            this.resourcePoolPerformances = builder.resourcePoolPerformances;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performances create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return resourcePoolPerformances
         */
        public java.util.List<ResourcePoolPerformances> getResourcePoolPerformances() {
            return this.resourcePoolPerformances;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<ResourcePoolPerformances> resourcePoolPerformances; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Performances model) {
                this.key = model.key;
                this.resourcePoolPerformances = model.resourcePoolPerformances;
                this.unit = model.unit;
            } 

            /**
             * <p>The metric of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB_RP_CPU</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The queried monitoring information about the resource groups.</p>
             */
            public Builder resourcePoolPerformances(java.util.List<ResourcePoolPerformances> resourcePoolPerformances) {
                this.resourcePoolPerformances = resourcePoolPerformances;
                return this;
            }

            /**
             * <p>The unit of the metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
