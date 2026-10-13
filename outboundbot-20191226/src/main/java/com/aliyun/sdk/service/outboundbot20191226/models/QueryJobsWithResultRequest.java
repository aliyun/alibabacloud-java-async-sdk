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
 * {@link QueryJobsWithResultRequest} extends {@link RequestModel}
 *
 * <p>QueryJobsWithResultRequest</p>
 */
public class QueryJobsWithResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndActualTimeFilter")
    private Long endActualTimeFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasAnsweredFilter")
    private Boolean hasAnsweredFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasHangUpByRejectionFilter")
    private Boolean hasHangUpByRejectionFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasReachedEndOfFlowFilter")
    private Boolean hasReachedEndOfFlowFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobFailureReasonsFilter")
    private String jobFailureReasonsFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobStatusFilter")
    private String jobStatusFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelsJson")
    private java.util.List<String> labelsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryText")
    private String queryText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartActualTimeFilter")
    private Long startActualTimeFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatusFilter")
    private String taskStatusFilter;

    private QueryJobsWithResultRequest(Builder builder) {
        super(builder);
        this.endActualTimeFilter = builder.endActualTimeFilter;
        this.hasAnsweredFilter = builder.hasAnsweredFilter;
        this.hasHangUpByRejectionFilter = builder.hasHangUpByRejectionFilter;
        this.hasReachedEndOfFlowFilter = builder.hasReachedEndOfFlowFilter;
        this.instanceId = builder.instanceId;
        this.jobFailureReasonsFilter = builder.jobFailureReasonsFilter;
        this.jobGroupId = builder.jobGroupId;
        this.jobStatusFilter = builder.jobStatusFilter;
        this.labelsJson = builder.labelsJson;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryText = builder.queryText;
        this.startActualTimeFilter = builder.startActualTimeFilter;
        this.taskStatusFilter = builder.taskStatusFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJobsWithResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endActualTimeFilter
     */
    public Long getEndActualTimeFilter() {
        return this.endActualTimeFilter;
    }

    /**
     * @return hasAnsweredFilter
     */
    public Boolean getHasAnsweredFilter() {
        return this.hasAnsweredFilter;
    }

    /**
     * @return hasHangUpByRejectionFilter
     */
    public Boolean getHasHangUpByRejectionFilter() {
        return this.hasHangUpByRejectionFilter;
    }

    /**
     * @return hasReachedEndOfFlowFilter
     */
    public Boolean getHasReachedEndOfFlowFilter() {
        return this.hasReachedEndOfFlowFilter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobFailureReasonsFilter
     */
    public String getJobFailureReasonsFilter() {
        return this.jobFailureReasonsFilter;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobStatusFilter
     */
    public String getJobStatusFilter() {
        return this.jobStatusFilter;
    }

    /**
     * @return labelsJson
     */
    public java.util.List<String> getLabelsJson() {
        return this.labelsJson;
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
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return startActualTimeFilter
     */
    public Long getStartActualTimeFilter() {
        return this.startActualTimeFilter;
    }

    /**
     * @return taskStatusFilter
     */
    public String getTaskStatusFilter() {
        return this.taskStatusFilter;
    }

    public static final class Builder extends Request.Builder<QueryJobsWithResultRequest, Builder> {
        private Long endActualTimeFilter; 
        private Boolean hasAnsweredFilter; 
        private Boolean hasHangUpByRejectionFilter; 
        private Boolean hasReachedEndOfFlowFilter; 
        private String instanceId; 
        private String jobFailureReasonsFilter; 
        private String jobGroupId; 
        private String jobStatusFilter; 
        private java.util.List<String> labelsJson; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryText; 
        private Long startActualTimeFilter; 
        private String taskStatusFilter; 

        private Builder() {
            super();
        } 

        private Builder(QueryJobsWithResultRequest request) {
            super(request);
            this.endActualTimeFilter = request.endActualTimeFilter;
            this.hasAnsweredFilter = request.hasAnsweredFilter;
            this.hasHangUpByRejectionFilter = request.hasHangUpByRejectionFilter;
            this.hasReachedEndOfFlowFilter = request.hasReachedEndOfFlowFilter;
            this.instanceId = request.instanceId;
            this.jobFailureReasonsFilter = request.jobFailureReasonsFilter;
            this.jobGroupId = request.jobGroupId;
            this.jobStatusFilter = request.jobStatusFilter;
            this.labelsJson = request.labelsJson;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryText = request.queryText;
            this.startActualTimeFilter = request.startActualTimeFilter;
            this.taskStatusFilter = request.taskStatusFilter;
        } 

        /**
         * <p>The filter condition for the call end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579055783000</p>
         */
        public Builder endActualTimeFilter(Long endActualTimeFilter) {
            this.putQueryParameter("EndActualTimeFilter", endActualTimeFilter);
            this.endActualTimeFilter = endActualTimeFilter;
            return this;
        }

        /**
         * <p>Specifies whether the call is answered.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasAnsweredFilter(Boolean hasAnsweredFilter) {
            this.putQueryParameter("HasAnsweredFilter", hasAnsweredFilter);
            this.hasAnsweredFilter = hasAnsweredFilter;
            return this;
        }

        /**
         * <p>Specifies whether the call is hung up due to rejection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasHangUpByRejectionFilter(Boolean hasHangUpByRejectionFilter) {
            this.putQueryParameter("HasHangUpByRejectionFilter", hasHangUpByRejectionFilter);
            this.hasHangUpByRejectionFilter = hasHangUpByRejectionFilter;
            return this;
        }

        /**
         * <p>Specifies whether the flow is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasReachedEndOfFlowFilter(Boolean hasReachedEndOfFlowFilter) {
            this.putQueryParameter("HasReachedEndOfFlowFilter", hasReachedEndOfFlowFilter);
            this.hasReachedEndOfFlowFilter = hasReachedEndOfFlowFilter;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9d53cd72-4050-4419-8c17-acc0bf158147</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of job failure reasons.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;NoAnswer&quot;]</p>
         */
        public Builder jobFailureReasonsFilter(String jobFailureReasonsFilter) {
            this.putQueryParameter("JobFailureReasonsFilter", jobFailureReasonsFilter);
            this.jobFailureReasonsFilter = jobFailureReasonsFilter;
            return this;
        }

        /**
         * <p>The ID of the job group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ad16fc35-d824-4102-a606-2be51c1aa6dd</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>The job status filter. Valid values:</p>
         * <ul>
         * <li>Scheduling: scheduling</li>
         * <li>Executing: executing</li>
         * <li>Succeeded: finished and reached</li>
         * <li>Paused: paused</li>
         * <li>Failed: finished but not reached</li>
         * <li>Cancelled: cancelled due to manual intervention</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder jobStatusFilter(String jobStatusFilter) {
            this.putQueryParameter("JobStatusFilter", jobStatusFilter);
            this.jobStatusFilter = jobStatusFilter;
            return this;
        }

        /**
         * <p>The filter condition for call labels.</p>
         * <blockquote>
         * <p>This condition can only filter by labels that are configured with specific enumerated label values, which means labels configured with specific label values in large language model scenarios.</p>
         * </blockquote>
         */
        public Builder labelsJson(java.util.List<String> labelsJson) {
            this.putQueryParameter("LabelsJson", labelsJson);
            this.labelsJson = labelsJson;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <blockquote>
         * <p>Notice: This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * <blockquote>
         * <p>Notice: This parameter is required.</p>
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
         * <p>The search content. You can search by phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1882020****</p>
         */
        public Builder queryText(String queryText) {
            this.putQueryParameter("QueryText", queryText);
            this.queryText = queryText;
            return this;
        }

        /**
         * <p>The filter condition for the call start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579055782000</p>
         */
        public Builder startActualTimeFilter(Long startActualTimeFilter) {
            this.putQueryParameter("StartActualTimeFilter", startActualTimeFilter);
            this.startActualTimeFilter = startActualTimeFilter;
            return this;
        }

        /**
         * <p>The call status. Multiple values are separated by commas. Example: [&quot;Executing&quot;,&quot;Succeeded&quot;]. Valid values:
         * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The <strong>Succeeded</strong>: 1 (answered) status is not displayed. All subsequent returned values are specific subdivided cause types.)</p>
         * <ul>
         * <li><strong>Executing</strong>: 0 (dialing)</li>
         * <li><strong>Succeeded</strong>: 1 (answered)</li>
         * <li><strong>NoAnswer</strong>: 2 (not answered - no answer)</li>
         * <li><strong>NotExist</strong>: 3 (not answered - nonexistent number)</li>
         * <li><strong>Busy</strong>: 4 (not answered - busy)</li>
         * <li><strong>Cancelled</strong>: 5 (not called - task stopped)</li>
         * <li><strong>Failed</strong>: 6 (failed)</li>
         * <li><strong>NotConnected</strong>: 7 (not answered - unreachable)</li>
         * <li><strong>PoweredOff</strong>: 8 (not answered - powered off)</li>
         * <li><strong>OutOfService</strong>: 9 (not answered - callee suspended)</li>
         * <li><strong>InArrears</strong>: 10 (not answered - callee overdue payment)</li>
         * <li><strong>EmptyNumber</strong>: 11 (not called - nonexistent number not called)</li>
         * <li><strong>PerDayCallCountLimit</strong>: 12 (not called - daily limit exceeded)</li>
         * <li><strong>ContactBlockList</strong>: 13 (not called - blacklist)</li>
         * <li><strong>CallerNotRegistered</strong>: 14 (not called - caller number not registered)</li>
         * <li><strong>Terminated</strong>: 15 (not called - terminated)</li>
         * <li><strong>VerificationCancelled</strong>: 16 (not called - cancelled due to pre-call verification failure)</li>
         * <li><strong>OutOfServiceNoCall</strong>: 17 (not called - callee suspended and not called)</li>
         * <li><strong>InArrearsNoCall</strong>: 18 (not called - callee overdue payment and not called)</li>
         * <li><strong>CallingNumberNotExist</strong>: 19 (not called - caller number does not exist)</li>
         * <li><strong>SucceededFinish</strong>: 20 (answered - normally completed)</li>
         * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (answered - robot hangs up after rejection)</li>
         * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (answered - hangs up due to silence timeout)</li>
         * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (answered - user hangs up after rejection)</li>
         * <li><strong>SucceededClientHangUp</strong>: 24 (answered - user hangs up without reason)</li>
         * <li><strong>SucceededTransferByIntent</strong>: 25 (answered - transferred to agent due to intent match)</li>
         * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (answered - transferred to agent after rejection)</li>
         * <li><strong>SucceededInoInterAction</strong>: 27 (answered - no interaction from user)</li>
         * <li><strong>SucceededError</strong>: 28 (answered - interrupted by system exception)</li>
         * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (answered - special case interception - voice assistant)</li>
         * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (answered - special case interception - extension number transfer)</li>
         * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (answered - special case interception - custom interception)</li>
         * <li><strong>HighRiskSipCode</strong>: 32 (not called - high risk and not called)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Executing&quot;]</p>
         */
        public Builder taskStatusFilter(String taskStatusFilter) {
            this.putQueryParameter("TaskStatusFilter", taskStatusFilter);
            this.taskStatusFilter = taskStatusFilter;
            return this;
        }

        @Override
        public QueryJobsWithResultRequest build() {
            return new QueryJobsWithResultRequest(this);
        } 

    } 

}
