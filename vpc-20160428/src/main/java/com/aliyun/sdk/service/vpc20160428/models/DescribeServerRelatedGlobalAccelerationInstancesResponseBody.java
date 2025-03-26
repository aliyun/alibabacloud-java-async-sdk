// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeServerRelatedGlobalAccelerationInstancesResponseBody model) {
            this.globalAccelerationInstances = model.globalAccelerationInstances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of GA instances.</p>
         */
        public Builder globalAccelerationInstances(GlobalAccelerationInstances globalAccelerationInstances) {
            this.globalAccelerationInstances = globalAccelerationInstances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8252014-D8DE-4D85-AF35-AFEXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBody build() {
            return new DescribeServerRelatedGlobalAccelerationInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServerRelatedGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerRelatedGlobalAccelerationInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(GlobalAccelerationInstance model) {
                this.globalAccelerationInstanceId = model.globalAccelerationInstanceId;
                this.ipAddress = model.ipAddress;
                this.regionId = model.regionId;
                this.serverIpAddress = model.serverIpAddress;
            } 

            /**
             * <p>The ID of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-t4nku6vv9****</p>
             */
            public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
                this.globalAccelerationInstanceId = globalAccelerationInstanceId;
                return this;
            }

            /**
             * <p>The public IP address of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12.34.56.78</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The region ID of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The IP address of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.52.234</p>
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
    /**
     * 
     * {@link DescribeServerRelatedGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerRelatedGlobalAccelerationInstancesResponseBody</p>
     */
    public static class GlobalAccelerationInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstance")
        private java.util.List<GlobalAccelerationInstance> globalAccelerationInstance;

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
        public java.util.List<GlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

        public static final class Builder {
            private java.util.List<GlobalAccelerationInstance> globalAccelerationInstance; 

            private Builder() {
            } 

            private Builder(GlobalAccelerationInstances model) {
                this.globalAccelerationInstance = model.globalAccelerationInstance;
            } 

            /**
             * GlobalAccelerationInstance.
             */
            public Builder globalAccelerationInstance(java.util.List<GlobalAccelerationInstance> globalAccelerationInstance) {
                this.globalAccelerationInstance = globalAccelerationInstance;
                return this;
            }

            public GlobalAccelerationInstances build() {
                return new GlobalAccelerationInstances(this);
            } 

        } 

    }
}
