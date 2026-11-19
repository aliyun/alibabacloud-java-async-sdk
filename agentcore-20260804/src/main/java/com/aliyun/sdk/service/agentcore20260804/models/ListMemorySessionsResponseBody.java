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
 * {@link ListMemorySessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMemorySessionsResponseBody</p>
 */
public class ListMemorySessionsResponseBody extends TeaModel {
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

    private ListMemorySessionsResponseBody(Builder builder) {
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

    public static ListMemorySessionsResponseBody create() {
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

        private Builder(ListMemorySessionsResponseBody model) {
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
         * <p>The list of sessions.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>eyJvZmZzZXQiOjEwMH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMemorySessionsResponseBody build() {
            return new ListMemorySessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMemorySessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemorySessionsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("teamId")
        private String teamId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Items(Builder builder) {
            this.agentId = builder.agentId;
            this.createdAt = builder.createdAt;
            this.metadata = builder.metadata;
            this.sessionId = builder.sessionId;
            this.teamId = builder.teamId;
            this.title = builder.title;
            this.userId = builder.userId;
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
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return teamId
         */
        public String getTeamId() {
            return this.teamId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String createdAt; 
            private java.util.Map<String, String> metadata; 
            private String sessionId; 
            private String teamId; 
            private String title; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.agentId = model.agentId;
                this.createdAt = model.createdAt;
                this.metadata = model.metadata;
                this.sessionId = model.sessionId;
                this.teamId = model.teamId;
                this.title = model.title;
                this.userId = model.userId;
            } 

            /**
             * <p>The agent ID. This field is not returned if the session is not associated with an agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The creation time in RFC 3339 format with time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The string key-value tags set by the caller. A maximum of 16 tags are supported. A key can be up to 64 Unicode characters in length, and a value can be up to 1,024 Unicode characters in length. Empty strings are allowed. Nested objects or arrays are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The business team ID defined by the caller. If specified, the value cannot be empty and can be up to 128 UTF-8 bytes in length.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The session title.</p>
             * 
             * <strong>example:</strong>
             * <p>Travel plan</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The user ID. This field is not returned if the session is not associated with a user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
