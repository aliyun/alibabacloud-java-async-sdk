// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maas20260318.models;

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
 * {@link ListApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiKeysResponseBody</p>
 */
public class ListApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeys")
    private java.util.List<ApiKeys> apiKeys;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListApiKeysResponseBody(Builder builder) {
        this.apiKeys = builder.apiKeys;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
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

    public static ListApiKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeys
     */
    public java.util.List<ApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<ApiKeys> apiKeys; 
        private String code; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListApiKeysResponseBody model) {
            this.apiKeys = model.apiKeys;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>API Key。</p>
         */
        public Builder apiKeys(java.util.List<ApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9B9650D6-68B0-55CC-845D-E8C1E5BED38B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApiKeysResponseBody build() {
            return new ListApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiKeysResponseBody</p>
     */
    public static class ApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyId")
        private Long apiKeyId;

        @com.aliyun.core.annotation.NameInMap("apiKeyValue")
        private String apiKeyValue;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("isBlocked")
        private Integer isBlocked;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private ApiKeys(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.apiKeyValue = builder.apiKeyValue;
            this.creator = builder.creator;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.isBlocked = builder.isBlocked;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeys create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return apiKeyValue
         */
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return isBlocked
         */
        public Integer getIsBlocked() {
            return this.isBlocked;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Long apiKeyId; 
            private String apiKeyValue; 
            private String creator; 
            private String description; 
            private Long gmtCreate; 
            private Integer isBlocked; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.apiKeyId = model.apiKeyId;
                this.apiKeyValue = model.apiKeyValue;
                this.creator = model.creator;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.isBlocked = model.isBlocked;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>API Key ID。</p>
             * 
             * <strong>example:</strong>
             * <p>3536766</p>
             */
            public Builder apiKeyId(Long apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * <p>API Key Value。</p>
             * 
             * <strong>example:</strong>
             * <p>sk-f83898fqwer340049bae6209cbb0bc29</p>
             */
            public Builder apiKeyValue(String apiKeyValue) {
                this.apiKeyValue = apiKeyValue;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * isBlocked.
             */
            public Builder isBlocked(Integer isBlocked) {
                this.isBlocked = isBlocked;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public ApiKeys build() {
                return new ApiKeys(this);
            } 

        } 

    }
}
