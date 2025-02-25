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
 * {@link ImportOASResponseBody} extends {@link TeaModel}
 *
 * <p>ImportOASResponseBody</p>
 */
public class ImportOASResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMessages")
    private ErrorMessages errorMessages;

    @com.aliyun.core.annotation.NameInMap("FailedApis")
    private FailedApis failedApis;

    @com.aliyun.core.annotation.NameInMap("FailedModels")
    private FailedModels failedModels;

    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessApis")
    private SuccessApis successApis;

    @com.aliyun.core.annotation.NameInMap("SuccessModels")
    private SuccessModels successModels;

    @com.aliyun.core.annotation.NameInMap("WarningMessages")
    private WarningMessages warningMessages;

    private ImportOASResponseBody(Builder builder) {
        this.errorMessages = builder.errorMessages;
        this.failedApis = builder.failedApis;
        this.failedModels = builder.failedModels;
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
        this.successApis = builder.successApis;
        this.successModels = builder.successModels;
        this.warningMessages = builder.warningMessages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportOASResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorMessages
     */
    public ErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    /**
     * @return failedApis
     */
    public FailedApis getFailedApis() {
        return this.failedApis;
    }

    /**
     * @return failedModels
     */
    public FailedModels getFailedModels() {
        return this.failedModels;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successApis
     */
    public SuccessApis getSuccessApis() {
        return this.successApis;
    }

    /**
     * @return successModels
     */
    public SuccessModels getSuccessModels() {
        return this.successModels;
    }

    /**
     * @return warningMessages
     */
    public WarningMessages getWarningMessages() {
        return this.warningMessages;
    }

    public static final class Builder {
        private ErrorMessages errorMessages; 
        private FailedApis failedApis; 
        private FailedModels failedModels; 
        private String operationId; 
        private String requestId; 
        private SuccessApis successApis; 
        private SuccessModels successModels; 
        private WarningMessages warningMessages; 

        /**
         * <p>The error messages that appear due to the invalid data in the imported file.</p>
         */
        public Builder errorMessages(ErrorMessages errorMessages) {
            this.errorMessages = errorMessages;
            return this;
        }

        /**
         * <p>The APIs that failed to pass the precheck.</p>
         */
        public Builder failedApis(FailedApis failedApis) {
            this.failedApis = failedApis;
            return this;
        }

        /**
         * <p>The information about the models that failed to pass the precheck.</p>
         */
        public Builder failedModels(FailedModels failedModels) {
            this.failedModels = failedModels;
            return this;
        }

        /**
         * <p>The ID of the asynchronous API import task that was generated during the import operation. This ID is used to query the execution status of the API import task.</p>
         * 
         * <strong>example:</strong>
         * <p>c16a1880f5164d779f6a54f64d997cd9</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E7FE7172-AA75-5880-B6F7-C00893E9BC06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the APIs that have passed the precheck.</p>
         */
        public Builder successApis(SuccessApis successApis) {
            this.successApis = successApis;
            return this;
        }

        /**
         * <p>The information about the models that have passed the precheck.</p>
         */
        public Builder successModels(SuccessModels successModels) {
            this.successModels = successModels;
            return this;
        }

        /**
         * <p>The warning messages that appear due to the invalid data in the imported file.</p>
         */
        public Builder warningMessages(WarningMessages warningMessages) {
            this.warningMessages = warningMessages;
            return this;
        }

        public ImportOASResponseBody build() {
            return new ImportOASResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class ErrorMessages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private java.util.List<String> errorMessage;

        private ErrorMessages(Builder builder) {
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorMessages create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public java.util.List<String> getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private java.util.List<String> errorMessage; 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(java.util.List<String> errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public ErrorMessages build() {
                return new ErrorMessages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class FailedApi extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private FailedApi(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.httpMethod = builder.httpMethod;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedApi create() {
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
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Invalid Api Definition.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The HTTP method configured when you created the API.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The request path configured when you created the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/st1</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public FailedApi build() {
                return new FailedApi(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class FailedApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedApi")
        private java.util.List<FailedApi> failedApi;

        private FailedApis(Builder builder) {
            this.failedApi = builder.failedApi;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedApis create() {
            return builder().build();
        }

        /**
         * @return failedApi
         */
        public java.util.List<FailedApi> getFailedApi() {
            return this.failedApi;
        }

        public static final class Builder {
            private java.util.List<FailedApi> failedApi; 

            /**
             * FailedApi.
             */
            public Builder failedApi(java.util.List<FailedApi> failedApi) {
                this.failedApi = failedApi;
                return this;
            }

            public FailedApis build() {
                return new FailedApis(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class FailedModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        private FailedModel(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.groupId = builder.groupId;
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedModel create() {
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
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Invalid Model Definition.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>2c1bc62e19614cc68c6b0b484bc9c5db</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            public FailedModel build() {
                return new FailedModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class FailedModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedModel")
        private java.util.List<FailedModel> failedModel;

        private FailedModels(Builder builder) {
            this.failedModel = builder.failedModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedModels create() {
            return builder().build();
        }

        /**
         * @return failedModel
         */
        public java.util.List<FailedModel> getFailedModel() {
            return this.failedModel;
        }

        public static final class Builder {
            private java.util.List<FailedModel> failedModel; 

            /**
             * FailedModel.
             */
            public Builder failedModel(java.util.List<FailedModel> failedModel) {
                this.failedModel = failedModel;
                return this;
            }

            public FailedModels build() {
                return new FailedModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class SuccessApi extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiOperation")
        private String apiOperation;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private SuccessApi(Builder builder) {
            this.apiId = builder.apiId;
            this.apiOperation = builder.apiOperation;
            this.httpMethod = builder.httpMethod;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessApi create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiOperation
         */
        public String getApiOperation() {
            return this.apiOperation;
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
            private String apiId; 
            private String apiOperation; 
            private String httpMethod; 
            private String path; 

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>92af1abffc2443eaa2b815fdbd9c13f1</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>Indicates that the operation is CREATE or MODIFY.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder apiOperation(String apiOperation) {
                this.apiOperation = apiOperation;
                return this;
            }

            /**
             * <p>The HTTP method configured when you created the API.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The request path configured when you created the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/st1</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public SuccessApi build() {
                return new SuccessApi(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class SuccessApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SuccessApi")
        private java.util.List<SuccessApi> successApi;

        private SuccessApis(Builder builder) {
            this.successApi = builder.successApi;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessApis create() {
            return builder().build();
        }

        /**
         * @return successApi
         */
        public java.util.List<SuccessApi> getSuccessApi() {
            return this.successApi;
        }

        public static final class Builder {
            private java.util.List<SuccessApi> successApi; 

            /**
             * SuccessApi.
             */
            public Builder successApi(java.util.List<SuccessApi> successApi) {
                this.successApi = successApi;
                return this;
            }

            public SuccessApis build() {
                return new SuccessApis(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class SuccessModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelOperation")
        private String modelOperation;

        @com.aliyun.core.annotation.NameInMap("ModelUid")
        private String modelUid;

        private SuccessModel(Builder builder) {
            this.groupId = builder.groupId;
            this.modelName = builder.modelName;
            this.modelOperation = builder.modelOperation;
            this.modelUid = builder.modelUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessModel create() {
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
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>feaccf67040643bcbdedb253e59eb527</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The operation of the model. Valid values: CREATE and MODIFY.</p>
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
             * <p>1r4efwee19614cc68c6b0b484bc9c5dbs</p>
             */
            public Builder modelUid(String modelUid) {
                this.modelUid = modelUid;
                return this;
            }

            public SuccessModel build() {
                return new SuccessModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class SuccessModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SuccessModel")
        private java.util.List<SuccessModel> successModel;

        private SuccessModels(Builder builder) {
            this.successModel = builder.successModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessModels create() {
            return builder().build();
        }

        /**
         * @return successModel
         */
        public java.util.List<SuccessModel> getSuccessModel() {
            return this.successModel;
        }

        public static final class Builder {
            private java.util.List<SuccessModel> successModel; 

            /**
             * SuccessModel.
             */
            public Builder successModel(java.util.List<SuccessModel> successModel) {
                this.successModel = successModel;
                return this;
            }

            public SuccessModels build() {
                return new SuccessModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImportOASResponseBody} extends {@link TeaModel}
     *
     * <p>ImportOASResponseBody</p>
     */
    public static class WarningMessages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WarningMessage")
        private java.util.List<String> warningMessage;

        private WarningMessages(Builder builder) {
            this.warningMessage = builder.warningMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningMessages create() {
            return builder().build();
        }

        /**
         * @return warningMessage
         */
        public java.util.List<String> getWarningMessage() {
            return this.warningMessage;
        }

        public static final class Builder {
            private java.util.List<String> warningMessage; 

            /**
             * WarningMessage.
             */
            public Builder warningMessage(java.util.List<String> warningMessage) {
                this.warningMessage = warningMessage;
                return this;
            }

            public WarningMessages build() {
                return new WarningMessages(this);
            } 

        } 

    }
}
