// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link StartJobResponseBody} extends {@link TeaModel}
 *
 * <p>StartJobResponseBody</p>
 */
public class StartJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallIds")
    private java.util.List<CallIds> callIds;

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

    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<TaskIds> taskIds;

    private StartJobResponseBody(Builder builder) {
        this.callIds = builder.callIds;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callIds
     */
    public java.util.List<CallIds> getCallIds() {
        return this.callIds;
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
     * @return taskIds
     */
    public java.util.List<TaskIds> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder {
        private java.util.List<CallIds> callIds; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TaskIds> taskIds; 

        private Builder() {
        } 

        private Builder(StartJobResponseBody model) {
            this.callIds = model.callIds;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskIds = model.taskIds;
        } 

        /**
         * <p>List of call IDs</p>
         */
        public Builder callIds(java.util.List<CallIds> callIds) {
            this.callIds = callIds;
            return this;
        }

        /**
         * <p>API status code</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>API message</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>8a621aa1-d2e7-43f3-b54d-8830af73c468</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call succeeded. true means success. false means failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Mapping between third-party contact IDs and outbound call task IDs</p>
         */
        public Builder taskIds(java.util.List<TaskIds> taskIds) {
            this.taskIds = taskIds;
            return this;
        }

        public StartJobResponseBody build() {
            return new StartJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartJobResponseBody} extends {@link TeaModel}
     *
     * <p>StartJobResponseBody</p>
     */
    public static class CallIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CallIds(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallIds create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(CallIds model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Third-party contact ID</p>
             * 
             * <strong>example:</strong>
             * <p>c93cdd1c-f9b5-4758-be43-7a237a7eaa1d</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Call ID for the task</p>
             * 
             * <strong>example:</strong>
             * <p>62229628-45d8-41bd-a80f-6e4c0a39f79b</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CallIds build() {
                return new CallIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartJobResponseBody} extends {@link TeaModel}
     *
     * <p>StartJobResponseBody</p>
     */
    public static class TaskIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TaskIds(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskIds create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TaskIds model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Third-party contact ID</p>
             * 
             * <strong>example:</strong>
             * <p>c93cdd1c-f9b5-4758-be43-7a237a7eaa1d</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Outbound call task ID</p>
             * 
             * <strong>example:</strong>
             * <p>62229628-45d8-41bd-a80f-6e4c0a39f79b</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TaskIds build() {
                return new TaskIds(this);
            } 

        } 

    }
}
