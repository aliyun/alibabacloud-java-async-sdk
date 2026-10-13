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
 * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobsWithResultResponseBody</p>
 */
public class QueryJobsWithResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Jobs")
    private Jobs jobs;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VariableNames")
    private java.util.List<String> variableNames;

    private QueryJobsWithResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobs = builder.jobs;
        this.labels = builder.labels;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.variableNames = builder.variableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJobsWithResultResponseBody create() {
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
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
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
     * @return variableNames
     */
    public java.util.List<String> getVariableNames() {
        return this.variableNames;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private Jobs jobs; 
        private java.util.List<Labels> labels; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<String> variableNames; 

        private Builder() {
        } 

        private Builder(QueryJobsWithResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobs = model.jobs;
            this.labels = model.labels;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.variableNames = model.variableNames;
        } 

        /**
         * <p>Code</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The jobs.</p>
         */
        public Builder jobs(Jobs jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The tag information that can be used as filter conditions. This field displays all tags with enumeration values in the task group.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The message returned by the API operation.</p>
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
         * <p>9bdaa1d1-a036-4451-ab11-ca0373679091</p>
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

        /**
         * <p>The names of the tags to be collected.</p>
         */
        public Builder variableNames(java.util.List<String> variableNames) {
            this.variableNames = variableNames;
            return this;
        }

        public QueryJobsWithResultResponseBody build() {
            return new QueryJobsWithResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Honorific")
        private String honorific;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JobUuid")
        private String jobUuid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("PreferredPhoneNumber")
        private String preferredPhoneNumber;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Round")
        private Integer round;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Contact(Builder builder) {
            this.honorific = builder.honorific;
            this.id = builder.id;
            this.jobUuid = builder.jobUuid;
            this.name = builder.name;
            this.phoneNumber = builder.phoneNumber;
            this.preferredPhoneNumber = builder.preferredPhoneNumber;
            this.referenceId = builder.referenceId;
            this.role = builder.role;
            this.round = builder.round;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return honorific
         */
        public String getHonorific() {
            return this.honorific;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jobUuid
         */
        public String getJobUuid() {
            return this.jobUuid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return preferredPhoneNumber
         */
        public String getPreferredPhoneNumber() {
            return this.preferredPhoneNumber;
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
         * @return round
         */
        public Integer getRound() {
            return this.round;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String honorific; 
            private String id; 
            private String jobUuid; 
            private String name; 
            private String phoneNumber; 
            private String preferredPhoneNumber; 
            private String referenceId; 
            private String role; 
            private Integer round; 
            private String state; 

            private Builder() {
            } 

            private Builder(Contact model) {
                this.honorific = model.honorific;
                this.id = model.id;
                this.jobUuid = model.jobUuid;
                this.name = model.name;
                this.phoneNumber = model.phoneNumber;
                this.preferredPhoneNumber = model.preferredPhoneNumber;
                this.referenceId = model.referenceId;
                this.role = model.role;
                this.round = model.round;
                this.state = model.state;
            } 

            /**
             * <p>The honorific of the contact. If this field is not specified, the default value is the same as the name. This is a custom field passed in JSON format when you call the API operation to execute the outbound call task.</p>
             * 
             * <strong>example:</strong>
             * <p>Mr. Zhang</p>
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * <p>The contact ID. A unique identifier generated by the system when the outbound call list is uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>63860deb-6218-45df-b1e0-76f2b166e790</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cc231a1d-3c05-4739-8926-193ecf4097ba</p>
             */
            public Builder jobUuid(String jobUuid) {
                this.jobUuid = jobUuid;
                return this;
            }

            /**
             * <p>The name of the contact, such as Zhang San.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The phone number of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1882020****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The phone number specified by the callee during the conversation. If this field is specified, the system calls this number. This is a custom field passed in JSON format when you call the API operation to execute the outbound call task.</p>
             * 
             * <strong>example:</strong>
             * <p>134123****</p>
             */
            public Builder preferredPhoneNumber(String preferredPhoneNumber) {
                this.preferredPhoneNumber = preferredPhoneNumber;
                return this;
            }

            /**
             * <p>The custom contact ID uploaded by the customer. This ID must be provided by the business side to avoid duplicate names.</p>
             * 
             * <strong>example:</strong>
             * <p>C01</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>The role of the contact in the outbound call business. If this field is not specified, roles are not distinguished. For example, in debt collection, contact roles can be borrower, co-borrower, or guarantor. This is a custom field passed in JSON format when you call the API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Borrower</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The conversation round.</p>
             * 
             * <strong>example:</strong>
             * <p>151</p>
             */
            public Builder round(Integer round) {
                this.round = round;
                return this;
            }

            /**
             * <p>The status of the contact, such as Available, WrongNumber, or DoesNotExist. This is a custom field passed in JSON format when you call the API operation to execute the outbound call task.</p>
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
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
     */
    public static class DialExceptionCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Hint")
        private String hint;

        private DialExceptionCodes(Builder builder) {
            this.code = builder.code;
            this.hint = builder.hint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialExceptionCodes create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hint
         */
        public String getHint() {
            return this.hint;
        }

        public static final class Builder {
            private String code; 
            private String hint; 

            private Builder() {
            } 

            private Builder(DialExceptionCodes model) {
                this.code = model.code;
                this.hint = model.hint;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder hint(String hint) {
                this.hint = hint;
                return this;
            }

            public DialExceptionCodes build() {
                return new DialExceptionCodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Is connected</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>Yes</p>
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
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
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
             * <p>The tag group to which the tag belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Animal</p>
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Kitten,Kitten</p>
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
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
     */
    public static class LatestTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallDuration")
        private Integer callDuration;

        @com.aliyun.core.annotation.NameInMap("CallDurationDisplay")
        private String callDurationDisplay;

        @com.aliyun.core.annotation.NameInMap("CallTime")
        private Long callTime;

        @com.aliyun.core.annotation.NameInMap("Contact")
        private Contact contact;

        @com.aliyun.core.annotation.NameInMap("DialExceptionCodes")
        private java.util.List<DialExceptionCodes> dialExceptionCodes;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private java.util.List<Extras> extras;

        @com.aliyun.core.annotation.NameInMap("HangUpDirection")
        private String hangUpDirection;

        @com.aliyun.core.annotation.NameInMap("HasAnswered")
        private Boolean hasAnswered;

        @com.aliyun.core.annotation.NameInMap("HasHangUpByRejection")
        private Boolean hasHangUpByRejection;

        @com.aliyun.core.annotation.NameInMap("HasLastPlaybackCompleted")
        private Boolean hasLastPlaybackCompleted;

        @com.aliyun.core.annotation.NameInMap("HasReachedEndOfFlow")
        private Boolean hasReachedEndOfFlow;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("TagHits")
        private java.util.List<TagHits> tagHits;

        @com.aliyun.core.annotation.NameInMap("TaskEndReason")
        private String taskEndReason;

        @com.aliyun.core.annotation.NameInMap("VoiceName")
        private String voiceName;

        private LatestTask(Builder builder) {
            this.callDuration = builder.callDuration;
            this.callDurationDisplay = builder.callDurationDisplay;
            this.callTime = builder.callTime;
            this.contact = builder.contact;
            this.dialExceptionCodes = builder.dialExceptionCodes;
            this.extras = builder.extras;
            this.hangUpDirection = builder.hangUpDirection;
            this.hasAnswered = builder.hasAnswered;
            this.hasHangUpByRejection = builder.hasHangUpByRejection;
            this.hasLastPlaybackCompleted = builder.hasLastPlaybackCompleted;
            this.hasReachedEndOfFlow = builder.hasReachedEndOfFlow;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.tagHits = builder.tagHits;
            this.taskEndReason = builder.taskEndReason;
            this.voiceName = builder.voiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestTask create() {
            return builder().build();
        }

        /**
         * @return callDuration
         */
        public Integer getCallDuration() {
            return this.callDuration;
        }

        /**
         * @return callDurationDisplay
         */
        public String getCallDurationDisplay() {
            return this.callDurationDisplay;
        }

        /**
         * @return callTime
         */
        public Long getCallTime() {
            return this.callTime;
        }

        /**
         * @return contact
         */
        public Contact getContact() {
            return this.contact;
        }

        /**
         * @return dialExceptionCodes
         */
        public java.util.List<DialExceptionCodes> getDialExceptionCodes() {
            return this.dialExceptionCodes;
        }

        /**
         * @return extras
         */
        public java.util.List<Extras> getExtras() {
            return this.extras;
        }

        /**
         * @return hangUpDirection
         */
        public String getHangUpDirection() {
            return this.hangUpDirection;
        }

        /**
         * @return hasAnswered
         */
        public Boolean getHasAnswered() {
            return this.hasAnswered;
        }

        /**
         * @return hasHangUpByRejection
         */
        public Boolean getHasHangUpByRejection() {
            return this.hasHangUpByRejection;
        }

        /**
         * @return hasLastPlaybackCompleted
         */
        public Boolean getHasLastPlaybackCompleted() {
            return this.hasLastPlaybackCompleted;
        }

        /**
         * @return hasReachedEndOfFlow
         */
        public Boolean getHasReachedEndOfFlow() {
            return this.hasReachedEndOfFlow;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return tagHits
         */
        public java.util.List<TagHits> getTagHits() {
            return this.tagHits;
        }

        /**
         * @return taskEndReason
         */
        public String getTaskEndReason() {
            return this.taskEndReason;
        }

        /**
         * @return voiceName
         */
        public String getVoiceName() {
            return this.voiceName;
        }

        public static final class Builder {
            private Integer callDuration; 
            private String callDurationDisplay; 
            private Long callTime; 
            private Contact contact; 
            private java.util.List<DialExceptionCodes> dialExceptionCodes; 
            private java.util.List<Extras> extras; 
            private String hangUpDirection; 
            private Boolean hasAnswered; 
            private Boolean hasHangUpByRejection; 
            private Boolean hasLastPlaybackCompleted; 
            private Boolean hasReachedEndOfFlow; 
            private String status; 
            private String statusName; 
            private java.util.List<TagHits> tagHits; 
            private String taskEndReason; 
            private String voiceName; 

            private Builder() {
            } 

            private Builder(LatestTask model) {
                this.callDuration = model.callDuration;
                this.callDurationDisplay = model.callDurationDisplay;
                this.callTime = model.callTime;
                this.contact = model.contact;
                this.dialExceptionCodes = model.dialExceptionCodes;
                this.extras = model.extras;
                this.hangUpDirection = model.hangUpDirection;
                this.hasAnswered = model.hasAnswered;
                this.hasHangUpByRejection = model.hasHangUpByRejection;
                this.hasLastPlaybackCompleted = model.hasLastPlaybackCompleted;
                this.hasReachedEndOfFlow = model.hasReachedEndOfFlow;
                this.status = model.status;
                this.statusName = model.statusName;
                this.tagHits = model.tagHits;
                this.taskEndReason = model.taskEndReason;
                this.voiceName = model.voiceName;
            } 

            /**
             * <p>The call duration.</p>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder callDuration(Integer callDuration) {
                this.callDuration = callDuration;
                return this;
            }

            /**
             * <p>The call duration.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder callDurationDisplay(String callDurationDisplay) {
                this.callDurationDisplay = callDurationDisplay;
                return this;
            }

            /**
             * <p>The call time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615363297000</p>
             */
            public Builder callTime(Long callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * <p>The contact.</p>
             */
            public Builder contact(Contact contact) {
                this.contact = contact;
                return this;
            }

            /**
             * <p>The call exception codes.</p>
             */
            public Builder dialExceptionCodes(java.util.List<DialExceptionCodes> dialExceptionCodes) {
                this.dialExceptionCodes = dialExceptionCodes;
                return this;
            }

            /**
             * <p>The names of the tags to be collected.</p>
             */
            public Builder extras(java.util.List<Extras> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>The party that hung up the call.</p>
             * 
             * <strong>example:</strong>
             * <p>Callee</p>
             */
            public Builder hangUpDirection(String hangUpDirection) {
                this.hangUpDirection = hangUpDirection;
                return this;
            }

            /**
             * <p>Indicates whether the call is answered.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasAnswered(Boolean hasAnswered) {
                this.hasAnswered = hasAnswered;
                return this;
            }

            /**
             * <p>Specifies whether the call is hung up due to rejection.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasHangUpByRejection(Boolean hasHangUpByRejection) {
                this.hasHangUpByRejection = hasHangUpByRejection;
                return this;
            }

            /**
             * <p>Indicates whether the playback is completed when the call is hung up.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
                this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
                return this;
            }

            /**
             * <p>Specifies whether the flow is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
                this.hasReachedEndOfFlow = hasReachedEndOfFlow;
                return this;
            }

            /**
             * <p>The call status.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the call status.</p>
             * 
             * <strong>example:</strong>
             * <p>Not dialed - Exceeded daily limit</p>
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * <p>The tag hit information. This field is returned for the legacy canvas.</p>
             */
            public Builder tagHits(java.util.List<TagHits> tagHits) {
                this.tagHits = tagHits;
                return this;
            }

            /**
             * <p>The call result.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder taskEndReason(String taskEndReason) {
                this.taskEndReason = taskEndReason;
                return this;
            }

            /**
             * <p>The name of the voice used in the call.</p>
             */
            public Builder voiceName(String voiceName) {
                this.voiceName = voiceName;
                return this;
            }

            public LatestTask build() {
                return new LatestTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JobFailureReason")
        private String jobFailureReason;

        @com.aliyun.core.annotation.NameInMap("LatestTask")
        private LatestTask latestTask;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        private List(Builder builder) {
            this.id = builder.id;
            this.jobFailureReason = builder.jobFailureReason;
            this.latestTask = builder.latestTask;
            this.status = builder.status;
            this.statusName = builder.statusName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jobFailureReason
         */
        public String getJobFailureReason() {
            return this.jobFailureReason;
        }

        /**
         * @return latestTask
         */
        public LatestTask getLatestTask() {
            return this.latestTask;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        public static final class Builder {
            private String id; 
            private String jobFailureReason; 
            private LatestTask latestTask; 
            private String status; 
            private String statusName; 

            private Builder() {
            } 

            private Builder(List model) {
                this.id = model.id;
                this.jobFailureReason = model.jobFailureReason;
                this.latestTask = model.latestTask;
                this.status = model.status;
                this.statusName = model.statusName;
            } 

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cc231a1d-3c05-4739-8926-193ecf4097ba</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The reason for the job failure.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>Unknown (Unknown error)</li>
             * <li>NoAnswer (No answer)</li>
             * <li>InvalidStrategy (Invalid strategy, incorrect strategy configuration)</li>
             * <li>TimeUp (Timeout during scheduling)</li>
             * <li>NoStrategy (Strategy is empty or not found)</li>
             * <li>CallFailed (Call failed)</li>
             * <li>PerDayCallCountLimit (Daily call count limit for the phone number)</li>
             * <li>ContactBlockList (Outbound call blocklist)</li>
             * <li>EmptyNumber (Nonexistent number, no outbound calls)</li>
             * <li>JobPerDayCallCountLimit (Daily call count limit for the phone number)</li>
             * <li>VerificationCancelled (Canceled due to pre-call verification failure)</li>
             * <li>ContactSuspended (Call suspended)</li>
             * <li>InArrears (Overdue payment)</li>
             * <li>OutOfService (Service suspended)</li>
             * <li>NoneRepeatableJobMaxAttemptCountLimit (Maximum attempt count for the job, effective when RepeatBy is None)</li>
             * </ul>
             */
            public Builder jobFailureReason(String jobFailureReason) {
                this.jobFailureReason = jobFailureReason;
                return this;
            }

            /**
             * <p>The latest call.</p>
             */
            public Builder latestTask(LatestTask latestTask) {
                this.latestTask = latestTask;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Scheduling(0, &quot;Scheduling&quot;)</li>
             * <li>Executing(1, &quot;Executing&quot;)</li>
             * <li>Succeeded(2, &quot;Completed - Reached&quot;)</li>
             * <li>Paused(3, &quot;Paused&quot;)</li>
             * <li>Failed(4, &quot;Completed - Not reached&quot;)</li>
             * <li>Cancelled(5, &quot;Canceled - Manual intervention&quot;)</li>
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
             * <p>The name of the job status.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed - Reached</p>
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Integer rowCount;

        private Jobs(Builder builder) {
            this.list = builder.list;
            this.pageCount = builder.pageCount;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.rowCount = builder.rowCount;
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
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
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
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageCount; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer rowCount; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.list = model.list;
                this.pageCount = model.pageCount;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.rowCount = model.rowCount;
            } 

            /**
             * <p>The list of jobs.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
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
             * <p>The number of entries per page.</p>
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
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobsWithResultResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List<String> valueList;

        private Labels(Builder builder) {
            this.name = builder.name;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return valueList
         */
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> valueList; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.name = model.name;
                this.valueList = model.valueList;
            } 

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Is satisfied</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of tag values.</p>
             */
            public Builder valueList(java.util.List<String> valueList) {
                this.valueList = valueList;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
