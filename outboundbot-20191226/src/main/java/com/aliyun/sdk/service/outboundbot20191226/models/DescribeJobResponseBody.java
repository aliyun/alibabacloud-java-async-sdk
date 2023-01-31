// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResponseBody</p>
 */
public class DescribeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Job")
    private Job job;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.job = builder.job;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResponseBody create() {
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
     * @return job
     */
    public Job getJob() {
        return this.job;
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
        private Job job; 
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
         * Job.
         */
        public Builder job(Job job) {
            this.job = job;
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

        public DescribeJobResponseBody build() {
            return new DescribeJobResponseBody(this);
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
    public static class Script extends TeaModel {
        @NameInMap("AsrConfig")
        private String asrConfig;

        @NameInMap("ChatbotId")
        private String chatbotId;

        @NameInMap("DebugStatus")
        private String debugStatus;

        @NameInMap("Industry")
        private String industry;

        @NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        private Boolean isDrafted;

        @NameInMap("MiniPlaybackConfigEnabled")
        private Boolean miniPlaybackConfigEnabled;

        @NameInMap("Name")
        private String name;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("ScriptDescription")
        private String scriptDescription;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TtsConfig")
        private String ttsConfig;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Script(Builder builder) {
            this.asrConfig = builder.asrConfig;
            this.chatbotId = builder.chatbotId;
            this.debugStatus = builder.debugStatus;
            this.industry = builder.industry;
            this.isDebugDrafted = builder.isDebugDrafted;
            this.isDrafted = builder.isDrafted;
            this.miniPlaybackConfigEnabled = builder.miniPlaybackConfigEnabled;
            this.name = builder.name;
            this.scene = builder.scene;
            this.scriptDescription = builder.scriptDescription;
            this.scriptId = builder.scriptId;
            this.status = builder.status;
            this.ttsConfig = builder.ttsConfig;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return asrConfig
         */
        public String getAsrConfig() {
            return this.asrConfig;
        }

        /**
         * @return chatbotId
         */
        public String getChatbotId() {
            return this.chatbotId;
        }

        /**
         * @return debugStatus
         */
        public String getDebugStatus() {
            return this.debugStatus;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return isDebugDrafted
         */
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        /**
         * @return isDrafted
         */
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        /**
         * @return miniPlaybackConfigEnabled
         */
        public Boolean getMiniPlaybackConfigEnabled() {
            return this.miniPlaybackConfigEnabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return scriptDescription
         */
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return ttsConfig
         */
        public String getTtsConfig() {
            return this.ttsConfig;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String asrConfig; 
            private String chatbotId; 
            private String debugStatus; 
            private String industry; 
            private Boolean isDebugDrafted; 
            private Boolean isDrafted; 
            private Boolean miniPlaybackConfigEnabled; 
            private String name; 
            private String scene; 
            private String scriptDescription; 
            private String scriptId; 
            private String status; 
            private String ttsConfig; 
            private Long updateTime; 

            /**
             * AsrConfig.
             */
            public Builder asrConfig(String asrConfig) {
                this.asrConfig = asrConfig;
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
             * DebugStatus.
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * Industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * IsDebugDrafted.
             */
            public Builder isDebugDrafted(Boolean isDebugDrafted) {
                this.isDebugDrafted = isDebugDrafted;
                return this;
            }

            /**
             * IsDrafted.
             */
            public Builder isDrafted(Boolean isDrafted) {
                this.isDrafted = isDrafted;
                return this;
            }

            /**
             * MiniPlaybackConfigEnabled.
             */
            public Builder miniPlaybackConfigEnabled(Boolean miniPlaybackConfigEnabled) {
                this.miniPlaybackConfigEnabled = miniPlaybackConfigEnabled;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * ScriptDescription.
             */
            public Builder scriptDescription(String scriptDescription) {
                this.scriptDescription = scriptDescription;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
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
             * TtsConfig.
             */
            public Builder ttsConfig(String ttsConfig) {
                this.ttsConfig = ttsConfig;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
    public static class Summary extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Content")
        private String content;

        @NameInMap("SummaryName")
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
    public static class Contact extends TeaModel {
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
    public static class ConversationSummary extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Content")
        private String content;

        @NameInMap("SummaryName")
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
    public static class Conversation extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionParams")
        private String actionParams;

        @NameInMap("Script")
        private String script;

        @NameInMap("SequenceId")
        private String sequenceId;

        @NameInMap("Speaker")
        private String speaker;

        @NameInMap("Summary")
        private java.util.List < ConversationSummary> summary;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Conversation(Builder builder) {
            this.action = builder.action;
            this.actionParams = builder.actionParams;
            this.script = builder.script;
            this.sequenceId = builder.sequenceId;
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
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionParams
         */
        public String getActionParams() {
            return this.actionParams;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return sequenceId
         */
        public String getSequenceId() {
            return this.sequenceId;
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
        public java.util.List < ConversationSummary> getSummary() {
            return this.summary;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String actionParams; 
            private String script; 
            private String sequenceId; 
            private String speaker; 
            private java.util.List < ConversationSummary> summary; 
            private Long timestamp; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionParams.
             */
            public Builder actionParams(String actionParams) {
                this.actionParams = actionParams;
                return this;
            }

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * SequenceId.
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
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
            public Builder summary(java.util.List < ConversationSummary> summary) {
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
    public static class Tasks extends TeaModel {
        @NameInMap("ActualTime")
        private Long actualTime;

        @NameInMap("Brief")
        private String brief;

        @NameInMap("CallId")
        private String callId;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CallingNumber")
        private String callingNumber;

        @NameInMap("ChatbotId")
        private String chatbotId;

        @NameInMap("Contact")
        private Contact contact;

        @NameInMap("Conversation")
        private java.util.List < Conversation> conversation;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("EndReason")
        private String endReason;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("HangUpDirection")
        private String hangUpDirection;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("PlanedTime")
        private Long planedTime;

        @NameInMap("RingingDuration")
        private Long ringingDuration;

        @NameInMap("ScenarioId")
        private String scenarioId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
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
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.hangUpDirection = builder.hangUpDirection;
            this.jobId = builder.jobId;
            this.planedTime = builder.planedTime;
            this.ringingDuration = builder.ringingDuration;
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
        public java.util.List < Conversation> getConversation() {
            return this.conversation;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return endReason
         */
        public String getEndReason() {
            return this.endReason;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return hangUpDirection
         */
        public String getHangUpDirection() {
            return this.hangUpDirection;
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
         * @return ringingDuration
         */
        public Long getRingingDuration() {
            return this.ringingDuration;
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
            private java.util.List < Conversation> conversation; 
            private Integer duration; 
            private String endReason; 
            private Long endTime; 
            private String hangUpDirection; 
            private String jobId; 
            private Long planedTime; 
            private Long ringingDuration; 
            private String scenarioId; 
            private String status; 
            private String taskId; 

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
            public Builder conversation(java.util.List < Conversation> conversation) {
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
             * EndReason.
             */
            public Builder endReason(String endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HangUpDirection.
             */
            public Builder hangUpDirection(String hangUpDirection) {
                this.hangUpDirection = hangUpDirection;
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
             * RingingDuration.
             */
            public Builder ringingDuration(Long ringingDuration) {
                this.ringingDuration = ringingDuration;
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
    public static class Job extends TeaModel {
        @NameInMap("ActualTime")
        private Long actualTime;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CallingNumbers")
        private java.util.List < String > callingNumbers;

        @NameInMap("Contacts")
        private java.util.List < Contacts> contacts;

        @NameInMap("DsReport")
        private String dsReport;

        @NameInMap("EndReason")
        private Integer endReason;

        @NameInMap("Extras")
        private java.util.List < Extras> extras;

        @NameInMap("FailureReason")
        private String failureReason;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobGroupId")
        private String jobGroupId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("NextExecutionTime")
        private Long nextExecutionTime;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ReferenceId")
        private String referenceId;

        @NameInMap("ScenarioId")
        private String scenarioId;

        @NameInMap("Script")
        private Script script;

        @NameInMap("Status")
        private String status;

        @NameInMap("StrategyId")
        private String strategyId;

        @NameInMap("Summary")
        private java.util.List < Summary> summary;

        @NameInMap("SystemPriority")
        private Integer systemPriority;

        @NameInMap("Tasks")
        private java.util.List < Tasks> tasks;

        private Job(Builder builder) {
            this.actualTime = builder.actualTime;
            this.calledNumber = builder.calledNumber;
            this.callingNumbers = builder.callingNumbers;
            this.contacts = builder.contacts;
            this.dsReport = builder.dsReport;
            this.endReason = builder.endReason;
            this.extras = builder.extras;
            this.failureReason = builder.failureReason;
            this.instanceId = builder.instanceId;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.nextExecutionTime = builder.nextExecutionTime;
            this.priority = builder.priority;
            this.referenceId = builder.referenceId;
            this.scenarioId = builder.scenarioId;
            this.script = builder.script;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
            this.summary = builder.summary;
            this.systemPriority = builder.systemPriority;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
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
         * @return dsReport
         */
        public String getDsReport() {
            return this.dsReport;
        }

        /**
         * @return endReason
         */
        public Integer getEndReason() {
            return this.endReason;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
         * @return nextExecutionTime
         */
        public Long getNextExecutionTime() {
            return this.nextExecutionTime;
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
         * @return script
         */
        public Script getScript() {
            return this.script;
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

        /**
         * @return tasks
         */
        public java.util.List < Tasks> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private Long actualTime; 
            private String calledNumber; 
            private java.util.List < String > callingNumbers; 
            private java.util.List < Contacts> contacts; 
            private String dsReport; 
            private Integer endReason; 
            private java.util.List < Extras> extras; 
            private String failureReason; 
            private String instanceId; 
            private String jobGroupId; 
            private String jobId; 
            private Long nextExecutionTime; 
            private Integer priority; 
            private String referenceId; 
            private String scenarioId; 
            private Script script; 
            private String status; 
            private String strategyId; 
            private java.util.List < Summary> summary; 
            private Integer systemPriority; 
            private java.util.List < Tasks> tasks; 

            /**
             * ActualTime.
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
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
             * DsReport.
             */
            public Builder dsReport(String dsReport) {
                this.dsReport = dsReport;
                return this;
            }

            /**
             * EndReason.
             */
            public Builder endReason(Integer endReason) {
                this.endReason = endReason;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * NextExecutionTime.
             */
            public Builder nextExecutionTime(Long nextExecutionTime) {
                this.nextExecutionTime = nextExecutionTime;
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
             * Script.
             */
            public Builder script(Script script) {
                this.script = script;
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

            /**
             * Tasks.
             */
            public Builder tasks(java.util.List < Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
