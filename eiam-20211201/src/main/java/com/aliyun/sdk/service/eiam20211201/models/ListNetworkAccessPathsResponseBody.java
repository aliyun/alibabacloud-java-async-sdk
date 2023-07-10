// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkAccessPathsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkAccessPathsResponseBody</p>
 */
public class ListNetworkAccessPathsResponseBody extends TeaModel {
    @NameInMap("NetworkAccessPaths")
    private java.util.List < NetworkAccessPaths> networkAccessPaths;

    @NameInMap("RequestId")
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

    /**
     * @return networkAccessPaths
     */
    public java.util.List < NetworkAccessPaths> getNetworkAccessPaths() {
        return this.networkAccessPaths;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < NetworkAccessPaths> networkAccessPaths; 
        private String requestId; 

        /**
         * NetworkAccessPaths.
         */
        public Builder networkAccessPaths(java.util.List < NetworkAccessPaths> networkAccessPaths) {
            this.networkAccessPaths = networkAccessPaths;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNetworkAccessPathsResponseBody build() {
            return new ListNetworkAccessPathsResponseBody(this);
        } 

    } 

    public static class NetworkAccessPaths extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @NameInMap("NetworkAccessPathId")
        private String networkAccessPathId;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkAccessPaths(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.networkAccessEndpointId = builder.networkAccessEndpointId;
            this.networkAccessPathId = builder.networkAccessPathId;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.privateIpAddress = builder.privateIpAddress;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.vSwitchId = builder.vSwitchId;
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

        public static final class Builder {
            private Long createTime; 
            private String instanceId; 
            private String networkAccessEndpointId; 
            private String networkAccessPathId; 
            private String networkInterfaceId; 
            private String privateIpAddress; 
            private String status; 
            private Long updateTime; 
            private String vSwitchId; 

            /**
             * 专属网络端点访问路径创建时间，Unix时间戳格式，单位为毫秒。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * 专属网络端点访问路径ID。
             */
            public Builder networkAccessPathId(String networkAccessPathId) {
                this.networkAccessPathId = networkAccessPathId;
                return this;
            }

            /**
             * 专属网络端点访问路径使用的ENI ID。
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * 专属网络端点访问路径使用的ENI私网地址。
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * 专属网络端点访问路径状态。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 专属网络端点访问路径最近更新时间，Unix时间戳格式，单位为毫秒。
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 专属网络端点访问路径的ENI归属的交换机ID。
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NetworkAccessPaths build() {
                return new NetworkAccessPaths(this);
            } 

        } 

    }
}
