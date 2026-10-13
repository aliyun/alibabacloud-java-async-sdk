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
 * {@link ListJobsByGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsByGroupResponseBody</p>
 */
public class ListJobsByGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Jobs")
    private Jobs jobs;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListJobsByGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobs = builder.jobs;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsByGroupResponseBody create() {
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
     * @return jobs
     */
    public Jobs getJobs() {
        return this.jobs;
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
        private Jobs jobs; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListJobsByGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobs = model.jobs;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Response code</p>
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
         * <p>Job array</p>
         */
        public Builder jobs(Jobs jobs) {
            this.jobs = jobs;
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
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListJobsByGroupResponseBody build() {
            return new ListJobsByGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsByGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsByGroupResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Honorific")
        private String honorific;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Contacts(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.honorific = builder.honorific;
            this.jobId = builder.jobId;
            this.phoneNumber = builder.phoneNumber;
            this.referenceId = builder.referenceId;
            this.role = builder.role;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return honorific
         */
        public String getHonorific() {
            return this.honorific;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String contactId; 
            private String contactName; 
            private String honorific; 
            private String jobId; 
            private String phoneNumber; 
            private String referenceId; 
            private String role; 
            private String state; 

            private Builder() {
            } 

            private Builder(Contacts model) {
                this.contactId = model.contactId;
                this.contactName = model.contactName;
                this.honorific = model.honorific;
                this.jobId = model.jobId;
                this.phoneNumber = model.phoneNumber;
                this.referenceId = model.referenceId;
                this.role = model.role;
                this.state = model.state;
            } 

            /**
             * <p>Contact ID (system-generated)</p>
             * 
             * <strong>example:</strong>
             * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>Contact name</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>Honorific (same as contact name)</p>
             * 
             * <strong>example:</strong>
             * <p>张先生</p>
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * <p>Job ID (deprecated)</p>
             * 
             * <strong>example:</strong>
             * <p>72dcd26b-f12d-4c27-b3af-18f6aed5b160</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Phone number</p>
             * 
             * <strong>example:</strong>
             * <p>134********</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>Contact third-party system ID (uploaded by customer)</p>
             * 
             * <strong>example:</strong>
             * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>Deprecated</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Deprecated</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsByGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsByGroupResponseBody</p>
     */
    public static class Extras extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Extras(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extras create() {
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

            private Builder(Extras model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Business parameter name</p>
             * 
             * <strong>example:</strong>
             * <p>性别</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Business parameter value</p>
             * 
             * <strong>example:</strong>
             * <p>男</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Extras build() {
                return new Extras(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsByGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsByGroupResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ConversationDetailId")
        private String conversationDetailId;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("SummaryId")
        private String summaryId;

        @com.aliyun.core.annotation.NameInMap("SummaryName")
        private String summaryName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Summary(Builder builder) {
            this.category = builder.category;
            this.content = builder.content;
            this.conversationDetailId = builder.conversationDetailId;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.summaryId = builder.summaryId;
            this.summaryName = builder.summaryName;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return conversationDetailId
         */
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return summaryId
         */
        public String getSummaryId() {
            return this.summaryId;
        }

        /**
         * @return summaryName
         */
        public String getSummaryName() {
            return this.summaryName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String category; 
            private String content; 
            private String conversationDetailId; 
            private String jobGroupId; 
            private String jobId; 
            private String summaryId; 
            private String summaryName; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.category = model.category;
                this.content = model.content;
                this.conversationDetailId = model.conversationDetailId;
                this.jobGroupId = model.jobGroupId;
                this.jobId = model.jobId;
                this.summaryId = model.summaryId;
                this.summaryName = model.summaryName;
                this.taskId = model.taskId;
            } 

            /**
             * <p>Conversation summary category</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Conversation summary content</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Call record ID</p>
             * 
             * <strong>example:</strong>
             * <p>62a860f5-a8b3-4b75-9512-c7e04bb7c8bc</p>
             */
            public Builder conversationDetailId(String conversationDetailId) {
                this.conversationDetailId = conversationDetailId;
                return this;
            }

            /**
             * <p>Job group ID</p>
             * 
             * <strong>example:</strong>
             * <p>88e56cfb-33f8-477a-907c-0fe83292d924</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>Job ID</p>
             * 
             * <strong>example:</strong>
             * <p>f102a853-5f5a-47fb-8869-b31ea74a9620</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Summary ID</p>
             * 
             * <strong>example:</strong>
             * <p>680f1905-81ae-4aab-99dd-2964dfb767fa</p>
             */
            public Builder summaryId(String summaryId) {
                this.summaryId = summaryId;
                return this;
            }

            /**
             * <p>Summary name</p>
             * 
             * <strong>example:</strong>
             * <p>score</p>
             */
            public Builder summaryName(String summaryName) {
                this.summaryName = summaryName;
                return this;
            }

            /**
             * <p>Call ID</p>
             * 
             * <strong>example:</strong>
             * <p>b0f35dd1-0337-402e-9c4f-3a6c2426950a</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsByGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsByGroupResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallingNumbers")
        private java.util.List<String> callingNumbers;

        @com.aliyun.core.annotation.NameInMap("Contacts")
        private java.util.List<Contacts> contacts;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private java.util.List<Extras> extras;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private java.util.List<Summary> summary;

        @com.aliyun.core.annotation.NameInMap("SystemPriority")
        private Integer systemPriority;

        private List(Builder builder) {
            this.callingNumbers = builder.callingNumbers;
            this.contacts = builder.contacts;
            this.extras = builder.extras;
            this.failureReason = builder.failureReason;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.priority = builder.priority;
            this.referenceId = builder.referenceId;
            this.scenarioId = builder.scenarioId;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
            this.summary = builder.summary;
            this.systemPriority = builder.systemPriority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return callingNumbers
         */
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        /**
         * @return contacts
         */
        public java.util.List<Contacts> getContacts() {
            return this.contacts;
        }

        /**
         * @return extras
         */
        public java.util.List<Extras> getExtras() {
            return this.extras;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return summary
         */
        public java.util.List<Summary> getSummary() {
            return this.summary;
        }

        /**
         * @return systemPriority
         */
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

        public static final class Builder {
            private java.util.List<String> callingNumbers; 
            private java.util.List<Contacts> contacts; 
            private java.util.List<Extras> extras; 
            private String failureReason; 
            private String jobGroupId; 
            private String jobId; 
            private Integer priority; 
            private String referenceId; 
            private String scenarioId; 
            private String status; 
            private String strategyId; 
            private java.util.List<Summary> summary; 
            private Integer systemPriority; 

            private Builder() {
            } 

            private Builder(List model) {
                this.callingNumbers = model.callingNumbers;
                this.contacts = model.contacts;
                this.extras = model.extras;
                this.failureReason = model.failureReason;
                this.jobGroupId = model.jobGroupId;
                this.jobId = model.jobId;
                this.priority = model.priority;
                this.referenceId = model.referenceId;
                this.scenarioId = model.scenarioId;
                this.status = model.status;
                this.strategyId = model.strategyId;
                this.summary = model.summary;
                this.systemPriority = model.systemPriority;
            } 

            /**
             * <p>Caller number list</p>
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * <p>Contact list</p>
             */
            public Builder contacts(java.util.List<Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>Business data</p>
             * <blockquote>
             * <p>TenantId and ServiceId are system-generated. All other parameters are custom.</p>
             * </blockquote>
             */
            public Builder extras(java.util.List<Extras> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>The failure reason.</p>
             * <ul>
             * <li><p>Unknown: An unknown error occurred.</p>
             * </li>
             * <li><p>NoAnswer: The call was not answered.</p>
             * </li>
             * <li><p>InvalidStrategy: The policy is invalid or incorrectly configured.</p>
             * </li>
             * <li><p>TimeUp: The task timed out during scheduling.</p>
             * </li>
             * <li><p>NoStrategy: The policy is empty or was not found.</p>
             * </li>
             * <li><p>CallFailed: The call failed.</p>
             * </li>
             * <li><p>PerDayCallCountLimit: The daily call limit for the phone number was reached.</p>
             * </li>
             * <li><p>ContactBlockList: The phone number is on the blocklist.</p>
             * </li>
             * <li><p>EmptyNumber: The phone number is nonexistent.</p>
             * </li>
             * <li><p>JobPerDayCallCountLimit: The daily call limit for the phone number within the job was reached.</p>
             * </li>
             * <li><p>VerificationCancelled: The call was canceled because it failed pre-call validation.</p>
             * </li>
             * <li><p>ContactSuspended: Calling to the contact is suspended.</p>
             * </li>
             * <li><p>InArrears: The account has an overdue payment.</p>
             * </li>
             * <li><p>OutOfService: The phone number is out of service.</p>
             * </li>
             * <li><p>NoneRepeatableJobMaxAttemptCountLimit: The non-repeatable job reached the maximum number of attempts.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoAnswer</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>Job ID</p>
             * 
             * <strong>example:</strong>
             * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>Job ID</p>
             * 
             * <strong>example:</strong>
             * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Priority</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Third-party system ID</p>
             * 
             * <strong>example:</strong>
             * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>Scenario ID (legacy parameter)</p>
             * 
             * <strong>example:</strong>
             * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>Job status</p>
             * <ul>
             * <li><p>Scheduling (0)</p>
             * </li>
             * <li><p>Executing (1)</p>
             * </li>
             * <li><p>Succeeded (2)</p>
             * </li>
             * <li><p>Paused (3)</p>
             * </li>
             * <li><p>Failed (4)</p>
             * </li>
             * <li><p>Cancelled (5)</p>
             * </li>
             * <li><p>Drafted (6)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Strategy ID</p>
             * 
             * <strong>example:</strong>
             * <p>c8a2b7f2-ad1a-4865-b872-d0080d9802d9</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>Conversation summary (deprecated)</p>
             * <blockquote>
             * <p>Use the DescribeJob API to retrieve this data.</p>
             * </blockquote>
             */
            public Builder summary(java.util.List<Summary> summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>System priority</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder systemPriority(Integer systemPriority) {
                this.systemPriority = systemPriority;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsByGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsByGroupResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Jobs(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Job list</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
