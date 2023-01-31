// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobsWithResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobsWithResultResponseBody</p>
 */
public class QueryJobsWithResultResponseBody extends TeaModel {
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

    @NameInMap("VariableNames")
    private java.util.List < String > variableNames;

    private QueryJobsWithResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobs = builder.jobs;
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

    /**
     * @return variableNames
     */
    public java.util.List < String > getVariableNames() {
        return this.variableNames;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private Jobs jobs; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < String > variableNames; 

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

        /**
         * VariableNames.
         */
        public Builder variableNames(java.util.List < String > variableNames) {
            this.variableNames = variableNames;
            return this;
        }

        public QueryJobsWithResultResponseBody build() {
            return new QueryJobsWithResultResponseBody(this);
        } 

    } 

    public static class Contact extends TeaModel {
        @NameInMap("Honorific")
        private String honorific;

        @NameInMap("Id")
        private String id;

        @NameInMap("JobUuid")
        private String jobUuid;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("PreferredPhoneNumber")
        private String preferredPhoneNumber;

        @NameInMap("ReferenceId")
        private String referenceId;

        @NameInMap("Role")
        private String role;

        @NameInMap("Round")
        private Integer round;

        @NameInMap("State")
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

            /**
             * Honorific.
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * JobUuid.
             */
            public Builder jobUuid(String jobUuid) {
                this.jobUuid = jobUuid;
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
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * PreferredPhoneNumber.
             */
            public Builder preferredPhoneNumber(String preferredPhoneNumber) {
                this.preferredPhoneNumber = preferredPhoneNumber;
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
             * Round.
             */
            public Builder round(Integer round) {
                this.round = round;
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
    public static class DialExceptionCodes extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Hint")
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

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Hint.
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
    public static class TagHits extends TeaModel {
        @NameInMap("TagGroup")
        private String tagGroup;

        @NameInMap("TagName")
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

            /**
             * TagGroup.
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * TagName.
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
    public static class LatestTask extends TeaModel {
        @NameInMap("CallDuration")
        private Integer callDuration;

        @NameInMap("CallDurationDisplay")
        private String callDurationDisplay;

        @NameInMap("CallTime")
        private Long callTime;

        @NameInMap("Contact")
        private Contact contact;

        @NameInMap("DialExceptionCodes")
        private java.util.List < DialExceptionCodes> dialExceptionCodes;

        @NameInMap("Extras")
        private java.util.List < Extras> extras;

        @NameInMap("HasAnswered")
        private Boolean hasAnswered;

        @NameInMap("HasHangUpByRejection")
        private Boolean hasHangUpByRejection;

        @NameInMap("HasLastPlaybackCompleted")
        private Boolean hasLastPlaybackCompleted;

        @NameInMap("HasReachedEndOfFlow")
        private Boolean hasReachedEndOfFlow;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("TagHits")
        private java.util.List < TagHits> tagHits;

        @NameInMap("TaskEndReason")
        private String taskEndReason;

        private LatestTask(Builder builder) {
            this.callDuration = builder.callDuration;
            this.callDurationDisplay = builder.callDurationDisplay;
            this.callTime = builder.callTime;
            this.contact = builder.contact;
            this.dialExceptionCodes = builder.dialExceptionCodes;
            this.extras = builder.extras;
            this.hasAnswered = builder.hasAnswered;
            this.hasHangUpByRejection = builder.hasHangUpByRejection;
            this.hasLastPlaybackCompleted = builder.hasLastPlaybackCompleted;
            this.hasReachedEndOfFlow = builder.hasReachedEndOfFlow;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.tagHits = builder.tagHits;
            this.taskEndReason = builder.taskEndReason;
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
        public java.util.List < DialExceptionCodes> getDialExceptionCodes() {
            return this.dialExceptionCodes;
        }

        /**
         * @return extras
         */
        public java.util.List < Extras> getExtras() {
            return this.extras;
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
        public java.util.List < TagHits> getTagHits() {
            return this.tagHits;
        }

        /**
         * @return taskEndReason
         */
        public String getTaskEndReason() {
            return this.taskEndReason;
        }

        public static final class Builder {
            private Integer callDuration; 
            private String callDurationDisplay; 
            private Long callTime; 
            private Contact contact; 
            private java.util.List < DialExceptionCodes> dialExceptionCodes; 
            private java.util.List < Extras> extras; 
            private Boolean hasAnswered; 
            private Boolean hasHangUpByRejection; 
            private Boolean hasLastPlaybackCompleted; 
            private Boolean hasReachedEndOfFlow; 
            private String status; 
            private String statusName; 
            private java.util.List < TagHits> tagHits; 
            private String taskEndReason; 

            /**
             * CallDuration.
             */
            public Builder callDuration(Integer callDuration) {
                this.callDuration = callDuration;
                return this;
            }

            /**
             * CallDurationDisplay.
             */
            public Builder callDurationDisplay(String callDurationDisplay) {
                this.callDurationDisplay = callDurationDisplay;
                return this;
            }

            /**
             * CallTime.
             */
            public Builder callTime(Long callTime) {
                this.callTime = callTime;
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
             * DialExceptionCodes.
             */
            public Builder dialExceptionCodes(java.util.List < DialExceptionCodes> dialExceptionCodes) {
                this.dialExceptionCodes = dialExceptionCodes;
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
             * HasAnswered.
             */
            public Builder hasAnswered(Boolean hasAnswered) {
                this.hasAnswered = hasAnswered;
                return this;
            }

            /**
             * HasHangUpByRejection.
             */
            public Builder hasHangUpByRejection(Boolean hasHangUpByRejection) {
                this.hasHangUpByRejection = hasHangUpByRejection;
                return this;
            }

            /**
             * HasLastPlaybackCompleted.
             */
            public Builder hasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
                this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
                return this;
            }

            /**
             * HasReachedEndOfFlow.
             */
            public Builder hasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
                this.hasReachedEndOfFlow = hasReachedEndOfFlow;
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
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * TagHits.
             */
            public Builder tagHits(java.util.List < TagHits> tagHits) {
                this.tagHits = tagHits;
                return this;
            }

            /**
             * TaskEndReason.
             */
            public Builder taskEndReason(String taskEndReason) {
                this.taskEndReason = taskEndReason;
                return this;
            }

            public LatestTask build() {
                return new LatestTask(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("JobFailureReason")
        private String jobFailureReason;

        @NameInMap("LatestTask")
        private LatestTask latestTask;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
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

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * JobFailureReason.
             */
            public Builder jobFailureReason(String jobFailureReason) {
                this.jobFailureReason = jobFailureReason;
                return this;
            }

            /**
             * LatestTask.
             */
            public Builder latestTask(LatestTask latestTask) {
                this.latestTask = latestTask;
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
             * StatusName.
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
    public static class Jobs extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("RowCount")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageCount; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer rowCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
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
             * RowCount.
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
}
