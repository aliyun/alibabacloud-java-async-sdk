// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportSwaggerResponseBody} extends {@link TeaModel}
 *
 * <p>ImportSwaggerResponseBody</p>
 */
public class ImportSwaggerResponseBody extends TeaModel {
    @NameInMap("Failed")
    private Failed failed;

    @NameInMap("ModelFailed")
    private ModelFailed modelFailed;

    @NameInMap("ModelSuccess")
    private ModelSuccess modelSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Success success;

    private ImportSwaggerResponseBody(Builder builder) {
        this.failed = builder.failed;
        this.modelFailed = builder.modelFailed;
        this.modelSuccess = builder.modelSuccess;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportSwaggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return failed
     */
    public Failed getFailed() {
        return this.failed;
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
         * The models that failed to be imported based on the Swagger-compliant data imported this time.
         */
        public Builder modelFailed(ModelFailed modelFailed) {
            this.modelFailed = modelFailed;
            return this;
        }

        /**
         * The models that were imported based on the Swagger-compliant data imported this time.
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
         * The APIs that were created based on the Swagger-compliant data imported this time.
         */
        public Builder success(Success success) {
            this.success = success;
            return this;
        }

        public ImportSwaggerResponseBody build() {
            return new ImportSwaggerResponseBody(this);
        } 

    } 

    public static class ApiImportSwaggerFailed extends TeaModel {
        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("Path")
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
             * The error message returned.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The HTTP method of the API.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The request path of the API.
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
        @NameInMap("ApiImportSwaggerFailed")
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
        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModelName")
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
        @NameInMap("ApiImportModelFailed")
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
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("ModelOperation")
        private String modelOperation;

        @NameInMap("ModelUid")
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
        @NameInMap("ApiImportModelSuccess")
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
    public static class ApiImportSwaggerSuccess extends TeaModel {
        @NameInMap("ApiOperation")
        private String apiOperation;

        @NameInMap("ApiUid")
        private String apiUid;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("Path")
        private String path;

        private ApiImportSwaggerSuccess(Builder builder) {
            this.apiOperation = builder.apiOperation;
            this.apiUid = builder.apiUid;
            this.httpMethod = builder.httpMethod;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiImportSwaggerSuccess create() {
            return builder().build();
        }

        /**
         * @return apiOperation
         */
        public String getApiOperation() {
            return this.apiOperation;
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
            private String apiUid; 
            private String httpMethod; 
            private String path; 

            /**
             * Specifies that the operation is CREATE or MODIFY.
             */
            public Builder apiOperation(String apiOperation) {
                this.apiOperation = apiOperation;
                return this;
            }

            /**
             * The UID of the imported API.
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * The HTTP method of the API.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The request path of the API.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ApiImportSwaggerSuccess build() {
                return new ApiImportSwaggerSuccess(this);
            } 

        } 

    }
    public static class Success extends TeaModel {
        @NameInMap("ApiImportSwaggerSuccess")
        private java.util.List < ApiImportSwaggerSuccess> apiImportSwaggerSuccess;

        private Success(Builder builder) {
            this.apiImportSwaggerSuccess = builder.apiImportSwaggerSuccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Success create() {
            return builder().build();
        }

        /**
         * @return apiImportSwaggerSuccess
         */
        public java.util.List < ApiImportSwaggerSuccess> getApiImportSwaggerSuccess() {
            return this.apiImportSwaggerSuccess;
        }

        public static final class Builder {
            private java.util.List < ApiImportSwaggerSuccess> apiImportSwaggerSuccess; 

            /**
             * ApiImportSwaggerSuccess.
             */
            public Builder apiImportSwaggerSuccess(java.util.List < ApiImportSwaggerSuccess> apiImportSwaggerSuccess) {
                this.apiImportSwaggerSuccess = apiImportSwaggerSuccess;
                return this;
            }

            public Success build() {
                return new Success(this);
            } 

        } 

    }
}
