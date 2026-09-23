// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetAdHocTaskLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetAdHocTaskLogResponseBody</p>
 */
public class GetAdHocTaskLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("LogInfo")
    private LogInfo logInfo;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAdHocTaskLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.logInfo = builder.logInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdHocTaskLogResponseBody create() {
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
     * @return logInfo
     */
    public LogInfo getLogInfo() {
        return this.logInfo;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Integer httpStatusCode; 
        private LogInfo logInfo; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAdHocTaskLogResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.logInfo = model.logInfo;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The log details.</p>
         */
        public Builder logInfo(LogInfo logInfo) {
            this.logInfo = logInfo;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAdHocTaskLogResponseBody build() {
            return new GetAdHocTaskLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAdHocTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetAdHocTaskLogResponseBody</p>
     */
    public static class LogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("HasResult")
        private Boolean hasResult;

        @com.aliyun.core.annotation.NameInMap("NextOffset")
        private Integer nextOffset;

        @com.aliyun.core.annotation.NameInMap("SubTaskId")
        private Integer subTaskId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private LogInfo(Builder builder) {
            this.content = builder.content;
            this.hasNext = builder.hasNext;
            this.hasResult = builder.hasResult;
            this.nextOffset = builder.nextOffset;
            this.subTaskId = builder.subTaskId;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return hasResult
         */
        public Boolean getHasResult() {
            return this.hasResult;
        }

        /**
         * @return nextOffset
         */
        public Integer getNextOffset() {
            return this.nextOffset;
        }

        /**
         * @return subTaskId
         */
        public Integer getSubTaskId() {
            return this.subTaskId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String content; 
            private Boolean hasNext; 
            private Boolean hasResult; 
            private Integer nextOffset; 
            private Integer subTaskId; 
            private String taskId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(LogInfo model) {
                this.content = model.content;
                this.hasNext = model.hasNext;
                this.hasResult = model.hasResult;
                this.nextOffset = model.nextOffset;
                this.subTaskId = model.subTaskId;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The runtime log content.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Indicates whether the next log entry exists.</p>
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * <p>Indicates whether the current query produces a result.</p>
             */
            public Builder hasResult(Boolean hasResult) {
                this.hasResult = hasResult;
                return this;
            }

            /**
             * <p>The start position of the next log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>2021</p>
             */
            public Builder nextOffset(Integer nextOffset) {
                this.nextOffset = nextOffset;
                return this;
            }

            /**
             * <p>The subtask ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subTaskId(Integer subTaskId) {
                this.subTaskId = subTaskId;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute_SQL_300000843_1611548758327</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task running status. Example: WAIT_RESOURCE indicates that the task is waiting for resources.</p>
             * 
             * <strong>example:</strong>
             * <p>WAIT_RESOURCE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public LogInfo build() {
                return new LogInfo(this);
            } 

        } 

    }
}
