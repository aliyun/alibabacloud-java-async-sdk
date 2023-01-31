// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTaskResponseBody</p>
 */
public class SearchTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SearchTaskInfoList")
    private java.util.List < SearchTaskInfoList> searchTaskInfoList;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Long total;

    private SearchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.searchTaskInfoList = builder.searchTaskInfoList;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTaskResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchTaskInfoList
     */
    public java.util.List < SearchTaskInfoList> getSearchTaskInfoList() {
        return this.searchTaskInfoList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < SearchTaskInfoList> searchTaskInfoList; 
        private Boolean success; 
        private Long total; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SearchTaskInfoList.
         */
        public Builder searchTaskInfoList(java.util.List < SearchTaskInfoList> searchTaskInfoList) {
            this.searchTaskInfoList = searchTaskInfoList;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchTaskResponseBody build() {
            return new SearchTaskResponseBody(this);
        } 

    } 

    public static class SearchTaskInfoList extends TeaModel {
        @NameInMap("ActualTime")
        private Long actualTime;

        @NameInMap("CallDuration")
        private Integer callDuration;

        @NameInMap("CallDurationDisplay")
        private String callDurationDisplay;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("DialException")
        private String dialException;

        @NameInMap("DialExceptionCodes")
        private java.util.List < String > dialExceptionCodes;

        @NameInMap("DialExceptionOld")
        private String dialExceptionOld;

        @NameInMap("HasAnswered")
        private Boolean hasAnswered;

        @NameInMap("HasHangUpByRejection")
        private Boolean hasHangUpByRejection;

        @NameInMap("HasLastPlaybackCompleted")
        private Boolean hasLastPlaybackCompleted;

        @NameInMap("HasReachedEndOfFlow")
        private Boolean hasReachedEndOfFlow;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobGroupId")
        private String jobGroupId;

        @NameInMap("JobGroupName")
        private String jobGroupName;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobStatus")
        private Integer jobStatus;

        @NameInMap("JobStatusName")
        private String jobStatusName;

        @NameInMap("JobStatusString")
        private String jobStatusString;

        @NameInMap("RecordingDuration")
        private Integer recordingDuration;

        @NameInMap("ScriptName")
        private String scriptName;

        @NameInMap("TaskCreateTime")
        private Long taskCreateTime;

        @NameInMap("TaskEndReason")
        private Integer taskEndReason;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        @NameInMap("TaskStatusName")
        private String taskStatusName;

        @NameInMap("TaskStatusString")
        private String taskStatusString;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        private SearchTaskInfoList(Builder builder) {
            this.actualTime = builder.actualTime;
            this.callDuration = builder.callDuration;
            this.callDurationDisplay = builder.callDurationDisplay;
            this.calledNumber = builder.calledNumber;
            this.dialException = builder.dialException;
            this.dialExceptionCodes = builder.dialExceptionCodes;
            this.dialExceptionOld = builder.dialExceptionOld;
            this.hasAnswered = builder.hasAnswered;
            this.hasHangUpByRejection = builder.hasHangUpByRejection;
            this.hasLastPlaybackCompleted = builder.hasLastPlaybackCompleted;
            this.hasReachedEndOfFlow = builder.hasReachedEndOfFlow;
            this.instanceId = builder.instanceId;
            this.jobGroupId = builder.jobGroupId;
            this.jobGroupName = builder.jobGroupName;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.jobStatusName = builder.jobStatusName;
            this.jobStatusString = builder.jobStatusString;
            this.recordingDuration = builder.recordingDuration;
            this.scriptName = builder.scriptName;
            this.taskCreateTime = builder.taskCreateTime;
            this.taskEndReason = builder.taskEndReason;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.taskStatusName = builder.taskStatusName;
            this.taskStatusString = builder.taskStatusString;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchTaskInfoList create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
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
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return dialException
         */
        public String getDialException() {
            return this.dialException;
        }

        /**
         * @return dialExceptionCodes
         */
        public java.util.List < String > getDialExceptionCodes() {
            return this.dialExceptionCodes;
        }

        /**
         * @return dialExceptionOld
         */
        public String getDialExceptionOld() {
            return this.dialExceptionOld;
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
         * @return jobGroupName
         */
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jobStatusName
         */
        public String getJobStatusName() {
            return this.jobStatusName;
        }

        /**
         * @return jobStatusString
         */
        public String getJobStatusString() {
            return this.jobStatusString;
        }

        /**
         * @return recordingDuration
         */
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return taskCreateTime
         */
        public Long getTaskCreateTime() {
            return this.taskCreateTime;
        }

        /**
         * @return taskEndReason
         */
        public Integer getTaskEndReason() {
            return this.taskEndReason;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskStatusName
         */
        public String getTaskStatusName() {
            return this.taskStatusName;
        }

        /**
         * @return taskStatusString
         */
        public String getTaskStatusString() {
            return this.taskStatusString;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long actualTime; 
            private Integer callDuration; 
            private String callDurationDisplay; 
            private String calledNumber; 
            private String dialException; 
            private java.util.List < String > dialExceptionCodes; 
            private String dialExceptionOld; 
            private Boolean hasAnswered; 
            private Boolean hasHangUpByRejection; 
            private Boolean hasLastPlaybackCompleted; 
            private Boolean hasReachedEndOfFlow; 
            private String instanceId; 
            private String jobGroupId; 
            private String jobGroupName; 
            private String jobId; 
            private Integer jobStatus; 
            private String jobStatusName; 
            private String jobStatusString; 
            private Integer recordingDuration; 
            private String scriptName; 
            private Long taskCreateTime; 
            private Integer taskEndReason; 
            private String taskId; 
            private Integer taskStatus; 
            private String taskStatusName; 
            private String taskStatusString; 
            private String userId; 
            private String userName; 

            /**
             * ActualTime.
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
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
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * DialException.
             */
            public Builder dialException(String dialException) {
                this.dialException = dialException;
                return this;
            }

            /**
             * DialExceptionCodes.
             */
            public Builder dialExceptionCodes(java.util.List < String > dialExceptionCodes) {
                this.dialExceptionCodes = dialExceptionCodes;
                return this;
            }

            /**
             * DialExceptionOld.
             */
            public Builder dialExceptionOld(String dialExceptionOld) {
                this.dialExceptionOld = dialExceptionOld;
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
             * JobGroupName.
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
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
             * JobStatus.
             */
            public Builder jobStatus(Integer jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * JobStatusName.
             */
            public Builder jobStatusName(String jobStatusName) {
                this.jobStatusName = jobStatusName;
                return this;
            }

            /**
             * JobStatusString.
             */
            public Builder jobStatusString(String jobStatusString) {
                this.jobStatusString = jobStatusString;
                return this;
            }

            /**
             * RecordingDuration.
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * TaskCreateTime.
             */
            public Builder taskCreateTime(Long taskCreateTime) {
                this.taskCreateTime = taskCreateTime;
                return this;
            }

            /**
             * TaskEndReason.
             */
            public Builder taskEndReason(Integer taskEndReason) {
                this.taskEndReason = taskEndReason;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskStatusName.
             */
            public Builder taskStatusName(String taskStatusName) {
                this.taskStatusName = taskStatusName;
                return this;
            }

            /**
             * TaskStatusString.
             */
            public Builder taskStatusString(String taskStatusString) {
                this.taskStatusString = taskStatusString;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SearchTaskInfoList build() {
                return new SearchTaskInfoList(this);
            } 

        } 

    }
}
