// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link TaskConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>TaskConfigListResponseBody</p>
 */
public class TaskConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PageTotal")
    private Integer pageTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private TaskList taskList;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private TaskConfigListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskList = builder.taskList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskConfigListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return pageTotal
     */
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskList
     */
    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String errorMessage; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer pageTotal; 
        private String requestId; 
        private Boolean success; 
        private TaskList taskList; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(TaskConfigListResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.pageTotal = model.pageTotal;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskList = model.taskList;
            this.total = model.total;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

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
         * PageTotal.
         */
        public Builder pageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskList.
         */
        public Builder taskList(TaskList taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public TaskConfigListResponseBody build() {
            return new TaskConfigListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TaskConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>TaskConfigListResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private InstanceList(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List<String> getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List<String> string; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TaskConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>TaskConfigListResponseBody</p>
     */
    public static class NodeTaskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private String alertConfig;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceList")
        private InstanceList instanceList;

        @com.aliyun.core.annotation.NameInMap("JsonData")
        private String jsonData;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskScope")
        private String taskScope;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private NodeTaskConfig(Builder builder) {
            this.alertConfig = builder.alertConfig;
            this.disabled = builder.disabled;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.instanceList = builder.instanceList;
            this.jsonData = builder.jsonData;
            this.taskName = builder.taskName;
            this.taskScope = builder.taskScope;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTaskConfig create() {
            return builder().build();
        }

        /**
         * @return alertConfig
         */
        public String getAlertConfig() {
            return this.alertConfig;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceList
         */
        public InstanceList getInstanceList() {
            return this.instanceList;
        }

        /**
         * @return jsonData
         */
        public String getJsonData() {
            return this.jsonData;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskScope
         */
        public String getTaskScope() {
            return this.taskScope;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String alertConfig; 
            private Boolean disabled; 
            private Long groupId; 
            private String groupName; 
            private Long id; 
            private InstanceList instanceList; 
            private String jsonData; 
            private String taskName; 
            private String taskScope; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(NodeTaskConfig model) {
                this.alertConfig = model.alertConfig;
                this.disabled = model.disabled;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.id = model.id;
                this.instanceList = model.instanceList;
                this.jsonData = model.jsonData;
                this.taskName = model.taskName;
                this.taskScope = model.taskScope;
                this.taskType = model.taskType;
            } 

            /**
             * AlertConfig.
             */
            public Builder alertConfig(String alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceList.
             */
            public Builder instanceList(InstanceList instanceList) {
                this.instanceList = instanceList;
                return this;
            }

            /**
             * JsonData.
             */
            public Builder jsonData(String jsonData) {
                this.jsonData = jsonData;
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
             * TaskScope.
             */
            public Builder taskScope(String taskScope) {
                this.taskScope = taskScope;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public NodeTaskConfig build() {
                return new NodeTaskConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link TaskConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>TaskConfigListResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeTaskConfig")
        private java.util.List<NodeTaskConfig> nodeTaskConfig;

        private TaskList(Builder builder) {
            this.nodeTaskConfig = builder.nodeTaskConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return nodeTaskConfig
         */
        public java.util.List<NodeTaskConfig> getNodeTaskConfig() {
            return this.nodeTaskConfig;
        }

        public static final class Builder {
            private java.util.List<NodeTaskConfig> nodeTaskConfig; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.nodeTaskConfig = model.nodeTaskConfig;
            } 

            /**
             * NodeTaskConfig.
             */
            public Builder nodeTaskConfig(java.util.List<NodeTaskConfig> nodeTaskConfig) {
                this.nodeTaskConfig = nodeTaskConfig;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
