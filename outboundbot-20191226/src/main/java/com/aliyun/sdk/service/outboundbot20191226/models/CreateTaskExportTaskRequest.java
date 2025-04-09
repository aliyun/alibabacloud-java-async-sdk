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
 * {@link CreateTaskExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskExportTaskRequest</p>
 */
public class CreateTaskExportTaskRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HasAnswered")
    private Boolean hasAnswered;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasHangUpByRejection")
    private Boolean hasHangUpByRejection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasReachedEndOfFlow")
    private Boolean hasReachedEndOfFlow;

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

    private CreateTaskExportTaskRequest(Builder builder) {
        super(builder);
        this.actualTimeGte = builder.actualTimeGte;
        this.actualTimeLte = builder.actualTimeLte;
        this.callDurationGte = builder.callDurationGte;
        this.callDurationLte = builder.callDurationLte;
        this.calledNumber = builder.calledNumber;
        this.hasAnswered = builder.hasAnswered;
        this.hasHangUpByRejection = builder.hasHangUpByRejection;
        this.hasReachedEndOfFlow = builder.hasReachedEndOfFlow;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobGroupNameQuery = builder.jobGroupNameQuery;
        this.jobId = builder.jobId;
        this.jobStatusStringList = builder.jobStatusStringList;
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

    public static CreateTaskExportTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CreateTaskExportTaskRequest, Builder> {
        private Long actualTimeGte; 
        private Long actualTimeLte; 
        private Long callDurationGte; 
        private Long callDurationLte; 
        private String calledNumber; 
        private Boolean hasAnswered; 
        private Boolean hasHangUpByRejection; 
        private Boolean hasReachedEndOfFlow; 
        private String instanceId; 
        private String jobGroupId; 
        private String jobGroupNameQuery; 
        private String jobId; 
        private String jobStatusStringList; 
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

        private Builder(CreateTaskExportTaskRequest request) {
            super(request);
            this.actualTimeGte = request.actualTimeGte;
            this.actualTimeLte = request.actualTimeLte;
            this.callDurationGte = request.callDurationGte;
            this.callDurationLte = request.callDurationLte;
            this.calledNumber = request.calledNumber;
            this.hasAnswered = request.hasAnswered;
            this.hasHangUpByRejection = request.hasHangUpByRejection;
            this.hasReachedEndOfFlow = request.hasReachedEndOfFlow;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobGroupNameQuery = request.jobGroupNameQuery;
            this.jobId = request.jobId;
            this.jobStatusStringList = request.jobStatusStringList;
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
         * ActualTimeGte.
         */
        public Builder actualTimeGte(Long actualTimeGte) {
            this.putQueryParameter("ActualTimeGte", actualTimeGte);
            this.actualTimeGte = actualTimeGte;
            return this;
        }

        /**
         * ActualTimeLte.
         */
        public Builder actualTimeLte(Long actualTimeLte) {
            this.putQueryParameter("ActualTimeLte", actualTimeLte);
            this.actualTimeLte = actualTimeLte;
            return this;
        }

        /**
         * CallDurationGte.
         */
        public Builder callDurationGte(Long callDurationGte) {
            this.putQueryParameter("CallDurationGte", callDurationGte);
            this.callDurationGte = callDurationGte;
            return this;
        }

        /**
         * CallDurationLte.
         */
        public Builder callDurationLte(Long callDurationLte) {
            this.putQueryParameter("CallDurationLte", callDurationLte);
            this.callDurationLte = callDurationLte;
            return this;
        }

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * HasAnswered.
         */
        public Builder hasAnswered(Boolean hasAnswered) {
            this.putQueryParameter("HasAnswered", hasAnswered);
            this.hasAnswered = hasAnswered;
            return this;
        }

        /**
         * HasHangUpByRejection.
         */
        public Builder hasHangUpByRejection(Boolean hasHangUpByRejection) {
            this.putQueryParameter("HasHangUpByRejection", hasHangUpByRejection);
            this.hasHangUpByRejection = hasHangUpByRejection;
            return this;
        }

        /**
         * HasReachedEndOfFlow.
         */
        public Builder hasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
            this.putQueryParameter("HasReachedEndOfFlow", hasReachedEndOfFlow);
            this.hasReachedEndOfFlow = hasReachedEndOfFlow;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1dcb09c5-d5db-4397-bf65-db854463beea</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobGroupNameQuery.
         */
        public Builder jobGroupNameQuery(String jobGroupNameQuery) {
            this.putQueryParameter("JobGroupNameQuery", jobGroupNameQuery);
            this.jobGroupNameQuery = jobGroupNameQuery;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * JobStatusStringList.
         */
        public Builder jobStatusStringList(String jobStatusStringList) {
            this.putQueryParameter("JobStatusStringList", jobStatusStringList);
            this.jobStatusStringList = jobStatusStringList;
            return this;
        }

        /**
         * OtherId.
         */
        public Builder otherId(String otherId) {
            this.putQueryParameter("OtherId", otherId);
            this.otherId = otherId;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RecordingDurationGte.
         */
        public Builder recordingDurationGte(Long recordingDurationGte) {
            this.putQueryParameter("RecordingDurationGte", recordingDurationGte);
            this.recordingDurationGte = recordingDurationGte;
            return this;
        }

        /**
         * RecordingDurationLte.
         */
        public Builder recordingDurationLte(Long recordingDurationLte) {
            this.putQueryParameter("RecordingDurationLte", recordingDurationLte);
            this.recordingDurationLte = recordingDurationLte;
            return this;
        }

        /**
         * ScriptNameQuery.
         */
        public Builder scriptNameQuery(String scriptNameQuery) {
            this.putQueryParameter("ScriptNameQuery", scriptNameQuery);
            this.scriptNameQuery = scriptNameQuery;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * TaskCreateTimeGte.
         */
        public Builder taskCreateTimeGte(Long taskCreateTimeGte) {
            this.putQueryParameter("TaskCreateTimeGte", taskCreateTimeGte);
            this.taskCreateTimeGte = taskCreateTimeGte;
            return this;
        }

        /**
         * TaskCreateTimeLte.
         */
        public Builder taskCreateTimeLte(Long taskCreateTimeLte) {
            this.putQueryParameter("TaskCreateTimeLte", taskCreateTimeLte);
            this.taskCreateTimeLte = taskCreateTimeLte;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatusStringList.
         */
        public Builder taskStatusStringList(String taskStatusStringList) {
            this.putQueryParameter("TaskStatusStringList", taskStatusStringList);
            this.taskStatusStringList = taskStatusStringList;
            return this;
        }

        /**
         * UserIdMatch.
         */
        public Builder userIdMatch(String userIdMatch) {
            this.putQueryParameter("UserIdMatch", userIdMatch);
            this.userIdMatch = userIdMatch;
            return this;
        }

        @Override
        public CreateTaskExportTaskRequest build() {
            return new CreateTaskExportTaskRequest(this);
        } 

    } 

}
