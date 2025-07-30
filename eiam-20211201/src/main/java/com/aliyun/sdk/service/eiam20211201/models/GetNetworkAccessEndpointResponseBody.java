// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetNetworkAccessEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkAccessEndpointResponseBody</p>
 */
public class GetNetworkAccessEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpoint")
    private NetworkAccessEndpoint networkAccessEndpoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNetworkAccessEndpointResponseBody(Builder builder) {
        this.networkAccessEndpoint = builder.networkAccessEndpoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkAccessEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAccessEndpoint
     */
    public NetworkAccessEndpoint getNetworkAccessEndpoint() {
        return this.networkAccessEndpoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NetworkAccessEndpoint networkAccessEndpoint; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNetworkAccessEndpointResponseBody model) {
            this.networkAccessEndpoint = model.networkAccessEndpoint;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Network endpoint information.</p>
         */
        public Builder networkAccessEndpoint(NetworkAccessEndpoint networkAccessEndpoint) {
            this.networkAccessEndpoint = networkAccessEndpoint;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkAccessEndpointResponseBody build() {
            return new GetNetworkAccessEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNetworkAccessEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkAccessEndpointResponseBody</p>
     */
    public static class NetworkAccessEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EgressPrivateIpAddresses")
        private java.util.List<String> egressPrivateIpAddresses;

        @com.aliyun.core.annotation.NameInMap("EgressPublicIpAddresses")
        private java.util.List<String> egressPublicIpAddresses;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointName")
        private String networkAccessEndpointName;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointType")
        private String networkAccessEndpointType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcRegionId")
        private String vpcRegionId;

        private NetworkAccessEndpoint(Builder builder) {
            this.createTime = builder.createTime;
            this.egressPrivateIpAddresses = builder.egressPrivateIpAddresses;
            this.egressPublicIpAddresses = builder.egressPublicIpAddresses;
            this.instanceId = builder.instanceId;
            this.networkAccessEndpointId = builder.networkAccessEndpointId;
            this.networkAccessEndpointName = builder.networkAccessEndpointName;
            this.networkAccessEndpointType = builder.networkAccessEndpointType;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.vpcRegionId = builder.vpcRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAccessEndpoint create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return egressPrivateIpAddresses
         */
        public java.util.List<String> getEgressPrivateIpAddresses() {
            return this.egressPrivateIpAddresses;
        }

        /**
         * @return egressPublicIpAddresses
         */
        public java.util.List<String> getEgressPublicIpAddresses() {
            return this.egressPublicIpAddresses;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkAccessEndpointId
         */
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        /**
         * @return networkAccessEndpointName
         */
        public String getNetworkAccessEndpointName() {
            return this.networkAccessEndpointName;
        }

        /**
         * @return networkAccessEndpointType
         */
        public String getNetworkAccessEndpointType() {
            return this.networkAccessEndpointType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcRegionId
         */
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.List<String> egressPrivateIpAddresses; 
            private java.util.List<String> egressPublicIpAddresses; 
            private String instanceId; 
            private String networkAccessEndpointId; 
            private String networkAccessEndpointName; 
            private String networkAccessEndpointType; 
            private String securityGroupId; 
            private String status; 
            private Long updateTime; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 
            private String vpcRegionId; 

            private Builder() {
            } 

            private Builder(NetworkAccessEndpoint model) {
                this.createTime = model.createTime;
                this.egressPrivateIpAddresses = model.egressPrivateIpAddresses;
                this.egressPublicIpAddresses = model.egressPublicIpAddresses;
                this.instanceId = model.instanceId;
                this.networkAccessEndpointId = model.networkAccessEndpointId;
                this.networkAccessEndpointName = model.networkAccessEndpointName;
                this.networkAccessEndpointType = model.networkAccessEndpointType;
                this.securityGroupId = model.securityGroupId;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
                this.vpcRegionId = model.vpcRegionId;
            } 

            /**
             * <p>The time when the baseline was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Public egress ip address range of the dedicated network endpoint
             * This field is returned only when NetworkEndpointType is set to private.</p>
             * 
             * <strong>example:</strong>
             * <p>172.168.x.x</p>
             */
            public Builder egressPrivateIpAddresses(java.util.List<String> egressPrivateIpAddresses) {
                this.egressPrivateIpAddresses = egressPrivateIpAddresses;
                return this;
            }

            /**
             * <p>Public egress ip address range of the shared network endpoint
             * This field is returned only when networkEndpointType is set to shared.</p>
             * 
             * <strong>example:</strong>
             * <p>8.xx.xx.xxx/27</p>
             */
            public Builder egressPublicIpAddresses(java.util.List<String> egressPublicIpAddresses) {
                this.egressPublicIpAddresses = egressPublicIpAddresses;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The unique identifier of the network access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>nae_examplexxx</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>Private network endpoint name.</p>
             * 
             * <strong>example:</strong>
             * <p>xx business VPC access endpoint</p>
             */
            public Builder networkAccessEndpointName(String networkAccessEndpointName) {
                this.networkAccessEndpointName = networkAccessEndpointName;
                return this;
            }

            /**
             * <p>Type of the Network Endpoint
             * Possible values:</p>
             * <p>shared: Shared network endpoint</p>
             * <p>private: Dedicated network endpoint</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder networkAccessEndpointType(String networkAccessEndpointType) {
                this.networkAccessEndpointType = networkAccessEndpointType;
                return this;
            }

            /**
             * <p>The ID of the destination security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-examplexxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>Status of the Network Endpoint
             * Possible values:</p>
             * <p>pending: Pending initialization</p>
             * <p>creating: Being created</p>
             * <p>running: Running</p>
             * <p>deleting: Being deleted</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the endpoint was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>List of specified vSwitches associated with the dedicated network endpoint connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-examplexxx</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-examplexxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The region ID of the outbound virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            public NetworkAccessEndpoint build() {
                return new NetworkAccessEndpoint(this);
            } 

        } 

    }
}
