// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link ListEgressProxyGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>ListEgressProxyGatewaysResponseBody</p>
 */
public class ListEgressProxyGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyGateways")
    private java.util.List<EgressProxyGateways> egressProxyGateways;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEgressProxyGatewaysResponseBody(Builder builder) {
        this.egressProxyGateways = builder.egressProxyGateways;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyGatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyGateways
     */
    public java.util.List<EgressProxyGateways> getEgressProxyGateways() {
        return this.egressProxyGateways;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<EgressProxyGateways> egressProxyGateways; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEgressProxyGatewaysResponseBody model) {
            this.egressProxyGateways = model.egressProxyGateways;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * EgressProxyGateways.
         */
        public Builder egressProxyGateways(java.util.List<EgressProxyGateways> egressProxyGateways) {
            this.egressProxyGateways = egressProxyGateways;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEgressProxyGatewaysResponseBody build() {
            return new ListEgressProxyGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyGatewaysResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEgressProxyGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyGatewaysResponseBody</p>
     */
    public static class EgressProxyGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultEgressProxyIpPoolId")
        private String defaultEgressProxyIpPoolId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
        private String egressProxyConfigurationId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
        private String egressProxyGatewayId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayName")
        private String egressProxyGatewayName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private EgressProxyGateways(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultEgressProxyIpPoolId = builder.defaultEgressProxyIpPoolId;
            this.description = builder.description;
            this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
            this.egressProxyGatewayId = builder.egressProxyGatewayId;
            this.egressProxyGatewayName = builder.egressProxyGatewayName;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyGateways create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultEgressProxyIpPoolId
         */
        public String getDefaultEgressProxyIpPoolId() {
            return this.defaultEgressProxyIpPoolId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyConfigurationId
         */
        public String getEgressProxyConfigurationId() {
            return this.egressProxyConfigurationId;
        }

        /**
         * @return egressProxyGatewayId
         */
        public String getEgressProxyGatewayId() {
            return this.egressProxyGatewayId;
        }

        /**
         * @return egressProxyGatewayName
         */
        public String getEgressProxyGatewayName() {
            return this.egressProxyGatewayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String createTime; 
            private String defaultEgressProxyIpPoolId; 
            private String description; 
            private String egressProxyConfigurationId; 
            private String egressProxyGatewayId; 
            private String egressProxyGatewayName; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(EgressProxyGateways model) {
                this.createTime = model.createTime;
                this.defaultEgressProxyIpPoolId = model.defaultEgressProxyIpPoolId;
                this.description = model.description;
                this.egressProxyConfigurationId = model.egressProxyConfigurationId;
                this.egressProxyGatewayId = model.egressProxyGatewayId;
                this.egressProxyGatewayName = model.egressProxyGatewayName;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultEgressProxyIpPoolId.
             */
            public Builder defaultEgressProxyIpPoolId(String defaultEgressProxyIpPoolId) {
                this.defaultEgressProxyIpPoolId = defaultEgressProxyIpPoolId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EgressProxyConfigurationId.
             */
            public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
                this.egressProxyConfigurationId = egressProxyConfigurationId;
                return this;
            }

            /**
             * EgressProxyGatewayId.
             */
            public Builder egressProxyGatewayId(String egressProxyGatewayId) {
                this.egressProxyGatewayId = egressProxyGatewayId;
                return this;
            }

            /**
             * EgressProxyGatewayName.
             */
            public Builder egressProxyGatewayName(String egressProxyGatewayName) {
                this.egressProxyGatewayName = egressProxyGatewayName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public EgressProxyGateways build() {
                return new EgressProxyGateways(this);
            } 

        } 

    }
}
