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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DryRunSwaggerResponseBody model) {
            this.failed = model.failed;
            this.globalCondition = model.globalCondition;
            this.modelFailed = model.modelFailed;
            this.modelSuccess = model.modelSuccess;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The APIs that failed to be created based on the Swagger-compliant data imported this time.</p>
         */
        public Builder failed(Failed failed) {
            this.failed = failed;
            return this;
        }

        /**
         * <p>The global condition.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder globalCondition(String globalCondition) {
            this.globalCondition = globalCondition;
            return this;
        }

        /**
         * <p>The models that failed to be imported through the Swagger-compliant data this time.</p>
         */
        public Builder modelFailed(ModelFailed modelFailed) {
            this.modelFailed = modelFailed;
            return this;
        }

        /**
         * <p>The models that failed to be imported through the Swagger-compliant data this time.</p>
         */
        public Builder modelSuccess(ModelSuccess modelSuccess) {
            this.modelSuccess = modelSuccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EF924FE4-2EDD-4CD3-89EC-34E4708574E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The APIs that are created based on the Swagger-compliant data imported this time.</p>
         */
        public Builder success(Success success) {
            this.success = success;
            return this;
        }

        public DryRunSwaggerResponseBody build() {
            return new DryRunSwaggerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ApiImportSwaggerFailed model) {
                this.errorMsg = model.errorMsg;
                this.httpMethod = model.httpMethod;
                this.path = model.path;
            } 

            /**
             * <p>The error message returned when the API is created.</p>
             * 
             * <strong>example:</strong>
             * <p>api already exists : apiUid ===&gt; 8e274ec61cf6468e83b68371956831cb</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The HTTP method configured when the API is created.</p>
             * 
             * <strong>example:</strong>
             * <p>post</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The request path configured when the API is created.</p>
             * 
             * <strong>example:</strong>
             * <p>/http/get/mapping</p>
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
    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
    public static class Failed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiImportSwaggerFailed")
        private java.util.List<ApiImportSwaggerFailed> apiImportSwaggerFailed;

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
        public java.util.List<ApiImportSwaggerFailed> getApiImportSwaggerFailed() {
            return this.apiImportSwaggerFailed;
        }

        public static final class Builder {
            private java.util.List<ApiImportSwaggerFailed> apiImportSwaggerFailed; 

            private Builder() {
            } 

            private Builder(Failed model) {
                this.apiImportSwaggerFailed = model.apiImportSwaggerFailed;
            } 

            /**
             * ApiImportSwaggerFailed.
             */
            public Builder apiImportSwaggerFailed(java.util.List<ApiImportSwaggerFailed> apiImportSwaggerFailed) {
                this.apiImportSwaggerFailed = apiImportSwaggerFailed;
                return this;
            }

            public Failed build() {
                return new Failed(this);
            } 

        } 

    }
    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ApiImportModelFailed model) {
                this.errorMsg = model.errorMsg;
                this.groupId = model.groupId;
                this.modelName = model.modelName;
            } 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Not Found</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>36d4bcfaec1946e1870d90b2d7519710</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>Region</p>
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
    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
    public static class ModelFailed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiImportModelFailed")
        private java.util.List<ApiImportModelFailed> apiImportModelFailed;

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
        public java.util.List<ApiImportModelFailed> getApiImportModelFailed() {
            return this.apiImportModelFailed;
        }

        public static final class Builder {
            private java.util.List<ApiImportModelFailed> apiImportModelFailed; 

            private Builder() {
            } 

            private Builder(ModelFailed model) {
                this.apiImportModelFailed = model.apiImportModelFailed;
            } 

            /**
             * ApiImportModelFailed.
             */
            public Builder apiImportModelFailed(java.util.List<ApiImportModelFailed> apiImportModelFailed) {
                this.apiImportModelFailed = apiImportModelFailed;
                return this;
            }

            public ModelFailed build() {
                return new ModelFailed(this);
            } 

        } 

    }
    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ApiImportModelSuccess model) {
                this.groupId = model.groupId;
                this.modelName = model.modelName;
                this.modelOperation = model.modelOperation;
                this.modelUid = model.modelUid;
            } 

            /**
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>b2d552ed90ca435b86f7bf8d45414793</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>NewInstance</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The model operation.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder modelOperation(String modelOperation) {
                this.modelOperation = modelOperation;
                return this;
            }

            /**
             * <p>The UID of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>ec1946e1870d90b2d7519</p>
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
    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
    public static class ModelSuccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiImportModelSuccess")
        private java.util.List<ApiImportModelSuccess> apiImportModelSuccess;

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
        public java.util.List<ApiImportModelSuccess> getApiImportModelSuccess() {
            return this.apiImportModelSuccess;
        }

        public static final class Builder {
            private java.util.List<ApiImportModelSuccess> apiImportModelSuccess; 

            private Builder() {
            } 

            private Builder(ModelSuccess model) {
                this.apiImportModelSuccess = model.apiImportModelSuccess;
            } 

            /**
             * ApiImportModelSuccess.
             */
            public Builder apiImportModelSuccess(java.util.List<ApiImportModelSuccess> apiImportModelSuccess) {
                this.apiImportModelSuccess = apiImportModelSuccess;
                return this;
            }

            public ModelSuccess build() {
                return new ModelSuccess(this);
            } 

        } 

    }
    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ApiDryRunSwaggerSuccess model) {
                this.apiOperation = model.apiOperation;
                this.apiSwagger = model.apiSwagger;
                this.apiUid = model.apiUid;
                this.httpMethod = model.httpMethod;
                this.path = model.path;
            } 

            /**
             * <p>Specifies whether the operation is CREATE or MODIFY.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder apiOperation(String apiOperation) {
                this.apiOperation = apiOperation;
                return this;
            }

            /**
             * <p>The API definition that complies with the Swagger specification.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;A Swagger API definition in YAML&quot;</p>
             */
            public Builder apiSwagger(String apiSwagger) {
                this.apiSwagger = apiSwagger;
                return this;
            }

            /**
             * <p>The UID of the successfully imported API.</p>
             * 
             * <strong>example:</strong>
             * <p>8e274ec61cf6468e83b68371956831cb</p>
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * <p>The HTTP method configured when the API is created.</p>
             * 
             * <strong>example:</strong>
             * <p>get</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The request path configured when the API is created.</p>
             * 
             * <strong>example:</strong>
             * <p>/http/get/mapping</p>
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
    /**
     * 
     * {@link DryRunSwaggerResponseBody} extends {@link TeaModel}
     *
     * <p>DryRunSwaggerResponseBody</p>
     */
    public static class Success extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiDryRunSwaggerSuccess")
        private java.util.List<ApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess;

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
        public java.util.List<ApiDryRunSwaggerSuccess> getApiDryRunSwaggerSuccess() {
            return this.apiDryRunSwaggerSuccess;
        }

        public static final class Builder {
            private java.util.List<ApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess; 

            private Builder() {
            } 

            private Builder(Success model) {
                this.apiDryRunSwaggerSuccess = model.apiDryRunSwaggerSuccess;
            } 

            /**
             * ApiDryRunSwaggerSuccess.
             */
            public Builder apiDryRunSwaggerSuccess(java.util.List<ApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess) {
                this.apiDryRunSwaggerSuccess = apiDryRunSwaggerSuccess;
                return this;
            }

            public Success build() {
                return new Success(this);
            } 

        } 

    }
}
