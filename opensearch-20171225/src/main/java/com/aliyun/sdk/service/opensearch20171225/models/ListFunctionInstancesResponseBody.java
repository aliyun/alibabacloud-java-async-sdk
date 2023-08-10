// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionInstancesResponseBody</p>
 */
public class ListFunctionInstancesResponseBody extends TeaModel {
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
    private java.util.List < Result> result;

    @NameInMap("Status")
    private String status;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListFunctionInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.latency = builder.latency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionInstancesResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Long httpCode; 
        private Long latency; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private String status; 
        private Long totalCount; 

        /**
         * The error code. If no error occurs, the parameter is left empty.
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
         * The error message. If no error occurs, the parameter is left empty.
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
         * The information about the instances.
         */
        public Builder result(java.util.List < Result> result) {
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

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFunctionInstancesResponseBody build() {
            return new ListFunctionInstancesResponseBody(this);
        } 

    } 

    public static class Belongs extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Language")
        private String language;

        private Belongs(Builder builder) {
            this.category = builder.category;
            this.domain = builder.domain;
            this.language = builder.language;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Belongs create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private String category; 
            private String domain; 
            private String language; 

            /**
             * The category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The industry.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The abbreviation of the language that applies.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public Belongs build() {
                return new Belongs(this);
            } 

        } 

    }
    public static class CreateParameters extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private CreateParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CreateParameters build() {
                return new CreateParameters(this);
            } 

        } 

    }
    public static class UsageParameters extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private UsageParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UsageParameters build() {
                return new UsageParameters(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Belongs")
        private Belongs belongs;

        @NameInMap("CreateParameters")
        private java.util.List < CreateParameters> createParameters;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Cron")
        private String cron;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExtendInfo")
        private String extendInfo;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("FunctionType")
        private String functionType;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("ModelType")
        private String modelType;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private String status;

        @NameInMap("UsageParameters")
        private java.util.List < UsageParameters> usageParameters;

        @NameInMap("VersionId")
        private Long versionId;

        private Result(Builder builder) {
            this.belongs = builder.belongs;
            this.createParameters = builder.createParameters;
            this.createTime = builder.createTime;
            this.cron = builder.cron;
            this.description = builder.description;
            this.extendInfo = builder.extendInfo;
            this.functionName = builder.functionName;
            this.functionType = builder.functionType;
            this.instanceName = builder.instanceName;
            this.modelType = builder.modelType;
            this.source = builder.source;
            this.status = builder.status;
            this.usageParameters = builder.usageParameters;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return belongs
         */
        public Belongs getBelongs() {
            return this.belongs;
        }

        /**
         * @return createParameters
         */
        public java.util.List < CreateParameters> getCreateParameters() {
            return this.createParameters;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usageParameters
         */
        public java.util.List < UsageParameters> getUsageParameters() {
            return this.usageParameters;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Belongs belongs; 
            private java.util.List < CreateParameters> createParameters; 
            private Long createTime; 
            private String cron; 
            private String description; 
            private String extendInfo; 
            private String functionName; 
            private String functionType; 
            private String instanceName; 
            private String modelType; 
            private String source; 
            private String status; 
            private java.util.List < UsageParameters> usageParameters; 
            private Long versionId; 

            /**
             * The information about the instance.
             */
            public Builder belongs(Belongs belongs) {
                this.belongs = belongs;
                return this;
            }

            /**
             * The parameters of the instance.
             */
            public Builder createParameters(java.util.List < CreateParameters> createParameters) {
                this.createParameters = createParameters;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The cron expression used to schedule training, in the format of (Minutes Hours DayofMonth Month DayofWeek). If the value is empty, it indicates that no periodic training is performed.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The extended information, which is a JSON string. It includes model evaluation information and error information.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * The name of the feature.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The type of the feature.
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * How the instance is created. Valid values:
             * <p>
             * 
             * *   user: The instance is created by user.
             * *   builtin: The instance is created by system.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The state of the instance. Valid values:
             * <p>
             * 
             * 1.  unavailable: No model is available. Models must be trained before you can use them.
             * 2.  available: Models can be used.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The parameters that are used.
             */
            public Builder usageParameters(java.util.List < UsageParameters> usageParameters) {
                this.usageParameters = usageParameters;
                return this;
            }

            /**
             * The ID of the version.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
