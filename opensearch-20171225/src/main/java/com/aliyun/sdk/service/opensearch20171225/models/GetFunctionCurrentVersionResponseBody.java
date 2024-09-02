// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionCurrentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionCurrentVersionResponseBody</p>
 */
public class GetFunctionCurrentVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("Latency")
    private Long latency;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetFunctionCurrentVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.latency = builder.latency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionCurrentVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return latency
     */
    public Long getLatency() {
        return this.latency;
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

    public static final class Builder {
        private String code; 
        private Long httpCode; 
        private Long latency; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String status; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The time consumed for the request, in milliseconds.
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The result of the request.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * The status of the request.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetFunctionCurrentVersionResponseBody build() {
            return new GetFunctionCurrentVersionResponseBody(this);
        } 

    } 

    public static class CreateParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private String required;

        private CreateParameters(Builder builder) {
            this.name = builder.name;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String name; 
            private String required; 

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the parameter is required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            public CreateParameters build() {
                return new CreateParameters(this);
            } 

        } 

    }
    public static class Depends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Dependency")
        private String dependency;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private Depends(Builder builder) {
            this.condition = builder.condition;
            this.dependency = builder.dependency;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Depends create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return dependency
         */
        public String getDependency() {
            return this.dependency;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String condition; 
            private String dependency; 
            private String description; 

            /**
             * The condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * The dependency.
             */
            public Builder dependency(String dependency) {
                this.dependency = dependency;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Depends build() {
                return new Depends(this);
            } 

        } 

    }
    public static class UsageParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private String required;

        private UsageParameters(Builder builder) {
            this.name = builder.name;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String name; 
            private String required; 

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the parameter is required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            public UsageParameters build() {
                return new UsageParameters(this);
            } 

        } 

    }
    public static class VersionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateParameters")
        private java.util.List < CreateParameters> createParameters;

        @com.aliyun.core.annotation.NameInMap("Depends")
        private java.util.List < Depends> depends;

        @com.aliyun.core.annotation.NameInMap("UsageParameters")
        private java.util.List < UsageParameters> usageParameters;

        private VersionConfig(Builder builder) {
            this.createParameters = builder.createParameters;
            this.depends = builder.depends;
            this.usageParameters = builder.usageParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionConfig create() {
            return builder().build();
        }

        /**
         * @return createParameters
         */
        public java.util.List < CreateParameters> getCreateParameters() {
            return this.createParameters;
        }

        /**
         * @return depends
         */
        public java.util.List < Depends> getDepends() {
            return this.depends;
        }

        /**
         * @return usageParameters
         */
        public java.util.List < UsageParameters> getUsageParameters() {
            return this.usageParameters;
        }

        public static final class Builder {
            private java.util.List < CreateParameters> createParameters; 
            private java.util.List < Depends> depends; 
            private java.util.List < UsageParameters> usageParameters; 

            /**
             * The parameters that are used to create the instance.
             */
            public Builder createParameters(java.util.List < CreateParameters> createParameters) {
                this.createParameters = createParameters;
                return this;
            }

            /**
             * The dependencies of the instance.
             */
            public Builder depends(java.util.List < Depends> depends) {
                this.depends = depends;
                return this;
            }

            /**
             * The parameters that are used to use the instance online.
             */
            public Builder usageParameters(java.util.List < UsageParameters> usageParameters) {
                this.usageParameters = usageParameters;
                return this;
            }

            public VersionConfig build() {
                return new VersionConfig(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("FunctionType")
        private String functionType;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("VersionConfig")
        private VersionConfig versionConfig;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private Long versionId;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private Result(Builder builder) {
            this.functionName = builder.functionName;
            this.functionType = builder.functionType;
            this.modelType = builder.modelType;
            this.versionConfig = builder.versionConfig;
            this.versionId = builder.versionId;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return functionType
         */
        public String getFunctionType() {
            return this.functionType;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return versionConfig
         */
        public VersionConfig getVersionConfig() {
            return this.versionConfig;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String functionName; 
            private String functionType; 
            private String modelType; 
            private VersionConfig versionConfig; 
            private Long versionId; 
            private String versionName; 

            /**
             * The name of the feature.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The type of the feature. Valid values:
             * <p>
             * 
             * *   PAAS
             * *   SAAS
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * The type of the model.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * The configuration information about the instance.
             */
            public Builder versionConfig(VersionConfig versionConfig) {
                this.versionConfig = versionConfig;
                return this;
            }

            /**
             * The ID of the version.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * The name of the version.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
