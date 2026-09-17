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
 * {@link ListSandboxesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSandboxesResponseBody</p>
 */
public class ListSandboxesResponseBody extends TeaModel {
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

    private ListSandboxesResponseBody(Builder builder) {
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

    public static ListSandboxesResponseBody create() {
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

        private Builder(ListSandboxesResponseBody model) {
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
         * <p>The business status code. The value SUCCESS is returned if the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 is returned if the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of sandboxes that match the filter conditions.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of records per page for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response message. The value success is returned if the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token for the next page. An empty value indicates that no more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSandboxesResponseBody build() {
            return new ListSandboxesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSandboxesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSandboxesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeSessionCount")
        private Integer activeSessionCount;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("lastActiveAt")
        private String lastActiveAt;

        @com.aliyun.core.annotation.NameInMap("lastHeartbeatAt")
        private String lastHeartbeatAt;

        @com.aliyun.core.annotation.NameInMap("maxConcurrentSessions")
        private Integer maxConcurrentSessions;

        @com.aliyun.core.annotation.NameInMap("phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("sandboxId")
        private String sandboxId;

        private Items(Builder builder) {
            this.activeSessionCount = builder.activeSessionCount;
            this.createdAt = builder.createdAt;
            this.lastActiveAt = builder.lastActiveAt;
            this.lastHeartbeatAt = builder.lastHeartbeatAt;
            this.maxConcurrentSessions = builder.maxConcurrentSessions;
            this.phase = builder.phase;
            this.sandboxId = builder.sandboxId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return activeSessionCount
         */
        public Integer getActiveSessionCount() {
            return this.activeSessionCount;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return lastActiveAt
         */
        public String getLastActiveAt() {
            return this.lastActiveAt;
        }

        /**
         * @return lastHeartbeatAt
         */
        public String getLastHeartbeatAt() {
            return this.lastHeartbeatAt;
        }

        /**
         * @return maxConcurrentSessions
         */
        public Integer getMaxConcurrentSessions() {
            return this.maxConcurrentSessions;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return sandboxId
         */
        public String getSandboxId() {
            return this.sandboxId;
        }

        public static final class Builder {
            private Integer activeSessionCount; 
            private String createdAt; 
            private String lastActiveAt; 
            private String lastHeartbeatAt; 
            private Integer maxConcurrentSessions; 
            private String phase; 
            private String sandboxId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.activeSessionCount = model.activeSessionCount;
                this.createdAt = model.createdAt;
                this.lastActiveAt = model.lastActiveAt;
                this.lastHeartbeatAt = model.lastHeartbeatAt;
                this.maxConcurrentSessions = model.maxConcurrentSessions;
                this.phase = model.phase;
                this.sandboxId = model.sandboxId;
            } 

            /**
             * <p>The number of active sessions for this sandbox.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder activeSessionCount(Integer activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
            }

            /**
             * <p>The time when the sandbox was created, in RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-29T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The time of the last activity on the sandbox, in RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-29T00:02:00Z</p>
             */
            public Builder lastActiveAt(String lastActiveAt) {
                this.lastActiveAt = lastActiveAt;
                return this;
            }

            /**
             * <p>The time of the last heartbeat from the sandbox, in RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-29T00:01:00Z</p>
             */
            public Builder lastHeartbeatAt(String lastHeartbeatAt) {
                this.lastHeartbeatAt = lastHeartbeatAt;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions allowed for this sandbox, derived from the auto scaling configuration in effect at runtime. This value is empty if auto scaling is not enabled or the configuration is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder maxConcurrentSessions(Integer maxConcurrentSessions) {
                this.maxConcurrentSessions = maxConcurrentSessions;
                return this;
            }

            /**
             * <p>The current running phase of the sandbox.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The sandbox ID. You can call the ListSandboxes operation to query sandbox IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>sbx-2</p>
             */
            public Builder sandboxId(String sandboxId) {
                this.sandboxId = sandboxId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
