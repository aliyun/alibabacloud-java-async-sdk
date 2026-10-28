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
 * {@link UpdateSessionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSessionResponseBody</p>
 */
public class UpdateSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateSessionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSessionResponseBody create() {
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

        private Builder(UpdateSessionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The session information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. A value of true indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateSessionResponseBody build() {
            return new UpdateSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSessionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSessionResponseBody</p>
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
             * <p>The time when the session was created, in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The ID of the last run.</p>
             * 
             * <strong>example:</strong>
             * <p>run_example_001</p>
             */
            public Builder lastRunId(String lastRunId) {
                this.lastRunId = lastRunId;
                return this;
            }

            /**
             * <p>The status of the last run. Valid values:</p>
             * <ul>
             * <li><code>PENDING</code>: Pending.</li>
             * <li><code>RUNNING</code>: Running.</li>
             * <li><code>WAITING_USER</code>: Waiting for interrupt handling.</li>
             * <li><code>COMPLETED</code>: Completed.</li>
             * <li><code>FAILED</code>: Failed.</li>
             * <li><code>CANCELLED</code>: Cancelled.</li>
             * <li><code>REJECTED</code>: Rejected.</li>
             * </ul>
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
             * <p>The session status. Valid values:</p>
             * <ul>
             * <li><code>IDLE</code>: Idle.</li>
             * <li><code>ACTIVE</code>: Active.</li>
             * <li><code>WAITING_USER_INPUT</code>: Waiting for user input.</li>
             * <li><code>WAITING_APPROVAL</code>: Waiting for user confirmation.</li>
             * <li><code>WAITING_OUT_OF_BAND_APPROVAL</code>: Waiting for out-of-band approval.</li>
             * <li><code>CLOSED</code>: Closed.</li>
             * </ul>
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
             * <p>The time when the session was last updated, in RFC 3339 format.</p>
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
