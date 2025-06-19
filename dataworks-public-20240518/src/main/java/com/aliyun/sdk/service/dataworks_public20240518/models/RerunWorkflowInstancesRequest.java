// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RerunWorkflowInstancesRequest} extends {@link RequestModel}
 *
 * <p>RerunWorkflowInstancesRequest</p>
 */
public class RerunWorkflowInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    private Long bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTriggerTime")
    private Long endTriggerTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List<Long> ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTriggerTime")
    private Long startTriggerTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workflowId;

    private RerunWorkflowInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdate = builder.bizdate;
        this.endTriggerTime = builder.endTriggerTime;
        this.envType = builder.envType;
        this.filter = builder.filter;
        this.ids = builder.ids;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.startTriggerTime = builder.startTriggerTime;
        this.status = builder.status;
        this.type = builder.type;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunWorkflowInstancesRequest create() {
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
     * @return bizdate
     */
    public Long getBizdate() {
        return this.bizdate;
    }

    /**
     * @return endTriggerTime
     */
    public Long getEndTriggerTime() {
        return this.endTriggerTime;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return startTriggerTime
     */
    public Long getStartTriggerTime() {
        return this.startTriggerTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<RerunWorkflowInstancesRequest, Builder> {
        private String regionId; 
        private Long bizdate; 
        private Long endTriggerTime; 
        private String envType; 
        private Filter filter; 
        private java.util.List<Long> ids; 
        private String name; 
        private Long projectId; 
        private Long startTriggerTime; 
        private String status; 
        private String type; 
        private Long workflowId; 

        private Builder() {
            super();
        } 

        private Builder(RerunWorkflowInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdate = request.bizdate;
            this.endTriggerTime = request.endTriggerTime;
            this.envType = request.envType;
            this.filter = request.filter;
            this.ids = request.ids;
            this.name = request.name;
            this.projectId = request.projectId;
            this.startTriggerTime = request.startTriggerTime;
            this.status = request.status;
            this.type = request.type;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Bizdate.
         */
        public Builder bizdate(Long bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * EndTriggerTime.
         */
        public Builder endTriggerTime(Long endTriggerTime) {
            this.putBodyParameter("EndTriggerTime", endTriggerTime);
            this.endTriggerTime = endTriggerTime;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putBodyParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * Ids.
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * StartTriggerTime.
         */
        public Builder startTriggerTime(Long startTriggerTime) {
            this.putBodyParameter("StartTriggerTime", startTriggerTime);
            this.startTriggerTime = startTriggerTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ManualWorkflow</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workflowId(Long workflowId) {
            this.putBodyParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public RerunWorkflowInstancesRequest build() {
            return new RerunWorkflowInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RerunWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>RerunWorkflowInstancesRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RerunDownstreamEnabled")
        private Boolean rerunDownstreamEnabled;

        @com.aliyun.core.annotation.NameInMap("TaskIds")
        private java.util.List<Long> taskIds;

        @com.aliyun.core.annotation.NameInMap("TaskInstanceStatuses")
        private java.util.List<String> taskInstanceStatuses;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskTypes")
        private java.util.List<String> taskTypes;

        private Filter(Builder builder) {
            this.rerunDownstreamEnabled = builder.rerunDownstreamEnabled;
            this.taskIds = builder.taskIds;
            this.taskInstanceStatuses = builder.taskInstanceStatuses;
            this.taskName = builder.taskName;
            this.taskTypes = builder.taskTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return rerunDownstreamEnabled
         */
        public Boolean getRerunDownstreamEnabled() {
            return this.rerunDownstreamEnabled;
        }

        /**
         * @return taskIds
         */
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return taskInstanceStatuses
         */
        public java.util.List<String> getTaskInstanceStatuses() {
            return this.taskInstanceStatuses;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskTypes
         */
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

        public static final class Builder {
            private Boolean rerunDownstreamEnabled; 
            private java.util.List<Long> taskIds; 
            private java.util.List<String> taskInstanceStatuses; 
            private String taskName; 
            private java.util.List<String> taskTypes; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.rerunDownstreamEnabled = model.rerunDownstreamEnabled;
                this.taskIds = model.taskIds;
                this.taskInstanceStatuses = model.taskInstanceStatuses;
                this.taskName = model.taskName;
                this.taskTypes = model.taskTypes;
            } 

            /**
             * RerunDownstreamEnabled.
             */
            public Builder rerunDownstreamEnabled(Boolean rerunDownstreamEnabled) {
                this.rerunDownstreamEnabled = rerunDownstreamEnabled;
                return this;
            }

            /**
             * TaskIds.
             */
            public Builder taskIds(java.util.List<Long> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * TaskInstanceStatuses.
             */
            public Builder taskInstanceStatuses(java.util.List<String> taskInstanceStatuses) {
                this.taskInstanceStatuses = taskInstanceStatuses;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskTypes.
             */
            public Builder taskTypes(java.util.List<String> taskTypes) {
                this.taskTypes = taskTypes;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
