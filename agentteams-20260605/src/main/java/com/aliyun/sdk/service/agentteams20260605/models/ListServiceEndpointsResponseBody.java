// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link ListServiceEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceEndpointsResponseBody</p>
 */
public class ListServiceEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceEndpointsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceEndpointsResponseBody create() {
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServiceEndpointsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>items</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>nextToken</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>totalCount</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceEndpointsResponseBody build() {
            return new ListServiceEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceEndpointsResponseBody</p>
     */
    public static class Auth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiKeyName")
        private String apiKeyName;

        private Auth(Builder builder) {
            this.apiKey = builder.apiKey;
            this.apiKeyName = builder.apiKeyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auth create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return apiKeyName
         */
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public static final class Builder {
            private String apiKey; 
            private String apiKeyName; 

            private Builder() {
            } 

            private Builder(Auth model) {
                this.apiKey = model.apiKey;
                this.apiKeyName = model.apiKeyName;
            } 

            /**
             * <p>API Key</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * ApiKeyName.
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            public Auth build() {
                return new Auth(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceEndpointsResponseBody</p>
     */
    public static class EndpointConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Auth")
        private Auth auth;

        private EndpointConfig(Builder builder) {
            this.auth = builder.auth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConfig create() {
            return builder().build();
        }

        /**
         * @return auth
         */
        public Auth getAuth() {
            return this.auth;
        }

        public static final class Builder {
            private Auth auth; 

            private Builder() {
            } 

            private Builder(EndpointConfig model) {
                this.auth = model.auth;
            } 

            /**
             * Auth.
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            public EndpointConfig build() {
                return new EndpointConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceEndpointsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("Component")
        private String component;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("EndpointConfig")
        private EndpointConfig endpointConfig;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Items(Builder builder) {
            this.certIdentifier = builder.certIdentifier;
            this.component = builder.component;
            this.createTime = builder.createTime;
            this.domain = builder.domain;
            this.domainType = builder.domainType;
            this.endpointConfig = builder.endpointConfig;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.instanceId = builder.instanceId;
            this.networkType = builder.networkType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return component
         */
        public String getComponent() {
            return this.component;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return endpointConfig
         */
        public EndpointConfig getEndpointConfig() {
            return this.endpointConfig;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String certIdentifier; 
            private String component; 
            private String createTime; 
            private String domain; 
            private String domainType; 
            private EndpointConfig endpointConfig; 
            private String endpointId; 
            private String endpointName; 
            private String instanceId; 
            private String networkType; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.certIdentifier = model.certIdentifier;
                this.component = model.component;
                this.createTime = model.createTime;
                this.domain = model.domain;
                this.domainType = model.domainType;
                this.endpointConfig = model.endpointConfig;
                this.endpointId = model.endpointId;
                this.endpointName = model.endpointName;
                this.instanceId = model.instanceId;
                this.networkType = model.networkType;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * Component.
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * EndpointConfig.
             */
            public Builder endpointConfig(EndpointConfig endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * <p>Endpoint ID</p>
             * 
             * <strong>example:</strong>
             * <p>ep-xxx</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * EndpointName.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
