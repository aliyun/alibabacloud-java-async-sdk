// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionInstanceResponseBody</p>
 */
public class GetFunctionInstanceResponseBody extends TeaModel {
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

    private GetFunctionInstanceResponseBody(Builder builder) {
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

    public static GetFunctionInstanceResponseBody create() {
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

        public GetFunctionInstanceResponseBody build() {
            return new GetFunctionInstanceResponseBody(this);
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Language.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
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
    public static class Task extends TeaModel {
        @NameInMap("DagStatus")
        private String dagStatus;

        @NameInMap("LastRunTime")
        private Long lastRunTime;

        private Task(Builder builder) {
            this.dagStatus = builder.dagStatus;
            this.lastRunTime = builder.lastRunTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return dagStatus
         */
        public String getDagStatus() {
            return this.dagStatus;
        }

        /**
         * @return lastRunTime
         */
        public Long getLastRunTime() {
            return this.lastRunTime;
        }

        public static final class Builder {
            private String dagStatus; 
            private Long lastRunTime; 

            /**
             * DagStatus.
             */
            public Builder dagStatus(String dagStatus) {
                this.dagStatus = dagStatus;
                return this;
            }

            /**
             * LastRunTime.
             */
            public Builder lastRunTime(Long lastRunTime) {
                this.lastRunTime = lastRunTime;
                return this;
            }

            public Task build() {
                return new Task(this);
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

        @NameInMap("Task")
        private Task task;

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
            this.task = builder.task;
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
         * @return task
         */
        public Task getTask() {
            return this.task;
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
            private Task task; 
            private Long versionId; 

            /**
             * Belongs.
             */
            public Builder belongs(Belongs belongs) {
                this.belongs = belongs;
                return this;
            }

            /**
             * CreateParameters.
             */
            public Builder createParameters(java.util.List < CreateParameters> createParameters) {
                this.createParameters = createParameters;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Cron.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Task.
             */
            public Builder task(Task task) {
                this.task = task;
                return this;
            }

            /**
             * VersionId.
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
