// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetAgentWorkLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentWorkLogResponseBody</p>
 */
public class GetAgentWorkLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private GetAgentWorkLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.logs = builder.logs;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentWorkLogResponseBody create() {
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
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Logs> logs; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(GetAgentWorkLogResponseBody model) {
            this.code = model.code;
            this.logs = model.logs;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The agent operation records in reverse chronological order. If no records are saved, an empty list is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of filtered operation log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetAgentWorkLogResponseBody build() {
            return new GetAgentWorkLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentWorkLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentWorkLogResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private Logs(Builder builder) {
            this.action = builder.action;
            this.detail = builder.detail;
            this.duration = builder.duration;
            this.nodeId = builder.nodeId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String detail; 
            private Long duration; 
            private String nodeId; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.action = model.action;
                this.detail = model.detail;
                this.duration = model.duration;
                this.nodeId = model.nodeId;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, and ARTIFACT.</p>
             * 
             * <strong>example:</strong>
             * <p>REPLY</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The saved raw record content. Tool invocations and artifact metadata are represented as JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>The data query for the current round is completed</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The duration of this operation record, in milliseconds. The value is 0 for artifact records.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The key of the node to which the record belongs. This is not the session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The time when the event was recorded, in ISO 8601 format. If the source record has no time, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
