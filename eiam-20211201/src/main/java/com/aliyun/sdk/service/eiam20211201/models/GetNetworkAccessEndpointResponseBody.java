// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNetworkAccessEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkAccessEndpointResponseBody</p>
 */
public class GetNetworkAccessEndpointResponseBody extends TeaModel {
    @NameInMap("NetworkAccessEndpoint")
    private NetworkAccessEndpoint networkAccessEndpoint;

    @NameInMap("RequestId")
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

        /**
         * NetworkAccessEndpoint.
         */
        public Builder networkAccessEndpoint(NetworkAccessEndpoint networkAccessEndpoint) {
            this.networkAccessEndpoint = networkAccessEndpoint;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkAccessEndpointResponseBody build() {
            return new GetNetworkAccessEndpointResponseBody(this);
        } 

    } 

    public static class NetworkAccessEndpoint extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EgressPrivateIpAddresses")
        private java.util.List < String > egressPrivateIpAddresses;

        @NameInMap("EgressPublicIpAddresses")
        private java.util.List < String > egressPublicIpAddresses;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @NameInMap("NetworkAccessEndpointName")
        private String networkAccessEndpointName;

        @NameInMap("NetworkAccessEndpointType")
        private String networkAccessEndpointType;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcRegionId")
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
        public java.util.List < String > getEgressPrivateIpAddresses() {
            return this.egressPrivateIpAddresses;
        }

        /**
         * @return egressPublicIpAddresses
         */
        public java.util.List < String > getEgressPublicIpAddresses() {
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
        public java.util.List < String > getVSwitchIds() {
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
            private java.util.List < String > egressPrivateIpAddresses; 
            private java.util.List < String > egressPublicIpAddresses; 
            private String instanceId; 
            private String networkAccessEndpointId; 
            private String networkAccessEndpointName; 
            private String networkAccessEndpointType; 
            private String securityGroupId; 
            private String status; 
            private Long updateTime; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 
            private String vpcRegionId; 

            /**
             * 专属网络端点创建时间，Unix时间戳格式，单位为毫秒。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 网络访问端私网出口IP地址列表。
             */
            public Builder egressPrivateIpAddresses(java.util.List < String > egressPrivateIpAddresses) {
                this.egressPrivateIpAddresses = egressPrivateIpAddresses;
                return this;
            }

            /**
             * 网络访问端点公网出口IP地址段
             */
            public Builder egressPublicIpAddresses(java.util.List < String > egressPublicIpAddresses) {
                this.egressPublicIpAddresses = egressPublicIpAddresses;
                return this;
            }

            /**
             * 实例ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 专属网络端点ID。
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * 专属网络端点名称。
             */
            public Builder networkAccessEndpointName(String networkAccessEndpointName) {
                this.networkAccessEndpointName = networkAccessEndpointName;
                return this;
            }

            /**
             * 专属网络端点连接的类型。
             */
            public Builder networkAccessEndpointType(String networkAccessEndpointType) {
                this.networkAccessEndpointType = networkAccessEndpointType;
                return this;
            }

            /**
             * 专属网络端点使用的安全组ID。
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * 专属网络端点状态。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 专属网络端点最近更新时间，Unix时间戳格式，单位为毫秒。
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 专属网络端点连接的指定vSwitch列表。
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * 专属网络端点连接的VpcID。
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * 专属网络端点连接的Vpc所属地域。
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
