// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
 *
 * <p>DryRunSwaggerResponseBody</p>
 */
public class DryRunSwaggerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Failed")
    private Failed failed;

    @com.aliyun.core.annotation.NameInMap("GlobalCondition")
    private String globalCondition;

    @com.aliyun.core.annotation.NameInMap("ModelFailed")
    private ModelFailed modelFailed;

    @com.aliyun.core.annotation.NameInMap("ModelSuccess")
    private ModelSuccess modelSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Success success;

    private DryRunSwaggerResponseBody(Builder builder) {
        this.failed = builder.failed;
        this.globalCondition = builder.globalCondition;
        this.modelFailed = builder.modelFailed;
        this.modelSuccess = builder.modelSuccess;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DryRunSwaggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return failed
     */
    public Failed getFailed() {
        return this.failed;
    }

    /**
     * @return globalCondition
     */
    public String getGlobalCondition() {
        return this.globalCondition;
    }

    /**
     * @return modelFailed
     */
    public ModelFailed getModelFailed() {
        return this.modelFailed;
    }

    /**
     * @return modelSuccess
     */
    public ModelSuccess getModelSuccess() {
        return this.modelSuccess;
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
    public Success getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Failed failed; 
        private String globalCondition; 
        private ModelFailed modelFailed; 
        private ModelSuccess modelSuccess; 
        private String requestId; 
        private Success success; 

        /**
         * The APIs that failed to be created based on the Swagger-compliant data imported this time.
         */
        public Builder failed(Failed failed) {
            this.failed = failed;
            return this;
        }

        /**
         * The global condition.
         */
        public Builder globalCondition(String globalCondition) {
            this.globalCondition = globalCondition;
            return this;
        }

        /**
         * The models that failed to be imported through the Swagger-compliant data this time.
         */
        public Builder modelFailed(ModelFailed modelFailed) {
            this.modelFailed = modelFailed;
            return this;
        }

        /**
         * The models that failed to be imported through the Swagger-compliant data this time.
         */
        public Builder modelSuccess(ModelSuccess modelSuccess) {
            this.modelSuccess = modelSuccess;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The APIs that are created based on the Swagger-compliant data imported this time.
         */
        public Builder success(Success success) {
            this.success = success;
            return this;
        }

        public DryRunSwaggerResponseBody build() {
            return new DryRunSwaggerResponseBody(this);
        } 

    } 

    public static class ApiImportSwaggerFailed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private ApiImportSwaggerFailed(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.httpMethod = builder.httpMethod;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiImportSwaggerFailed create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String errorMsg; 
            private String httpMethod; 
            private String path; 

            /**
             * The error message returned when the API is created.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The HTTP method configured when the API is created.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The request path configured when the API is created.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ApiImportSwaggerFailed build() {
                return new ApiImportSwaggerFailed(this);
            } 

        } 

    }
    public static class Failed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiImportSwaggerFailed")
        private java.util.List < ApiImportSwaggerFailed> apiImportSwaggerFailed;

        private Failed(Builder builder) {
            this.apiImportSwaggerFailed = builder.apiImportSwaggerFailed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Failed create() {
            return builder().build();
        }

        /**
         * @return apiImportSwaggerFailed
         */
        public java.util.List < ApiImportSwaggerFailed> getApiImportSwaggerFailed() {
            return this.apiImportSwaggerFailed;
        }

        public static final class Builder {
            private java.util.List < ApiImportSwaggerFailed> apiImportSwaggerFailed; 

            /**
             * ApiImportSwaggerFailed.
             */
            public Builder apiImportSwaggerFailed(java.util.List < ApiImportSwaggerFailed> apiImportSwaggerFailed) {
                this.apiImportSwaggerFailed = apiImportSwaggerFailed;
                return this;
            }

            public Failed build() {
                return new Failed(this);
            } 

        } 

    }
    public static class ApiImportModelFailed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        private ApiImportModelFailed(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.groupId = builder.groupId;
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiImportModelFailed create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        public static final class Builder {
            private String errorMsg; 
            private String groupId; 
            private String modelName; 

            /**
             * The error message.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the model.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            public ApiImportModelFailed build() {
                return new ApiImportModelFailed(this);
            } 

        } 

    }
    public static class ModelFailed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiImportModelFailed")
        private java.util.List < ApiImportModelFailed> apiImportModelFailed;

        private ModelFailed(Builder builder) {
            this.apiImportModelFailed = builder.apiImportModelFailed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelFailed create() {
            return builder().build();
        }

        /**
         * @return apiImportModelFailed
         */
        public java.util.List < ApiImportModelFailed> getApiImportModelFailed() {
            return this.apiImportModelFailed;
        }

        public static final class Builder {
            private java.util.List < ApiImportModelFailed> apiImportModelFailed; 

            /**
             * ApiImportModelFailed.
             */
            public Builder apiImportModelFailed(java.util.List < ApiImportModelFailed> apiImportModelFailed) {
                this.apiImportModelFailed = apiImportModelFailed;
                return this;
            }

            public ModelFailed build() {
                return new ModelFailed(this);
            } 

        } 

    }
    public static class ApiImportModelSuccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelOperation")
        private String modelOperation;

        @com.aliyun.core.annotation.NameInMap("ModelUid")
        private String modelUid;

        private ApiImportModelSuccess(Builder builder) {
            this.groupId = builder.groupId;
            this.modelName = builder.modelName;
            this.modelOperation = builder.modelOperation;
            this.modelUid = builder.modelUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiImportModelSuccess create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelOperation
         */
        public String getModelOperation() {
            return this.modelOperation;
        }

        /**
         * @return modelUid
         */
        public String getModelUid() {
            return this.modelUid;
        }

        public static final class Builder {
            private String groupId; 
            private String modelName; 
            private String modelOperation; 
            private String modelUid; 

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the model.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * The model operation.
             */
            public Builder modelOperation(String modelOperation) {
                this.modelOperation = modelOperation;
                return this;
            }

            /**
             * The UID of the model.
             */
            public Builder modelUid(String modelUid) {
                this.modelUid = modelUid;
                return this;
            }

            public ApiImportModelSuccess build() {
                return new ApiImportModelSuccess(this);
            } 

        } 

    }
    public static class ModelSuccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiImportModelSuccess")
        private java.util.List < ApiImportModelSuccess> apiImportModelSuccess;

        private ModelSuccess(Builder builder) {
            this.apiImportModelSuccess = builder.apiImportModelSuccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelSuccess create() {
            return builder().build();
        }

        /**
         * @return apiImportModelSuccess
         */
        public java.util.List < ApiImportModelSuccess> getApiImportModelSuccess() {
            return this.apiImportModelSuccess;
        }

        public static final class Builder {
            private java.util.List < ApiImportModelSuccess> apiImportModelSuccess; 

            /**
             * ApiImportModelSuccess.
             */
            public Builder apiImportModelSuccess(java.util.List < ApiImportModelSuccess> apiImportModelSuccess) {
                this.apiImportModelSuccess = apiImportModelSuccess;
                return this;
            }

            public ModelSuccess build() {
                return new ModelSuccess(this);
            } 

        } 

    }
    public static class ApiDryRunSwaggerSuccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiOperation")
        private String apiOperation;

        @com.aliyun.core.annotation.NameInMap("ApiSwagger")
        private String apiSwagger;

        @com.aliyun.core.annotation.NameInMap("ApiUid")
        private String apiUid;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private ApiDryRunSwaggerSuccess(Builder builder) {
            this.apiOperation = builder.apiOperation;
            this.apiSwagger = builder.apiSwagger;
            this.apiUid = builder.apiUid;
            this.httpMethod = builder.httpMethod;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiDryRunSwaggerSuccess create() {
            return builder().build();
        }

        /**
         * @return apiOperation
         */
        public String getApiOperation() {
            return this.apiOperation;
        }

        /**
         * @return apiSwagger
         */
        public String getApiSwagger() {
            return this.apiSwagger;
        }

        /**
         * @return apiUid
         */
        public String getApiUid() {
            return this.apiUid;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String apiOperation; 
            private String apiSwagger; 
            private String apiUid; 
            private String httpMethod; 
            private String path; 

            /**
             * Specifies whether the operation is CREATE or MODIFY.
             */
            public Builder apiOperation(String apiOperation) {
                this.apiOperation = apiOperation;
                return this;
            }

            /**
             * The API definition that complies with the Swagger specification.
             */
            public Builder apiSwagger(String apiSwagger) {
                this.apiSwagger = apiSwagger;
                return this;
            }

            /**
             * The UID of the successfully imported API.
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * The HTTP method configured when the API is created.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The request path configured when the API is created.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ApiDryRunSwaggerSuccess build() {
                return new ApiDryRunSwaggerSuccess(this);
            } 

        } 

    }
    public static class Success extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiDryRunSwaggerSuccess")
        private java.util.List < ApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess;

        private Success(Builder builder) {
            this.apiDryRunSwaggerSuccess = builder.apiDryRunSwaggerSuccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Success create() {
            return builder().build();
        }

        /**
         * @return apiDryRunSwaggerSuccess
         */
        public java.util.List < ApiDryRunSwaggerSuccess> getApiDryRunSwaggerSuccess() {
            return this.apiDryRunSwaggerSuccess;
        }

        public static final class Builder {
            private java.util.List < ApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess; 

            /**
             * ApiDryRunSwaggerSuccess.
             */
            public Builder apiDryRunSwaggerSuccess(java.util.List < ApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess) {
                this.apiDryRunSwaggerSuccess = apiDryRunSwaggerSuccess;
                return this;
            }

            public Success build() {
                return new Success(this);
            } 

        } 

    }
}
