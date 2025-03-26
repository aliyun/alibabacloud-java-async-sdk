// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link AITeacherSyncPracticeTaskGenerateResponseBody} extends {@link TeaModel}
 *
 * <p>AITeacherSyncPracticeTaskGenerateResponseBody</p>
 */
public class AITeacherSyncPracticeTaskGenerateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private AITeacherSyncPracticeTaskGenerateResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AITeacherSyncPracticeTaskGenerateResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AITeacherSyncPracticeTaskGenerateResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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

        public AITeacherSyncPracticeTaskGenerateResponseBody build() {
            return new AITeacherSyncPracticeTaskGenerateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AITeacherSyncPracticeTaskGenerateResponseBody} extends {@link TeaModel}
     *
     * <p>AITeacherSyncPracticeTaskGenerateResponseBody</p>
     */
    public static class TaskContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assistant")
        private String assistant;

        @com.aliyun.core.annotation.NameInMap("user")
        private String user;

        private TaskContent(Builder builder) {
            this.assistant = builder.assistant;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskContent create() {
            return builder().build();
        }

        /**
         * @return assistant
         */
        public String getAssistant() {
            return this.assistant;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String assistant; 
            private String user; 

            private Builder() {
            } 

            private Builder(TaskContent model) {
                this.assistant = model.assistant;
                this.user = model.user;
            } 

            /**
             * assistant.
             */
            public Builder assistant(String assistant) {
                this.assistant = assistant;
                return this;
            }

            /**
             * user.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public TaskContent build() {
                return new TaskContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link AITeacherSyncPracticeTaskGenerateResponseBody} extends {@link TeaModel}
     *
     * <p>AITeacherSyncPracticeTaskGenerateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("taskContent")
        private java.util.List<TaskContent> taskContent;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        private Data(Builder builder) {
            this.taskContent = builder.taskContent;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskContent
         */
        public java.util.List<TaskContent> getTaskContent() {
            return this.taskContent;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private java.util.List<TaskContent> taskContent; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskContent = model.taskContent;
                this.taskType = model.taskType;
            } 

            /**
             * taskContent.
             */
            public Builder taskContent(java.util.List<TaskContent> taskContent) {
                this.taskContent = taskContent;
                return this;
            }

            /**
             * taskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
