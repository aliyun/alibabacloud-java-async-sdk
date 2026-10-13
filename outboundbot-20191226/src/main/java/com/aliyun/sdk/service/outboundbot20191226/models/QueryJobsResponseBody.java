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
 * {@link QueryJobsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobsResponseBody</p>
 */
public class QueryJobsResponseBody extends TeaModel {
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

    private QueryJobsResponseBody(Builder builder) {
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

    public static QueryJobsResponseBody create() {
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

        private Builder(QueryJobsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobs = model.jobs;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The job data.</p>
         */
        public Builder jobs(Jobs jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryJobsResponseBody build() {
            return new QueryJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
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
             * <p>The contact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The contact name.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The honorific.</p>
             * 
             * <strong>example:</strong>
             * <p>Mr. Zhang</p>
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>135****8888</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The associated business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>The role.</p>
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
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>Available: Normal.</li>
             * <li>WrongNumber: Wrong number.</li>
             * <li>DoesNotExist: Nonexistent number.</li>
             * <li>Suspended: Call suspended.</li>
             * </ul>
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
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
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
             * <p>The key of the business data.</p>
             * 
             * <strong>example:</strong>
             * <p>djrq</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the business data.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-21 09:49:59.0</p>
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
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ConversationDetailId")
        private String conversationDetailId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

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
            this.groupId = builder.groupId;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
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
            private String groupId; 
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
                this.groupId = model.groupId;
                this.jobId = model.jobId;
                this.summaryId = model.summaryId;
                this.summaryName = model.summaryName;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The category.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The content.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The call record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>098b9b09-9223-4a8b-a422-99726f0457f3</p>
             */
            public Builder conversationDetailId(String conversationDetailId) {
                this.conversationDetailId = conversationDetailId;
                return this;
            }

            /**
             * <p>The job group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ba1ba502-d044-48c0-b710-0f1f840a7c53</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The summary ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dc67d544-df06-4625-ae48-13e3c9f72d8a</p>
             */
            public Builder summaryId(String summaryId) {
                this.summaryId = summaryId;
                return this;
            }

            /**
             * <p>The summary name.</p>
             * 
             * <strong>example:</strong>
             * <p>score</p>
             */
            public Builder summaryName(String summaryName) {
                this.summaryName = summaryName;
                return this;
            }

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9fdf7a81-6781-4ab8-92fb-1d4231ef365e</p>
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
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
     */
    public static class TagHits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagGroup")
        private String tagGroup;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagHits(Builder builder) {
            this.tagGroup = builder.tagGroup;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagHits create() {
            return builder().build();
        }

        /**
         * @return tagGroup
         */
        public String getTagGroup() {
            return this.tagGroup;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String tagGroup; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagHits model) {
                this.tagGroup = model.tagGroup;
                this.tagName = model.tagName;
            } 

            /**
             * <p>The tag group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Intent collection</p>
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Interested</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagHits build() {
                return new TagHits(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
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
             * <p>The contact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The contact name.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The honorific.</p>
             * 
             * <strong>example:</strong>
             * <p>Mr. Zhang</p>
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The phone number of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>135****8888</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The associated business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>The role.</p>
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
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
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
                this.duration = model.duration;
                this.jobId = model.jobId;
                this.planedTime = model.planedTime;
                this.scenarioId = model.scenarioId;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The actual outbound call time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424883</p>
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The summary. This is a legacy field and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder brief(String brief) {
                this.brief = brief;
                return this;
            }

            /**
             * <p>The SIP call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1528189846043</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>135****8888</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571****3106</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The robot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * <p>The contact information.</p>
             */
            public Builder contact(Contact contact) {
                this.contact = contact;
                return this;
            }

            /**
             * <p>The call duration.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The planned outbound call time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424883</p>
             */
            public Builder planedTime(Long planedTime) {
                this.planedTime = planedTime;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The task status. Note: The Succeeded status is subdivided into specific reasons. The Succeeded: 1 (Connected) status is no longer returned. Instead, specific subdivided reason types are returned. Valid values:</p>
             * <ul>
             * <li>Executing: 0 (Calling).</li>
             * <li>Succeeded: 1 (Connected).</li>
             * <li>NoAnswer: 2 (Not connected - No answer).</li>
             * <li>NotExist: 3 (Not connected - Nonexistent number).</li>
             * <li>Busy: 4 (Not connected - Busy).</li>
             * <li>Cancelled: 5 (Not called - Task stopped).</li>
             * <li>Failed: 6 (Failed).</li>
             * <li>NotConnected: 7 (Not connected - Unreachable).</li>
             * <li>PoweredOff: 8 (Not connected - Powered off).</li>
             * <li>OutOfService: 9 (Not connected - Callee service suspended).</li>
             * <li>InArrears: 10 (Not connected - Callee overdue payment).</li>
             * <li>EmptyNumber: 11 (Not called - Nonexistent number, no outbound call).</li>
             * <li>PerDayCallCountLimit: 12 (Not called - Daily limit exceeded).</li>
             * <li>ContactBlockList: 13 (Not called - Blacklisted).</li>
             * <li>CallerNotRegistered: 14 (Not called - Caller number not registered).</li>
             * <li>Terminated: 15 (Not called - Terminated).</li>
             * <li>VerificationCancelled: 16 (Not called - Cancelled due to failed pre-call verification).</li>
             * <li>OutOfServiceNoCall: 17 (Not called - Callee service suspended, no outbound call).</li>
             * <li>InArrearsNoCall: 18 (Not called - Callee overdue payment, no outbound call).</li>
             * <li>CallingNumberNotExist: 19 (Not called - Caller number does not exist).</li>
             * <li>SucceededFinish: 20 (Connected - Normally finished).</li>
             * <li>SucceededChatbotHangUpAfterNoAnswer: 21 (Connected - Robot hung up after rejection).</li>
             * <li>SucceededChatbotHangUpAfterSilence: 22 (Connected - Hung up due to silence timeout).</li>
             * <li>SucceededClientHangUpAfterNoAnswer: 23 (Connected - User hung up after rejection).</li>
             * <li>SucceededClientHangUp: 24 (Connected - User hung up without reason).</li>
             * <li>SucceededTransferByIntent: 25 (Connected - Transferred to agent due to intent match).</li>
             * <li>SucceededTransferAfterNoAnswer: 26 (Connected - Transferred to agent after rejection).</li>
             * <li>SucceededInoInterAction: 27 (Connected - No interaction from the user side).</li>
             * <li>SucceededError: 28 (Connected - Interrupted due to system exception).</li>
             * <li>SucceededSpecialInterceptVoiceAssistant: 29 (Connected - Special interception - Voice assistant).</li>
             * <li>SucceededSpecialInterceptExtensionNumberTransfer: 30 (Connected - Special interception - Extension number transfer).</li>
             * <li>SucceededSpecialInterceptCustomSpecialIntercept: 31 (Connected - Special interception - Custom interception).</li>
             * <li>HighRiskSipCode: 32 (Not called - High risk, no outbound call).</li>
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
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ff44709e-39a6-43ba-959b-20fcabe3e496</p>
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
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("TagHits")
        private java.util.List<TagHits> tagHits;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<Tasks> tasks;

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
            this.tagHits = builder.tagHits;
            this.tasks = builder.tasks;
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
         * @return tagHits
         */
        public java.util.List<TagHits> getTagHits() {
            return this.tagHits;
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
            private java.util.List<TagHits> tagHits; 
            private java.util.List<Tasks> tasks; 

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
                this.tagHits = model.tagHits;
                this.tasks = model.tasks;
            } 

            /**
             * <p>The calling number list.</p>
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The contact information.</p>
             * <blockquote>
             * <p>You can obtain this information by calling the DescribeJob operation.</p>
             * </blockquote>
             */
            public Builder contacts(java.util.List<Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>The business data, which displays the tag collection status in large model scenarios.</p>
             * <blockquote>
             * <p>If the key is TenantId or ServiceId, it is a system parameter.</p>
             * </blockquote>
             */
            public Builder extras(java.util.List<Extras> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>The reason for the failure. Valid values:</p>
             * <ul>
             * <li>Unknown: Unknown error.  </li>
             * <li>NoAnswer: No answer.</li>
             * <li>InvalidStrategy: Invalid strategy. The strategy configuration is incorrect.</li>
             * <li>TimeUp: Timeout detected during scheduling.</li>
             * <li>NoStrategy: The strategy is empty or not found.</li>
             * <li>CallFailed: Call failed.</li>
             * <li>PerDayCallCountLimit: The daily call count limit for the number is reached.</li>
             * <li>ContactBlockList: The number is on the outbound call blacklist.</li>
             * <li>EmptyNumber: The number is a nonexistent number and will not be called.</li>
             * <li>JobPerDayCallCountLimit: The daily call count limit for the number is reached.</li>
             * <li>VerificationCancelled: Cancelled due to failed pre-call verification.</li>
             * <li>ContactSuspended: Call suspended.</li>
             * <li>InArrears: Overdue payment.</li>
             * <li>OutOfService: Service suspended.</li>
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
             * <p>The job group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The associated business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The scenario ID. This is a legacy parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Scheduling(0, &quot;Scheduling&quot;)</li>
             * <li>Executing(1, &quot;Executing&quot;)</li>
             * <li>Succeeded(2, &quot;Finished - Reached&quot;)</li>
             * <li>Paused(3, &quot;Paused&quot;)</li>
             * <li>Failed(4, &quot;Finished - Not reached&quot;)</li>
             * <li>Cancelled(5, &quot;Cancelled - Manual intervention&quot;)</li>
             * <li>Drafted(6, &quot;Draft&quot;)</li>
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
             * <p>The strategy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c8a2b7f2-ad1a-4865-b872-d0080d9802d9</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The conversation summary. This is a legacy field and is no longer used.</p>
             */
            public Builder summary(java.util.List<Summary> summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The matched tag information in small model scenarios.</p>
             */
            public Builder tagHits(java.util.List<TagHits> tagHits) {
                this.tagHits = tagHits;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The call list.</p>
             * <blockquote>
             * <p>You can obtain this information by calling the searchTask operation.</p>
             * </blockquote>
             */
            public Builder tasks(java.util.List<Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsResponseBody</p>
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
             * <p>The job array.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
