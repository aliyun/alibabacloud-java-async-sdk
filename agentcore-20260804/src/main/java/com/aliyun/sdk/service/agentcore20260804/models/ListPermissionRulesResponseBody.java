// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListPermissionRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionRulesResponseBody</p>
 */
public class ListPermissionRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

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
    private Long totalCount;

    private ListPermissionRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
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

    public static ListPermissionRulesResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListPermissionRulesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of permission rules.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of results returned in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The request processing result message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>token-example</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of rules that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPermissionRulesResponseBody build() {
            return new ListPermissionRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPermissionRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("enforcementMode")
        private String enforcementMode;

        @com.aliyun.core.annotation.NameInMap("permissionRuleId")
        private String permissionRuleId;

        @com.aliyun.core.annotation.NameInMap("principalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("principalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("principalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourceDetail")
        private String sourceDetail;

        @com.aliyun.core.annotation.NameInMap("targetScope")
        private String targetScope;

        @com.aliyun.core.annotation.NameInMap("targets")
        private java.util.List<String> targets;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Items(Builder builder) {
            this.createdAt = builder.createdAt;
            this.effect = builder.effect;
            this.enforcementMode = builder.enforcementMode;
            this.permissionRuleId = builder.permissionRuleId;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.source = builder.source;
            this.sourceDetail = builder.sourceDetail;
            this.targetScope = builder.targetScope;
            this.targets = builder.targets;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return enforcementMode
         */
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        /**
         * @return permissionRuleId
         */
        public String getPermissionRuleId() {
            return this.permissionRuleId;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceDetail
         */
        public String getSourceDetail() {
            return this.sourceDetail;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        /**
         * @return targets
         */
        public java.util.List<String> getTargets() {
            return this.targets;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String effect; 
            private String enforcementMode; 
            private String permissionRuleId; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String resourceId; 
            private String resourceType; 
            private String source; 
            private String sourceDetail; 
            private String targetScope; 
            private java.util.List<String> targets; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createdAt = model.createdAt;
                this.effect = model.effect;
                this.enforcementMode = model.enforcementMode;
                this.permissionRuleId = model.permissionRuleId;
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.source = model.source;
                this.sourceDetail = model.sourceDetail;
                this.targetScope = model.targetScope;
                this.targets = model.targets;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The creation time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The authorization effect.</p>
             * 
             * <strong>example:</strong>
             * <p>ALLOW</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>The rule enforcement mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ENFORCE</p>
             */
            public Builder enforcementMode(String enforcementMode) {
                this.enforcementMode = enforcementMode;
                return this;
            }

            /**
             * <p>The permission rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pr-1234567890</p>
             */
            public Builder permissionRuleId(String permissionRuleId) {
                this.permissionRuleId = permissionRuleId;
                return this;
            }

            /**
             * <p>The principal ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The principal name.</p>
             * 
             * <strong>example:</strong>
             * <p>example-user</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The principal type.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1234567890</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The rule source.</p>
             * 
             * <strong>example:</strong>
             * <p>AgentCore</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The rule source details.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI</p>
             */
            public Builder sourceDetail(String sourceDetail) {
                this.sourceDetail = sourceDetail;
                return this;
            }

            /**
             * <p>The target scope.</p>
             * 
             * <strong>example:</strong>
             * <p>SPECIFIED</p>
             */
            public Builder targetScope(String targetScope) {
                this.targetScope = targetScope;
                return this;
            }

            /**
             * <p>The list of rule targets.</p>
             */
            public Builder targets(java.util.List<String> targets) {
                this.targets = targets;
                return this;
            }

            /**
             * <p>The update time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
