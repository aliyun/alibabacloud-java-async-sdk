// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNetworkAccessEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkAccessEndpointsResponseBody</p>
 */
public class ListNetworkAccessEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpoints")
    private java.util.List < NetworkAccessEndpoints> networkAccessEndpoints;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListNetworkAccessEndpointsResponseBody(Builder builder) {
        this.networkAccessEndpoints = builder.networkAccessEndpoints;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkAccessEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkAccessEndpoints
     */
    public java.util.List < NetworkAccessEndpoints> getNetworkAccessEndpoints() {
        return this.networkAccessEndpoints;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < NetworkAccessEndpoints> networkAccessEndpoints; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * NetworkAccessEndpoints.
         */
        public Builder networkAccessEndpoints(java.util.List < NetworkAccessEndpoints> networkAccessEndpoints) {
            this.networkAccessEndpoints = networkAccessEndpoints;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNetworkAccessEndpointsResponseBody build() {
            return new ListNetworkAccessEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkAccessEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkAccessEndpointsResponseBody</p>
     */
    public static class NetworkAccessEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcRegionId")
        private String vpcRegionId;

        private NetworkAccessEndpoints(Builder builder) {
            this.createTime = builder.createTime;
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

        public static NetworkAccessEndpoints create() {
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
             * <p>专属网络端点创建时间，Unix时间戳格式，单位为毫秒。</p>
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
             * <p>专属网络端点名称。</p>
             * 
             * <strong>example:</strong>
             * <p>xx业务VPC访问端点</p>
             */
            public Builder networkAccessEndpointName(String networkAccessEndpointName) {
                this.networkAccessEndpointName = networkAccessEndpointName;
                return this;
            }

            /**
             * <p>专属网络端点连接的类型。</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder networkAccessEndpointType(String networkAccessEndpointType) {
                this.networkAccessEndpointType = networkAccessEndpointType;
                return this;
            }

            /**
             * <p>专属网络端点使用的安全组ID。</p>
             * 
             * <strong>example:</strong>
             * <p>sg-examplexxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>专属网络端点状态。</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>专属网络端点最近更新时间，Unix时间戳格式，单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>专属网络端点连接的指定vSwitch列表。</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-examplexxx</p>
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>专属网络端点连接的VpcID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-examplexxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>专属网络端点连接的Vpc所属地域。</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            public NetworkAccessEndpoints build() {
                return new NetworkAccessEndpoints(this);
            } 

        } 

    }
}
