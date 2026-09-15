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
             * activeSessionCount.
             */
            public Builder activeSessionCount(Integer activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
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
             * lastActiveAt.
             */
            public Builder lastActiveAt(String lastActiveAt) {
                this.lastActiveAt = lastActiveAt;
                return this;
            }

            /**
             * lastHeartbeatAt.
             */
            public Builder lastHeartbeatAt(String lastHeartbeatAt) {
                this.lastHeartbeatAt = lastHeartbeatAt;
                return this;
            }

            /**
             * maxConcurrentSessions.
             */
            public Builder maxConcurrentSessions(Integer maxConcurrentSessions) {
                this.maxConcurrentSessions = maxConcurrentSessions;
                return this;
            }

            /**
             * phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * sandboxId.
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
