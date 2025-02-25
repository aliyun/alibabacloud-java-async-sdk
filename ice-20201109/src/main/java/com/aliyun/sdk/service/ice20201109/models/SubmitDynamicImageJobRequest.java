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
 * {@link SubmitDynamicImageJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDynamicImageJobRequest</p>
 */
public class SubmitDynamicImageJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

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
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private TemplateConfig templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitDynamicImageJobRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.name = builder.name;
        this.output = builder.output;
        this.scheduleConfig = builder.scheduleConfig;
        this.templateConfig = builder.templateConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDynamicImageJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
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

    public static final class Builder extends Request.Builder<SubmitDynamicImageJobRequest, Builder> {
        private Input input; 
        private String name; 
        private Output output; 
        private ScheduleConfig scheduleConfig; 
        private TemplateConfig templateConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDynamicImageJobRequest request) {
            super(request);
            this.input = request.input;
            this.name = request.name;
            this.output = request.output;
            this.scheduleConfig = request.scheduleConfig;
            this.templateConfig = request.templateConfig;
            this.userData = request.userData;
        } 

        /**
         * <p>The input of the job.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleJob</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The output of the job.</p>
         * <p>This parameter is required.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * <p>The scheduling settings.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The snapshot template configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SampleKey&quot;: &quot;SampleValue&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitDynamicImageJobRequest build() {
            return new SubmitDynamicImageJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitDynamicImageJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitDynamicImageJobRequest</p>
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

            /**
             * <p>The input file. If Type is set to OSS, set this parameter to the URL of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. The URL of an OSS object can be in one of the following formats:</p>
             * <ol>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
             * </ol>
             * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</p>
             * <blockquote>
             * <p> Before you use the OSS bucket in the URL, you must add the bucket on the <a href="https://help.aliyun.com/document_detail/609918.html">Storage Management</a> page of the Intelligent Media Services (IMS) console.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values:</p>
             * <ol>
             * <li>OSS: an Object Storage Service (OSS) object.</li>
             * <li>Media: a media asset.</li>
             * </ol>
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
     * {@link SubmitDynamicImageJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitDynamicImageJobRequest</p>
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

            /**
             * <p>The output file. The file can be an OSS object or a media asset. The URL of an OSS object can be in one of the following formats:</p>
             * <ul>
             * <li>oss://bucket/object</li>
             * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object</li>
             * </ul>
             * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</p>
             * <blockquote>
             * <p> Before you use the OSS bucket in the URL, you must add the bucket on the <a href="https://help.aliyun.com/document_detail/609918.html">Storage Management</a> page of the IMS console.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the output file. Valid values:</p>
             * <ol>
             * <li>OSS: an OSS object.</li>
             * <li>Media: a media asset.</li>
             * </ol>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Media</p>
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
     * {@link SubmitDynamicImageJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitDynamicImageJobRequest</p>
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

            /**
             * <p>The ID of the MPS queue to which the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority. Valid values: 1 to 10. Default value: 6. A greater value specifies a higher priority.</p>
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
    /**
     * 
     * {@link SubmitDynamicImageJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitDynamicImageJobRequest</p>
     */
    public static class TimeSpan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Seek")
        private String seek;

        private TimeSpan(Builder builder) {
            this.duration = builder.duration;
            this.end = builder.end;
            this.seek = builder.seek;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSpan create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return seek
         */
        public String getSeek() {
            return this.seek;
        }

        public static final class Builder {
            private String duration; 
            private String end; 
            private String seek; 

            /**
             * <p>The length of the clip.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>01:59:59.999 or 32000.23</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The length of the ending part of the original clip to be cropped out. If you specify this parameter, the Duration parameter becomes invalid.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>01:59:59.999 or 32000.23</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The start point of the clip.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>01:59:59.999 or 32000.23</p>
             */
            public Builder seek(String seek) {
                this.seek = seek;
                return this;
            }

            public TimeSpan build() {
                return new TimeSpan(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitDynamicImageJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitDynamicImageJobRequest</p>
     */
    public static class OverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private Integer fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("LongShortMode")
        private Boolean longShortMode;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("TimeSpan")
        private TimeSpan timeSpan;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private OverwriteParams(Builder builder) {
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.longShortMode = builder.longShortMode;
            this.scanMode = builder.scanMode;
            this.timeSpan = builder.timeSpan;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParams create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return fps
         */
        public Integer getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return longShortMode
         */
        public Boolean getLongShortMode() {
            return this.longShortMode;
        }

        /**
         * @return scanMode
         */
        public String getScanMode() {
            return this.scanMode;
        }

        /**
         * @return timeSpan
         */
        public TimeSpan getTimeSpan() {
            return this.timeSpan;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String format; 
            private Integer fps; 
            private Integer height; 
            private Boolean longShortMode; 
            private String scanMode; 
            private TimeSpan timeSpan; 
            private Integer width; 

            /**
             * <p>The format of the animated image. Valid values:</p>
             * <ul>
             * <li><strong>gif</strong></li>
             * <li><strong>webp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gif</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate. Valid values: [1,60].</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the animated image. Valid values: [128,4096].</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>Specifies whether to enable the auto-rotate screen feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <p>Default value: <strong>true</strong>.</p>
             * <blockquote>
             * <p> If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder longShortMode(Boolean longShortMode) {
                this.longShortMode = longShortMode;
                return this;
            }

            /**
             * <p>The scan mode. Valid values:</p>
             * <ul>
             * <li><strong>interlaced</strong></li>
             * <li><strong>progressive</strong> This is the default value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>progressive</p>
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * <p>The timeline parameters.</p>
             */
            public Builder timeSpan(TimeSpan timeSpan) {
                this.timeSpan = timeSpan;
                return this;
            }

            /**
             * <p>The width of the animated image. Valid values: [128,4096].</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public OverwriteParams build() {
                return new OverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitDynamicImageJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitDynamicImageJobRequest</p>
     */
    public static class TemplateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private OverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateId;

        private TemplateConfig(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateConfig create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public OverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private OverwriteParams overwriteParams; 
            private String templateId; 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters.</p>
             */
            public Builder overwriteParams(OverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
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
