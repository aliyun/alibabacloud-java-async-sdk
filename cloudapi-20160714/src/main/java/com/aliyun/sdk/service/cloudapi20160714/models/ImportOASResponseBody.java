// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportOASResponseBody} extends {@link TeaModel}
 *
 * <p>ImportOASResponseBody</p>
 */
public class ImportOASResponseBody extends TeaModel {
    @NameInMap("ErrorMessages")
    private ErrorMessages errorMessages;

    @NameInMap("FailedApis")
    private FailedApis failedApis;

    @NameInMap("FailedModels")
    private FailedModels failedModels;

    @NameInMap("OperationId")
    private String operationId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessApis")
    private SuccessApis successApis;

    @NameInMap("SuccessModels")
    private SuccessModels successModels;

    @NameInMap("WarningMessages")
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
         * ErrorMessages.
         */
        public Builder errorMessages(ErrorMessages errorMessages) {
            this.errorMessages = errorMessages;
            return this;
        }

        /**
         * FailedApis.
         */
        public Builder failedApis(FailedApis failedApis) {
            this.failedApis = failedApis;
            return this;
        }

        /**
         * FailedModels.
         */
        public Builder failedModels(FailedModels failedModels) {
            this.failedModels = failedModels;
            return this;
        }

        /**
         * OperationId.
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
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
         * SuccessApis.
         */
        public Builder successApis(SuccessApis successApis) {
            this.successApis = successApis;
            return this;
        }

        /**
         * SuccessModels.
         */
        public Builder successModels(SuccessModels successModels) {
            this.successModels = successModels;
            return this;
        }

        /**
         * WarningMessages.
         */
        public Builder warningMessages(WarningMessages warningMessages) {
            this.warningMessages = warningMessages;
            return this;
        }

        public ImportOASResponseBody build() {
            return new ImportOASResponseBody(this);
        } 

    } 

    public static class ErrorMessages extends TeaModel {
        @NameInMap("ErrorMessage")
        private java.util.List < String > errorMessage;

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
        public java.util.List < String > getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private java.util.List < String > errorMessage; 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(java.util.List < String > errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public ErrorMessages build() {
                return new ErrorMessages(this);
            } 

        } 

    }
    public static class FailedApi extends TeaModel {
        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("Path")
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
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * HttpMethod.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * Path.
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
    public static class FailedApis extends TeaModel {
        @NameInMap("FailedApi")
        private java.util.List < FailedApi> failedApi;

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
        public java.util.List < FailedApi> getFailedApi() {
            return this.failedApi;
        }

        public static final class Builder {
            private java.util.List < FailedApi> failedApi; 

            /**
             * FailedApi.
             */
            public Builder failedApi(java.util.List < FailedApi> failedApi) {
                this.failedApi = failedApi;
                return this;
            }

            public FailedApis build() {
                return new FailedApis(this);
            } 

        } 

    }
    public static class FailedModel extends TeaModel {
        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModelName")
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
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
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
             * ModelName.
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
    public static class FailedModels extends TeaModel {
        @NameInMap("FailedModel")
        private java.util.List < FailedModel> failedModel;

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
        public java.util.List < FailedModel> getFailedModel() {
            return this.failedModel;
        }

        public static final class Builder {
            private java.util.List < FailedModel> failedModel; 

            /**
             * FailedModel.
             */
            public Builder failedModel(java.util.List < FailedModel> failedModel) {
                this.failedModel = failedModel;
                return this;
            }

            public FailedModels build() {
                return new FailedModels(this);
            } 

        } 

    }
    public static class SuccessApi extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiOperation")
        private String apiOperation;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("Path")
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
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiOperation.
             */
            public Builder apiOperation(String apiOperation) {
                this.apiOperation = apiOperation;
                return this;
            }

            /**
             * HttpMethod.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * Path.
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
    public static class SuccessApis extends TeaModel {
        @NameInMap("SuccessApi")
        private java.util.List < SuccessApi> successApi;

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
        public java.util.List < SuccessApi> getSuccessApi() {
            return this.successApi;
        }

        public static final class Builder {
            private java.util.List < SuccessApi> successApi; 

            /**
             * SuccessApi.
             */
            public Builder successApi(java.util.List < SuccessApi> successApi) {
                this.successApi = successApi;
                return this;
            }

            public SuccessApis build() {
                return new SuccessApis(this);
            } 

        } 

    }
    public static class SuccessModel extends TeaModel {
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("ModelOperation")
        private String modelOperation;

        @NameInMap("ModelUid")
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
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
             * ModelOperation.
             */
            public Builder modelOperation(String modelOperation) {
                this.modelOperation = modelOperation;
                return this;
            }

            /**
             * ModelUid.
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
    public static class SuccessModels extends TeaModel {
        @NameInMap("SuccessModel")
        private java.util.List < SuccessModel> successModel;

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
        public java.util.List < SuccessModel> getSuccessModel() {
            return this.successModel;
        }

        public static final class Builder {
            private java.util.List < SuccessModel> successModel; 

            /**
             * SuccessModel.
             */
            public Builder successModel(java.util.List < SuccessModel> successModel) {
                this.successModel = successModel;
                return this;
            }

            public SuccessModels build() {
                return new SuccessModels(this);
            } 

        } 

    }
    public static class WarningMessages extends TeaModel {
        @NameInMap("WarningMessage")
        private java.util.List < String > warningMessage;

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
        public java.util.List < String > getWarningMessage() {
            return this.warningMessage;
        }

        public static final class Builder {
            private java.util.List < String > warningMessage; 

            /**
             * WarningMessage.
             */
            public Builder warningMessage(java.util.List < String > warningMessage) {
                this.warningMessage = warningMessage;
                return this;
            }

            public WarningMessages build() {
                return new WarningMessages(this);
            } 

        } 

    }
}
