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
 * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstancesResponseBody</p>
 */
public class ListWorkflowInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListWorkflowInstancesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListWorkflowInstancesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListWorkflowInstancesResponseBody build() {
            return new ListWorkflowInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
     */
    public static class WorkflowInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private Long bizDate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        @com.aliyun.core.annotation.NameInMap("WorkflowParameters")
        private String workflowParameters;

        @com.aliyun.core.annotation.NameInMap("WorkflowTaskInstanceId")
        private Long workflowTaskInstanceId;

        private WorkflowInstances(Builder builder) {
            this.bizDate = builder.bizDate;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.envType = builder.envType;
            this.finishedTime = builder.finishedTime;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
            this.workflowId = builder.workflowId;
            this.workflowParameters = builder.workflowParameters;
            this.workflowTaskInstanceId = builder.workflowTaskInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowInstances create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public Long getBizDate() {
            return this.bizDate;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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

        /**
         * @return workflowParameters
         */
        public String getWorkflowParameters() {
            return this.workflowParameters;
        }

        /**
         * @return workflowTaskInstanceId
         */
        public Long getWorkflowTaskInstanceId() {
            return this.workflowTaskInstanceId;
        }

        public static final class Builder {
            private Long bizDate; 
            private Long createTime; 
            private String createUser; 
            private String envType; 
            private Long finishedTime; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private Long startedTime; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String type; 
            private Long workflowId; 
            private String workflowParameters; 
            private Long workflowTaskInstanceId; 

            private Builder() {
            } 

            private Builder(WorkflowInstances model) {
                this.bizDate = model.bizDate;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.envType = model.envType;
                this.finishedTime = model.finishedTime;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.name = model.name;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.startedTime = model.startedTime;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.workflowId = model.workflowId;
                this.workflowParameters = model.workflowParameters;
                this.workflowTaskInstanceId = model.workflowTaskInstanceId;
            } 

            /**
             * BizDate.
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The account ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The environment of the workspace. Valid values:</p>
             * <ul>
             * <li>Prod</li>
             * <li>Dev</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The time when the instance finished running.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The workflow instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The account ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The name of the workflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>WorkflowInstance1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The time when the instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The status of the workflow instance. Valid values:</p>
             * <ul>
             * <li>NotRun: The instance is not run.</li>
             * <li>Running: The instance is running.</li>
             * <li>WaitTime: The instance is waiting for the scheduling time to arrive.</li>
             * <li>CheckingCondition: Branch conditions are being checked for the instance.</li>
             * <li>WaitResource: The instance is waiting for resources.</li>
             * <li>Failure: The instance fails to be run.</li>
             * <li>Success: The instance is successfully run.</li>
             * <li>Checking: Data quality is being checked for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task tag.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * <p>The workflow parameters.</p>
             */
            public Builder workflowParameters(String workflowParameters) {
                this.workflowParameters = workflowParameters;
                return this;
            }

            /**
             * WorkflowTaskInstanceId.
             */
            public Builder workflowTaskInstanceId(Long workflowTaskInstanceId) {
                this.workflowTaskInstanceId = workflowTaskInstanceId;
                return this;
            }

            public WorkflowInstances build() {
                return new WorkflowInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowInstancesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstances")
        private java.util.List<WorkflowInstances> workflowInstances;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.workflowInstances = builder.workflowInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return workflowInstances
         */
        public java.util.List<WorkflowInstances> getWorkflowInstances() {
            return this.workflowInstances;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List<WorkflowInstances> workflowInstances; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.workflowInstances = model.workflowInstances;
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The workflow instances.</p>
             */
            public Builder workflowInstances(java.util.List<WorkflowInstances> workflowInstances) {
                this.workflowInstances = workflowInstances;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
