// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIProductionJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitIProductionJobRequest</p>
 */
public class SubmitIProductionJobRequest extends Request {
    @Query
    @NameInMap("FunctionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("Input")
    @Validation(required = true)
    private Input input;

    @Query
    @NameInMap("JobParams")
    private String jobParams;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Output")
    @Validation(required = true)
    private Output output;

    @Query
    @NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitIProductionJobRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.input = builder.input;
        this.jobParams = builder.jobParams;
        this.name = builder.name;
        this.output = builder.output;
        this.scheduleConfig = builder.scheduleConfig;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIProductionJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitIProductionJobRequest, Builder> {
        private String functionName; 
        private Input input; 
        private String jobParams; 
        private String name; 
        private Output output; 
        private ScheduleConfig scheduleConfig; 
        private String templateId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitIProductionJobRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.input = request.input;
            this.jobParams = request.jobParams;
            this.name = request.name;
            this.output = request.output;
            this.scheduleConfig = request.scheduleConfig;
            this.templateId = request.templateId;
            this.userData = request.userData;
        } 

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * JobParams.
         */
        public Builder jobParams(String jobParams) {
            this.putQueryParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * ScheduleConfig.
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitIProductionJobRequest build() {
            return new SubmitIProductionJobRequest(this);
        } 

    } 

    public static class Input extends TeaModel {
        @NameInMap("Media")
        @Validation(required = true)
        private String media;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class Output extends TeaModel {
        @NameInMap("Media")
        @Validation(required = true)
        private String media;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    public static class ScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("Priority")
        private Integer priority;

        private ScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String pipelineId; 
            private Integer priority; 

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
}
