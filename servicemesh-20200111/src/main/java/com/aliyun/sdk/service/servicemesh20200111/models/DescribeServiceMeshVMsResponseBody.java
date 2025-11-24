// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeServiceMeshVMsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshVMsResponseBody</p>
 */
public class DescribeServiceMeshVMsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VMs")
    private java.util.List<VMs> vMs;

    private DescribeServiceMeshVMsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vMs = builder.vMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshVMsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vMs
     */
    public java.util.List<VMs> getVMs() {
        return this.vMs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VMs> vMs; 

        private Builder() {
        } 

        private Builder(DescribeServiceMeshVMsResponseBody model) {
            this.requestId = model.requestId;
            this.vMs = model.vMs;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4b2c0fe0-6705-4614-8521-6b9d289163c8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ECS instances that reside in the same VPC as the ASM instance.</p>
         */
        public Builder vMs(java.util.List<VMs> vMs) {
            this.vMs = vMs;
            return this;
        }

        public DescribeServiceMeshVMsResponseBody build() {
            return new DescribeServiceMeshVMsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshVMsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshVMsResponseBody</p>
     */
    public static class VMs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasTag")
        private Boolean hasTag;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private String securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
        private String serviceMeshId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private VMs(Builder builder) {
            this.hasTag = builder.hasTag;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.ipAddress = builder.ipAddress;
            this.region = builder.region;
            this.securityGroupIds = builder.securityGroupIds;
            this.serviceMeshId = builder.serviceMeshId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VMs create() {
            return builder().build();
        }

        /**
         * @return hasTag
         */
        public Boolean getHasTag() {
            return this.hasTag;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return securityGroupIds
         */
        public String getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return serviceMeshId
         */
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean hasTag; 
            private String hostName; 
            private String instanceId; 
            private String ipAddress; 
            private String region; 
            private String securityGroupIds; 
            private String serviceMeshId; 
            private String status; 

            private Builder() {
            } 

            private Builder(VMs model) {
                this.hasTag = model.hasTag;
                this.hostName = model.hostName;
                this.instanceId = model.instanceId;
                this.ipAddress = model.ipAddress;
                this.region = model.region;
                this.securityGroupIds = model.securityGroupIds;
                this.serviceMeshId = model.serviceMeshId;
                this.status = model.status;
            } 

            /**
             * <p>Indicates whether the ECS instance has labels.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasTag(Boolean hasTag) {
                this.hasTag = hasTag;
                return this;
            }

            /**
             * <p>The host name.</p>
             * 
             * <strong>example:</strong>
             * <p>iZ2ze45cgxkx4q12eh****</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze0kub9scdguom****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.2.241</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The security group to which the ECS instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2zeaqy08amco9osl****</p>
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The ASM instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccb37ff104caf419fbf48fb38e6f3****</p>
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            /**
             * <p>The state of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public VMs build() {
                return new VMs(this);
            } 

        } 

    }
}
