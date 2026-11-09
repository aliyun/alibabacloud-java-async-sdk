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
         * <p>The business status code. The value is SUCCESS if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. The value is 200 if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of sandboxes that meet the filter conditions.</p>
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
         * <p>The response message. The value is success if the request is successful.</p>
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
         * <p>Indicates whether the request is successful. A value of true indicates success, and a value of false indicates failure.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions.</p>
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

        @com.aliyun.core.annotation.NameInMap("harnessVersion")
        private String harnessVersion;

        @com.aliyun.core.annotation.NameInMap("lastActiveAt")
        private String lastActiveAt;

        @com.aliyun.core.annotation.NameInMap("lastHeartbeatAt")
        private String lastHeartbeatAt;

        @com.aliyun.core.annotation.NameInMap("lastRebuildOperationId")
        private String lastRebuildOperationId;

        @com.aliyun.core.annotation.NameInMap("maxConcurrentSessions")
        private Integer maxConcurrentSessions;

        @com.aliyun.core.annotation.NameInMap("phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("sandboxId")
        private String sandboxId;

        @com.aliyun.core.annotation.NameInMap("updateAvailable")
        private Boolean updateAvailable;

        @com.aliyun.core.annotation.NameInMap("updateFailed")
        private Boolean updateFailed;

        private Items(Builder builder) {
            this.activeSessionCount = builder.activeSessionCount;
            this.createdAt = builder.createdAt;
            this.harnessVersion = builder.harnessVersion;
            this.lastActiveAt = builder.lastActiveAt;
            this.lastHeartbeatAt = builder.lastHeartbeatAt;
            this.lastRebuildOperationId = builder.lastRebuildOperationId;
            this.maxConcurrentSessions = builder.maxConcurrentSessions;
            this.phase = builder.phase;
            this.sandboxId = builder.sandboxId;
            this.updateAvailable = builder.updateAvailable;
            this.updateFailed = builder.updateFailed;
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
         * @return harnessVersion
         */
        public String getHarnessVersion() {
            return this.harnessVersion;
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
         * @return lastRebuildOperationId
         */
        public String getLastRebuildOperationId() {
            return this.lastRebuildOperationId;
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

        /**
         * @return updateAvailable
         */
        public Boolean getUpdateAvailable() {
            return this.updateAvailable;
        }

        /**
         * @return updateFailed
         */
        public Boolean getUpdateFailed() {
            return this.updateFailed;
        }

        public static final class Builder {
            private Integer activeSessionCount; 
            private String createdAt; 
            private String harnessVersion; 
            private String lastActiveAt; 
            private String lastHeartbeatAt; 
            private String lastRebuildOperationId; 
            private Integer maxConcurrentSessions; 
            private String phase; 
            private String sandboxId; 
            private Boolean updateAvailable; 
            private Boolean updateFailed; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.activeSessionCount = model.activeSessionCount;
                this.createdAt = model.createdAt;
                this.harnessVersion = model.harnessVersion;
                this.lastActiveAt = model.lastActiveAt;
                this.lastHeartbeatAt = model.lastHeartbeatAt;
                this.lastRebuildOperationId = model.lastRebuildOperationId;
                this.maxConcurrentSessions = model.maxConcurrentSessions;
                this.phase = model.phase;
                this.sandboxId = model.sandboxId;
                this.updateAvailable = model.updateAvailable;
                this.updateFailed = model.updateFailed;
            } 

            /**
             * <p>The number of active sessions in the sandbox.</p>
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
             * <p>The tag of the actual observed image of the currently returned instance. This parameter is empty if the tag cannot be parsed.</p>
             * 
             * <strong>example:</strong>
             * <p>202611031754</p>
             */
            public Builder harnessVersion(String harnessVersion) {
                this.harnessVersion = harnessVersion;
                return this;
            }

            /**
             * <p>The time of the last activity of the sandbox, in RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-29T00:02:00Z</p>
             */
            public Builder lastActiveAt(String lastActiveAt) {
                this.lastActiveAt = lastActiveAt;
                return this;
            }

            /**
             * <p>The time of the last heartbeat of the sandbox, in RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-29T00:01:00Z</p>
             */
            public Builder lastHeartbeatAt(String lastHeartbeatAt) {
                this.lastHeartbeatAt = lastHeartbeatAt;
                return this;
            }

            /**
             * <p>Used to continue calling GetSandboxRebuildOperation to query the overall result after a page refresh. This parameter is empty if there is no historical rebuild. Do not use the ID of a subsequently created task instead.</p>
             * 
             * <strong>example:</strong>
             * <p>01a19f98-906d-7e82-96aa-8b7ea1d1a29d</p>
             */
            public Builder lastRebuildOperationId(String lastRebuildOperationId) {
                this.lastRebuildOperationId = lastRebuildOperationId;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions allowed for the sandbox, which is obtained from the effective auto-scaling configuration at runtime. This parameter is empty if auto-scaling is disabled or the configuration is unavailable.</p>
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
             * <p>The sandbox ID, which can be queried by calling ListSandboxes.</p>
             * 
             * <strong>example:</strong>
             * <p>sbx-2</p>
             */
            public Builder sandboxId(String sandboxId) {
                this.sandboxId = sandboxId;
                return this;
            }

            /**
             * <p>The server compares the actual image tag of the instance with the pool target image tag. The value is true if the tags are different during the RUNNING, HIBERNATED, or FAILED phase. The value is false if the tags are the same or during other known phases. This parameter is empty if the tag or phase cannot be confirmed, and it cannot be treated as false. The version sequence is not determined by the tag size.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder updateAvailable(Boolean updateAvailable) {
                this.updateAvailable = updateAvailable;
                return this;
            }

            /**
             * <p>A value of true indicates that the most recent rebuild corresponding to the current instance generation failed as a whole. A value of false indicates that there is no historical rebuild or the rebuild succeeded as a whole. This parameter is empty if the rebuild is in progress, canceled, replaced, the generation does not match, or the result cannot be confirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder updateFailed(Boolean updateFailed) {
                this.updateFailed = updateFailed;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
