// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
    private java.util.List < NetworkAccessPaths> networkAccessPaths;

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

    /**
     * 
     * {@link ListNetworkAccessPathsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkAccessPathsResponseBody</p>
     */
    public static class NetworkAccessPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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
             * <p>专属网络端点访问路径创建时间，Unix时间戳格式，单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>专属网络端点ID。</p>
             * 
             * <strong>example:</strong>
             * <p>nae_examplexxx</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>专属网络端点访问路径ID。</p>
             * 
             * <strong>example:</strong>
             * <p>nap_examplexxx</p>
             */
            public Builder networkAccessPathId(String networkAccessPathId) {
                this.networkAccessPathId = networkAccessPathId;
                return this;
            }

            /**
             * <p>专属网络端点访问路径使用的ENI ID。</p>
             * 
             * <strong>example:</strong>
             * <p>eni-examplexxx</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>专属网络端点访问路径使用的ENI私网地址。</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>专属网络端点访问路径状态。</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>专属网络端点访问路径最近更新时间，Unix时间戳格式，单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>专属网络端点访问路径的ENI归属的交换机ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-examplexxx</p>
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
