// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link GetSessionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSessionResponseBody</p>
 */
public class GetSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetSessionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSessionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSessionResponseBody build() {
            return new GetSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("lastRunId")
        private String lastRunId;

        @com.aliyun.core.annotation.NameInMap("lastRunStatus")
        private String lastRunStatus;

        @com.aliyun.core.annotation.NameInMap("pinned")
        private Boolean pinned;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.lastRunId = builder.lastRunId;
            this.lastRunStatus = builder.lastRunStatus;
            this.pinned = builder.pinned;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.title = builder.title;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return lastRunId
         */
        public String getLastRunId() {
            return this.lastRunId;
        }

        /**
         * @return lastRunStatus
         */
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        /**
         * @return pinned
         */
        public Boolean getPinned() {
            return this.pinned;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String lastRunId; 
            private String lastRunStatus; 
            private Boolean pinned; 
            private String sessionId; 
            private String status; 
            private String title; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.lastRunId = model.lastRunId;
                this.lastRunStatus = model.lastRunStatus;
                this.pinned = model.pinned;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.title = model.title;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The time when the session was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The ID of the most recent run.</p>
             * 
             * <strong>example:</strong>
             * <p>run_example_001</p>
             */
            public Builder lastRunId(String lastRunId) {
                this.lastRunId = lastRunId;
                return this;
            }

            /**
             * <p>The status of the most recent run. Valid values: <code>PENDING</code> (pending execution), <code>RUNNING</code> (running), <code>WAITING_USER</code> (waiting for interrupt handling), <code>COMPLETED</code> (completed), <code>FAILED</code> (failed), <code>CANCELLED</code> (cancelled), and <code>REJECTED</code> (rejected).</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder lastRunStatus(String lastRunStatus) {
                this.lastRunStatus = lastRunStatus;
                return this;
            }

            /**
             * <p>Indicates whether the session is pinned.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pinned(Boolean pinned) {
                this.pinned = pinned;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>session_example_001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The session status. Valid values: <code>IDLE</code> (idle), <code>ACTIVE</code> (active), <code>WAITING_USER_INPUT</code> (waiting for user input), <code>WAITING_APPROVAL</code> (waiting for user confirmation), <code>WAITING_OUT_OF_BAND_APPROVAL</code> (waiting for out-of-band approval), and <code>CLOSED</code> (closed).</p>
             * 
             * <strong>example:</strong>
             * <p>IDLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The session title.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud resource inspection example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The time when the session was last updated, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:01:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
