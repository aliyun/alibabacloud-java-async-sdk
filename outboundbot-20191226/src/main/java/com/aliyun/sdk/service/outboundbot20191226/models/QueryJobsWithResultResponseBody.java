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
             * <p>Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Value</p>
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

        public static final class Builder {
            private Integer callDuration; 
            private String callDurationDisplay; 
            private Long callTime; 
            private Contact contact; 
            private java.util.List<DialExceptionCodes> dialExceptionCodes; 
            private java.util.List<Extras> extras; 
            private Boolean hasAnswered; 
            private Boolean hasHangUpByRejection; 
            private Boolean hasLastPlaybackCompleted; 
            private Boolean hasReachedEndOfFlow; 
            private String status; 
            private String statusName; 
            private java.util.List<TagHits> tagHits; 
            private String taskEndReason; 

            private Builder() {
            } 

            private Builder(LatestTask model) {
                this.callDuration = model.callDuration;
                this.callDurationDisplay = model.callDurationDisplay;
                this.callTime = model.callTime;
                this.contact = model.contact;
                this.dialExceptionCodes = model.dialExceptionCodes;
                this.extras = model.extras;
                this.hasAnswered = model.hasAnswered;
                this.hasHangUpByRejection = model.hasHangUpByRejection;
                this.hasLastPlaybackCompleted = model.hasLastPlaybackCompleted;
                this.hasReachedEndOfFlow = model.hasReachedEndOfFlow;
                this.status = model.status;
                this.statusName = model.statusName;
                this.tagHits = model.tagHits;
                this.taskEndReason = model.taskEndReason;
            } 

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
            public Builder dialExceptionCodes(java.util.List<DialExceptionCodes> dialExceptionCodes) {
                this.dialExceptionCodes = dialExceptionCodes;
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
            public Builder tagHits(java.util.List<TagHits> tagHits) {
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
             * List.
             */
            public Builder list(java.util.List<List> list) {
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
