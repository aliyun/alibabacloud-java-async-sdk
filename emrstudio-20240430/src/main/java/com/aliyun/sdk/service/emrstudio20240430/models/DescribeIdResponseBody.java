// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

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
 * {@link DescribeIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIdResponseBody</p>
 */
public class DescribeIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DescribeIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIdResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeIdResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIdResponseBody build() {
            return new DescribeIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputId")
        private String inputId;

        @com.aliyun.core.annotation.NameInMap("inputIdType")
        private String inputIdType;

        @com.aliyun.core.annotation.NameInMap("manualTaskId")
        private String manualTaskId;

        @com.aliyun.core.annotation.NameInMap("manualTaskInstanceId")
        private String manualTaskInstanceId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskInstanceId")
        private String taskInstanceId;

        @com.aliyun.core.annotation.NameInMap("workflowId")
        private String workflowId;

        @com.aliyun.core.annotation.NameInMap("workflowInstanceId")
        private String workflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.inputId = builder.inputId;
            this.inputIdType = builder.inputIdType;
            this.manualTaskId = builder.manualTaskId;
            this.manualTaskInstanceId = builder.manualTaskInstanceId;
            this.projectId = builder.projectId;
            this.taskId = builder.taskId;
            this.taskInstanceId = builder.taskInstanceId;
            this.workflowId = builder.workflowId;
            this.workflowInstanceId = builder.workflowInstanceId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inputId
         */
        public String getInputId() {
            return this.inputId;
        }

        /**
         * @return inputIdType
         */
        public String getInputIdType() {
            return this.inputIdType;
        }

        /**
         * @return manualTaskId
         */
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        /**
         * @return manualTaskInstanceId
         */
        public String getManualTaskInstanceId() {
            return this.manualTaskInstanceId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskInstanceId
         */
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowInstanceId
         */
        public String getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String inputId; 
            private String inputIdType; 
            private String manualTaskId; 
            private String manualTaskInstanceId; 
            private String projectId; 
            private String taskId; 
            private String taskInstanceId; 
            private String workflowId; 
            private String workflowInstanceId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inputId = model.inputId;
                this.inputIdType = model.inputIdType;
                this.manualTaskId = model.manualTaskId;
                this.manualTaskInstanceId = model.manualTaskInstanceId;
                this.projectId = model.projectId;
                this.taskId = model.taskId;
                this.taskInstanceId = model.taskInstanceId;
                this.workflowId = model.workflowId;
                this.workflowInstanceId = model.workflowInstanceId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * inputId.
             */
            public Builder inputId(String inputId) {
                this.inputId = inputId;
                return this;
            }

            /**
             * inputIdType.
             */
            public Builder inputIdType(String inputIdType) {
                this.inputIdType = inputIdType;
                return this;
            }

            /**
             * manualTaskId.
             */
            public Builder manualTaskId(String manualTaskId) {
                this.manualTaskId = manualTaskId;
                return this;
            }

            /**
             * manualTaskInstanceId.
             */
            public Builder manualTaskInstanceId(String manualTaskInstanceId) {
                this.manualTaskInstanceId = manualTaskInstanceId;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskInstanceId.
             */
            public Builder taskInstanceId(String taskInstanceId) {
                this.taskInstanceId = taskInstanceId;
                return this;
            }

            /**
             * workflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * workflowInstanceId.
             */
            public Builder workflowInstanceId(String workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
