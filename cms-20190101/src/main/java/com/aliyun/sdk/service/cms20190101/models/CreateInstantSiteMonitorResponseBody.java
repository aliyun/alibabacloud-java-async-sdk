// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstantSiteMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstantSiteMonitorResponseBody</p>
 */
public class CreateInstantSiteMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateResultList")
    private java.util.List < CreateResultList> createResultList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateInstantSiteMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.createResultList = builder.createResultList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstantSiteMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createResultList
     */
    public java.util.List < CreateResultList> getCreateResultList() {
        return this.createResultList;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < CreateResultList> createResultList; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The error code.
         * <p>
         * 
         * > The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The results for creating the instant test task.
         */
        public Builder createResultList(java.util.List < CreateResultList> createResultList) {
            this.createResultList = createResultList;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateInstantSiteMonitorResponseBody build() {
            return new CreateInstantSiteMonitorResponseBody(this);
        } 

    } 

    public static class CreateResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private CreateResultList(Builder builder) {
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResultList create() {
            return builder().build();
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

        public static final class Builder {
            private String taskId; 
            private String taskName; 

            /**
             * The ID of the instant test task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the instant test task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public CreateResultList build() {
                return new CreateResultList(this);
            } 

        } 

    }
}
