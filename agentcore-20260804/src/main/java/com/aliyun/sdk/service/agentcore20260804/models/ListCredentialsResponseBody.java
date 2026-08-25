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
 * {@link ListCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCredentialsResponseBody</p>
 */
public class ListCredentialsResponseBody extends TeaModel {
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

    private ListCredentialsResponseBody(Builder builder) {
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

    public static ListCredentialsResponseBody create() {
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

        private Builder(ListCredentialsResponseBody model) {
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
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * requestId.
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCredentialsResponseBody build() {
            return new ListCredentialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundAgentsCounts")
        private Integer boundAgentsCounts;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("credentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("credentialMetadata")
        private String credentialMetadata;

        @com.aliyun.core.annotation.NameInMap("credentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Items(Builder builder) {
            this.boundAgentsCounts = builder.boundAgentsCounts;
            this.createdAt = builder.createdAt;
            this.credentialId = builder.credentialId;
            this.credentialMetadata = builder.credentialMetadata;
            this.credentialType = builder.credentialType;
            this.description = builder.description;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return boundAgentsCounts
         */
        public Integer getBoundAgentsCounts() {
            return this.boundAgentsCounts;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return credentialMetadata
         */
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Integer boundAgentsCounts; 
            private String createdAt; 
            private String credentialId; 
            private String credentialMetadata; 
            private String credentialType; 
            private String description; 
            private String name; 
            private String regionId; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.boundAgentsCounts = model.boundAgentsCounts;
                this.createdAt = model.createdAt;
                this.credentialId = model.credentialId;
                this.credentialMetadata = model.credentialMetadata;
                this.credentialType = model.credentialType;
                this.description = model.description;
                this.name = model.name;
                this.regionId = model.regionId;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * boundAgentsCounts.
             */
            public Builder boundAgentsCounts(Integer boundAgentsCounts) {
                this.boundAgentsCounts = boundAgentsCounts;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * credentialId.
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * credentialMetadata.
             */
            public Builder credentialMetadata(String credentialMetadata) {
                this.credentialMetadata = credentialMetadata;
                return this;
            }

            /**
             * credentialType.
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
