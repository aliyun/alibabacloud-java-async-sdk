// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerRelatedGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServerRelatedGlobalAccelerationInstancesResponseBody</p>
 */
public class DescribeServerRelatedGlobalAccelerationInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstances")
    private GlobalAccelerationInstances globalAccelerationInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServerRelatedGlobalAccelerationInstancesResponseBody(Builder builder) {
        this.globalAccelerationInstances = builder.globalAccelerationInstances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServerRelatedGlobalAccelerationInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalAccelerationInstances
     */
    public GlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GlobalAccelerationInstances globalAccelerationInstances; 
        private String requestId; 

        /**
         * The list of GA instances.
         */
        public Builder globalAccelerationInstances(GlobalAccelerationInstances globalAccelerationInstances) {
            this.globalAccelerationInstances = globalAccelerationInstances;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBody build() {
            return new DescribeServerRelatedGlobalAccelerationInstancesResponseBody(this);
        } 

    } 

    public static class GlobalAccelerationInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstanceId")
        private String globalAccelerationInstanceId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServerIpAddress")
        private String serverIpAddress;

        private GlobalAccelerationInstance(Builder builder) {
            this.globalAccelerationInstanceId = builder.globalAccelerationInstanceId;
            this.ipAddress = builder.ipAddress;
            this.regionId = builder.regionId;
            this.serverIpAddress = builder.serverIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalAccelerationInstance create() {
            return builder().build();
        }

        /**
         * @return globalAccelerationInstanceId
         */
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serverIpAddress
         */
        public String getServerIpAddress() {
            return this.serverIpAddress;
        }

        public static final class Builder {
            private String globalAccelerationInstanceId; 
            private String ipAddress; 
            private String regionId; 
            private String serverIpAddress; 

            /**
             * The ID of the GA instance.
             */
            public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
                this.globalAccelerationInstanceId = globalAccelerationInstanceId;
                return this;
            }

            /**
             * The public IP address of the GA instance.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The region ID of the GA instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The IP address of the backend service.
             */
            public Builder serverIpAddress(String serverIpAddress) {
                this.serverIpAddress = serverIpAddress;
                return this;
            }

            public GlobalAccelerationInstance build() {
                return new GlobalAccelerationInstance(this);
            } 

        } 

    }
    public static class GlobalAccelerationInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstance")
        private java.util.List < GlobalAccelerationInstance> globalAccelerationInstance;

        private GlobalAccelerationInstances(Builder builder) {
            this.globalAccelerationInstance = builder.globalAccelerationInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalAccelerationInstances create() {
            return builder().build();
        }

        /**
         * @return globalAccelerationInstance
         */
        public java.util.List < GlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

        public static final class Builder {
            private java.util.List < GlobalAccelerationInstance> globalAccelerationInstance; 

            /**
             * GlobalAccelerationInstance.
             */
            public Builder globalAccelerationInstance(java.util.List < GlobalAccelerationInstance> globalAccelerationInstance) {
                this.globalAccelerationInstance = globalAccelerationInstance;
                return this;
            }

            public GlobalAccelerationInstances build() {
                return new GlobalAccelerationInstances(this);
            } 

        } 

    }
}
