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
 * {@link SearchTaskRequest} extends {@link RequestModel}
 *
 * <p>SearchTaskRequest</p>
 */
public class SearchTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActualTimeGte")
    private Long actualTimeGte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActualTimeLte")
    private Long actualTimeLte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDurationGte")
    private Long callDurationGte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDurationLte")
    private Long callDurationLte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupNameQuery")
    private String jobGroupNameQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobStatusStringList")
    private String jobStatusStringList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelsJson")
    private java.util.List<String> labelsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherId")
    private String otherId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingDurationGte")
    private Long recordingDurationGte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingDurationLte")
    private Long recordingDurationLte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptNameQuery")
    private String scriptNameQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskCreateTimeGte")
    private Long taskCreateTimeGte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskCreateTimeLte")
    private Long taskCreateTimeLte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatusStringList")
    private String taskStatusStringList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdMatch")
    private String userIdMatch;

    private SearchTaskRequest(Builder builder) {
        super(builder);
        this.actualTimeGte = builder.actualTimeGte;
        this.actualTimeLte = builder.actualTimeLte;
        this.callDurationGte = builder.callDurationGte;
        this.callDurationLte = builder.callDurationLte;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobGroupNameQuery = builder.jobGroupNameQuery;
        this.jobId = builder.jobId;
        this.jobStatusStringList = builder.jobStatusStringList;
        this.labelsJson = builder.labelsJson;
        this.otherId = builder.otherId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.recordingDurationGte = builder.recordingDurationGte;
        this.recordingDurationLte = builder.recordingDurationLte;
        this.scriptNameQuery = builder.scriptNameQuery;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.taskCreateTimeGte = builder.taskCreateTimeGte;
        this.taskCreateTimeLte = builder.taskCreateTimeLte;
        this.taskId = builder.taskId;
        this.taskStatusStringList = builder.taskStatusStringList;
        this.userIdMatch = builder.userIdMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualTimeGte
     */
    public Long getActualTimeGte() {
        return this.actualTimeGte;
    }

    /**
     * @return actualTimeLte
     */
    public Long getActualTimeLte() {
        return this.actualTimeLte;
    }

    /**
     * @return callDurationGte
     */
    public Long getCallDurationGte() {
        return this.callDurationGte;
    }

    /**
     * @return callDurationLte
     */
    public Long getCallDurationLte() {
        return this.callDurationLte;
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
     * @return jobGroupNameQuery
     */
    public String getJobGroupNameQuery() {
        return this.jobGroupNameQuery;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobStatusStringList
     */
    public String getJobStatusStringList() {
        return this.jobStatusStringList;
    }

    /**
     * @return labelsJson
     */
    public java.util.List<String> getLabelsJson() {
        return this.labelsJson;
    }

    /**
     * @return otherId
     */
    public String getOtherId() {
        return this.otherId;
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
     * @return recordingDurationGte
     */
    public Long getRecordingDurationGte() {
        return this.recordingDurationGte;
    }

    /**
     * @return recordingDurationLte
     */
    public Long getRecordingDurationLte() {
        return this.recordingDurationLte;
    }

    /**
     * @return scriptNameQuery
     */
    public String getScriptNameQuery() {
        return this.scriptNameQuery;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return taskCreateTimeGte
     */
    public Long getTaskCreateTimeGte() {
        return this.taskCreateTimeGte;
    }

    /**
     * @return taskCreateTimeLte
     */
    public Long getTaskCreateTimeLte() {
        return this.taskCreateTimeLte;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatusStringList
     */
    public String getTaskStatusStringList() {
        return this.taskStatusStringList;
    }

    /**
     * @return userIdMatch
     */
    public String getUserIdMatch() {
        return this.userIdMatch;
    }

    public static final class Builder extends Request.Builder<SearchTaskRequest, Builder> {
        private Long actualTimeGte; 
        private Long actualTimeLte; 
        private Long callDurationGte; 
        private Long callDurationLte; 
        private String calledNumber; 
        private String callingNumber; 
        private String instanceId; 
        private String jobGroupId; 
        private String jobGroupNameQuery; 
        private String jobId; 
        private String jobStatusStringList; 
        private java.util.List<String> labelsJson; 
        private String otherId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long recordingDurationGte; 
        private Long recordingDurationLte; 
        private String scriptNameQuery; 
        private String sortBy; 
        private String sortOrder; 
        private Long taskCreateTimeGte; 
        private Long taskCreateTimeLte; 
        private String taskId; 
        private String taskStatusStringList; 
        private String userIdMatch; 

        private Builder() {
            super();
        } 

        private Builder(SearchTaskRequest request) {
            super(request);
            this.actualTimeGte = request.actualTimeGte;
            this.actualTimeLte = request.actualTimeLte;
            this.callDurationGte = request.callDurationGte;
            this.callDurationLte = request.callDurationLte;
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobGroupNameQuery = request.jobGroupNameQuery;
            this.jobId = request.jobId;
            this.jobStatusStringList = request.jobStatusStringList;
            this.labelsJson = request.labelsJson;
            this.otherId = request.otherId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.recordingDurationGte = request.recordingDurationGte;
            this.recordingDurationLte = request.recordingDurationLte;
            this.scriptNameQuery = request.scriptNameQuery;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.taskCreateTimeGte = request.taskCreateTimeGte;
            this.taskCreateTimeLte = request.taskCreateTimeLte;
            this.taskId = request.taskId;
            this.taskStatusStringList = request.taskStatusStringList;
            this.userIdMatch = request.userIdMatch;
        } 

        /**
         * <p>The start time of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1646582400000</p>
         */
        public Builder actualTimeGte(Long actualTimeGte) {
            this.putQueryParameter("ActualTimeGte", actualTimeGte);
            this.actualTimeGte = actualTimeGte;
            return this;
        }

        /**
         * <p>The end time of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1643126399000</p>
         */
        public Builder actualTimeLte(Long actualTimeLte) {
            this.putQueryParameter("ActualTimeLte", actualTimeLte);
            this.actualTimeLte = actualTimeLte;
            return this;
        }

        /**
         * <p>The minimum call duration for the search, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12341155</p>
         */
        public Builder callDurationGte(Long callDurationGte) {
            this.putQueryParameter("CallDurationGte", callDurationGte);
            this.callDurationGte = callDurationGte;
            return this;
        }

        /**
         * <p>The maximum call duration for the search, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12341155</p>
         */
        public Builder callDurationLte(Long callDurationLte) {
            this.putQueryParameter("CallDurationLte", callDurationLte);
            this.callDurationLte = callDurationLte;
            return this;
        }

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>15126426342</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>051085500215</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d481cebe-0bb6-4d13-9649-42ce5074fb75</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The job group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3a30ae7c-27b2-4305-9444-7185ced9d51f</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>The name of the job group.</p>
         * 
         * <strong>example:</strong>
         * <p>ChinaLifePCHospitalizationInsuranceRenewal_20220301_134130</p>
         */
        public Builder jobGroupNameQuery(String jobGroupNameQuery) {
            this.putQueryParameter("JobGroupNameQuery", jobGroupNameQuery);
            this.jobGroupNameQuery = jobGroupNameQuery;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11994321-e6bc-47bb-8b1c-8eef8f2f768b</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The job statuses. Separate multiple statuses with commas (,). If this field is not empty, it overwrites jobStatusList. Valid values:</p>
         * <ul>
         * <li>Scheduling: The job is being scheduled.</li>
         * <li>Executing: The job is being executed.</li>
         * <li>Succeeded: The job is finished and the called party is reached.</li>
         * <li>Paused: The job is stopped.</li>
         * <li>Failed: The job is finished but the called party is not reached.</li>
         * <li>Cancelled: The job is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder jobStatusStringList(String jobStatusStringList) {
            this.putQueryParameter("JobStatusStringList", jobStatusStringList);
            this.jobStatusStringList = jobStatusStringList;
            return this;
        }

        /**
         * <p>The filter conditions for call labels.</p>
         * <blockquote>
         * <p>You can only filter by labels that are configured with specific enumerated label values, which means labels configured with specific values in large language model scenarios.</p>
         * </blockquote>
         */
        public Builder labelsJson(java.util.List<String> labelsJson) {
            this.putQueryParameter("LabelsJson", labelsJson);
            this.labelsJson = labelsJson;
            return this;
        }

        /**
         * <p>The other IDs.</p>
         * <p><strong>This includes the following IDs:</strong></p>
         * <ul>
         * <li><p>sessionID</p>
         * </li>
         * <li><p>taskid</p>
         * </li>
         * <li><p>jobid</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVD-2021-39685</p>
         */
        public Builder otherId(String otherId) {
            this.putQueryParameter("OtherId", otherId);
            this.otherId = otherId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <blockquote>
         * <p>Page numbers for this API operation start from 0 by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <blockquote>
         * <p>If this parameter is left empty, the default value is 10.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The minimum ringing duration for the search.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recordingDurationGte(Long recordingDurationGte) {
            this.putQueryParameter("RecordingDurationGte", recordingDurationGte);
            this.recordingDurationGte = recordingDurationGte;
            return this;
        }

        /**
         * <p>The minimum ringing duration for the search.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder recordingDurationLte(Long recordingDurationLte) {
            this.putQueryParameter("RecordingDurationLte", recordingDurationLte);
            this.recordingDurationLte = recordingDurationLte;
            return this;
        }

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>China Life P&amp;C</p>
         */
        public Builder scriptNameQuery(String scriptNameQuery) {
            this.putQueryParameter("ScriptNameQuery", scriptNameQuery);
            this.scriptNameQuery = scriptNameQuery;
            return this;
        }

        /**
         * <p>The sort field. Default value: actualTime.</p>
         * 
         * <strong>example:</strong>
         * <p>actualTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>asc: Ascending order.</p>
         * </li>
         * <li><p>desc: Descending order. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The start time of the task.</p>
         * <blockquote>
         * <p>This parameter must be specified together with the TaskCreateTimeLte parameter. Otherwise, it does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        public Builder taskCreateTimeGte(Long taskCreateTimeGte) {
            this.putQueryParameter("TaskCreateTimeGte", taskCreateTimeGte);
            this.taskCreateTimeGte = taskCreateTimeGte;
            return this;
        }

        /**
         * <p>The end time of the task.</p>
         * <blockquote>
         * <p>This parameter must be specified together with the TaskCreateTimeGte parameter. Otherwise, it does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        public Builder taskCreateTimeLte(Long taskCreateTimeLte) {
            this.putQueryParameter("TaskCreateTimeLte", taskCreateTimeLte);
            this.taskCreateTimeLte = taskCreateTimeLte;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>744b27f3-437f-4a8c-a181-f668e492fd24</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The call statuses. Separate multiple statuses with commas (,). Valid values:
         * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The <strong>Succeeded</strong>: 1 (Connected) status is not displayed. All subsequent returned values are specific subdivided cause types.)</p>
         * <ul>
         * <li><strong>Executing</strong>: 0 (Dialing).</li>
         * <li><strong>Succeeded</strong>: 1 (Connected).</li>
         * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
         * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
         * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
         * <li><strong>Cancelled</strong>: 5 (Not called - Task stopped).</li>
         * <li><strong>Failed</strong>: 6 (Failed).</li>
         * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
         * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
         * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
         * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
         * <li><strong>EmptyNumber</strong>: 11 (Not called - Nonexistent number, no call).</li>
         * <li><strong>PerDayCallCountLimit</strong>: 12 (Not called - Daily limit exceeded).</li>
         * <li><strong>ContactBlockList</strong>: 13 (Not called - Blacklisted).</li>
         * <li><strong>CallerNotRegistered</strong>: 14 (Not called - Calling number not registered).</li>
         * <li><strong>Terminated</strong>: 15 (Not called - Terminated).</li>
         * <li><strong>VerificationCancelled</strong>: 16 (Not called - Canceled due to pre-call verification failure).</li>
         * <li><strong>OutOfServiceNoCall</strong>: 17 (Not called - Suspended, no call).</li>
         * <li><strong>InArrearsNoCall</strong>: 18 (Not called - Overdue payment, no call).</li>
         * <li><strong>CallingNumberNotExist</strong>: 19 (Not called - Calling number does not exist).</li>
         * <li><strong>SucceededFinish</strong>: 20 (Connected - Finished normally).</li>
         * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Bot hung up after unrecognized intent).</li>
         * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
         * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
         * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
         * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
         * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
         * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on the user side).</li>
         * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted due to system exception).</li>
         * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
         * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
         * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected - Special interception - Custom interception).</li>
         * <li><strong>HighRiskSipCode</strong>: 32 (Not called - High risk, no call).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        public Builder taskStatusStringList(String taskStatusStringList) {
            this.putQueryParameter("TaskStatusStringList", taskStatusStringList);
            this.taskStatusStringList = taskStatusStringList;
            return this;
        }

        /**
         * <p>The user ID, which is the unique identifier of the user.</p>
         * <blockquote>
         * <p>This field is passed when you upload an outbound call list.</p>
         * <ul>
         * <li>If the list is uploaded in JSON format, the user ID is the value of referenceId.</li>
         * <li>If the list is uploaded in an Excel file, the user ID is the value of contactId.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>C01</p>
         */
        public Builder userIdMatch(String userIdMatch) {
            this.putQueryParameter("UserIdMatch", userIdMatch);
            this.userIdMatch = userIdMatch;
            return this;
        }

        @Override
        public SearchTaskRequest build() {
            return new SearchTaskRequest(this);
        } 

    } 

}
