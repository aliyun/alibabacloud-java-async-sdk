// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link CreateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTaskResponseBody</p>
 */
public class CreateTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertRule")
    private String alertRule;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateResultList")
    private CreateResultList createResultList;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateTaskResponseBody(Builder builder) {
        this.alertRule = builder.alertRule;
        this.code = builder.code;
        this.createResultList = builder.createResultList;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertRule
     */
    public String getAlertRule() {
        return this.alertRule;
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
    public CreateResultList getCreateResultList() {
        return this.createResultList;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
        private String alertRule; 
        private String code; 
        private CreateResultList createResultList; 
        private String data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(CreateTaskResponseBody model) {
            this.alertRule = model.alertRule;
            this.code = model.code;
            this.createResultList = model.createResultList;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AlertRule.
         */
        public Builder alertRule(String alertRule) {
            this.alertRule = alertRule;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateResultList.
         */
        public Builder createResultList(CreateResultList createResultList) {
            this.createResultList = createResultList;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateTaskResponseBody build() {
            return new CreateTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTaskResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private Contact(Builder builder) {
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
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

            private Builder() {
            } 

            private Builder(Contact model) {
                this.taskId = model.taskId;
                this.taskName = model.taskName;
            } 

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTaskResponseBody</p>
     */
    public static class CreateResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contact")
        private java.util.List<Contact> contact;

        private CreateResultList(Builder builder) {
            this.contact = builder.contact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResultList create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public java.util.List<Contact> getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List<Contact> contact; 

            private Builder() {
            } 

            private Builder(CreateResultList model) {
                this.contact = model.contact;
            } 

            /**
             * Contact.
             */
            public Builder contact(java.util.List<Contact> contact) {
                this.contact = contact;
                return this;
            }

            public CreateResultList build() {
                return new CreateResultList(this);
            } 

        } 

    }
}
