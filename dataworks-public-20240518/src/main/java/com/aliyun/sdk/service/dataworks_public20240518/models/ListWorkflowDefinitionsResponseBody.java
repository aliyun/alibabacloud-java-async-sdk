// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWorkflowDefinitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowDefinitionsResponseBody</p>
 */
public class ListWorkflowDefinitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListWorkflowDefinitionsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowDefinitionsResponseBody create() {
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
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListWorkflowDefinitionsResponseBody build() {
            return new ListWorkflowDefinitionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowDefinitionsResponseBody</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        private Runtime(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        public static final class Builder {
            private String command; 

            /**
             * <p>脚本所属类型</p>
             * 
             * <strong>example:</strong>
             * <p>WORKFLOW</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowDefinitionsResponseBody</p>
     */
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private Runtime runtime;

        private Script(Builder builder) {
            this.id = builder.id;
            this.path = builder.path;
            this.runtime = builder.runtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        public static final class Builder {
            private String id; 
            private String path; 
            private Runtime runtime; 

            /**
             * <p>工作流脚本的id</p>
             * 
             * <strong>example:</strong>
             * <p>698002781368644XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>工作流的脚本路径</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>脚本的运行时信息</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowDefinitionsResponseBody</p>
     */
    public static class WorkflowDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private WorkflowDefinitions(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.script = builder.script;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowDefinitions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
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
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return script
         */
        public Script getScript() {
            return this.script;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private String projectId; 
            private Script script; 
            private String type; 

            /**
             * <p>工作流的创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1698057323000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>工作流的描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>工作流定义的唯一ID</p>
             * 
             * <strong>example:</strong>
             * <p>463497880880954XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>工作流的最近修改时间</p>
             * 
             * <strong>example:</strong>
             * <p>1698057323000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>工作流的名称</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>工作流的责任人</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>工作流定义的所属项目空间</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>4710</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>工作流的脚本信息</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>工作流类型，可选值：CycleWorkflow、ManualWorkflow，分别表示周期工作流和手动工作流</p>
             * 
             * <strong>example:</strong>
             * <p>CycleWorkflow</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public WorkflowDefinitions build() {
                return new WorkflowDefinitions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowDefinitionsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("WorkflowDefinitions")
        private java.util.List < WorkflowDefinitions> workflowDefinitions;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.workflowDefinitions = builder.workflowDefinitions;
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
         * @return workflowDefinitions
         */
        public java.util.List < WorkflowDefinitions> getWorkflowDefinitions() {
            return this.workflowDefinitions;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List < WorkflowDefinitions> workflowDefinitions; 

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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * WorkflowDefinitions.
             */
            public Builder workflowDefinitions(java.util.List < WorkflowDefinitions> workflowDefinitions) {
                this.workflowDefinitions = workflowDefinitions;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
