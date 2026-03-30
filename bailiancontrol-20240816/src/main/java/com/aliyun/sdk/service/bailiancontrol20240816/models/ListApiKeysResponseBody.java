// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailiancontrol20240816.models;

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
         * <p>apiKey</p>
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
    public static class AuthSetModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authSetMode")
        private String authSetMode;

        private AuthSetModel(Builder builder) {
            this.authSetMode = builder.authSetMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthSetModel create() {
            return builder().build();
        }

        /**
         * @return authSetMode
         */
        public String getAuthSetMode() {
            return this.authSetMode;
        }

        public static final class Builder {
            private String authSetMode; 

            private Builder() {
            } 

            private Builder(AuthSetModel model) {
                this.authSetMode = model.authSetMode;
            } 

            /**
             * authSetMode.
             */
            public Builder authSetMode(String authSetMode) {
                this.authSetMode = authSetMode;
                return this;
            }

            public AuthSetModel build() {
                return new AuthSetModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiKeysResponseBody</p>
     */
    public static class ApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyValue")
        private String apiKeyValue;

        @com.aliyun.core.annotation.NameInMap("apikeyId")
        private String apikeyId;

        @com.aliyun.core.annotation.NameInMap("authSetModel")
        private AuthSetModel authSetModel;

        @com.aliyun.core.annotation.NameInMap("blocked")
        private Integer blocked;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("extData")
        private String extData;

        @com.aliyun.core.annotation.NameInMap("parentUid")
        private String parentUid;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private ApiKeys(Builder builder) {
            this.apiKeyValue = builder.apiKeyValue;
            this.apikeyId = builder.apikeyId;
            this.authSetModel = builder.authSetModel;
            this.blocked = builder.blocked;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.extData = builder.extData;
            this.parentUid = builder.parentUid;
            this.type = builder.type;
            this.uid = builder.uid;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeys create() {
            return builder().build();
        }

        /**
         * @return apiKeyValue
         */
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        /**
         * @return apikeyId
         */
        public String getApikeyId() {
            return this.apikeyId;
        }

        /**
         * @return authSetModel
         */
        public AuthSetModel getAuthSetModel() {
            return this.authSetModel;
        }

        /**
         * @return blocked
         */
        public Integer getBlocked() {
            return this.blocked;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return extData
         */
        public String getExtData() {
            return this.extData;
        }

        /**
         * @return parentUid
         */
        public String getParentUid() {
            return this.parentUid;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String apiKeyValue; 
            private String apikeyId; 
            private AuthSetModel authSetModel; 
            private Integer blocked; 
            private Long createTime; 
            private String creator; 
            private String description; 
            private Long expireTime; 
            private String extData; 
            private String parentUid; 
            private Integer type; 
            private String uid; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.apiKeyValue = model.apiKeyValue;
                this.apikeyId = model.apikeyId;
                this.authSetModel = model.authSetModel;
                this.blocked = model.blocked;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.extData = model.extData;
                this.parentUid = model.parentUid;
                this.type = model.type;
                this.uid = model.uid;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * apiKeyValue.
             */
            public Builder apiKeyValue(String apiKeyValue) {
                this.apiKeyValue = apiKeyValue;
                return this;
            }

            /**
             * apikeyId.
             */
            public Builder apikeyId(String apikeyId) {
                this.apikeyId = apikeyId;
                return this;
            }

            /**
             * authSetModel.
             */
            public Builder authSetModel(AuthSetModel authSetModel) {
                this.authSetModel = authSetModel;
                return this;
            }

            /**
             * blocked.
             */
            public Builder blocked(Integer blocked) {
                this.blocked = blocked;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * expireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * extData.
             */
            public Builder extData(String extData) {
                this.extData = extData;
                return this;
            }

            /**
             * parentUid.
             */
            public Builder parentUid(String parentUid) {
                this.parentUid = parentUid;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
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
