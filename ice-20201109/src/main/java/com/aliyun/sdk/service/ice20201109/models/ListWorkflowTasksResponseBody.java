// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListWorkflowTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowTasksResponseBody</p>
 */
public class ListWorkflowTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private java.util.List<TaskList> taskList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListWorkflowTasksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskList
     */
    public java.util.List<TaskList> getTaskList() {
        return this.taskList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<TaskList> taskList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListWorkflowTasksResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.taskList = model.taskList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>****8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C0C02296-113C-5838-8FE9-8F3A32998DDC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The media workflow tasks.</p>
         */
        public Builder taskList(java.util.List<TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * <p>The total number of entries returned. By default, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkflowTasksResponseBody build() {
            return new ListWorkflowTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowTasksResponseBody</p>
     */
    public static class Workflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        private Workflow(Builder builder) {
            this.createTime = builder.createTime;
            this.mediaType = builder.mediaType;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflow create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String createTime; 
            private String mediaType; 
            private String modifiedTime; 
            private String name; 
            private String status; 
            private String type; 
            private String workflowId; 

            private Builder() {
            } 

            private Builder(Workflow model) {
                this.createTime = model.createTime;
                this.mediaType = model.mediaType;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
                this.workflowId = model.workflowId;
            } 

            /**
             * <p>The creation time of the workflow template.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-21T01:48:49Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The source of the media file. Valid values:</p>
             * <ul>
             * <li>OSS: an OSS object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The last modification time of the workflow template.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-23 10:19:37 +0800</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The name of the workflow template.</p>
             * 
             * <strong>example:</strong>
             * <p>example-workflow-***</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the workflow template.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the workflow template.</p>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong>2491c84dce913da9fe65</strong></strong></strong></p>
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Workflow build() {
                return new Workflow(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowTasksResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskInput")
        private String taskInput;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("Workflow")
        private Workflow workflow;

        private TaskList(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskInput = builder.taskInput;
            this.userData = builder.userData;
            this.workflow = builder.workflow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskInput
         */
        public String getTaskInput() {
            return this.taskInput;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return workflow
         */
        public Workflow getWorkflow() {
            return this.workflow;
        }

        public static final class Builder {
            private String createTime; 
            private String finishTime; 
            private String status; 
            private String taskId; 
            private String taskInput; 
            private String userData; 
            private Workflow workflow; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskInput = model.taskInput;
                this.userData = model.userData;
                this.workflow = model.workflow;
            } 

            /**
             * <p>The time the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-15T09:45:48Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time the task was completed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-07T10:53:45Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The task state.</p>
             * <p><strong>Valid values</strong>:</p>
             * <ul>
             * <li>Init: Initializing</li>
             * <li>Failed</li>
             * <li>Canceled</li>
             * <li>Processing</li>
             * <li>Succeed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the workflow task.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong><strong>4c93d2f404f8345b16a965</strong></strong></em></p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The input data for the workflow task.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Type&quot;:&quot;Media&quot;,&quot;Media&quot;:&quot;<strong><strong>8b40884171efb0d9e7f7f458</strong></strong>&quot;}</p>
             */
            public Builder taskInput(String taskInput) {
                this.taskInput = taskInput;
                return this;
            }

            /**
             * <p>The custom data that was passed when the task was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The information about the workflow template.</p>
             */
            public Builder workflow(Workflow workflow) {
                this.workflow = workflow;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
