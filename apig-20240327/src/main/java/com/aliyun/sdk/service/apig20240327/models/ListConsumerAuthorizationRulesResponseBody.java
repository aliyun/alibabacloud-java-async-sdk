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
 * {@link ListConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsumerAuthorizationRulesResponseBody</p>
 */
public class ListConsumerAuthorizationRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListConsumerAuthorizationRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerAuthorizationRulesResponseBody create() {
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

        private Builder(ListConsumerAuthorizationRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>294382D9-EE60-5735-A4CD-F2AC2840423D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConsumerAuthorizationRulesResponseBody build() {
            return new ListConsumerAuthorizationRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumerAuthorizationRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiInfo")
        private HttpApiApiInfo apiInfo;

        @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
        private String consumerAuthorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

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

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Items(Builder builder) {
            this.apiInfo = builder.apiInfo;
            this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
            this.consumerId = builder.consumerId;
            this.createTimestamp = builder.createTimestamp;
            this.deployStatus = builder.deployStatus;
            this.environmentInfo = builder.environmentInfo;
            this.expireMode = builder.expireMode;
            this.expireStatus = builder.expireStatus;
            this.expireTimestamp = builder.expireTimestamp;
            this.gatewayInfo = builder.gatewayInfo;
            this.resourceId = builder.resourceId;
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
            private Long createTimestamp; 
            private String deployStatus; 
            private EnvironmentInfo environmentInfo; 
            private String expireMode; 
            private String expireStatus; 
            private Long expireTimestamp; 
            private GatewayInfo gatewayInfo; 
            private String resourceId; 
            private String resourceType; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apiInfo = model.apiInfo;
                this.consumerAuthorizationRuleId = model.consumerAuthorizationRuleId;
                this.consumerId = model.consumerId;
                this.createTimestamp = model.createTimestamp;
                this.deployStatus = model.deployStatus;
                this.environmentInfo = model.environmentInfo;
                this.expireMode = model.expireMode;
                this.expireStatus = model.expireStatus;
                this.expireTimestamp = model.expireTimestamp;
                this.gatewayInfo = model.gatewayInfo;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * apiInfo.
             */
            public Builder apiInfo(HttpApiApiInfo apiInfo) {
                this.apiInfo = apiInfo;
                return this;
            }

            /**
             * consumerAuthorizationRuleId.
             */
            public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
                this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
                return this;
            }

            /**
             * consumerId.
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * createTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * deployStatus.
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * environmentInfo.
             */
            public Builder environmentInfo(EnvironmentInfo environmentInfo) {
                this.environmentInfo = environmentInfo;
                return this;
            }

            /**
             * expireMode.
             */
            public Builder expireMode(String expireMode) {
                this.expireMode = expireMode;
                return this;
            }

            /**
             * expireStatus.
             */
            public Builder expireStatus(String expireStatus) {
                this.expireStatus = expireStatus;
                return this;
            }

            /**
             * expireTimestamp.
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * gatewayInfo.
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * updateTimestamp.
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
     * {@link ListConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumerAuthorizationRulesResponseBody</p>
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
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalSize.
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
