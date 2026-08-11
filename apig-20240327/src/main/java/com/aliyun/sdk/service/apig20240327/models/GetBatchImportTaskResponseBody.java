// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchImportTaskResponseBody</p>
 */
public class GetBatchImportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetBatchImportTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchImportTaskResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetBatchImportTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CE534E1D-FCE4-5930-B784-E055EC1AEE6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBatchImportTaskResponseBody build() {
            return new GetBatchImportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class VersionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("headerName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("queryName")
        private String queryName;

        @com.aliyun.core.annotation.NameInMap("scheme")
        private String scheme;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private VersionInfo(Builder builder) {
            this.enable = builder.enable;
            this.headerName = builder.headerName;
            this.queryName = builder.queryName;
            this.scheme = builder.scheme;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionInfo create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return queryName
         */
        public String getQueryName() {
            return this.queryName;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean enable; 
            private String headerName; 
            private String queryName; 
            private String scheme; 
            private String version; 

            private Builder() {
            } 

            private Builder(VersionInfo model) {
                this.enable = model.enable;
                this.headerName = model.headerName;
                this.queryName = model.queryName;
                this.scheme = model.scheme;
                this.version = model.version;
            } 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * headerName.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * queryName.
             */
            public Builder queryName(String queryName) {
                this.queryName = queryName;
                return this;
            }

            /**
             * scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionInfo build() {
                return new VersionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class ExistHttpApiInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("basePath")
        private String basePath;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("httpApiId")
        private String httpApiId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("versionInfo")
        private VersionInfo versionInfo;

        private ExistHttpApiInfo(Builder builder) {
            this.basePath = builder.basePath;
            this.gatewayId = builder.gatewayId;
            this.httpApiId = builder.httpApiId;
            this.name = builder.name;
            this.type = builder.type;
            this.versionInfo = builder.versionInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExistHttpApiInfo create() {
            return builder().build();
        }

        /**
         * @return basePath
         */
        public String getBasePath() {
            return this.basePath;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return httpApiId
         */
        public String getHttpApiId() {
            return this.httpApiId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return versionInfo
         */
        public VersionInfo getVersionInfo() {
            return this.versionInfo;
        }

        public static final class Builder {
            private String basePath; 
            private String gatewayId; 
            private String httpApiId; 
            private String name; 
            private String type; 
            private VersionInfo versionInfo; 

            private Builder() {
            } 

            private Builder(ExistHttpApiInfo model) {
                this.basePath = model.basePath;
                this.gatewayId = model.gatewayId;
                this.httpApiId = model.httpApiId;
                this.name = model.name;
                this.type = model.type;
                this.versionInfo = model.versionInfo;
            } 

            /**
             * basePath.
             */
            public Builder basePath(String basePath) {
                this.basePath = basePath;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>HTTP API ID。</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxx</p>
             */
            public Builder httpApiId(String httpApiId) {
                this.httpApiId = httpApiId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * versionInfo.
             */
            public Builder versionInfo(VersionInfo versionInfo) {
                this.versionInfo = versionInfo;
                return this;
            }

            public ExistHttpApiInfo build() {
                return new ExistHttpApiInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class FailureComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private FailureComponents(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureComponents create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String errorMessage; 
            private String name; 

            private Builder() {
            } 

            private Builder(FailureComponents model) {
                this.errorMessage = model.errorMessage;
                this.name = model.name;
            } 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FailureComponents build() {
                return new FailureComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class FailureOperations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private FailureOperations(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.method = builder.method;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureOperations create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
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

        public static final class Builder {
            private String errorMessage; 
            private String method; 
            private String path; 

            private Builder() {
            } 

            private Builder(FailureOperations model) {
                this.errorMessage = model.errorMessage;
                this.method = model.method;
                this.path = model.path;
            } 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public FailureOperations build() {
                return new FailureOperations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class FailureRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private FailureRoutes(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureRoutes create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String errorMessage; 
            private String name; 

            private Builder() {
            } 

            private Builder(FailureRoutes model) {
                this.errorMessage = model.errorMessage;
                this.name = model.name;
            } 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FailureRoutes build() {
                return new FailureRoutes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class SuccessComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private SuccessComponents(Builder builder) {
            this.action = builder.action;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessComponents create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String action; 
            private String name; 

            private Builder() {
            } 

            private Builder(SuccessComponents model) {
                this.action = model.action;
                this.name = model.name;
            } 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SuccessComponents build() {
                return new SuccessComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class SuccessOperations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private SuccessOperations(Builder builder) {
            this.action = builder.action;
            this.method = builder.method;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessOperations create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String action; 
            private String method; 
            private String name; 
            private String path; 

            private Builder() {
            } 

            private Builder(SuccessOperations model) {
                this.action = model.action;
                this.method = model.method;
                this.name = model.name;
                this.path = model.path;
            } 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public SuccessOperations build() {
                return new SuccessOperations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class SuccessRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private SuccessRoutes(Builder builder) {
            this.action = builder.action;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessRoutes create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String action; 
            private String name; 

            private Builder() {
            } 

            private Builder(SuccessRoutes model) {
                this.action = model.action;
                this.name = model.name;
            } 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SuccessRoutes build() {
                return new SuccessRoutes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class DryRunInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessages")
        private java.util.List<String> errorMessages;

        @com.aliyun.core.annotation.NameInMap("existHttpApiInfo")
        private ExistHttpApiInfo existHttpApiInfo;

        @com.aliyun.core.annotation.NameInMap("failureComponents")
        private java.util.List<FailureComponents> failureComponents;

        @com.aliyun.core.annotation.NameInMap("failureOperations")
        private java.util.List<FailureOperations> failureOperations;

        @com.aliyun.core.annotation.NameInMap("failureRoutes")
        private java.util.List<FailureRoutes> failureRoutes;

        @com.aliyun.core.annotation.NameInMap("successComponents")
        private java.util.List<SuccessComponents> successComponents;

        @com.aliyun.core.annotation.NameInMap("successOperations")
        private java.util.List<SuccessOperations> successOperations;

        @com.aliyun.core.annotation.NameInMap("successRoutes")
        private java.util.List<SuccessRoutes> successRoutes;

        @com.aliyun.core.annotation.NameInMap("warningMessages")
        private java.util.List<String> warningMessages;

        private DryRunInfo(Builder builder) {
            this.errorMessages = builder.errorMessages;
            this.existHttpApiInfo = builder.existHttpApiInfo;
            this.failureComponents = builder.failureComponents;
            this.failureOperations = builder.failureOperations;
            this.failureRoutes = builder.failureRoutes;
            this.successComponents = builder.successComponents;
            this.successOperations = builder.successOperations;
            this.successRoutes = builder.successRoutes;
            this.warningMessages = builder.warningMessages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DryRunInfo create() {
            return builder().build();
        }

        /**
         * @return errorMessages
         */
        public java.util.List<String> getErrorMessages() {
            return this.errorMessages;
        }

        /**
         * @return existHttpApiInfo
         */
        public ExistHttpApiInfo getExistHttpApiInfo() {
            return this.existHttpApiInfo;
        }

        /**
         * @return failureComponents
         */
        public java.util.List<FailureComponents> getFailureComponents() {
            return this.failureComponents;
        }

        /**
         * @return failureOperations
         */
        public java.util.List<FailureOperations> getFailureOperations() {
            return this.failureOperations;
        }

        /**
         * @return failureRoutes
         */
        public java.util.List<FailureRoutes> getFailureRoutes() {
            return this.failureRoutes;
        }

        /**
         * @return successComponents
         */
        public java.util.List<SuccessComponents> getSuccessComponents() {
            return this.successComponents;
        }

        /**
         * @return successOperations
         */
        public java.util.List<SuccessOperations> getSuccessOperations() {
            return this.successOperations;
        }

        /**
         * @return successRoutes
         */
        public java.util.List<SuccessRoutes> getSuccessRoutes() {
            return this.successRoutes;
        }

        /**
         * @return warningMessages
         */
        public java.util.List<String> getWarningMessages() {
            return this.warningMessages;
        }

        public static final class Builder {
            private java.util.List<String> errorMessages; 
            private ExistHttpApiInfo existHttpApiInfo; 
            private java.util.List<FailureComponents> failureComponents; 
            private java.util.List<FailureOperations> failureOperations; 
            private java.util.List<FailureRoutes> failureRoutes; 
            private java.util.List<SuccessComponents> successComponents; 
            private java.util.List<SuccessOperations> successOperations; 
            private java.util.List<SuccessRoutes> successRoutes; 
            private java.util.List<String> warningMessages; 

            private Builder() {
            } 

            private Builder(DryRunInfo model) {
                this.errorMessages = model.errorMessages;
                this.existHttpApiInfo = model.existHttpApiInfo;
                this.failureComponents = model.failureComponents;
                this.failureOperations = model.failureOperations;
                this.failureRoutes = model.failureRoutes;
                this.successComponents = model.successComponents;
                this.successOperations = model.successOperations;
                this.successRoutes = model.successRoutes;
                this.warningMessages = model.warningMessages;
            } 

            /**
             * errorMessages.
             */
            public Builder errorMessages(java.util.List<String> errorMessages) {
                this.errorMessages = errorMessages;
                return this;
            }

            /**
             * existHttpApiInfo.
             */
            public Builder existHttpApiInfo(ExistHttpApiInfo existHttpApiInfo) {
                this.existHttpApiInfo = existHttpApiInfo;
                return this;
            }

            /**
             * failureComponents.
             */
            public Builder failureComponents(java.util.List<FailureComponents> failureComponents) {
                this.failureComponents = failureComponents;
                return this;
            }

            /**
             * failureOperations.
             */
            public Builder failureOperations(java.util.List<FailureOperations> failureOperations) {
                this.failureOperations = failureOperations;
                return this;
            }

            /**
             * failureRoutes.
             */
            public Builder failureRoutes(java.util.List<FailureRoutes> failureRoutes) {
                this.failureRoutes = failureRoutes;
                return this;
            }

            /**
             * successComponents.
             */
            public Builder successComponents(java.util.List<SuccessComponents> successComponents) {
                this.successComponents = successComponents;
                return this;
            }

            /**
             * successOperations.
             */
            public Builder successOperations(java.util.List<SuccessOperations> successOperations) {
                this.successOperations = successOperations;
                return this;
            }

            /**
             * successRoutes.
             */
            public Builder successRoutes(java.util.List<SuccessRoutes> successRoutes) {
                this.successRoutes = successRoutes;
                return this;
            }

            /**
             * warningMessages.
             */
            public Builder warningMessages(java.util.List<String> warningMessages) {
                this.warningMessages = warningMessages;
                return this;
            }

            public DryRunInfo build() {
                return new DryRunInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class DryRunResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("dryRunInfo")
        private DryRunInfo dryRunInfo;

        @com.aliyun.core.annotation.NameInMap("error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        private DryRunResults(Builder builder) {
            this.apiName = builder.apiName;
            this.dryRunInfo = builder.dryRunInfo;
            this.error = builder.error;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DryRunResults create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return dryRunInfo
         */
        public DryRunInfo getDryRunInfo() {
            return this.dryRunInfo;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String apiName; 
            private DryRunInfo dryRunInfo; 
            private String error; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(DryRunResults model) {
                this.apiName = model.apiName;
                this.dryRunInfo = model.dryRunInfo;
                this.error = model.error;
                this.fileName = model.fileName;
            } 

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * dryRunInfo.
             */
            public Builder dryRunInfo(DryRunInfo dryRunInfo) {
                this.dryRunInfo = dryRunInfo;
                return this;
            }

            /**
             * error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public DryRunResults build() {
                return new DryRunResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class FailureItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        private FailureItems(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.errorMessage = builder.errorMessage;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureItems create() {
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
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String errorMessage; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(FailureItems model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.errorMessage = model.errorMessage;
                this.fileName = model.fileName;
            } 

            /**
             * <p>API ID。</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxx</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public FailureItems build() {
                return new FailureItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class SpecOssConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("objectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private SpecOssConfig(Builder builder) {
            this.bucketName = builder.bucketName;
            this.objectKey = builder.objectKey;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecOssConfig create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String bucketName; 
            private String objectKey; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(SpecOssConfig model) {
                this.bucketName = model.bucketName;
                this.objectKey = model.objectKey;
                this.regionId = model.regionId;
            } 

            /**
             * bucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>OSS Object Key。</p>
             * 
             * <strong>example:</strong>
             * <p>imports/batch.zip</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SpecOssConfig build() {
                return new SpecOssConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class ImportRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowUpdate")
        private Boolean allowUpdate;

        @com.aliyun.core.annotation.NameInMap("apiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("dryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("specFileUrl")
        private String specFileUrl;

        @com.aliyun.core.annotation.NameInMap("specOssConfig")
        private SpecOssConfig specOssConfig;

        @com.aliyun.core.annotation.NameInMap("strategy")
        private String strategy;

        @com.aliyun.core.annotation.NameInMap("withGatewayExtension")
        private Boolean withGatewayExtension;

        private ImportRequest(Builder builder) {
            this.allowUpdate = builder.allowUpdate;
            this.apiType = builder.apiType;
            this.dryRun = builder.dryRun;
            this.gatewayId = builder.gatewayId;
            this.resourceGroupId = builder.resourceGroupId;
            this.specFileUrl = builder.specFileUrl;
            this.specOssConfig = builder.specOssConfig;
            this.strategy = builder.strategy;
            this.withGatewayExtension = builder.withGatewayExtension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportRequest create() {
            return builder().build();
        }

        /**
         * @return allowUpdate
         */
        public Boolean getAllowUpdate() {
            return this.allowUpdate;
        }

        /**
         * @return apiType
         */
        public String getApiType() {
            return this.apiType;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return specFileUrl
         */
        public String getSpecFileUrl() {
            return this.specFileUrl;
        }

        /**
         * @return specOssConfig
         */
        public SpecOssConfig getSpecOssConfig() {
            return this.specOssConfig;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        /**
         * @return withGatewayExtension
         */
        public Boolean getWithGatewayExtension() {
            return this.withGatewayExtension;
        }

        public static final class Builder {
            private Boolean allowUpdate; 
            private String apiType; 
            private Boolean dryRun; 
            private String gatewayId; 
            private String resourceGroupId; 
            private String specFileUrl; 
            private SpecOssConfig specOssConfig; 
            private String strategy; 
            private Boolean withGatewayExtension; 

            private Builder() {
            } 

            private Builder(ImportRequest model) {
                this.allowUpdate = model.allowUpdate;
                this.apiType = model.apiType;
                this.dryRun = model.dryRun;
                this.gatewayId = model.gatewayId;
                this.resourceGroupId = model.resourceGroupId;
                this.specFileUrl = model.specFileUrl;
                this.specOssConfig = model.specOssConfig;
                this.strategy = model.strategy;
                this.withGatewayExtension = model.withGatewayExtension;
            } 

            /**
             * allowUpdate.
             */
            public Builder allowUpdate(Boolean allowUpdate) {
                this.allowUpdate = allowUpdate;
                return this;
            }

            /**
             * apiType.
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * dryRun.
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * specFileUrl.
             */
            public Builder specFileUrl(String specFileUrl) {
                this.specFileUrl = specFileUrl;
                return this;
            }

            /**
             * specOssConfig.
             */
            public Builder specOssConfig(SpecOssConfig specOssConfig) {
                this.specOssConfig = specOssConfig;
                return this;
            }

            /**
             * strategy.
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * withGatewayExtension.
             */
            public Builder withGatewayExtension(Boolean withGatewayExtension) {
                this.withGatewayExtension = withGatewayExtension;
                return this;
            }

            public ImportRequest build() {
                return new ImportRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class SuccessItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        private SuccessItems(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.errorMessage = builder.errorMessage;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessItems create() {
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
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String errorMessage; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(SuccessItems model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.errorMessage = model.errorMessage;
                this.fileName = model.fileName;
            } 

            /**
             * <p>API ID。</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxx</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public SuccessItems build() {
                return new SuccessItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("dryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("dryRunResults")
        private java.util.List<DryRunResults> dryRunResults;

        @com.aliyun.core.annotation.NameInMap("failureItems")
        private java.util.List<FailureItems> failureItems;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("importRequest")
        private ImportRequest importRequest;

        @com.aliyun.core.annotation.NameInMap("successItems")
        private java.util.List<SuccessItems> successItems;

        private Result(Builder builder) {
            this.apiType = builder.apiType;
            this.dryRun = builder.dryRun;
            this.dryRunResults = builder.dryRunResults;
            this.failureItems = builder.failureItems;
            this.gatewayId = builder.gatewayId;
            this.importRequest = builder.importRequest;
            this.successItems = builder.successItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return apiType
         */
        public String getApiType() {
            return this.apiType;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return dryRunResults
         */
        public java.util.List<DryRunResults> getDryRunResults() {
            return this.dryRunResults;
        }

        /**
         * @return failureItems
         */
        public java.util.List<FailureItems> getFailureItems() {
            return this.failureItems;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return importRequest
         */
        public ImportRequest getImportRequest() {
            return this.importRequest;
        }

        /**
         * @return successItems
         */
        public java.util.List<SuccessItems> getSuccessItems() {
            return this.successItems;
        }

        public static final class Builder {
            private String apiType; 
            private Boolean dryRun; 
            private java.util.List<DryRunResults> dryRunResults; 
            private java.util.List<FailureItems> failureItems; 
            private String gatewayId; 
            private ImportRequest importRequest; 
            private java.util.List<SuccessItems> successItems; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.apiType = model.apiType;
                this.dryRun = model.dryRun;
                this.dryRunResults = model.dryRunResults;
                this.failureItems = model.failureItems;
                this.gatewayId = model.gatewayId;
                this.importRequest = model.importRequest;
                this.successItems = model.successItems;
            } 

            /**
             * apiType.
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * dryRun.
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * dryRunResults.
             */
            public Builder dryRunResults(java.util.List<DryRunResults> dryRunResults) {
                this.dryRunResults = dryRunResults;
                return this;
            }

            /**
             * failureItems.
             */
            public Builder failureItems(java.util.List<FailureItems> failureItems) {
                this.failureItems = failureItems;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * importRequest.
             */
            public Builder importRequest(ImportRequest importRequest) {
                this.importRequest = importRequest;
                return this;
            }

            /**
             * successItems.
             */
            public Builder successItems(java.util.List<SuccessItems> successItems) {
                this.successItems = successItems;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchImportTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("processedCount")
        private Integer processedCount;

        @com.aliyun.core.annotation.NameInMap("result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.errorMessage = builder.errorMessage;
            this.processedCount = builder.processedCount;
            this.result = builder.result;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return processedCount
         */
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
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
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String createTime; 
            private String errorMessage; 
            private Integer processedCount; 
            private Result result; 
            private String status; 
            private String taskId; 
            private String taskType; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.errorMessage = model.errorMessage;
                this.processedCount = model.processedCount;
                this.result = model.result;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.totalCount = model.totalCount;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * processedCount.
             */
            public Builder processedCount(Integer processedCount) {
                this.processedCount = processedCount;
                return this;
            }

            /**
             * result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * taskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
