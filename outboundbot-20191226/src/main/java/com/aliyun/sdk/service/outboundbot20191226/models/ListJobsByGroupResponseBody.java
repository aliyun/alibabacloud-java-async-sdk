// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsByGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsByGroupResponseBody</p>
 */
public class ListJobsByGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Jobs")
    private Jobs jobs;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Jobs.
         */
        public Builder jobs(Jobs jobs) {
            this.jobs = jobs;
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

        public ListJobsByGroupResponseBody build() {
            return new ListJobsByGroupResponseBody(this);
        } 

    } 

    public static class Contacts extends TeaModel {
        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("Honorific")
        private String honorific;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("ReferenceId")
        private String referenceId;

        @NameInMap("Role")
        private String role;

        @NameInMap("State")
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

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * Honorific.
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * ReferenceId.
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * State.
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
    public static class Extras extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Summary extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Content")
        private String content;

        @NameInMap("ConversationDetailId")
        private String conversationDetailId;

        @NameInMap("JobGroupId")
        private String jobGroupId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("SummaryId")
        private String summaryId;

        @NameInMap("SummaryName")
        private String summaryName;

        @NameInMap("TaskId")
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

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ConversationDetailId.
             */
            public Builder conversationDetailId(String conversationDetailId) {
                this.conversationDetailId = conversationDetailId;
                return this;
            }

            /**
             * JobGroupId.
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * SummaryId.
             */
            public Builder summaryId(String summaryId) {
                this.summaryId = summaryId;
                return this;
            }

            /**
             * SummaryName.
             */
            public Builder summaryName(String summaryName) {
                this.summaryName = summaryName;
                return this;
            }

            /**
             * TaskId.
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
    public static class List extends TeaModel {
        @NameInMap("CallingNumbers")
        private java.util.List < String > callingNumbers;

        @NameInMap("Contacts")
        private java.util.List < Contacts> contacts;

        @NameInMap("Extras")
        private java.util.List < Extras> extras;

        @NameInMap("FailureReason")
        private String failureReason;

        @NameInMap("JobGroupId")
        private String jobGroupId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ReferenceId")
        private String referenceId;

        @NameInMap("ScenarioId")
        private String scenarioId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StrategyId")
        private String strategyId;

        @NameInMap("Summary")
        private java.util.List < Summary> summary;

        @NameInMap("SystemPriority")
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
        public java.util.List < String > getCallingNumbers() {
            return this.callingNumbers;
        }

        /**
         * @return contacts
         */
        public java.util.List < Contacts> getContacts() {
            return this.contacts;
        }

        /**
         * @return extras
         */
        public java.util.List < Extras> getExtras() {
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
        public java.util.List < Summary> getSummary() {
            return this.summary;
        }

        /**
         * @return systemPriority
         */
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

        public static final class Builder {
            private java.util.List < String > callingNumbers; 
            private java.util.List < Contacts> contacts; 
            private java.util.List < Extras> extras; 
            private String failureReason; 
            private String jobGroupId; 
            private String jobId; 
            private Integer priority; 
            private String referenceId; 
            private String scenarioId; 
            private String status; 
            private String strategyId; 
            private java.util.List < Summary> summary; 
            private Integer systemPriority; 

            /**
             * CallingNumbers.
             */
            public Builder callingNumbers(java.util.List < String > callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * Contacts.
             */
            public Builder contacts(java.util.List < Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * Extras.
             */
            public Builder extras(java.util.List < Extras> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * FailureReason.
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * JobGroupId.
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ReferenceId.
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * ScenarioId.
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
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
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(java.util.List < Summary> summary) {
                this.summary = summary;
                return this;
            }

            /**
             * SystemPriority.
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
    public static class Jobs extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
