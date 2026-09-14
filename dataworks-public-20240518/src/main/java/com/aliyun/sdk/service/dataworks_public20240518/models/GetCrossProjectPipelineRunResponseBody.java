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
 * {@link GetCrossProjectPipelineRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrossProjectPipelineRunResponseBody</p>
 */
public class GetCrossProjectPipelineRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCrossProjectPipelineRunResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrossProjectPipelineRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCrossProjectPipelineRunResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PipelineRunId&quot;:&quot;fcfd4160-e2ff-4603-9719-09128fe733df&quot;,&quot;DeploymentEnvironmentId&quot;:101,&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;Status&quot;:&quot;Ready&quot;,&quot;Description&quot;:&quot;Publish objects that are published in the source project to the target project&quot;,&quot;Creator&quot;:&quot;creator&quot;,&quot;CreateTime&quot;:1788739200000}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCrossProjectPipelineRunResponseBody build() {
            return new GetCrossProjectPipelineRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCrossProjectPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrossProjectPipelineRunResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbolishTime")
        private Long abolishTime;

        @com.aliyun.core.annotation.NameInMap("Abolisher")
        private String abolisher;

        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DeploymentEnvironmentId")
        private Long deploymentEnvironmentId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("Executor")
        private String executor;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("ObjectVersion")
        private String objectVersion;

        @com.aliyun.core.annotation.NameInMap("PipelineRunId")
        private String pipelineRunId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.abolishTime = builder.abolishTime;
            this.abolisher = builder.abolisher;
            this.changeType = builder.changeType;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.deploymentEnvironmentId = builder.deploymentEnvironmentId;
            this.description = builder.description;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.executeTime = builder.executeTime;
            this.executor = builder.executor;
            this.finishTime = builder.finishTime;
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.objectVersion = builder.objectVersion;
            this.pipelineRunId = builder.pipelineRunId;
            this.requestId = builder.requestId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return abolishTime
         */
        public Long getAbolishTime() {
            return this.abolishTime;
        }

        /**
         * @return abolisher
         */
        public String getAbolisher() {
            return this.abolisher;
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deploymentEnvironmentId
         */
        public Long getDeploymentEnvironmentId() {
            return this.deploymentEnvironmentId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return executor
         */
        public String getExecutor() {
            return this.executor;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return objectVersion
         */
        public String getObjectVersion() {
            return this.objectVersion;
        }

        /**
         * @return pipelineRunId
         */
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long abolishTime; 
            private String abolisher; 
            private String changeType; 
            private Long createTime; 
            private String creator; 
            private Long deploymentEnvironmentId; 
            private String description; 
            private String errorCode; 
            private String errorMessage; 
            private Long executeTime; 
            private String executor; 
            private Long finishTime; 
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private String objectVersion; 
            private String pipelineRunId; 
            private String requestId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.abolishTime = model.abolishTime;
                this.abolisher = model.abolisher;
                this.changeType = model.changeType;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.deploymentEnvironmentId = model.deploymentEnvironmentId;
                this.description = model.description;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.executeTime = model.executeTime;
                this.executor = model.executor;
                this.finishTime = model.finishTime;
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.objectVersion = model.objectVersion;
                this.pipelineRunId = model.pipelineRunId;
                this.requestId = model.requestId;
                this.status = model.status;
            } 

            /**
             * <p>The termination time. This value is a UNIX timestamp in milliseconds. This parameter is returned only after the flow is terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>1788739260000</p>
             */
            public Builder abolishTime(Long abolishTime) {
                this.abolishTime = abolishTime;
                return this;
            }

            /**
             * <p>The user who terminated the flow.</p>
             * 
             * <strong>example:</strong>
             * <p>operator</p>
             */
            public Builder abolisher(String abolisher) {
                this.abolisher = abolisher;
                return this;
            }

            /**
             * <p>The change type.</p>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1788739200000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>creator</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The cross-workspace deployment environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder deploymentEnvironmentId(Long deploymentEnvironmentId) {
                this.deploymentEnvironmentId = deploymentEnvironmentId;
                return this;
            }

            /**
             * <p>The deployment description.</p>
             * 
             * <strong>example:</strong>
             * <p>Publish objects that are published in the source project to the target project</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DeploymentFailed</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployment failed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The execution time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1788739260000</p>
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The executor.</p>
             * 
             * <strong>example:</strong>
             * <p>executor</p>
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>The completion time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1788739320000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the deployment object.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The name of the deployment object.</p>
             * 
             * <strong>example:</strong>
             * <p>object-1</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The object type of the publish object.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The version of the deployment object.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder objectVersion(String objectVersion) {
                this.objectVersion = objectVersion;
                return this;
            }

            /**
             * <p>The cross-workspace deployment flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fcfd4160-e2ff-4603-9719-09128fe733df</p>
             */
            public Builder pipelineRunId(String pipelineRunId) {
                this.pipelineRunId = pipelineRunId;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The status of the deployment flow. Valid values:</p>
             * <ul>
             * <li>Building: Building.</li>
             * <li>Ready: Ready and waiting for execution.</li>
             * <li>Running: Running.</li>
             * <li>Termination: Terminated.</li>
             * <li>Success: Execution succeeded.</li>
             * <li>Fail: Execution failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
