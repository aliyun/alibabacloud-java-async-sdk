// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIProductionJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIProductionJobResponseBody</p>
 */
public class QueryIProductionJobResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("FinishTime")
    private String finishTime;

    @NameInMap("FunctionName")
    private String functionName;

    @NameInMap("Input")
    private Input input;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobParams")
    private String jobParams;

    @NameInMap("Name")
    private String name;

    @NameInMap("Output")
    private Output output;

    @NameInMap("OutputFiles")
    private java.util.List < String > outputFiles;

    @NameInMap("OutputUrls")
    private java.util.List < String > outputUrls;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @NameInMap("Status")
    private String status;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("UserData")
    private String userData;

    private QueryIProductionJobResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.finishTime = builder.finishTime;
        this.functionName = builder.functionName;
        this.input = builder.input;
        this.jobId = builder.jobId;
        this.jobParams = builder.jobParams;
        this.name = builder.name;
        this.output = builder.output;
        this.outputFiles = builder.outputFiles;
        this.outputUrls = builder.outputUrls;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.scheduleConfig = builder.scheduleConfig;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIProductionJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return outputFiles
     */
    public java.util.List < String > getOutputFiles() {
        return this.outputFiles;
    }

    /**
     * @return outputUrls
     */
    public java.util.List < String > getOutputUrls() {
        return this.outputUrls;
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
    public String getResult() {
        return this.result;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder {
        private String createTime; 
        private String finishTime; 
        private String functionName; 
        private Input input; 
        private String jobId; 
        private String jobParams; 
        private String name; 
        private Output output; 
        private java.util.List < String > outputFiles; 
        private java.util.List < String > outputUrls; 
        private String requestId; 
        private String result; 
        private ScheduleConfig scheduleConfig; 
        private String status; 
        private String templateId; 
        private String userData; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * FinishTime.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
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
         * Input.
         */
        public Builder input(Input input) {
            this.input = input;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobParams.
         */
        public Builder jobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(Output output) {
            this.output = output;
            return this;
        }

        /**
         * OutputFiles.
         */
        public Builder outputFiles(java.util.List < String > outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }

        /**
         * OutputUrls.
         */
        public Builder outputUrls(java.util.List < String > outputUrls) {
            this.outputUrls = outputUrls;
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
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * ScheduleConfig.
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public QueryIProductionJobResponseBody build() {
            return new QueryIProductionJobResponseBody(this);
        } 

    } 

    public static class Input extends TeaModel {
        @NameInMap("Media")
        private String media;

        @NameInMap("Type")
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
        private String media;

        @NameInMap("Type")
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
