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
 * {@link ListNetworkAccessPathsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkAccessPathsResponseBody</p>
 */
public class ListNetworkAccessPathsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAccessPaths")
    private java.util.List<NetworkAccessPaths> networkAccessPaths;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNetworkAccessPathsResponseBody(Builder builder) {
        this.networkAccessPaths = builder.networkAccessPaths;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkAccessPathsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAccessPaths
     */
    public java.util.List<NetworkAccessPaths> getNetworkAccessPaths() {
        return this.networkAccessPaths;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NetworkAccessPaths> networkAccessPaths; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNetworkAccessPathsResponseBody model) {
            this.networkAccessPaths = model.networkAccessPaths;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Network access paths</p>
         */
        public Builder networkAccessPaths(java.util.List<NetworkAccessPaths> networkAccessPaths) {
            this.networkAccessPaths = networkAccessPaths;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNetworkAccessPathsResponseBody build() {
            return new ListNetworkAccessPathsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkAccessPathsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkAccessPathsResponseBody</p>
     */
    public static class NetworkAccessPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossRegionReplicationRole")
        private String crossRegionReplicationRole;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessPathId")
        private String networkAccessPathId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcRegionId")
        private String vpcRegionId;

        private NetworkAccessPaths(Builder builder) {
            this.createTime = builder.createTime;
            this.crossRegionReplicationRole = builder.crossRegionReplicationRole;
            this.instanceId = builder.instanceId;
            this.networkAccessEndpointId = builder.networkAccessEndpointId;
            this.networkAccessPathId = builder.networkAccessPathId;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.privateIpAddress = builder.privateIpAddress;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcRegionId = builder.vpcRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAccessPaths create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crossRegionReplicationRole
         */
        public String getCrossRegionReplicationRole() {
            return this.crossRegionReplicationRole;
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
         * @return networkAccessPathId
         */
        public String getNetworkAccessPathId() {
            return this.networkAccessPathId;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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
            private String crossRegionReplicationRole; 
            private String instanceId; 
            private String networkAccessEndpointId; 
            private String networkAccessPathId; 
            private String networkInterfaceId; 
            private String privateIpAddress; 
            private String status; 
            private Long updateTime; 
            private String vSwitchId; 
            private String vpcId; 
            private String vpcRegionId; 

            private Builder() {
            } 

            private Builder(NetworkAccessPaths model) {
                this.createTime = model.createTime;
                this.crossRegionReplicationRole = model.crossRegionReplicationRole;
                this.instanceId = model.instanceId;
                this.networkAccessEndpointId = model.networkAccessEndpointId;
                this.networkAccessPathId = model.networkAccessPathId;
                this.networkInterfaceId = model.networkInterfaceId;
                this.privateIpAddress = model.privateIpAddress;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.vpcRegionId = model.vpcRegionId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CrossRegionReplicationRole.
             */
            public Builder crossRegionReplicationRole(String crossRegionReplicationRole) {
                this.crossRegionReplicationRole = crossRegionReplicationRole;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Network access endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nae_examplexxx</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>Network access path ID</p>
             * 
             * <strong>example:</strong>
             * <p>nap_examplexxx</p>
             */
            public Builder networkAccessPathId(String networkAccessPathId) {
                this.networkAccessPathId = networkAccessPathId;
                return this;
            }

            /**
             * <p>Network interface ID</p>
             * 
             * <strong>example:</strong>
             * <p>eni-examplexxx</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>Network access path status</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of a vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-examplexxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcRegionId.
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            public NetworkAccessPaths build() {
                return new NetworkAccessPaths(this);
            } 

        } 

    }
}
