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
 * {@link DescribeVMsInServiceMeshResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVMsInServiceMeshResponseBody</p>
 */
public class DescribeVMsInServiceMeshResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VMs")
    private java.util.List<VMs> vMs;

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

        private Builder(DescribeVMsInServiceMeshResponseBody model) {
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
         * <p>The VMs that are added to the ASM instance.</p>
         */
        public Builder vMs(java.util.List<VMs> vMs) {
            this.vMs = vMs;
            return this;
        }

        public DescribeVMsInServiceMeshResponseBody build() {
            return new DescribeVMsInServiceMeshResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVMsInServiceMeshResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVMsInServiceMeshResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(VMs model) {
                this.hasTag = model.hasTag;
                this.hostName = model.hostName;
                this.instanceId = model.instanceId;
                this.ipAddress = model.ipAddress;
                this.region = model.region;
                this.securityGroupIds = model.securityGroupIds;
                this.status = model.status;
            } 

            /**
             * <p>Indicates whether the ECS instance has labels.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasTag(Boolean hasTag) {
                this.hasTag = hasTag;
                return this;
            }

            /**
             * <p>The host name.</p>
             * 
             * <strong>example:</strong>
             * <p>iZ2ze45cgxkx4q12eh9l****</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze45cgxkx4q12e****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.<em>,</em>**</p>
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
