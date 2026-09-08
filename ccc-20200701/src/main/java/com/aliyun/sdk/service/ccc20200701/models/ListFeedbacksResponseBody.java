// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListFeedbacksResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeedbacksResponseBody</p>
 */
public class ListFeedbacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFeedbacksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeedbacksResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFeedbacksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned dataset.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26E54929-CA86-1035-9B42-0C8F291BB027</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFeedbacksResponseBody build() {
            return new ListFeedbacksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFeedbacksResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeedbacksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("UserRating")
        private Integer userRating;

        @com.aliyun.core.annotation.NameInMap("UserResponse")
        private String userResponse;

        private Data(Builder builder) {
            this.contactId = builder.contactId;
            this.instanceId = builder.instanceId;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.userRating = builder.userRating;
            this.userResponse = builder.userResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return userRating
         */
        public Integer getUserRating() {
            return this.userRating;
        }

        /**
         * @return userResponse
         */
        public String getUserResponse() {
            return this.userResponse;
        }

        public static final class Builder {
            private String contactId; 
            private String instanceId; 
            private String taskId; 
            private String taskName; 
            private Integer userRating; 
            private String userResponse; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contactId = model.contactId;
                this.instanceId = model.instanceId;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.userRating = model.userRating;
                this.userResponse = model.userResponse;
            } 

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-25920271311543****</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20251216-8B9B7B02-16FE-54BE-942A-F59DE0656032</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>PostCallAnalyzer:solution</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The user\&quot;s rating for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder userRating(Integer userRating) {
                this.userRating = userRating;
                return this;
            }

            /**
             * <p>The data from user feedback.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxx</p>
             */
            public Builder userResponse(String userResponse) {
                this.userResponse = userResponse;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
