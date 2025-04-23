// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link CreateOnlineEvalTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOnlineEvalTaskRequest</p>
 */
public class CreateOnlineEvalTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateOnlineEvalTaskRequestBody body;

    private CreateOnlineEvalTaskRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOnlineEvalTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateOnlineEvalTaskRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateOnlineEvalTaskRequest, Builder> {
        private CreateOnlineEvalTaskRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateOnlineEvalTaskRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CreateOnlineEvalTaskRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateOnlineEvalTaskRequest build() {
            return new CreateOnlineEvalTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOnlineEvalTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOnlineEvalTaskRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOnlineEvalTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOnlineEvalTaskRequest</p>
     */
    public static class CreateOnlineEvalTaskRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EvaluationConfig")
        private EvaluationConfig evaluationConfig;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List<Filters> filters;

        @com.aliyun.core.annotation.NameInMap("ModelConfig")
        private ModelConfig modelConfig;

        @com.aliyun.core.annotation.NameInMap("SamplingFrequencyMinutes")
        private Integer samplingFrequencyMinutes;

        @com.aliyun.core.annotation.NameInMap("SamplingRatio")
        private Integer samplingRatio;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private CreateOnlineEvalTaskRequestBody(Builder builder) {
            this.appName = builder.appName;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.evaluationConfig = builder.evaluationConfig;
            this.filters = builder.filters;
            this.modelConfig = builder.modelConfig;
            this.samplingFrequencyMinutes = builder.samplingFrequencyMinutes;
            this.samplingRatio = builder.samplingRatio;
            this.startTime = builder.startTime;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateOnlineEvalTaskRequestBody create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return evaluationConfig
         */
        public EvaluationConfig getEvaluationConfig() {
            return this.evaluationConfig;
        }

        /**
         * @return filters
         */
        public java.util.List<Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return modelConfig
         */
        public ModelConfig getModelConfig() {
            return this.modelConfig;
        }

        /**
         * @return samplingFrequencyMinutes
         */
        public Integer getSamplingFrequencyMinutes() {
            return this.samplingFrequencyMinutes;
        }

        /**
         * @return samplingRatio
         */
        public Integer getSamplingRatio() {
            return this.samplingRatio;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String appName; 
            private String description; 
            private String endTime; 
            private EvaluationConfig evaluationConfig; 
            private java.util.List<Filters> filters; 
            private ModelConfig modelConfig; 
            private Integer samplingFrequencyMinutes; 
            private Integer samplingRatio; 
            private String startTime; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(CreateOnlineEvalTaskRequestBody model) {
                this.appName = model.appName;
                this.description = model.description;
                this.endTime = model.endTime;
                this.evaluationConfig = model.evaluationConfig;
                this.filters = model.filters;
                this.modelConfig = model.modelConfig;
                this.samplingFrequencyMinutes = model.samplingFrequencyMinutes;
                this.samplingRatio = model.samplingRatio;
                this.startTime = model.startTime;
                this.taskName = model.taskName;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EvaluationConfig.
             */
            public Builder evaluationConfig(EvaluationConfig evaluationConfig) {
                this.evaluationConfig = evaluationConfig;
                return this;
            }

            /**
             * Filters.
             */
            public Builder filters(java.util.List<Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * ModelConfig.
             */
            public Builder modelConfig(ModelConfig modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * SamplingFrequencyMinutes.
             */
            public Builder samplingFrequencyMinutes(Integer samplingFrequencyMinutes) {
                this.samplingFrequencyMinutes = samplingFrequencyMinutes;
                return this;
            }

            /**
             * SamplingRatio.
             */
            public Builder samplingRatio(Integer samplingRatio) {
                this.samplingRatio = samplingRatio;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public CreateOnlineEvalTaskRequestBody build() {
                return new CreateOnlineEvalTaskRequestBody(this);
            } 

        } 

    }
}
