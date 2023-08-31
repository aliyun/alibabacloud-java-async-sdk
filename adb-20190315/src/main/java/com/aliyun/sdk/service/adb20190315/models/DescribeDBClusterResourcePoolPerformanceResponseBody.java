// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterResourcePoolPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterResourcePoolPerformanceResponseBody</p>
 */
public class DescribeDBClusterResourcePoolPerformanceResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Performances")
    private java.util.List < Performances> performances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
    public java.util.List < Performances> getPerformances() {
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
        private java.util.List < Performances> performances; 
        private String requestId; 
        private String startTime; 

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The end of the time range for monitoring the resource group. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The queried monitoring information about the metrics.
         */
        public Builder performances(java.util.List < Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range for monitoring the resource group. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBody build() {
            return new DescribeDBClusterResourcePoolPerformanceResponseBody(this);
        } 

    } 

    public static class ResourcePoolSeries extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > values; 

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public ResourcePoolSeries build() {
                return new ResourcePoolSeries(this);
            } 

        } 

    }
    public static class ResourcePoolPerformances extends TeaModel {
        @NameInMap("ResourcePoolName")
        private String resourcePoolName;

        @NameInMap("ResourcePoolSeries")
        private java.util.List < ResourcePoolSeries> resourcePoolSeries;

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
        public java.util.List < ResourcePoolSeries> getResourcePoolSeries() {
            return this.resourcePoolSeries;
        }

        public static final class Builder {
            private String resourcePoolName; 
            private java.util.List < ResourcePoolSeries> resourcePoolSeries; 

            /**
             * The name of the resource group.
             */
            public Builder resourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
                return this;
            }

            /**
             * The sequential monitoring information about the resource groups.
             */
            public Builder resourcePoolSeries(java.util.List < ResourcePoolSeries> resourcePoolSeries) {
                this.resourcePoolSeries = resourcePoolSeries;
                return this;
            }

            public ResourcePoolPerformances build() {
                return new ResourcePoolPerformances(this);
            } 

        } 

    }
    public static class Performances extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("ResourcePoolPerformances")
        private java.util.List < ResourcePoolPerformances> resourcePoolPerformances;

        @NameInMap("Unit")
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
        public java.util.List < ResourcePoolPerformances> getResourcePoolPerformances() {
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
            private java.util.List < ResourcePoolPerformances> resourcePoolPerformances; 
            private String unit; 

            /**
             * The metric of the resource group.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The queried monitoring information about the resource groups.
             */
            public Builder resourcePoolPerformances(java.util.List < ResourcePoolPerformances> resourcePoolPerformances) {
                this.resourcePoolPerformances = resourcePoolPerformances;
                return this;
            }

            /**
             * The unit of the metric value.
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
