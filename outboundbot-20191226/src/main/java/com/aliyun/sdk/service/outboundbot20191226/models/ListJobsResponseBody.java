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
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListJobsResponseBody(Builder builder) {
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

    public static ListJobsResponseBody create() {
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
    public java.util.List<Jobs> getJobs() {
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
        private java.util.List<Jobs> jobs; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListJobsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobs = model.jobs;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder jobs(java.util.List<Jobs> jobs) {
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

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
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
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
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
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("SummaryName")
        private String summaryName;

        private Summary(Builder builder) {
            this.category = builder.category;
            this.content = builder.content;
            this.summaryName = builder.summaryName;
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
         * @return summaryName
         */
        public String getSummaryName() {
            return this.summaryName;
        }

        public static final class Builder {
            private String category; 
            private String content; 
            private String summaryName; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.category = model.category;
                this.content = model.content;
                this.summaryName = model.summaryName;
            } 

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
             * SummaryName.
             */
            public Builder summaryName(String summaryName) {
                this.summaryName = summaryName;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Contact extends TeaModel {
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

        private Contact(Builder builder) {
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

        public static Contact create() {
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

            private Builder(Contact model) {
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

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class ConversationSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("SummaryName")
        private String summaryName;

        private ConversationSummary(Builder builder) {
            this.category = builder.category;
            this.content = builder.content;
            this.summaryName = builder.summaryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationSummary create() {
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
         * @return summaryName
         */
        public String getSummaryName() {
            return this.summaryName;
        }

        public static final class Builder {
            private String category; 
            private String content; 
            private String summaryName; 

            private Builder() {
            } 

            private Builder(ConversationSummary model) {
                this.category = model.category;
                this.content = model.content;
                this.summaryName = model.summaryName;
            } 

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
             * SummaryName.
             */
            public Builder summaryName(String summaryName) {
                this.summaryName = summaryName;
                return this;
            }

            public ConversationSummary build() {
                return new ConversationSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Conversation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("Speaker")
        private String speaker;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private java.util.List<ConversationSummary> summary;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Conversation(Builder builder) {
            this.script = builder.script;
            this.speaker = builder.speaker;
            this.summary = builder.summary;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversation create() {
            return builder().build();
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return speaker
         */
        public String getSpeaker() {
            return this.speaker;
        }

        /**
         * @return summary
         */
        public java.util.List<ConversationSummary> getSummary() {
            return this.summary;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String script; 
            private String speaker; 
            private java.util.List<ConversationSummary> summary; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Conversation model) {
                this.script = model.script;
                this.speaker = model.speaker;
                this.summary = model.summary;
                this.timestamp = model.timestamp;
            } 

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * Speaker.
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(java.util.List<ConversationSummary> summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Conversation build() {
                return new Conversation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualTime")
        private Long actualTime;

        @com.aliyun.core.annotation.NameInMap("Brief")
        private String brief;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ChatbotId")
        private String chatbotId;

        @com.aliyun.core.annotation.NameInMap("Contact")
        private Contact contact;

        @com.aliyun.core.annotation.NameInMap("Conversation")
        private java.util.List<Conversation> conversation;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("PlanedTime")
        private Long planedTime;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.actualTime = builder.actualTime;
            this.brief = builder.brief;
            this.callId = builder.callId;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.chatbotId = builder.chatbotId;
            this.contact = builder.contact;
            this.conversation = builder.conversation;
            this.duration = builder.duration;
            this.jobId = builder.jobId;
            this.planedTime = builder.planedTime;
            this.scenarioId = builder.scenarioId;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
        }

        /**
         * @return brief
         */
        public String getBrief() {
            return this.brief;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return chatbotId
         */
        public String getChatbotId() {
            return this.chatbotId;
        }

        /**
         * @return contact
         */
        public Contact getContact() {
            return this.contact;
        }

        /**
         * @return conversation
         */
        public java.util.List<Conversation> getConversation() {
            return this.conversation;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return planedTime
         */
        public Long getPlanedTime() {
            return this.planedTime;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long actualTime; 
            private String brief; 
            private String callId; 
            private String calledNumber; 
            private String callingNumber; 
            private String chatbotId; 
            private Contact contact; 
            private java.util.List<Conversation> conversation; 
            private Integer duration; 
            private String jobId; 
            private Long planedTime; 
            private String scenarioId; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.actualTime = model.actualTime;
                this.brief = model.brief;
                this.callId = model.callId;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.chatbotId = model.chatbotId;
                this.contact = model.contact;
                this.conversation = model.conversation;
                this.duration = model.duration;
                this.jobId = model.jobId;
                this.planedTime = model.planedTime;
                this.scenarioId = model.scenarioId;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * ActualTime.
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * Brief.
             */
            public Builder brief(String brief) {
                this.brief = brief;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * ChatbotId.
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * Contact.
             */
            public Builder contact(Contact contact) {
                this.contact = contact;
                return this;
            }

            /**
             * Conversation.
             */
            public Builder conversation(java.util.List<Conversation> conversation) {
                this.conversation = conversation;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * PlanedTime.
             */
            public Builder planedTime(Long planedTime) {
                this.planedTime = planedTime;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<Tasks> tasks;

        private Jobs(Builder builder) {
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
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
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

        /**
         * @return tasks
         */
        public java.util.List<Tasks> getTasks() {
            return this.tasks;
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
            private java.util.List<Tasks> tasks; 

            private Builder() {
            } 

            private Builder(Jobs model) {
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
                this.tasks = model.tasks;
            } 

            /**
             * CallingNumbers.
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * Contacts.
             */
            public Builder contacts(java.util.List<Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * Extras.
             */
            public Builder extras(java.util.List<Extras> extras) {
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
            public Builder summary(java.util.List<Summary> summary) {
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

            /**
             * Tasks.
             */
            public Builder tasks(java.util.List<Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
