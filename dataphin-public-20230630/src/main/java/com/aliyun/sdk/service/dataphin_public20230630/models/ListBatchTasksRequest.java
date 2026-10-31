// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListBatchTasksRequest} extends {@link RequestModel}
 *
 * <p>ListBatchTasksRequest</p>
 */
public class ListBatchTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchTaskQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private BatchTaskQuery batchTaskQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListBatchTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.batchTaskQuery = builder.batchTaskQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBatchTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return batchTaskQuery
     */
    public BatchTaskQuery getBatchTaskQuery() {
        return this.batchTaskQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListBatchTasksRequest, Builder> {
        private String regionId; 
        private BatchTaskQuery batchTaskQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListBatchTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.batchTaskQuery = request.batchTaskQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The task query conditions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder batchTaskQuery(BatchTaskQuery batchTaskQuery) {
            String batchTaskQueryShrink = shrink(batchTaskQuery, "BatchTaskQuery", "json");
            this.putBodyParameter("BatchTaskQuery", batchTaskQueryShrink);
            this.batchTaskQuery = batchTaskQuery;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the user who performs the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListBatchTasksRequest build() {
            return new ListBatchTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListBatchTasksRequest} extends {@link TeaModel}
     *
     * <p>ListBatchTasksRequest</p>
     */
    public static class BatchTaskQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionScheduleEnable")
        private Boolean conditionScheduleEnable;

        @com.aliyun.core.annotation.NameInMap("CreateBeginTime")
        private Long createBeginTime;

        @com.aliyun.core.annotation.NameInMap("CreateEndTime")
        private Long createEndTime;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerList")
        private java.util.List<String> developOwnerList;

        @com.aliyun.core.annotation.NameInMap("DirectoryList")
        private java.util.List<String> directoryList;

        @com.aliyun.core.annotation.NameInMap("IncludeSubDirectory")
        private Boolean includeSubDirectory;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("LastSubmitStatusList")
        private java.util.List<String> lastSubmitStatusList;

        @com.aliyun.core.annotation.NameInMap("LockUserList")
        private java.util.List<String> lockUserList;

        @com.aliyun.core.annotation.NameInMap("ModifiedBeginTime")
        private Long modifiedBeginTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedEndTime")
        private Long modifiedEndTime;

        @com.aliyun.core.annotation.NameInMap("NodeStatusList")
        private java.util.List<Integer> nodeStatusList;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerList")
        private java.util.List<String> opsOwnerList;

        @com.aliyun.core.annotation.NameInMap("OutputTableNameList")
        private java.util.List<String> outputTableNameList;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Published")
        private Boolean published;

        @com.aliyun.core.annotation.NameInMap("RefCodeTemplateId")
        private String refCodeTemplateId;

        @com.aliyun.core.annotation.NameInMap("ScheduleIntervalTypeList")
        private java.util.List<String> scheduleIntervalTypeList;

        @com.aliyun.core.annotation.NameInMap("TaskStatusList")
        private java.util.List<Integer> taskStatusList;

        @com.aliyun.core.annotation.NameInMap("TaskTagList")
        private java.util.List<String> taskTagList;

        @com.aliyun.core.annotation.NameInMap("TaskTypeList")
        private java.util.List<Integer> taskTypeList;

        private BatchTaskQuery(Builder builder) {
            this.conditionScheduleEnable = builder.conditionScheduleEnable;
            this.createBeginTime = builder.createBeginTime;
            this.createEndTime = builder.createEndTime;
            this.developOwnerList = builder.developOwnerList;
            this.directoryList = builder.directoryList;
            this.includeSubDirectory = builder.includeSubDirectory;
            this.keyword = builder.keyword;
            this.lastSubmitStatusList = builder.lastSubmitStatusList;
            this.lockUserList = builder.lockUserList;
            this.modifiedBeginTime = builder.modifiedBeginTime;
            this.modifiedEndTime = builder.modifiedEndTime;
            this.nodeStatusList = builder.nodeStatusList;
            this.opsOwnerList = builder.opsOwnerList;
            this.outputTableNameList = builder.outputTableNameList;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.projectId = builder.projectId;
            this.published = builder.published;
            this.refCodeTemplateId = builder.refCodeTemplateId;
            this.scheduleIntervalTypeList = builder.scheduleIntervalTypeList;
            this.taskStatusList = builder.taskStatusList;
            this.taskTagList = builder.taskTagList;
            this.taskTypeList = builder.taskTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchTaskQuery create() {
            return builder().build();
        }

        /**
         * @return conditionScheduleEnable
         */
        public Boolean getConditionScheduleEnable() {
            return this.conditionScheduleEnable;
        }

        /**
         * @return createBeginTime
         */
        public Long getCreateBeginTime() {
            return this.createBeginTime;
        }

        /**
         * @return createEndTime
         */
        public Long getCreateEndTime() {
            return this.createEndTime;
        }

        /**
         * @return developOwnerList
         */
        public java.util.List<String> getDevelopOwnerList() {
            return this.developOwnerList;
        }

        /**
         * @return directoryList
         */
        public java.util.List<String> getDirectoryList() {
            return this.directoryList;
        }

        /**
         * @return includeSubDirectory
         */
        public Boolean getIncludeSubDirectory() {
            return this.includeSubDirectory;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return lastSubmitStatusList
         */
        public java.util.List<String> getLastSubmitStatusList() {
            return this.lastSubmitStatusList;
        }

        /**
         * @return lockUserList
         */
        public java.util.List<String> getLockUserList() {
            return this.lockUserList;
        }

        /**
         * @return modifiedBeginTime
         */
        public Long getModifiedBeginTime() {
            return this.modifiedBeginTime;
        }

        /**
         * @return modifiedEndTime
         */
        public Long getModifiedEndTime() {
            return this.modifiedEndTime;
        }

        /**
         * @return nodeStatusList
         */
        public java.util.List<Integer> getNodeStatusList() {
            return this.nodeStatusList;
        }

        /**
         * @return opsOwnerList
         */
        public java.util.List<String> getOpsOwnerList() {
            return this.opsOwnerList;
        }

        /**
         * @return outputTableNameList
         */
        public java.util.List<String> getOutputTableNameList() {
            return this.outputTableNameList;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return published
         */
        public Boolean getPublished() {
            return this.published;
        }

        /**
         * @return refCodeTemplateId
         */
        public String getRefCodeTemplateId() {
            return this.refCodeTemplateId;
        }

        /**
         * @return scheduleIntervalTypeList
         */
        public java.util.List<String> getScheduleIntervalTypeList() {
            return this.scheduleIntervalTypeList;
        }

        /**
         * @return taskStatusList
         */
        public java.util.List<Integer> getTaskStatusList() {
            return this.taskStatusList;
        }

        /**
         * @return taskTagList
         */
        public java.util.List<String> getTaskTagList() {
            return this.taskTagList;
        }

        /**
         * @return taskTypeList
         */
        public java.util.List<Integer> getTaskTypeList() {
            return this.taskTypeList;
        }

        public static final class Builder {
            private Boolean conditionScheduleEnable; 
            private Long createBeginTime; 
            private Long createEndTime; 
            private java.util.List<String> developOwnerList; 
            private java.util.List<String> directoryList; 
            private Boolean includeSubDirectory; 
            private String keyword; 
            private java.util.List<String> lastSubmitStatusList; 
            private java.util.List<String> lockUserList; 
            private Long modifiedBeginTime; 
            private Long modifiedEndTime; 
            private java.util.List<Integer> nodeStatusList; 
            private java.util.List<String> opsOwnerList; 
            private java.util.List<String> outputTableNameList; 
            private Integer page; 
            private Integer pageSize; 
            private Long projectId; 
            private Boolean published; 
            private String refCodeTemplateId; 
            private java.util.List<String> scheduleIntervalTypeList; 
            private java.util.List<Integer> taskStatusList; 
            private java.util.List<String> taskTagList; 
            private java.util.List<Integer> taskTypeList; 

            private Builder() {
            } 

            private Builder(BatchTaskQuery model) {
                this.conditionScheduleEnable = model.conditionScheduleEnable;
                this.createBeginTime = model.createBeginTime;
                this.createEndTime = model.createEndTime;
                this.developOwnerList = model.developOwnerList;
                this.directoryList = model.directoryList;
                this.includeSubDirectory = model.includeSubDirectory;
                this.keyword = model.keyword;
                this.lastSubmitStatusList = model.lastSubmitStatusList;
                this.lockUserList = model.lockUserList;
                this.modifiedBeginTime = model.modifiedBeginTime;
                this.modifiedEndTime = model.modifiedEndTime;
                this.nodeStatusList = model.nodeStatusList;
                this.opsOwnerList = model.opsOwnerList;
                this.outputTableNameList = model.outputTableNameList;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.projectId = model.projectId;
                this.published = model.published;
                this.refCodeTemplateId = model.refCodeTemplateId;
                this.scheduleIntervalTypeList = model.scheduleIntervalTypeList;
                this.taskStatusList = model.taskStatusList;
                this.taskTagList = model.taskTagList;
                this.taskTypeList = model.taskTypeList;
            } 

            /**
             * <p>Specifies whether to enable conditional scheduling. If not specified, no filtering is applied.</p>
             */
            public Builder conditionScheduleEnable(Boolean conditionScheduleEnable) {
                this.conditionScheduleEnable = conditionScheduleEnable;
                return this;
            }

            /**
             * <p>The start time of the creation time range, in milliseconds. Must be specified together with CreateEndTime.</p>
             * 
             * <strong>example:</strong>
             * <p>1785930337435</p>
             */
            public Builder createBeginTime(Long createBeginTime) {
                this.createBeginTime = createBeginTime;
                return this;
            }

            /**
             * <p>The end time of the creation time range, in milliseconds. Must be specified together with CreateBeginTime.</p>
             * 
             * <strong>example:</strong>
             * <p>1788608737435</p>
             */
            public Builder createEndTime(Long createEndTime) {
                this.createEndTime = createEndTime;
                return this;
            }

            /**
             * <p>The list of developer IDs. If multiple IDs are specified, the union is used. If empty or not specified, no filtering is applied.</p>
             */
            public Builder developOwnerList(java.util.List<String> developOwnerList) {
                this.developOwnerList = developOwnerList;
                return this;
            }

            /**
             * <p>The list of task directories, such as [&quot;/&quot;]. If empty or not specified, no filtering is applied.</p>
             */
            public Builder directoryList(java.util.List<String> directoryList) {
                this.directoryList = directoryList;
                return this;
            }

            /**
             * <p>Specifies whether to include tasks in the subdirectories of the directories specified in DirectoryList. Default value: false.</p>
             */
            public Builder includeSubDirectory(Boolean includeSubDirectory) {
                this.includeSubDirectory = includeSubDirectory;
                return this;
            }

            /**
             * <p>The search keyword for fuzzy matching by task name or node ID. If empty or not specified, no filtering is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_order</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The list of recent submit statuses. Valid values: SUBMITTING, SUCCESS, FAILED, and WARNING. If empty or not specified, no filtering is applied.</p>
             */
            public Builder lastSubmitStatusList(java.util.List<String> lastSubmitStatusList) {
                this.lastSubmitStatusList = lastSubmitStatusList;
                return this;
            }

            /**
             * <p>The list of locker IDs. If multiple IDs are specified, the union is used. If empty or not specified, no filtering by locker is applied.</p>
             */
            public Builder lockUserList(java.util.List<String> lockUserList) {
                this.lockUserList = lockUserList;
                return this;
            }

            /**
             * <p>The start time of the last modification time range, in milliseconds. Must be specified together with ModifiedEndTime.</p>
             * 
             * <strong>example:</strong>
             * <p>1785930337435</p>
             */
            public Builder modifiedBeginTime(Long modifiedBeginTime) {
                this.modifiedBeginTime = modifiedBeginTime;
                return this;
            }

            /**
             * <p>The end time of the last modification time range, in milliseconds. Must be specified together with ModifiedBeginTime.</p>
             * 
             * <strong>example:</strong>
             * <p>1788608737435</p>
             */
            public Builder modifiedEndTime(Long modifiedEndTime) {
                this.modifiedEndTime = modifiedEndTime;
                return this;
            }

            /**
             * <p>The list of scheduling types. Valid values: 0 (Manual), 1 (Normal), 2 (Paused), and 3 (Dry run). If empty or not specified, no filtering is applied.</p>
             */
            public Builder nodeStatusList(java.util.List<Integer> nodeStatusList) {
                this.nodeStatusList = nodeStatusList;
                return this;
            }

            /**
             * <p>The list of O&amp;M owner IDs. If multiple IDs are specified, the union is used. If empty or not specified, no filtering is applied.</p>
             */
            public Builder opsOwnerList(java.util.List<String> opsOwnerList) {
                this.opsOwnerList = opsOwnerList;
                return this;
            }

            /**
             * <p>The list of output table names for exact matching. If multiple table names are specified, the OR logical operator is used. If empty or not specified, no filtering is applied.</p>
             */
            public Builder outputTableNameList(java.util.List<String> outputTableNameList) {
                this.outputTableNameList = outputTableNameList;
                return this;
            }

            /**
             * <p>The page number. Pages start from 1. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The project ID. The query scope is limited to this project.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7086194564164288</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Specifies whether the task is published to the production environment. If not specified, no filtering is applied.</p>
             */
            public Builder published(Boolean published) {
                this.published = published;
                return this;
            }

            /**
             * <p>The ID of the referenced offline code template. If empty or not specified, no filtering is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>7305621095333696</p>
             */
            public Builder refCodeTemplateId(String refCodeTemplateId) {
                this.refCodeTemplateId = refCodeTemplateId;
                return this;
            }

            /**
             * <p>The list of scheduling intervals. Valid values: MINUTELY, HOURLY, DAILY, WEEKLY, and MONTHLY. If empty or not specified, no filtering is applied.</p>
             */
            public Builder scheduleIntervalTypeList(java.util.List<String> scheduleIntervalTypeList) {
                this.scheduleIntervalTypeList = scheduleIntervalTypeList;
                return this;
            }

            /**
             * <p>The list of task statuses. Valid values: 0 (Draft), 1 (Submitting), 2 (Submitted), and 100 (In development). If empty or not specified, no filtering is applied.</p>
             */
            public Builder taskStatusList(java.util.List<Integer> taskStatusList) {
                this.taskStatusList = taskStatusList;
                return this;
            }

            /**
             * <p>The list of task tag names. If empty or not specified, no filtering is applied.</p>
             */
            public Builder taskTagList(java.util.List<String> taskTagList) {
                this.taskTagList = taskTagList;
                return this;
            }

            /**
             * <p>The list of task type codes. If empty or not specified, no filtering is applied.</p>
             */
            public Builder taskTypeList(java.util.List<Integer> taskTypeList) {
                this.taskTypeList = taskTypeList;
                return this;
            }

            public BatchTaskQuery build() {
                return new BatchTaskQuery(this);
            } 

        } 

    }
}
