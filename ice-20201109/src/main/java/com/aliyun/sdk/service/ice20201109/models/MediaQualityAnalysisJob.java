// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaQualityAnalysisJob} extends {@link TeaModel}
 *
 * <p>MediaQualityAnalysisJob</p>
 */
public class MediaQualityAnalysisJob extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    private TemplateConfig templateConfig;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.NameInMap("VqaResult")
    private MediaQualityAnalysisJobVqaResult vqaResult;

    private MediaQualityAnalysisJob(Builder builder) {
        this.createTime = builder.createTime;
        this.finishTime = builder.finishTime;
        this.input = builder.input;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.scheduleConfig = builder.scheduleConfig;
        this.state = builder.state;
        this.templateConfig = builder.templateConfig;
        this.userData = builder.userData;
        this.vqaResult = builder.vqaResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaQualityAnalysisJob create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return templateConfig
     */
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return vqaResult
     */
    public MediaQualityAnalysisJobVqaResult getVqaResult() {
        return this.vqaResult;
    }

    public static final class Builder {
        private String createTime; 
        private String finishTime; 
        private Input input; 
        private String jobId; 
        private String name; 
        private ScheduleConfig scheduleConfig; 
        private String state; 
        private TemplateConfig templateConfig; 
        private String userData; 
        private MediaQualityAnalysisJobVqaResult vqaResult; 

        private Builder() {
        } 

        private Builder(MediaQualityAnalysisJob model) {
            this.createTime = model.createTime;
            this.finishTime = model.finishTime;
            this.input = model.input;
            this.jobId = model.jobId;
            this.name = model.name;
            this.scheduleConfig = model.scheduleConfig;
            this.state = model.state;
            this.templateConfig = model.templateConfig;
            this.userData = model.userData;
            this.vqaResult = model.vqaResult;
        } 

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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * TemplateConfig.
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * VqaResult.
         */
        public Builder vqaResult(MediaQualityAnalysisJobVqaResult vqaResult) {
            this.vqaResult = vqaResult;
            return this;
        }

        public MediaQualityAnalysisJob build() {
            return new MediaQualityAnalysisJob(this);
        } 

    } 

    /**
     * 
     * {@link MediaQualityAnalysisJob} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJob</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

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
    /**
     * 
     * {@link MediaQualityAnalysisJob} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJob</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
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

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
            } 

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
    /**
     * 
     * {@link MediaQualityAnalysisJob} extends {@link TeaModel}
     *
     * <p>MediaQualityAnalysisJob</p>
     */
    public static class TemplateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private TemplateConfig(Builder builder) {
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateConfig create() {
            return builder().build();
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String templateId; 

            private Builder() {
            } 

            private Builder(TemplateConfig model) {
                this.templateId = model.templateId;
            } 

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public TemplateConfig build() {
                return new TemplateConfig(this);
            } 

        } 

    }
}
