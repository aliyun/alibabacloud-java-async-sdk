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
 * {@link GetStreamTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetStreamTaskResponseBody</p>
 */
public class GetStreamTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStreamTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStreamTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStreamTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The basic information and running information of the real-time task instance. The fileId can be used to subsequently query operation records and historical running instances.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend response exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStreamTaskResponseBody build() {
            return new GetStreamTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStreamTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetStreamTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeLocationDate")
        private String consumeLocationDate;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OperatorId")
        private String operatorId;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectMode")
        private String projectMode;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ResourceQueue")
        private String resourceQueue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.consumeLocationDate = builder.consumeLocationDate;
            this.engineVersion = builder.engineVersion;
            this.fileId = builder.fileId;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.operatorId = builder.operatorId;
            this.operatorName = builder.operatorName;
            this.projectId = builder.projectId;
            this.projectMode = builder.projectMode;
            this.projectName = builder.projectName;
            this.resourceQueue = builder.resourceQueue;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumeLocationDate
         */
        public String getConsumeLocationDate() {
            return this.consumeLocationDate;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return operatorId
         */
        public String getOperatorId() {
            return this.operatorId;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectMode
         */
        public String getProjectMode() {
            return this.projectMode;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return resourceQueue
         */
        public String getResourceQueue() {
            return this.resourceQueue;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String consumeLocationDate; 
            private String engineVersion; 
            private String fileId; 
            private String name; 
            private String nodeId; 
            private String operatorId; 
            private String operatorName; 
            private Long projectId; 
            private String projectMode; 
            private String projectName; 
            private String resourceQueue; 
            private String status; 
            private String taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumeLocationDate = model.consumeLocationDate;
                this.engineVersion = model.engineVersion;
                this.fileId = model.fileId;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.operatorId = model.operatorId;
                this.operatorName = model.operatorName;
                this.projectId = model.projectId;
                this.projectMode = model.projectMode;
                this.projectName = model.projectName;
                this.resourceQueue = model.resourceQueue;
                this.status = model.status;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The time corresponding to the latest read position. The format is yyyy-MM-dd HH:mm:ss. If no consumption metrics are available, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-15 13:45:52</p>
             */
            public Builder consumeLocationDate(String consumeLocationDate) {
                this.consumeLocationDate = consumeLocationDate;
                return this;
            }

            /**
             * <p>The database engine version of the compute DPI engine used to run the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1.15.3</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The ID of the task file. This corresponds to the FileId request parameter in ListStreamOpsRecords and ListStreamInstanceRecords. It is not a nodeId or a template file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7333610201479808</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the node to which the real-time task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rt_mysql_doris</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the node. The ID starts with n_ and identifies a development node. It is different from the task file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_8442437168737681408</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the user who last operated the task.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * <p>The display name of the user who last operated the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The ID of the Dataphin project to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>7299592831043008</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project mode. Valid values: BASIC for the basic mode, and DEV_PROD for the development-production isolation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder projectMode(String projectMode) {
                this.projectMode = projectMode;
                return this;
            }

            /**
             * <p>The name of the Dataphin project to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>flink_k8s</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The display information of the resource queue used by the task, including the queue name and ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Dedicated for real-time development (1052061)</p>
             */
            public Builder resourceQueue(String resourceQueue) {
                this.resourceQueue = resourceQueue;
                return this;
            }

            /**
             * <p>The running status of the task. The original TaskStatusEnum enumeration name is returned. Common real-time statuses include: STREAMING_STARTING (starting), STREAMING_RUNNING (running), STREAMING_PAUSING (pausing), STREAMING_PAUSED (paused), STREAMING_RESUMING (resuming), STREAMING_STOPPING (stopping), STREAMING_STOPPED (stopped), STREAMING_INIT (initial status), STREAMING_FAILED (running exception), STREAMING_START_FAILED (start exception), STREAMING_RESUME_FAILED (resume exception), and STREAMING_FINISHED (completed). Other known statuses also return the original enumeration name. If the status cannot be identified, UNKNOWN is returned. If the original status is empty, null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>STREAMING_RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Instance ID of the real-time task instance. Instance ID starts with t_ and corresponds to the TaskId request parameter in GetStreamTask.</p>
             * 
             * <strong>example:</strong>
             * <p>t_8442437168737681408_20261014_8442447717177229312</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the task, such as REAL_TIME_PIPELINE (real-time integration), FLINK_SQL (SQL task), FLINK_TEMPLATE_SQL (template task), and FLINK_DATASTREAM (DataStream task).</p>
             * 
             * <strong>example:</strong>
             * <p>REAL_TIME_PIPELINE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
