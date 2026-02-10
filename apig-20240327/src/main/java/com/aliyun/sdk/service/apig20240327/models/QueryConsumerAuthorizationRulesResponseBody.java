// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link QueryConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConsumerAuthorizationRulesResponseBody</p>
 */
public class QueryConsumerAuthorizationRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryConsumerAuthorizationRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConsumerAuthorizationRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryConsumerAuthorizationRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response payload.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A60EE5CA-1294-532A-9775-8D2FD1C6EFBF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryConsumerAuthorizationRulesResponseBody build() {
            return new QueryConsumerAuthorizationRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConsumerAuthorizationRulesResponseBody</p>
     */
    public static class ResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operationInfo")
        private HttpApiOperationInfo operationInfo;

        @com.aliyun.core.annotation.NameInMap("route")
        private HttpRoute route;

        private ResourceInfo(Builder builder) {
            this.operationInfo = builder.operationInfo;
            this.route = builder.route;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfo create() {
            return builder().build();
        }

        /**
         * @return operationInfo
         */
        public HttpApiOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

        /**
         * @return route
         */
        public HttpRoute getRoute() {
            return this.route;
        }

        public static final class Builder {
            private HttpApiOperationInfo operationInfo; 
            private HttpRoute route; 

            private Builder() {
            } 

            private Builder(ResourceInfo model) {
                this.operationInfo = model.operationInfo;
                this.route = model.route;
            } 

            /**
             * <p>The operation information.</p>
             */
            public Builder operationInfo(HttpApiOperationInfo operationInfo) {
                this.operationInfo = operationInfo;
                return this;
            }

            /**
             * <p>The route.</p>
             */
            public Builder route(HttpRoute route) {
                this.route = route;
                return this;
            }

            public ResourceInfo build() {
                return new ResourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConsumerAuthorizationRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiInfo")
        private HttpApiApiInfo apiInfo;

        @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
        private String consumerAuthorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("consumerInfo")
        private ConsumerInfo consumerInfo;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("deployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("environmentInfo")
        private EnvironmentInfo environmentInfo;

        @com.aliyun.core.annotation.NameInMap("expireMode")
        private String expireMode;

        @com.aliyun.core.annotation.NameInMap("expireStatus")
        private String expireStatus;

        @com.aliyun.core.annotation.NameInMap("expireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceInfo")
        private ResourceInfo resourceInfo;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Items(Builder builder) {
            this.apiInfo = builder.apiInfo;
            this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
            this.consumerId = builder.consumerId;
            this.consumerInfo = builder.consumerInfo;
            this.createTimestamp = builder.createTimestamp;
            this.deployStatus = builder.deployStatus;
            this.environmentInfo = builder.environmentInfo;
            this.expireMode = builder.expireMode;
            this.expireStatus = builder.expireStatus;
            this.expireTimestamp = builder.expireTimestamp;
            this.gatewayInfo = builder.gatewayInfo;
            this.resourceId = builder.resourceId;
            this.resourceInfo = builder.resourceInfo;
            this.resourceType = builder.resourceType;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return apiInfo
         */
        public HttpApiApiInfo getApiInfo() {
            return this.apiInfo;
        }

        /**
         * @return consumerAuthorizationRuleId
         */
        public String getConsumerAuthorizationRuleId() {
            return this.consumerAuthorizationRuleId;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return consumerInfo
         */
        public ConsumerInfo getConsumerInfo() {
            return this.consumerInfo;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return environmentInfo
         */
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        /**
         * @return expireMode
         */
        public String getExpireMode() {
            return this.expireMode;
        }

        /**
         * @return expireStatus
         */
        public String getExpireStatus() {
            return this.expireStatus;
        }

        /**
         * @return expireTimestamp
         */
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceInfo
         */
        public ResourceInfo getResourceInfo() {
            return this.resourceInfo;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private HttpApiApiInfo apiInfo; 
            private String consumerAuthorizationRuleId; 
            private String consumerId; 
            private ConsumerInfo consumerInfo; 
            private Long createTimestamp; 
            private String deployStatus; 
            private EnvironmentInfo environmentInfo; 
            private String expireMode; 
            private String expireStatus; 
            private Long expireTimestamp; 
            private GatewayInfo gatewayInfo; 
            private String resourceId; 
            private ResourceInfo resourceInfo; 
            private String resourceType; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apiInfo = model.apiInfo;
                this.consumerAuthorizationRuleId = model.consumerAuthorizationRuleId;
                this.consumerId = model.consumerId;
                this.consumerInfo = model.consumerInfo;
                this.createTimestamp = model.createTimestamp;
                this.deployStatus = model.deployStatus;
                this.environmentInfo = model.environmentInfo;
                this.expireMode = model.expireMode;
                this.expireStatus = model.expireStatus;
                this.expireTimestamp = model.expireTimestamp;
                this.gatewayInfo = model.gatewayInfo;
                this.resourceId = model.resourceId;
                this.resourceInfo = model.resourceInfo;
                this.resourceType = model.resourceType;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>The API details.</p>
             */
            public Builder apiInfo(HttpApiApiInfo apiInfo) {
                this.apiInfo = apiInfo;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>car-csgeka5lhtggrjcprok0</p>
             */
            public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
                this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
                return this;
            }

            /**
             * <p>The consumer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-csheiftlhtgmp0j0hp4g</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The consumer information.</p>
             */
            public Builder consumerInfo(ConsumerInfo consumerInfo) {
                this.consumerInfo = consumerInfo;
                return this;
            }

            /**
             * <p>The creation timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The deployment status of the API in the current environment.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * <p>The environment information.</p>
             */
            public Builder environmentInfo(EnvironmentInfo environmentInfo) {
                this.environmentInfo = environmentInfo;
                return this;
            }

            /**
             * <p>The expiry mode. Valid values: LongTerm and ShortTerm.</p>
             * 
             * <strong>example:</strong>
             * <p>ShortTerm</p>
             */
            public Builder expireMode(String expireMode) {
                this.expireMode = expireMode;
                return this;
            }

            /**
             * <p>The rule status.</p>
             * 
             * <strong>example:</strong>
             * <p>InEffect</p>
             */
            public Builder expireStatus(String expireStatus) {
                this.expireStatus = expireStatus;
                return this;
            }

            /**
             * <p>The time when the rule expires.</p>
             * 
             * <strong>example:</strong>
             * <p>172086834548</p>
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>The instance information.</p>
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * <p>The resource IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>2351944</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource information.</p>
             */
            public Builder resourceInfo(ResourceInfo resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>HttpApiRoute</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The update timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConsumerAuthorizationRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private String totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public String getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private String totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The rules.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder totalSize(String totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
