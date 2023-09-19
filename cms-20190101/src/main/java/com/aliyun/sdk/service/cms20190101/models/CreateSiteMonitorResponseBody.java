// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSiteMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSiteMonitorResponseBody</p>
 */
public class CreateSiteMonitorResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateResultList")
    private CreateResultList createResultList;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private CreateSiteMonitorResponseBody(Builder builder) {
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

    public static CreateSiteMonitorResponseBody create() {
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
    public CreateResultList getCreateResultList() {
        return this.createResultList;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private String code; 
        private CreateResultList createResultList; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned result.
         * <p>
         * 
         * If a site monitoring task is created, the result is returned. If a site monitoring task fails to be created, no result is returned.
         */
        public Builder createResultList(CreateResultList createResultList) {
            this.createResultList = createResultList;
            return this;
        }

        /**
         * The result of the site monitoring task.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateSiteMonitorResponseBody build() {
            return new CreateSiteMonitorResponseBody(this);
        } 

    } 

    public static class CreateResultListCreateResultList extends TeaModel {
        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        private CreateResultListCreateResultList(Builder builder) {
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResultListCreateResultList create() {
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
             * The ID of the site monitoring task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the site monitoring task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public CreateResultListCreateResultList build() {
                return new CreateResultListCreateResultList(this);
            } 

        } 

    }
    public static class CreateResultList extends TeaModel {
        @NameInMap("CreateResultList")
        private java.util.List < CreateResultListCreateResultList> createResultList;

        private CreateResultList(Builder builder) {
            this.createResultList = builder.createResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResultList create() {
            return builder().build();
        }

        /**
         * @return createResultList
         */
        public java.util.List < CreateResultListCreateResultList> getCreateResultList() {
            return this.createResultList;
        }

        public static final class Builder {
            private java.util.List < CreateResultListCreateResultList> createResultList; 

            /**
             * The returned result.
             * <p>
             * 
             * If a site monitoring task is created, the result is returned. If a site monitoring task fails to be created, no result is returned.
             */
            public Builder createResultList(java.util.List < CreateResultListCreateResultList> createResultList) {
                this.createResultList = createResultList;
                return this;
            }

            public CreateResultList build() {
                return new CreateResultList(this);
            } 

        } 

    }
    public static class Contact extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("Success")
        private String success;

        private Contact(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.requestId = builder.requestId;
            this.ruleId = builder.ruleId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String requestId; 
            private String ruleId; 
            private String success; 

            /**
             * The status code that is returned after you associate the existing alert rule with the site monitoring task.
             * <p>
             * 
             * >  The status code 200 indicates that the request was successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The message that is returned after you associate the existing alert rule with the site monitoring task.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the request that was sent to associate the existing alert rule with the site monitoring task.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * The ID of the alert rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Indicates whether the existing alert rule was associated with the site monitoring task. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    public static class AttachAlertResult extends TeaModel {
        @NameInMap("Contact")
        private java.util.List < Contact> contact;

        private AttachAlertResult(Builder builder) {
            this.contact = builder.contact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachAlertResult create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public java.util.List < Contact> getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List < Contact> contact; 

            /**
             * Contact.
             */
            public Builder contact(java.util.List < Contact> contact) {
                this.contact = contact;
                return this;
            }

            public AttachAlertResult build() {
                return new AttachAlertResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AttachAlertResult")
        private AttachAlertResult attachAlertResult;

        private Data(Builder builder) {
            this.attachAlertResult = builder.attachAlertResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attachAlertResult
         */
        public AttachAlertResult getAttachAlertResult() {
            return this.attachAlertResult;
        }

        public static final class Builder {
            private AttachAlertResult attachAlertResult; 

            /**
             * The result that is returned after you associate the existing alert rule with the site monitoring task.
             */
            public Builder attachAlertResult(AttachAlertResult attachAlertResult) {
                this.attachAlertResult = attachAlertResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
