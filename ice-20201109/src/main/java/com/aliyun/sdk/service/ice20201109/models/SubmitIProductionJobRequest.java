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
         * <p>The name of the algorithm that you want to use for the job. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: This algorithm intelligently generates a thumbnail image for a video.</li>
         * <li><strong>VideoClip</strong>: This algorithm intelligently generates a summary for a video.</li>
         * <li><strong>VideoDelogo</strong>: This algorithm removes logos from a video.</li>
         * <li><strong>VideoDetext</strong>: This algorithm removes captions from a video.</li>
         * <li><strong>CaptionExtraction</strong>: This algorithm extracts captions from a video and generates the caption file.</li>
         * <li><strong>VideoGreenScreenMatting</strong>: This algorithm performs green-screen image matting on a video and generates a new video.</li>
         * <li><strong>FaceBeauty</strong>: This algorithm performs video retouching.</li>
         * <li><strong>VideoH2V</strong>: This algorithm transforms a video from the landscape mode to the portrait mode.</li>
         * <li><strong>MusicSegmentDetect</strong>: This algorithm detects the chorus of a song.</li>
         * <li><strong>AudioBeatDetection</strong>: This algorithm detects rhythms.</li>
         * <li><strong>AudioQualityAssessment</strong>: This algorithm assesses the audio quality.</li>
         * <li><strong>SpeechDenoise</strong>: This algorithm performs noise reduction.</li>
         * <li><strong>AudioMixing</strong>: This algorithm mixes audio streams.</li>
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
         * <p>The input file. The file can be an Object Storage Service (OSS) object or a media asset.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The algorithm-specific parameters. The parameters are specified as JSON objects and vary based on the algorithm. For more information, see the &quot;Parameters of JobParams&quot; section of this topic.</p>
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
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The name of the intelligent production job. The name can be up to 100 characters in length.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The output file. The file can be an OSS object or a media asset.</p>
         * <p>This parameter is required.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * <p>The scheduling configuration.</p>
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
         * <p>The user-defined data that is returned in the response. The value can be up to 1,024 bytes in length.</p>
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
             * <p>The input file. The file can be an OSS object or a media asset. You can specify the path of an OSS object in one of the following formats:</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
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
             * <li>OSS: OSS object</li>
             * <li>Media: media asset</li>
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
        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Output model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The output file. If Type is set to OSS, set this parameter to the path of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. You can specify the path of an OSS object in one of the following formats:</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
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
             * <li>OSS: OSS object</li>
             * <li>Media: media asset</li>
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
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue.</p>
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
