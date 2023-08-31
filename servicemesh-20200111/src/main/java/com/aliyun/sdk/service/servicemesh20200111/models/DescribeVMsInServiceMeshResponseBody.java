// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVMsInServiceMeshResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVMsInServiceMeshResponseBody</p>
 */
public class DescribeVMsInServiceMeshResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VMs")
    private java.util.List < VMs> vMs;

    private DescribeVMsInServiceMeshResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vMs = builder.vMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVMsInServiceMeshResponseBody create() {
        return builder().build();
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
    public java.util.List < VMs> getVMs() {
        return this.vMs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VMs> vMs; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The VMs that are added to the ASM instance.
         */
        public Builder vMs(java.util.List < VMs> vMs) {
            this.vMs = vMs;
            return this;
        }

        public DescribeVMsInServiceMeshResponseBody build() {
            return new DescribeVMsInServiceMeshResponseBody(this);
        } 

    } 

    public static class VMs extends TeaModel {
        @NameInMap("HasTag")
        private Boolean hasTag;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Region")
        private String region;

        @NameInMap("SecurityGroupIds")
        private String securityGroupIds;

        @NameInMap("Status")
        private String status;

        private VMs(Builder builder) {
            this.hasTag = builder.hasTag;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.ipAddress = builder.ipAddress;
            this.region = builder.region;
            this.securityGroupIds = builder.securityGroupIds;
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
            private String status; 

            /**
             * Indicates whether the ECS instance has labels.
             */
            public Builder hasTag(Boolean hasTag) {
                this.hasTag = hasTag;
                return this;
            }

            /**
             * The host name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IP address of the ECS instance.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The security group to which the ECS instance belongs.
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The state of the ECS instance.
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
