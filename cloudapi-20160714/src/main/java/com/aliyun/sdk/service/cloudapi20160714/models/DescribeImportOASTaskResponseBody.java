// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeImportOASTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImportOASTaskResponseBody</p>
 */
public class DescribeImportOASTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiResults")
    private ApiResults apiResults;

    @com.aliyun.core.annotation.NameInMap("ModelResults")
    private ModelResults modelResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private DescribeImportOASTaskResponseBody(Builder builder) {
        this.apiResults = builder.apiResults;
        this.modelResults = builder.modelResults;
        this.requestId = builder.requestId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImportOASTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiResults
     */
    public ApiResults getApiResults() {
        return this.apiResults;
    }

    /**
     * @return modelResults
     */
    public ModelResults getModelResults() {
        return this.modelResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private ApiResults apiResults; 
        private ModelResults modelResults; 
        private String requestId; 
        private String taskStatus; 

        /**
         * <p>The execution status of the subtask. Valid values:</p>
         * <ul>
         * <li>RUNNING</li>
         * <li>WAIT</li>
         * <li>OVER</li>
         * <li>FAIL</li>
         * <li>CANCEL</li>
         * </ul>
         */
        public Builder apiResults(ApiResults apiResults) {
            this.apiResults = apiResults;
            return this;
        }

        /**
         * <p>The execution status of the subtask. Valid values:</p>
         * <ul>
         * <li>RUNNING</li>
         * <li>WAIT</li>
         * <li>OVER</li>
         * <li>FAIL</li>
         * <li>CANCEL</li>
         * </ul>
         */
        public Builder modelResults(ModelResults modelResults) {
            this.modelResults = modelResults;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE5722A6-AE78-4741-A9B0-6C817D360510</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the import task. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Finished</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public DescribeImportOASTaskResponseBody build() {
            return new DescribeImportOASTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImportOASTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImportOASTaskResponseBody</p>
     */
    public static class ApiResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("UpdateStatus")
        private String updateStatus;

        private ApiResult(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.description = builder.description;
            this.errorMessage = builder.errorMessage;
            this.groupId = builder.groupId;
            this.method = builder.method;
            this.path = builder.path;
            this.updateStatus = builder.updateStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiResult create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return updateStatus
         */
        public String getUpdateStatus() {
            return this.updateStatus;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String description; 
            private String errorMessage; 
            private String groupId; 
            private String method; 
            private String path; 
            private String updateStatus; 

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c5a0c2900ff746b789c007545be22fb8</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>GetByCreatorIdUsingGET</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The API description.</p>
             * 
             * <strong>example:</strong>
             * <p>release data api 411055691505041</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The cause of the failure if the API fails to be imported.</p>
             * 
             * <strong>example:</strong>
             * <p>Internal Error</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The API group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>736508d885074167ba8fbce3bc95ea0b</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The HTTP request HTTP method of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The request path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/creator/getByCreatorId</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The execution status of the subtask. Valid values:</p>
             * <ul>
             * <li>RUNNING</li>
             * <li>WAIT</li>
             * <li>OVER</li>
             * <li>FAIL</li>
             * <li>CANCEL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WAIT</p>
             */
            public Builder updateStatus(String updateStatus) {
                this.updateStatus = updateStatus;
                return this;
            }

            public ApiResult build() {
                return new ApiResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImportOASTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImportOASTaskResponseBody</p>
     */
    public static class ApiResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiResult")
        private java.util.List<ApiResult> apiResult;

        private ApiResults(Builder builder) {
            this.apiResult = builder.apiResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiResults create() {
            return builder().build();
        }

        /**
         * @return apiResult
         */
        public java.util.List<ApiResult> getApiResult() {
            return this.apiResult;
        }

        public static final class Builder {
            private java.util.List<ApiResult> apiResult; 

            /**
             * ApiResult.
             */
            public Builder apiResult(java.util.List<ApiResult> apiResult) {
                this.apiResult = apiResult;
                return this;
            }

            public ApiResults build() {
                return new ApiResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImportOASTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImportOASTaskResponseBody</p>
     */
    public static class ModelResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("UpdateStatus")
        private String updateStatus;

        private ModelResult(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.groupId = builder.groupId;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.updateStatus = builder.updateStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelResult create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return updateStatus
         */
        public String getUpdateStatus() {
            return this.updateStatus;
        }

        public static final class Builder {
            private String errorMessage; 
            private String groupId; 
            private String modelId; 
            private String modelName; 
            private String updateStatus; 

            /**
             * <p>The cause of the failure if the model fails to be imported.</p>
             * 
             * <strong>example:</strong>
             * <p>Internal Error</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The API group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>736508d885074167ba8fbce3bc95ea0b</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the imported model.</p>
             * 
             * <strong>example:</strong>
             * <p>6b48d724c921415486e190c494dd6bf8</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>Pet</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The execution status of the subtask. Valid values:</p>
             * <ul>
             * <li>RUNNING</li>
             * <li>WAIT</li>
             * <li>OVER</li>
             * <li>FAIL</li>
             * <li>CANCEL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAIL</p>
             */
            public Builder updateStatus(String updateStatus) {
                this.updateStatus = updateStatus;
                return this;
            }

            public ModelResult build() {
                return new ModelResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImportOASTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImportOASTaskResponseBody</p>
     */
    public static class ModelResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelResult")
        private java.util.List<ModelResult> modelResult;

        private ModelResults(Builder builder) {
            this.modelResult = builder.modelResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelResults create() {
            return builder().build();
        }

        /**
         * @return modelResult
         */
        public java.util.List<ModelResult> getModelResult() {
            return this.modelResult;
        }

        public static final class Builder {
            private java.util.List<ModelResult> modelResult; 

            /**
             * ModelResult.
             */
            public Builder modelResult(java.util.List<ModelResult> modelResult) {
                this.modelResult = modelResult;
                return this;
            }

            public ModelResults build() {
                return new ModelResults(this);
            } 

        } 

    }
}
