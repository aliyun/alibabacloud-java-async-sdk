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
 * {@link ImportHttpApiResponseBody} extends {@link TeaModel}
 *
 * <p>ImportHttpApiResponseBody</p>
 */
public class ImportHttpApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ImportHttpApiResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportHttpApiResponseBody create() {
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

        private Builder(ImportHttpApiResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The API information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE857A85-251D-5018-8103-A38957D71E20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImportHttpApiResponseBody build() {
            return new ImportHttpApiResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImportHttpApiResponseBody} extends {@link TeaModel}
     *
     * <p>ImportHttpApiResponseBody</p>
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
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The data struct is incorrectly defined.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The data struct name.</p>
             * 
             * <strong>example:</strong>
             * <p>orderDTO</p>
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
     * {@link ImportHttpApiResponseBody} extends {@link TeaModel}
     *
     * <p>ImportHttpApiResponseBody</p>
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
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Missing response definition.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The HTTP method of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The operation path.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/orders</p>
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
     * {@link ImportHttpApiResponseBody} extends {@link TeaModel}
     *
     * <p>ImportHttpApiResponseBody</p>
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
             * <p>The action that will be performed for the data struct after the dry run.</p>
             * <ul>
             * <li>Create: The data struct is created.</li>
             * <li>Update: The data struct is updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The data struct name.</p>
             * 
             * <strong>example:</strong>
             * <p>userDTO</p>
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
     * {@link ImportHttpApiResponseBody} extends {@link TeaModel}
     *
     * <p>ImportHttpApiResponseBody</p>
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
             * <p>The action that will be performed for the operation after the dry run.</p>
             * <ul>
             * <li>Create: The operation is created.</li>
             * <li>Update: The operation is updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The HTTP method of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The operation name.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateUser</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operation path.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/users</p>
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
     * {@link ImportHttpApiResponseBody} extends {@link TeaModel}
     *
     * <p>ImportHttpApiResponseBody</p>
     */
    public static class DryRunInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessages")
        private java.util.List<String> errorMessages;

        @com.aliyun.core.annotation.NameInMap("existHttpApiInfo")
        private HttpApiApiInfo existHttpApiInfo;

        @com.aliyun.core.annotation.NameInMap("failureComponents")
        private java.util.List<FailureComponents> failureComponents;

        @com.aliyun.core.annotation.NameInMap("failureOperations")
        private java.util.List<FailureOperations> failureOperations;

        @com.aliyun.core.annotation.NameInMap("successComponents")
        private java.util.List<SuccessComponents> successComponents;

        @com.aliyun.core.annotation.NameInMap("successOperations")
        private java.util.List<SuccessOperations> successOperations;

        @com.aliyun.core.annotation.NameInMap("warningMessages")
        private java.util.List<String> warningMessages;

        private DryRunInfo(Builder builder) {
            this.errorMessages = builder.errorMessages;
            this.existHttpApiInfo = builder.existHttpApiInfo;
            this.failureComponents = builder.failureComponents;
            this.failureOperations = builder.failureOperations;
            this.successComponents = builder.successComponents;
            this.successOperations = builder.successOperations;
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
        public HttpApiApiInfo getExistHttpApiInfo() {
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
         * @return warningMessages
         */
        public java.util.List<String> getWarningMessages() {
            return this.warningMessages;
        }

        public static final class Builder {
            private java.util.List<String> errorMessages; 
            private HttpApiApiInfo existHttpApiInfo; 
            private java.util.List<FailureComponents> failureComponents; 
            private java.util.List<FailureOperations> failureOperations; 
            private java.util.List<SuccessComponents> successComponents; 
            private java.util.List<SuccessOperations> successOperations; 
            private java.util.List<String> warningMessages; 

            private Builder() {
            } 

            private Builder(DryRunInfo model) {
                this.errorMessages = model.errorMessages;
                this.existHttpApiInfo = model.existHttpApiInfo;
                this.failureComponents = model.failureComponents;
                this.failureOperations = model.failureOperations;
                this.successComponents = model.successComponents;
                this.successOperations = model.successOperations;
                this.warningMessages = model.warningMessages;
            } 

            /**
             * <p>The error messages. If an error message is returned, the API fails to be imported.</p>
             */
            public Builder errorMessages(java.util.List<String> errorMessages) {
                this.errorMessages = errorMessages;
                return this;
            }

            /**
             * <p>The existing APIs. If an existing API is returned, the import updates the existing API.</p>
             */
            public Builder existHttpApiInfo(HttpApiApiInfo existHttpApiInfo) {
                this.existHttpApiInfo = existHttpApiInfo;
                return this;
            }

            /**
             * <p>The data structs that fail the dry run.</p>
             */
            public Builder failureComponents(java.util.List<FailureComponents> failureComponents) {
                this.failureComponents = failureComponents;
                return this;
            }

            /**
             * <p>The operations that fail the dry run.</p>
             */
            public Builder failureOperations(java.util.List<FailureOperations> failureOperations) {
                this.failureOperations = failureOperations;
                return this;
            }

            /**
             * <p>The data structs that pass the dry run.</p>
             */
            public Builder successComponents(java.util.List<SuccessComponents> successComponents) {
                this.successComponents = successComponents;
                return this;
            }

            /**
             * <p>The operations that pass the dry run.</p>
             */
            public Builder successOperations(java.util.List<SuccessOperations> successOperations) {
                this.successOperations = successOperations;
                return this;
            }

            /**
             * <p>The alerts. If an alert is returned, specific operations or structs may fail to be imported.</p>
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
     * {@link ImportHttpApiResponseBody} extends {@link TeaModel}
     *
     * <p>ImportHttpApiResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dryRunInfo")
        private DryRunInfo dryRunInfo;

        @com.aliyun.core.annotation.NameInMap("httpApiId")
        private String httpApiId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Data(Builder builder) {
            this.dryRunInfo = builder.dryRunInfo;
            this.httpApiId = builder.httpApiId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dryRunInfo
         */
        public DryRunInfo getDryRunInfo() {
            return this.dryRunInfo;
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

        public static final class Builder {
            private DryRunInfo dryRunInfo; 
            private String httpApiId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dryRunInfo = model.dryRunInfo;
                this.httpApiId = model.httpApiId;
                this.name = model.name;
            } 

            /**
             * <p>The dry run result.</p>
             */
            public Builder dryRunInfo(DryRunInfo dryRunInfo) {
                this.dryRunInfo = dryRunInfo;
                return this;
            }

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxx</p>
             */
            public Builder httpApiId(String httpApiId) {
                this.httpApiId = httpApiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>import-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
