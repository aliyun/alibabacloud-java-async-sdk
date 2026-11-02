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
 * {@link SubmitIProductionJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitIProductionJobRequest</p>
 */
public class SubmitIProductionJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobParams")
    private String jobParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private Output output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitIProductionJobRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.input = builder.input;
        this.jobParams = builder.jobParams;
        this.modelId = builder.modelId;
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
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
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
        private String modelId; 
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
            this.modelId = request.modelId;
            this.name = request.name;
            this.output = request.output;
            this.scheduleConfig = request.scheduleConfig;
            this.templateId = request.templateId;
            this.userData = request.userData;
        } 

        /**
         * <p>The name of the algorithm feature to be used. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: intelligent cover</li>
         * <li><strong>VideoClip</strong>: video synopsis</li>
         * <li><strong>VideoDelogo</strong>: video icon removal</li>
         * <li><strong>VideoDetext</strong>: video subtitle removal</li>
         * <li><strong>CaptionExtraction</strong>: subtitle fetch</li>
         * <li><strong>VideoGreenScreenMatting</strong>: image matting</li>
         * <li><strong>FaceBeauty</strong>: video face beautification</li>
         * <li><strong>VideoH2V</strong>: video landscape-to-portrait conversion</li>
         * <li><strong>MusicSegmentDetect</strong>: chorus detection</li>
         * <li><strong>AudioBeatDetection</strong>: beat detection</li>
         * <li><strong>AudioQualityAssessment</strong>: audio quality assessment</li>
         * <li><strong>SpeechDenoise</strong>: speech noise reduction</li>
         * <li><strong>AudioMixing</strong>: audio mixing</li>
         * <li><strong>MusicDemix</strong>: vocal and accompaniment separation</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The input media. OSS paths and media asset IDs are supported.</p>
         * <p>The file requirements for the input media vary based on the algorithm feature. For more information, see the supplementary instructions below.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The algorithm job parameters. The value is a JSON object. The parameters vary based on the algorithm. For more information, see the supplementary instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
         */
        public Builder jobParams(String jobParams) {
            this.putQueryParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The algorithm model ID. If this parameter is left empty, the default model for the corresponding feature is used. You can leave this parameter empty and use the default model.</p>
         * <p>The following algorithm features support non-default models:</p>
         * <ul>
         * <li>VideoDetext<ul>
         * <li>ModelId = algo-video-detext-new: a subtitle removal algorithm that delivers better results but runs slower and costs more than the default algorithm.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>algo-video-detext-new</p>
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The name of the job. The name can be up to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Test job</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The output media. OSS paths and media asset IDs are supported.</p>
         * <p>The output files for the Output parameter vary based on the algorithm feature. For more information, see the supplementary instructions below.</p>
         * <p>This parameter is required.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * <p>The job scheduling configuration.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The custom user data. The data is returned as is when the result is obtained. The value can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;:1}</p>
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

    /**
     * 
     * {@link SubmitIProductionJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitIProductionJobRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The input media. Both OSS URLs and media asset IDs are supported.
             * OSS URL formats (select one of the following formats):</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object
             * In the URLs, bucket is the name of the OSS bucket in the same region as the current project, and object is the file path.</li>
             * </ol>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The media type. Valid values:</p>
             * <ul>
             * <li><p>OSS: OSS path</p>
             * </li>
             * <li><p>Media: media asset ID</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
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
     * {@link SubmitIProductionJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitIProductionJobRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Biz")
        private String biz;

        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Output(Builder builder) {
            this.biz = builder.biz;
            this.media = builder.media;
            this.outputUrl = builder.outputUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return biz
         */
        public String getBiz() {
            return this.biz;
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String biz; 
            private String media; 
            private String outputUrl; 
            private String type; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.biz = model.biz;
                this.media = model.media;
                this.outputUrl = model.outputUrl;
                this.type = model.type;
            } 

            /**
             * <p>The business to which the media asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>IMS</p>
             */
            public Builder biz(String biz) {
                this.biz = biz;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The OSS URL of the output file. This parameter is required when Type is set to Media. The bucket must be registered in IMS or VOD.</p>
             * 
             * <strong>example:</strong>
             * <p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * <p>The media type. Valid values:</p>
             * <ul>
             * <li><p>OSS: OSS path</p>
             * </li>
             * <li><p>Media: media asset ID</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
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
    /**
     * 
     * {@link SubmitIProductionJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitIProductionJobRequest</p>
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
             * <p>The pipeline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5246b8d12a62433ab77845074039c3dc</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the job. Valid values: 1 to 10. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
