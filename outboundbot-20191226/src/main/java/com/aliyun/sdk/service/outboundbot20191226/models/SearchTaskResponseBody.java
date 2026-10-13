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
 * {@link SearchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTaskResponseBody</p>
 */
public class SearchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchTaskInfoList")
    private java.util.List<SearchTaskInfoList> searchTaskInfoList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("VariableNames")
    private java.util.List<String> variableNames;

    private SearchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.labels = builder.labels;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.searchTaskInfoList = builder.searchTaskInfoList;
        this.success = builder.success;
        this.total = builder.total;
        this.variableNames = builder.variableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTaskResponseBody create() {
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
    public java.util.List<SearchTaskInfoList> getSearchTaskInfoList() {
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

    /**
     * @return variableNames
     */
    public java.util.List<String> getVariableNames() {
        return this.variableNames;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Labels> labels; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SearchTaskInfoList> searchTaskInfoList; 
        private Boolean success; 
        private Long total; 
        private java.util.List<String> variableNames; 

        private Builder() {
        } 

        private Builder(SearchTaskResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.labels = model.labels;
            this.message = model.message;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.searchTaskInfoList = model.searchTaskInfoList;
            this.success = model.success;
            this.total = model.total;
            this.variableNames = model.variableNames;
        } 

        /**
         * <p>The request status code.</p>
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
         * <p>The label information that can be used as filter conditions.</p>
         * <blockquote>
         * <p>Displays all label information with enumerated values in this job group.</p>
         * </blockquote>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
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
         * <p>The list of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder searchTaskInfoList(java.util.List<SearchTaskInfoList> searchTaskInfoList) {
            this.searchTaskInfoList = searchTaskInfoList;
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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The full set of label name keys.</p>
         */
        public Builder variableNames(java.util.List<String> variableNames) {
            this.variableNames = variableNames;
            return this;
        }

        public SearchTaskResponseBody build() {
            return new SearchTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTaskResponseBody</p>
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
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>Satisfied</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of label values.</p>
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
    /**
     * 
     * {@link SearchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTaskResponseBody</p>
     */
    public static class SearchTaskInfoListLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("K")
        private String k;

        @com.aliyun.core.annotation.NameInMap("V")
        private String v;

        private SearchTaskInfoListLabels(Builder builder) {
            this.k = builder.k;
            this.v = builder.v;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchTaskInfoListLabels create() {
            return builder().build();
        }

        /**
         * @return k
         */
        public String getK() {
            return this.k;
        }

        /**
         * @return v
         */
        public String getV() {
            return this.v;
        }

        public static final class Builder {
            private String k; 
            private String v; 

            private Builder() {
            } 

            private Builder(SearchTaskInfoListLabels model) {
                this.k = model.k;
                this.v = model.v;
            } 

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>Satisfied</p>
             */
            public Builder k(String k) {
                this.k = k;
                return this;
            }

            /**
             * <p>The matched label value.</p>
             * 
             * <strong>example:</strong>
             * <p>Yes</p>
             */
            public Builder v(String v) {
                this.v = v;
                return this;
            }

            public SearchTaskInfoListLabels build() {
                return new SearchTaskInfoListLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTaskResponseBody</p>
     */
    public static class SearchTaskInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualTime")
        private Long actualTime;

        @com.aliyun.core.annotation.NameInMap("CallDuration")
        private Integer callDuration;

        @com.aliyun.core.annotation.NameInMap("CallDurationDisplay")
        private String callDurationDisplay;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("DialException")
        private String dialException;

        @com.aliyun.core.annotation.NameInMap("DialExceptionCodes")
        private java.util.List<String> dialExceptionCodes;

        @com.aliyun.core.annotation.NameInMap("DialExceptionOld")
        private String dialExceptionOld;

        @com.aliyun.core.annotation.NameInMap("HasAnswered")
        private Boolean hasAnswered;

        @com.aliyun.core.annotation.NameInMap("HasHangUpByRejection")
        private Boolean hasHangUpByRejection;

        @com.aliyun.core.annotation.NameInMap("HasLastPlaybackCompleted")
        private Boolean hasLastPlaybackCompleted;

        @com.aliyun.core.annotation.NameInMap("HasReachedEndOfFlow")
        private Boolean hasReachedEndOfFlow;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobGroupName")
        private String jobGroupName;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private Integer jobStatus;

        @com.aliyun.core.annotation.NameInMap("JobStatusName")
        private String jobStatusName;

        @com.aliyun.core.annotation.NameInMap("JobStatusString")
        private String jobStatusString;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<SearchTaskInfoListLabels> labels;

        @com.aliyun.core.annotation.NameInMap("RecordingDuration")
        private Integer recordingDuration;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("TaskCreateTime")
        private Long taskCreateTime;

        @com.aliyun.core.annotation.NameInMap("TaskEndReason")
        private Integer taskEndReason;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusName")
        private String taskStatusName;

        @com.aliyun.core.annotation.NameInMap("TaskStatusString")
        private String taskStatusString;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SearchTaskInfoList(Builder builder) {
            this.actualTime = builder.actualTime;
            this.callDuration = builder.callDuration;
            this.callDurationDisplay = builder.callDurationDisplay;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
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
            this.labels = builder.labels;
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
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
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
        public java.util.List<String> getDialExceptionCodes() {
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
         * @return labels
         */
        public java.util.List<SearchTaskInfoListLabels> getLabels() {
            return this.labels;
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
            private String callingNumber; 
            private String dialException; 
            private java.util.List<String> dialExceptionCodes; 
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
            private java.util.List<SearchTaskInfoListLabels> labels; 
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

            private Builder() {
            } 

            private Builder(SearchTaskInfoList model) {
                this.actualTime = model.actualTime;
                this.callDuration = model.callDuration;
                this.callDurationDisplay = model.callDurationDisplay;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.dialException = model.dialException;
                this.dialExceptionCodes = model.dialExceptionCodes;
                this.dialExceptionOld = model.dialExceptionOld;
                this.hasAnswered = model.hasAnswered;
                this.hasHangUpByRejection = model.hasHangUpByRejection;
                this.hasLastPlaybackCompleted = model.hasLastPlaybackCompleted;
                this.hasReachedEndOfFlow = model.hasReachedEndOfFlow;
                this.instanceId = model.instanceId;
                this.jobGroupId = model.jobGroupId;
                this.jobGroupName = model.jobGroupName;
                this.jobId = model.jobId;
                this.jobStatus = model.jobStatus;
                this.jobStatusName = model.jobStatusName;
                this.jobStatusString = model.jobStatusString;
                this.labels = model.labels;
                this.recordingDuration = model.recordingDuration;
                this.scriptName = model.scriptName;
                this.taskCreateTime = model.taskCreateTime;
                this.taskEndReason = model.taskEndReason;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.taskStatusName = model.taskStatusName;
                this.taskStatusString = model.taskStatusString;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>The actual execution time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1643436089677</p>
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * <p>The call duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>46000</p>
             */
            public Builder callDuration(Integer callDuration) {
                this.callDuration = callDuration;
                return this;
            }

            /**
             * <p>The call duration.</p>
             * 
             * <strong>example:</strong>
             * <p>47″</p>
             */
            public Builder callDurationDisplay(String callDurationDisplay) {
                this.callDurationDisplay = callDurationDisplay;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>15205879599</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>02152739269</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The exception information.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;code&quot;:&quot;OutboundCallError.SipCodeError&quot;, &quot;params&quot;:[{&quot;key&quot;:&quot;SipCode&quot;,&quot;value&quot;:&quot;500&quot;}]}]</p>
             */
            public Builder dialException(String dialException) {
                this.dialException = dialException;
                return this;
            }

            /**
             * <p>The field used for displaying remarks on the page.</p>
             */
            public Builder dialExceptionCodes(java.util.List<String> dialExceptionCodes) {
                this.dialExceptionCodes = dialExceptionCodes;
                return this;
            }

            /**
             * <p>The exception information.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;OutboundCallError.SipTrunkError&quot;]</p>
             */
            public Builder dialExceptionOld(String dialExceptionOld) {
                this.dialExceptionOld = dialExceptionOld;
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
             * <p>Indicates whether the call is hung up due to unrecognized intent.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasHangUpByRejection(Boolean hasHangUpByRejection) {
                this.hasHangUpByRejection = hasHangUpByRejection;
                return this;
            }

            /**
             * <p>Indicates whether the last sentence is fully played before hanging up.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
                this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
                return this;
            }

            /**
             * <p>Indicates whether the dialogue is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
                this.hasReachedEndOfFlow = hasReachedEndOfFlow;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>73df6283-26b2-402d-bad0-ffa489923ea1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The job group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>37db3113-ad34-4ba3-b930-468f016bbf95</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The name of the job group.</p>
             * 
             * <strong>example:</strong>
             * <p>85% new (with notes and underlines) 2021_11_14_18_00_51</p>
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6203248e-e652-4ef8-a1eb-586ed7b54dc2</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>0: Scheduling.</li>
             * <li>1: Executing.</li>
             * <li>2: Succeeded (Reached).</li>
             * <li>3: Paused.</li>
             * <li>4: Failed (Not connected - Busy).</li>
             * <li>5: Cancelled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder jobStatus(Integer jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The display content of the job status. Valid values:</p>
             * <ul>
             * <li>0: Scheduling.</li>
             * <li>1: Executing.</li>
             * <li>2: Succeeded (Reached).</li>
             * <li>3: Paused.</li>
             * <li>4: Failed (Not connected - Busy).</li>
             * <li>5: Cancelled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduling</p>
             */
            public Builder jobStatusName(String jobStatusName) {
                this.jobStatusName = jobStatusName;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Scheduling: Scheduling (0).</li>
             * <li>Executing: Executing (1).</li>
             * <li>Succeeded: Reached (2).</li>
             * <li>Paused: Paused (3).</li>
             * <li>Failed: Not connected - Busy (4).</li>
             * <li>Cancelled: Cancelled (5).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduling</p>
             */
            public Builder jobStatusString(String jobStatusString) {
                this.jobStatusString = jobStatusString;
                return this;
            }

            /**
             * <p>The label hit status of the current outbound call.</p>
             */
            public Builder labels(java.util.List<SearchTaskInfoListLabels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The ringing duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * <p>The scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>Chronic disease leads</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The task creation time. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1646792941</p>
             */
            public Builder taskCreateTime(Long taskCreateTime) {
                this.taskCreateTime = taskCreateTime;
                return this;
            }

            /**
             * <p>The reason why the task ended. Valid values:</p>
             * <ul>
             * <li>FINISHED (1): The task completed normally.</li>
             * <li>CHATBOT_HANGUP_AFTER_NOANSWER (2): The robot hung up after an unrecognized intent.</li>
             * <li>CHATBOT_HANGUP_AFTER_SILENCE (3): The robot hung up due to a silence timeout.</li>
             * <li>CLIENT_HANGUP_AFTER_NOANSWER (4): The user hung up after an unrecognized intent.</li>
             * <li>CLIENT_HANGUP (5): The user hung up without a specific reason.</li>
             * <li>TRANSFER_BY_INTENT (6): The call was transferred to an agent due to a matched intent.</li>
             * <li>TRANSFER_AFTER_NOANSWER (7): The call was transferred to an agent after an unrecognized intent.</li>
             * <li>INO_INTERACTION (8): No interaction occurred on the user side.</li>
             * <li>ERROR (9): The task was interrupted by a system exception.</li>
             * <li>SPECIAL_INTERCEPT_VOICE_ASSISTANT (10): The call was intercepted by the voice assistant.</li>
             * <li>SPECIAL_INTERCEPT_EXTENSION_NUMBER_TRANSFER (11): The call was intercepted during extension number transfer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OutOfService</p>
             */
            public Builder taskEndReason(Integer taskEndReason) {
                this.taskEndReason = taskEndReason;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>479aea04-3a92-4ac3-935d-c8798c667850</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task status. Valid values:
             * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The general <strong>Succeeded</strong>: 1 (Connected) status is not displayed. Instead, specific subdivided causes are returned.)</p>
             * <ul>
             * <li><strong>Executing</strong>: 0 (Dialing).</li>
             * <li><strong>Succeeded</strong>: 1 (Connected).</li>
             * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
             * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
             * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
             * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
             * <li><strong>Failed</strong>: 6 (Failed).</li>
             * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
             * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
             * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
             * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
             * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, not dialed).</li>
             * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
             * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
             * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Caller number not registered).</li>
             * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
             * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Canceled due to pre-call verification failure).</li>
             * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Callee suspended, not dialed).</li>
             * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Callee has overdue payment, not dialed).</li>
             * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Caller number does not exist).</li>
             * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
             * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after unrecognized intent).</li>
             * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
             * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
             * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
             * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
             * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
             * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on user side).</li>
             * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted by system exception).</li>
             * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
             * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The display content of the call status. Valid values:
             * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The general <strong>Succeeded</strong>: 1 (Connected) status is not displayed. Instead, specific subdivided causes are returned.)</p>
             * <ul>
             * <li><strong>Executing</strong>: 0 (Dialing).</li>
             * <li><strong>Succeeded</strong>: 1 (Connected).</li>
             * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
             * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
             * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
             * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
             * <li><strong>Failed</strong>: 6 (Failed).</li>
             * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
             * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
             * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
             * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
             * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, not dialed).</li>
             * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
             * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
             * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Caller number not registered).</li>
             * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
             * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Canceled due to pre-call verification failure).</li>
             * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Callee suspended, not dialed).</li>
             * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Callee has overdue payment, not dialed).</li>
             * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Caller number does not exist).</li>
             * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
             * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after unrecognized intent).</li>
             * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
             * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
             * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
             * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
             * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
             * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on user side).</li>
             * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted by system exception).</li>
             * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
             * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Dialing</p>
             */
            public Builder taskStatusName(String taskStatusName) {
                this.taskStatusName = taskStatusName;
                return this;
            }

            /**
             * <p>The task status. Valid values:
             * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The general <strong>Succeeded</strong>: 1 (Connected) status is not displayed. Instead, specific subdivided causes are returned.)</p>
             * <ul>
             * <li><strong>Executing</strong>: 0 (Dialing).</li>
             * <li><strong>Succeeded</strong>: 1 (Connected).</li>
             * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
             * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
             * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
             * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
             * <li><strong>Failed</strong>: 6 (Failed).</li>
             * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
             * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
             * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
             * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
             * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, not dialed).</li>
             * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
             * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
             * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Caller number not registered).</li>
             * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
             * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Canceled due to pre-call verification failure).</li>
             * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Callee suspended, not dialed).</li>
             * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Callee has overdue payment, not dialed).</li>
             * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Caller number does not exist).</li>
             * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
             * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after unrecognized intent).</li>
             * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
             * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
             * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
             * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
             * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
             * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on user side).</li>
             * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted by system exception).</li>
             * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
             * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
             * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected - Special interception - Custom interception).</li>
             * <li><strong>HighRiskSipCode</strong>: 32 (Not dialed - High risk, not dialed).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder taskStatusString(String taskStatusString) {
                this.taskStatusString = taskStatusString;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12334134</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
