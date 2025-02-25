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
 * {@link ListWorkflowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowsResponseBody</p>
 */
public class ListWorkflowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListWorkflowsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowsResponseBody create() {
        return builder().build();
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

        public ListWorkflowsResponseBody build() {
            return new ListWorkflowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowsResponseBody</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Recurrence")
        private String recurrence;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Trigger(Builder builder) {
            this.cron = builder.cron;
            this.endTime = builder.endTime;
            this.recurrence = builder.recurrence;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return recurrence
         */
        public String getRecurrence() {
            return this.recurrence;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cron; 
            private String endTime; 
            private String recurrence; 
            private String startTime; 
            private String type; 

            /**
             * <p>The CRON expression. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 00 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The end time of the time range during which the workflow is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-01-01 00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The running mode of the workflow after it is triggered. This parameter takes effect only if the Type parameter is set to Scheduler. Valid values:</p>
             * <ul>
             * <li>Pause</li>
             * <li>Skip</li>
             * <li>Normal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * <p>The start time of the time range during which the workflow is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li>Scheduler: scheduling cycle-based trigger</li>
             * <li>Manual: manual trigger</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowsResponseBody</p>
     */
    public static class Workflows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientUniqueCode")
        private String clientUniqueCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

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

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private Workflows(Builder builder) {
            this.clientUniqueCode = builder.clientUniqueCode;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.description = builder.description;
            this.envType = builder.envType;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.owner = builder.owner;
            this.parameters = builder.parameters;
            this.projectId = builder.projectId;
            this.trigger = builder.trigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflows create() {
            return builder().build();
        }

        /**
         * @return clientUniqueCode
         */
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
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
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return trigger
         */
        public Trigger getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private String clientUniqueCode; 
            private Long createTime; 
            private String createUser; 
            private String description; 
            private String envType; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private String owner; 
            private String parameters; 
            private Long projectId; 
            private Trigger trigger; 

            /**
             * <p>The unique code of the client. This parameter is used to create a workflow asynchronously and implement the idempotence of the workflow. If you do not specify this parameter when you create the workflow, the system automatically generates a unique code. The unique code is uniquely associated with the workflow ID. If you specify this parameter when you update or delete the workflow, the value of this parameter must be the unique code that is used to create the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
             */
            public Builder clientUniqueCode(String clientUniqueCode) {
                this.clientUniqueCode = clientUniqueCode;
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
             * <p>1000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>The workflow ID.</p>
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
             * <p>1000</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>Workflow1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The account ID of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>para1=$bizdate para2=$[yyyymmdd]</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
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
             * <p>The trigger method.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            public Workflows build() {
                return new Workflows(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("Workflows")
        private java.util.List<Workflows> workflows;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.workflows = builder.workflows;
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
         * @return workflows
         */
        public java.util.List<Workflows> getWorkflows() {
            return this.workflows;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List<Workflows> workflows; 

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
             * <p>The workflows.</p>
             */
            public Builder workflows(java.util.List<Workflows> workflows) {
                this.workflows = workflows;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
