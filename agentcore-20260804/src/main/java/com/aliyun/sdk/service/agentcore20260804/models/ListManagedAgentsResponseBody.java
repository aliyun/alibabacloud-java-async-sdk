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
 * {@link ListManagedAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListManagedAgentsResponseBody</p>
 */
public class ListManagedAgentsResponseBody extends TeaModel {
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

    private ListManagedAgentsResponseBody(Builder builder) {
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

    public static ListManagedAgentsResponseBody create() {
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

        private Builder(ListManagedAgentsResponseBody model) {
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
         * <p>The business status code. A value of SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of managed agents.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;agentId&quot;:&quot;agent-xxxxxx&quot;,&quot;workspaceId&quot;:&quot;ws-xxxxxx&quot;,&quot;agentName&quot;:&quot;demo-agent&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;template&quot;:{&quot;templateId&quot;:&quot;tpl-xxxxxx&quot;,&quot;templateVersion&quot;:&quot;v1.0.0&quot;},&quot;spec&quot;:{&quot;replicas&quot;:1,&quot;cpu&quot;:&quot;2&quot;,&quot;memory&quot;:&quot;4Gi&quot;},&quot;createTime&quot;:&quot;2026-01-01T00:00:00Z&quot;,&quot;updateTime&quot;:&quot;2026-01-01T00:00:00Z&quot;}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of results returned for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token for the next page. An empty value indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-1</p>
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListManagedAgentsResponseBody build() {
            return new ListManagedAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListManagedAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListManagedAgentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("createMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("effectiveSpecVersion")
        private Long effectiveSpecVersion;

        @com.aliyun.core.annotation.NameInMap("latestSpecVersion")
        private Long latestSpecVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Items(Builder builder) {
            this.agentId = builder.agentId;
            this.createMode = builder.createMode;
            this.createdAt = builder.createdAt;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.effectiveSpecVersion = builder.effectiveSpecVersion;
            this.latestSpecVersion = builder.latestSpecVersion;
            this.name = builder.name;
            this.runtime = builder.runtime;
            this.status = builder.status;
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
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveSpecVersion
         */
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        /**
         * @return latestSpecVersion
         */
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String agentId; 
            private String createMode; 
            private String createdAt; 
            private String deployType; 
            private String description; 
            private Long effectiveSpecVersion; 
            private Long latestSpecVersion; 
            private String name; 
            private String runtime; 
            private String status; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.agentId = model.agentId;
                this.createMode = model.createMode;
                this.createdAt = model.createdAt;
                this.deployType = model.deployType;
                this.description = model.description;
                this.effectiveSpecVersion = model.effectiveSpecVersion;
                this.latestSpecVersion = model.latestSpecVersion;
                this.name = model.name;
                this.runtime = model.runtime;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The managed agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The creation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Managed</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
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
             * <p>The deployment type.</p>
             * 
             * <strong>example:</strong>
             * <p>Managed</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The description of the managed agent.</p>
             * 
             * <strong>example:</strong>
             * <p>An agent for code review</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The effective specification version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder effectiveSpecVersion(Long effectiveSpecVersion) {
                this.effectiveSpecVersion = effectiveSpecVersion;
                return this;
            }

            /**
             * <p>The latest specification version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestSpecVersion(Long latestSpecVersion) {
                this.latestSpecVersion = latestSpecVersion;
                return this;
            }

            /**
             * <p>The managed agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The runtime type.</p>
             * 
             * <strong>example:</strong>
             * <p>Managed</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The status of the managed agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
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

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1</p>
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
