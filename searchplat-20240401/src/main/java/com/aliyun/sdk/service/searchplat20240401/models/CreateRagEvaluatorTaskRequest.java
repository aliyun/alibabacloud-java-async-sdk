// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link CreateRagEvaluatorTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRagEvaluatorTaskRequest</p>
 */
public class CreateRagEvaluatorTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("app_name")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data_source_config")
    private Object dataSourceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("emails")
    private java.util.List<String> emails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("evaluate_config")
    private EvaluateConfig evaluateConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("has_data_source")
    private Boolean hasDataSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metrics")
    private java.util.List<?> metrics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("task_name")
    private String taskName;

    private CreateRagEvaluatorTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.appName = builder.appName;
        this.data = builder.data;
        this.dataSourceConfig = builder.dataSourceConfig;
        this.emails = builder.emails;
        this.evaluateConfig = builder.evaluateConfig;
        this.hasDataSource = builder.hasDataSource;
        this.metrics = builder.metrics;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRagEvaluatorTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return dataSourceConfig
     */
    public Object getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    /**
     * @return emails
     */
    public java.util.List<String> getEmails() {
        return this.emails;
    }

    /**
     * @return evaluateConfig
     */
    public EvaluateConfig getEvaluateConfig() {
        return this.evaluateConfig;
    }

    /**
     * @return hasDataSource
     */
    public Boolean getHasDataSource() {
        return this.hasDataSource;
    }

    /**
     * @return metrics
     */
    public java.util.List<?> getMetrics() {
        return this.metrics;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateRagEvaluatorTaskRequest, Builder> {
        private String workspaceName; 
        private String appName; 
        private java.util.List<Data> data; 
        private Object dataSourceConfig; 
        private java.util.List<String> emails; 
        private EvaluateConfig evaluateConfig; 
        private Boolean hasDataSource; 
        private java.util.List<?> metrics; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRagEvaluatorTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.appName = request.appName;
            this.data = request.data;
            this.dataSourceConfig = request.dataSourceConfig;
            this.emails = request.emails;
            this.evaluateConfig = request.evaluateConfig;
            this.hasDataSource = request.hasDataSource;
            this.metrics = request.metrics;
            this.taskName = request.taskName;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>app_name</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("app_name", appName);
            this.appName = appName;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * data_source_config.
         */
        public Builder dataSourceConfig(Object dataSourceConfig) {
            this.putBodyParameter("data_source_config", dataSourceConfig);
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }

        /**
         * <p>emails</p>
         */
        public Builder emails(java.util.List<String> emails) {
            this.putBodyParameter("emails", emails);
            this.emails = emails;
            return this;
        }

        /**
         * evaluate_config.
         */
        public Builder evaluateConfig(EvaluateConfig evaluateConfig) {
            this.putBodyParameter("evaluate_config", evaluateConfig);
            this.evaluateConfig = evaluateConfig;
            return this;
        }

        /**
         * <p>has_data_source</p>
         */
        public Builder hasDataSource(Boolean hasDataSource) {
            this.putBodyParameter("has_data_source", hasDataSource);
            this.hasDataSource = hasDataSource;
            return this;
        }

        /**
         * metrics.
         */
        public Builder metrics(java.util.List<?> metrics) {
            this.putBodyParameter("metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * task_name.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("task_name", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateRagEvaluatorTaskRequest build() {
            return new CreateRagEvaluatorTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRagEvaluatorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateRagEvaluatorTaskRequest</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("model_answer")
        private String modelAnswer;

        @com.aliyun.core.annotation.NameInMap("question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("recall_docs")
        private java.util.List<String> recallDocs;

        @com.aliyun.core.annotation.NameInMap("standard_answer")
        private String standardAnswer;

        private Data(Builder builder) {
            this.modelAnswer = builder.modelAnswer;
            this.question = builder.question;
            this.recallDocs = builder.recallDocs;
            this.standardAnswer = builder.standardAnswer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelAnswer
         */
        public String getModelAnswer() {
            return this.modelAnswer;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return recallDocs
         */
        public java.util.List<String> getRecallDocs() {
            return this.recallDocs;
        }

        /**
         * @return standardAnswer
         */
        public String getStandardAnswer() {
            return this.standardAnswer;
        }

        public static final class Builder {
            private String modelAnswer; 
            private String question; 
            private java.util.List<String> recallDocs; 
            private String standardAnswer; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.modelAnswer = model.modelAnswer;
                this.question = model.question;
                this.recallDocs = model.recallDocs;
                this.standardAnswer = model.standardAnswer;
            } 

            /**
             * <p>model_answer</p>
             */
            public Builder modelAnswer(String modelAnswer) {
                this.modelAnswer = modelAnswer;
                return this;
            }

            /**
             * <p>question</p>
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * <p>recall_docs</p>
             */
            public Builder recallDocs(java.util.List<String> recallDocs) {
                this.recallDocs = recallDocs;
                return this;
            }

            /**
             * <p>standard_answer</p>
             */
            public Builder standardAnswer(String standardAnswer) {
                this.standardAnswer = standardAnswer;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRagEvaluatorTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateRagEvaluatorTaskRequest</p>
     */
    public static class EvaluateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("run_all_step")
        private Boolean runAllStep;

        private EvaluateConfig(Builder builder) {
            this.model = builder.model;
            this.prompt = builder.prompt;
            this.runAllStep = builder.runAllStep;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluateConfig create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return runAllStep
         */
        public Boolean getRunAllStep() {
            return this.runAllStep;
        }

        public static final class Builder {
            private String model; 
            private String prompt; 
            private Boolean runAllStep; 

            private Builder() {
            } 

            private Builder(EvaluateConfig model) {
                this.model = model.model;
                this.prompt = model.prompt;
                this.runAllStep = model.runAllStep;
            } 

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>prompt</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>run_all_step</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder runAllStep(Boolean runAllStep) {
                this.runAllStep = runAllStep;
                return this;
            }

            public EvaluateConfig build() {
                return new EvaluateConfig(this);
            } 

        } 

    }
}
