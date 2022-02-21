// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionVersionResponseBody</p>
 */
public class GetFunctionVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpCode")
    private Long httpCode;

    @NameInMap("Latency")
    private Long latency;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Status")
    private String status;

    private GetFunctionVersionResponseBody(Builder builder) {
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

    public static GetFunctionVersionResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * Latency.
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetFunctionVersionResponseBody build() {
            return new GetFunctionVersionResponseBody(this);
        } 

    } 

    public static class CreateParameters extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Required")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
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
        @NameInMap("Condition")
        private String condition;

        @NameInMap("Dependency")
        private String dependency;

        @NameInMap("Description")
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
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Dependency.
             */
            public Builder dependency(String dependency) {
                this.dependency = dependency;
                return this;
            }

            /**
             * Description.
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
        @NameInMap("Name")
        private String name;

        @NameInMap("Required")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
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
        @NameInMap("CreateParameters")
        private java.util.List < CreateParameters> createParameters;

        @NameInMap("Depends")
        private java.util.List < Depends> depends;

        @NameInMap("UsageParameters")
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
             * CreateParameters.
             */
            public Builder createParameters(java.util.List < CreateParameters> createParameters) {
                this.createParameters = createParameters;
                return this;
            }

            /**
             * Depends.
             */
            public Builder depends(java.util.List < Depends> depends) {
                this.depends = depends;
                return this;
            }

            /**
             * UsageParameters.
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
        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("FunctionType")
        private String functionType;

        @NameInMap("ModelType")
        private String modelType;

        @NameInMap("VersionConfig")
        private VersionConfig versionConfig;

        @NameInMap("VersionId")
        private Long versionId;

        @NameInMap("VersionName")
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
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * FunctionType.
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * VersionConfig.
             */
            public Builder versionConfig(VersionConfig versionConfig) {
                this.versionConfig = versionConfig;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionName.
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
