// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportOASTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImportOASTaskResponseBody</p>
 */
public class DescribeImportOASTaskResponseBody extends TeaModel {
    @NameInMap("ApiResults")
    private ApiResults apiResults;

    @NameInMap("ModelResults")
    private ModelResults modelResults;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskStatus")
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
         * ApiResults.
         */
        public Builder apiResults(ApiResults apiResults) {
            this.apiResults = apiResults;
            return this;
        }

        /**
         * ModelResults.
         */
        public Builder modelResults(ModelResults modelResults) {
            this.modelResults = modelResults;
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
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public DescribeImportOASTaskResponseBody build() {
            return new DescribeImportOASTaskResponseBody(this);
        } 

    } 

    public static class ApiResult extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("Description")
        private String description;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Method")
        private String method;

        @NameInMap("Path")
        private String path;

        @NameInMap("UpdateStatus")
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
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * UpdateStatus.
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
    public static class ApiResults extends TeaModel {
        @NameInMap("ApiResult")
        private java.util.List < ApiResult> apiResult;

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
        public java.util.List < ApiResult> getApiResult() {
            return this.apiResult;
        }

        public static final class Builder {
            private java.util.List < ApiResult> apiResult; 

            /**
             * ApiResult.
             */
            public Builder apiResult(java.util.List < ApiResult> apiResult) {
                this.apiResult = apiResult;
                return this;
            }

            public ApiResults build() {
                return new ApiResults(this);
            } 

        } 

    }
    public static class ModelResult extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModelId")
        private String modelId;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("UpdateStatus")
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * UpdateStatus.
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
    public static class ModelResults extends TeaModel {
        @NameInMap("ModelResult")
        private java.util.List < ModelResult> modelResult;

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
        public java.util.List < ModelResult> getModelResult() {
            return this.modelResult;
        }

        public static final class Builder {
            private java.util.List < ModelResult> modelResult; 

            /**
             * ModelResult.
             */
            public Builder modelResult(java.util.List < ModelResult> modelResult) {
                this.modelResult = modelResult;
                return this;
            }

            public ModelResults build() {
                return new ModelResults(this);
            } 

        } 

    }
}
