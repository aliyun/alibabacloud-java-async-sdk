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
 * {@link GetPhysicalInstanceLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhysicalInstanceLogResponseBody</p>
 */
public class GetPhysicalInstanceLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskrunLogList")
    private java.util.List<TaskrunLogList> taskrunLogList;

    private GetPhysicalInstanceLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskrunLogList = builder.taskrunLogList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalInstanceLogResponseBody create() {
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

    /**
     * @return taskrunLogList
     */
    public java.util.List<TaskrunLogList> getTaskrunLogList() {
        return this.taskrunLogList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TaskrunLogList> taskrunLogList; 

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

        /**
         * TaskrunLogList.
         */
        public Builder taskrunLogList(java.util.List<TaskrunLogList> taskrunLogList) {
            this.taskrunLogList = taskrunLogList;
            return this;
        }

        public GetPhysicalInstanceLogResponseBody build() {
            return new GetPhysicalInstanceLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPhysicalInstanceLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalInstanceLogResponseBody</p>
     */
    public static class TaskrunLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("LogContent")
        private String logContent;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskrunId")
        private String taskrunId;

        private TaskrunLogList(Builder builder) {
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.logContent = builder.logContent;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskrunId = builder.taskrunId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskrunLogList create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return logContent
         */
        public String getLogContent() {
            return this.logContent;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskrunId
         */
        public String getTaskrunId() {
            return this.taskrunId;
        }

        public static final class Builder {
            private String duration; 
            private String endTime; 
            private String logContent; 
            private String startTime; 
            private String status; 
            private String taskrunId; 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * LogContent.
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskrunId.
             */
            public Builder taskrunId(String taskrunId) {
                this.taskrunId = taskrunId;
                return this;
            }

            public TaskrunLogList build() {
                return new TaskrunLogList(this);
            } 

        } 

    }
}
