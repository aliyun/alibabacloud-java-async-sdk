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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * LogInfo.
         */
        public Builder logInfo(LogInfo logInfo) {
            this.logInfo = logInfo;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * HasNext.
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * HasResult.
             */
            public Builder hasResult(Boolean hasResult) {
                this.hasResult = hasResult;
                return this;
            }

            /**
             * NextOffset.
             */
            public Builder nextOffset(Integer nextOffset) {
                this.nextOffset = nextOffset;
                return this;
            }

            /**
             * SubTaskId.
             */
            public Builder subTaskId(Integer subTaskId) {
                this.subTaskId = subTaskId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
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
