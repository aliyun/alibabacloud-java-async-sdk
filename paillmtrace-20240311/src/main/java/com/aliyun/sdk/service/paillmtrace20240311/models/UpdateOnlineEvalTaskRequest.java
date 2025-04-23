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
 * {@link UpdateOnlineEvalTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateOnlineEvalTaskRequest</p>
 */
public class UpdateOnlineEvalTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationConfig")
    private EvaluationConfig evaluationConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private ModelConfig modelConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SamplingFrequencyMinutes")
    private Integer samplingFrequencyMinutes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SamplingRatio")
    private Integer samplingRatio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private UpdateOnlineEvalTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
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

    public static UpdateOnlineEvalTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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

    public static final class Builder extends Request.Builder<UpdateOnlineEvalTaskRequest, Builder> {
        private String taskId; 
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
            super();
        } 

        private Builder(UpdateOnlineEvalTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.appName = request.appName;
            this.description = request.description;
            this.endTime = request.endTime;
            this.evaluationConfig = request.evaluationConfig;
            this.filters = request.filters;
            this.modelConfig = request.modelConfig;
            this.samplingFrequencyMinutes = request.samplingFrequencyMinutes;
            this.samplingRatio = request.samplingRatio;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>518bc0f833d9a4ad3836ace4db69ba59c</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EvaluationConfig.
         */
        public Builder evaluationConfig(EvaluationConfig evaluationConfig) {
            this.putBodyParameter("EvaluationConfig", evaluationConfig);
            this.evaluationConfig = evaluationConfig;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * ModelConfig.
         */
        public Builder modelConfig(ModelConfig modelConfig) {
            this.putBodyParameter("ModelConfig", modelConfig);
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * SamplingFrequencyMinutes.
         */
        public Builder samplingFrequencyMinutes(Integer samplingFrequencyMinutes) {
            this.putBodyParameter("SamplingFrequencyMinutes", samplingFrequencyMinutes);
            this.samplingFrequencyMinutes = samplingFrequencyMinutes;
            return this;
        }

        /**
         * SamplingRatio.
         */
        public Builder samplingRatio(Integer samplingRatio) {
            this.putBodyParameter("SamplingRatio", samplingRatio);
            this.samplingRatio = samplingRatio;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public UpdateOnlineEvalTaskRequest build() {
            return new UpdateOnlineEvalTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateOnlineEvalTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateOnlineEvalTaskRequest</p>
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
}
