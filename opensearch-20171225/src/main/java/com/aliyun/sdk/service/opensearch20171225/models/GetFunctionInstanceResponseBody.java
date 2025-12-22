// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link GetFunctionInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionInstanceResponseBody</p>
 */
public class GetFunctionInstanceResponseBody extends TeaModel {
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

        private Builder() {
        } 

        private Builder(GetFunctionInstanceResponseBody model) {
            this.code = model.code;
            this.httpCode = model.httpCode;
            this.latency = model.latency;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * <p>The error code. If no error occurs, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance.NotExist</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The time consumed for the request, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instance not exist.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>68ED4E1B-92B8-5821-A886-9C90686139EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The status of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetFunctionInstanceResponseBody build() {
            return new GetFunctionInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFunctionInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetFunctionInstanceResponseBody</p>
     */
    public static class Belongs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Language")
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

            private Builder() {
            } 

            private Builder(Belongs model) {
                this.category = model.category;
                this.domain = model.domain;
                this.language = model.language;
            } 

            /**
             * <p>The category.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The industry.</p>
             * 
             * <strong>example:</strong>
             * <p>ecommerce</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The abbreviation of the language that applies.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
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
    /**
     * 
     * {@link GetFunctionInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetFunctionInstanceResponseBody</p>
     */
    public static class CreateParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(CreateParameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link GetFunctionInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetFunctionInstanceResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagStatus")
        private String dagStatus;

        @com.aliyun.core.annotation.NameInMap("LastRunTime")
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

            private Builder() {
            } 

            private Builder(Task model) {
                this.dagStatus = model.dagStatus;
                this.lastRunTime = model.lastRunTime;
            } 

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li>success: succeeded</li>
             * <li>failed: failed</li>
             * <li>untrained: to be trained</li>
             * <li>pending: being scheduled</li>
             * <li>running: being trained</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder dagStatus(String dagStatus) {
                this.dagStatus = dagStatus;
                return this;
            }

            /**
             * <p>The time consumed for the most recent run, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
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
    /**
     * 
     * {@link GetFunctionInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetFunctionInstanceResponseBody</p>
     */
    public static class UsageParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(UsageParameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>use_param1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link GetFunctionInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetFunctionInstanceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Belongs")
        private Belongs belongs;

        @com.aliyun.core.annotation.NameInMap("CreateParameters")
        private java.util.List<CreateParameters> createParameters;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("FunctionType")
        private String functionType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Task")
        private Task task;

        @com.aliyun.core.annotation.NameInMap("UsageParameters")
        private java.util.List<UsageParameters> usageParameters;

        @com.aliyun.core.annotation.NameInMap("VersionId")
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
        public java.util.List<CreateParameters> getCreateParameters() {
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
         * @return usageParameters
         */
        public java.util.List<UsageParameters> getUsageParameters() {
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
            private java.util.List<CreateParameters> createParameters; 
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
            private java.util.List<UsageParameters> usageParameters; 
            private Long versionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.belongs = model.belongs;
                this.createParameters = model.createParameters;
                this.createTime = model.createTime;
                this.cron = model.cron;
                this.description = model.description;
                this.extendInfo = model.extendInfo;
                this.functionName = model.functionName;
                this.functionType = model.functionType;
                this.instanceName = model.instanceName;
                this.modelType = model.modelType;
                this.source = model.source;
                this.status = model.status;
                this.task = model.task;
                this.usageParameters = model.usageParameters;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The information about the instance.</p>
             */
            public Builder belongs(Belongs belongs) {
                this.belongs = belongs;
                return this;
            }

            /**
             * <p>The parameters that are used to create the instance.</p>
             */
            public Builder createParameters(java.util.List<CreateParameters> createParameters) {
                this.createParameters = createParameters;
                return this;
            }

            /**
             * <p>The time when the task was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cron expression used to schedule training, in the format of (Minutes Hours DayofMonth Month DayofWeek). If the value is empty, it indicates that no periodic training is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>0 3 ? * 0,1,3,5 (at 3 a.m. on Sunday, Monday, Wednesday, and Friday)</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance descriptions</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extended information, which is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dataReport&quot;:{},&quot;errors&quot;:{}}</p>
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>ctr</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The type of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>PAAS</p>
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ctr_test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The type of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>tf_checkpoint</p>
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>How the instance is created. Valid values:</p>
             * <ul>
             * <li>user: The instance is created by user.</li>
             * <li>builtin: The instance is created by the system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ol>
             * <li>unavailable: No model is available. Models must be trained before you can use them.</li>
             * <li>available: Models can be used.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information about the training task. This parameter is not displayed if no task is available.</p>
             */
            public Builder task(Task task) {
                this.task = task;
                return this;
            }

            /**
             * <p>The parameters that are used.</p>
             */
            public Builder usageParameters(java.util.List<UsageParameters> usageParameters) {
                this.usageParameters = usageParameters;
                return this;
            }

            /**
             * <p>The ID of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
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
