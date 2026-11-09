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
 * {@link ListAgentVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentVersionsResponseBody</p>
 */
public class ListAgentVersionsResponseBody extends TeaModel {
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

    private ListAgentVersionsResponseBody(Builder builder) {
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

    public static ListAgentVersionsResponseBody create() {
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

        private Builder(ListAgentVersionsResponseBody model) {
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
         * <p>The business status code. The value is SUCCESS if the request is successful, or an error code if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
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
         * <p>The list of fixed versions on the current page, sorted in descending order of creation time. The configuration is not included.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries per page used in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response message. The value is success if the request is successful, or an error message if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token for the next page. Pass this value as the nextToken request parameter to query the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>YWdlbnQtdmVyc2lvbnM6MjA</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
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
         * <p>The total number of undeleted fixed versions of the agent, excluding the system-maintained latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAgentVersionsResponseBody build() {
            return new ListAgentVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentVersionsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("artifactStatus")
        private String artifactStatus;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("targetSpecVersion")
        private Long targetSpecVersion;

        @com.aliyun.core.annotation.NameInMap("versionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Items(Builder builder) {
            this.agentId = builder.agentId;
            this.agentVersion = builder.agentVersion;
            this.artifactStatus = builder.artifactStatus;
            this.createdAt = builder.createdAt;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.targetSpecVersion = builder.targetSpecVersion;
            this.versionName = builder.versionName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return artifactStatus
         */
        public String getArtifactStatus() {
            return this.artifactStatus;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return targetSpecVersion
         */
        public Long getTargetSpecVersion() {
            return this.targetSpecVersion;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentVersion; 
            private String artifactStatus; 
            private String createdAt; 
            private String createdBy; 
            private String description; 
            private Long targetSpecVersion; 
            private String versionName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.agentId = model.agentId;
                this.agentVersion = model.agentVersion;
                this.artifactStatus = model.artifactStatus;
                this.createdAt = model.createdAt;
                this.createdBy = model.createdBy;
                this.description = model.description;
                this.targetSpecVersion = model.targetSpecVersion;
                this.versionName = model.versionName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The ID of the managed or custom agent to which the version belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-0123456789abcdef0123456789abcdef</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The version number generated by the system in ascending order for the agent, such as v1 and v2. It is used when querying, deleting, and referencing the version in service endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>Indicates only whether the version template and artifact archiving are complete, and does not represent the deployment or running status. READY indicates complete, and INVALID indicates missing or inconsistent archiving.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder artifactStatus(String artifactStatus) {
                this.artifactStatus = artifactStatus;
                return this;
            }

            /**
             * <p>The time when the version was saved, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T01:02:03Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account of the caller who saved the version. If a RAM user makes the call, this is the UID of the Alibaba Cloud account to which the RAM user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The version description provided when saving the version, up to 1,024 characters. It is empty if no description was provided when saving.</p>
             * 
             * <strong>example:</strong>
             * <p>Stable production version</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The effective release serial number of the agent when the version was saved, which is the effectiveSpecVersion at that time. This value does not change after the version is saved.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder targetSpecVersion(Long targetSpecVersion) {
                this.targetSpecVersion = targetSpecVersion;
                return this;
            }

            /**
             * <p>The display name specified by the user when saving the version. For earlier saved versions without a recorded name, the agentVersion is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Production stable version V1.0</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * <p>The ID of the AgentCore workspace where the agent that owns the version resides.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-0123456789abcdef01234</p>
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
