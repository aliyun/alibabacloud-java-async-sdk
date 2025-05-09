// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAnalysisJobResponseBody</p>
 */
public class SubmitAnalysisJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnalysisJob")
    private AnalysisJob analysisJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitAnalysisJobResponseBody(Builder builder) {
        this.analysisJob = builder.analysisJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAnalysisJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisJob
     */
    public AnalysisJob getAnalysisJob() {
        return this.analysisJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AnalysisJob analysisJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitAnalysisJobResponseBody model) {
            this.analysisJob = model.analysisJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the preset template analysis job that was submitted.</p>
         */
        public Builder analysisJob(AnalysisJob analysisJob) {
            this.analysisJob = analysisJob;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B52658D4-07AB-43CD-82B0-210958A65E23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitAnalysisJobResponseBody build() {
            return new SubmitAnalysisJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class Crop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Left")
        private String left;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Top")
        private String top;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Crop(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.mode = builder.mode;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Crop create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public String getLeft() {
            return this.left;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return top
         */
        public String getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String height; 
            private String left; 
            private String mode; 
            private String top; 
            private String width; 

            private Builder() {
            } 

            private Builder(Crop model) {
                this.height = model.height;
                this.left = model.left;
                this.mode = model.mode;
                this.top = model.top;
                this.width = model.width;
            } 

            /**
             * <p>The height of the video after the margins were cropped out.</p>
             * <blockquote>
             * <p>This parameter is invalid if the <strong>Mode</strong> parameter is set to Auto or None.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The left margin that was cropped out.</p>
             * <blockquote>
             * <p>This parameter is invalid if the <strong>Mode</strong> parameter is set to Auto or None.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The cropping mode. Valid values:</p>
             * <ul>
             * <li><strong>Auto</strong>: Cropping was automatically run. This is the default value.</li>
             * <li><strong>Force</strong>: Cropping was forced to run.</li>
             * <li><strong>None</strong>: Cropping was forced not to run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The top margin that was cropped out.</p>
             * <blockquote>
             * <p>This parameter is invalid if the <strong>Mode</strong> parameter is set to Auto or None.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder top(String top) {
                this.top = top;
                return this;
            }

            /**
             * <p>The width of the video after the margins were cropped out.</p>
             * <blockquote>
             * <p>This parameter is invalid if the <strong>Mode</strong> parameter is set to Auto or None.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Crop build() {
                return new Crop(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class PropertiesControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Crop")
        private Crop crop;

        @com.aliyun.core.annotation.NameInMap("Deinterlace")
        private String deinterlace;

        private PropertiesControl(Builder builder) {
            this.crop = builder.crop;
            this.deinterlace = builder.deinterlace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertiesControl create() {
            return builder().build();
        }

        /**
         * @return crop
         */
        public Crop getCrop() {
            return this.crop;
        }

        /**
         * @return deinterlace
         */
        public String getDeinterlace() {
            return this.deinterlace;
        }

        public static final class Builder {
            private Crop crop; 
            private String deinterlace; 

            private Builder() {
            } 

            private Builder(PropertiesControl model) {
                this.crop = model.crop;
                this.deinterlace = model.deinterlace;
            } 

            /**
             * <p>The cropping configurations of video images.</p>
             */
            public Builder crop(Crop crop) {
                this.crop = crop;
                return this;
            }

            /**
             * <p>Indicates whether deinterlacing was forced to run. Valid values:</p>
             * <ul>
             * <li><strong>Auto</strong>: Deinterlacing was automatically run.</li>
             * <li><strong>Force</strong>: Deinterlacing was forced to run.</li>
             * <li><strong>None</strong>: Deinterlacing was forced not to run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Force</p>
             */
            public Builder deinterlace(String deinterlace) {
                this.deinterlace = deinterlace;
                return this;
            }

            public PropertiesControl build() {
                return new PropertiesControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class QualityControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MethodStreaming")
        private String methodStreaming;

        @com.aliyun.core.annotation.NameInMap("RateQuality")
        private String rateQuality;

        private QualityControl(Builder builder) {
            this.methodStreaming = builder.methodStreaming;
            this.rateQuality = builder.rateQuality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityControl create() {
            return builder().build();
        }

        /**
         * @return methodStreaming
         */
        public String getMethodStreaming() {
            return this.methodStreaming;
        }

        /**
         * @return rateQuality
         */
        public String getRateQuality() {
            return this.rateQuality;
        }

        public static final class Builder {
            private String methodStreaming; 
            private String rateQuality; 

            private Builder() {
            } 

            private Builder(QualityControl model) {
                this.methodStreaming = model.methodStreaming;
                this.rateQuality = model.rateQuality;
            } 

            /**
             * <p>The playback mode. Valid values:</p>
             * <ul>
             * <li><strong>network</strong>: online playback</li>
             * <li><strong>local</strong>: playback on local devices</li>
             * <li>Default value: <strong>network</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>network</p>
             */
            public Builder methodStreaming(String methodStreaming) {
                this.methodStreaming = methodStreaming;
                return this;
            }

            /**
             * <p>The quality level of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder rateQuality(String rateQuality) {
                this.rateQuality = rateQuality;
                return this;
            }

            public QualityControl build() {
                return new QualityControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class AnalysisConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertiesControl")
        private PropertiesControl propertiesControl;

        @com.aliyun.core.annotation.NameInMap("QualityControl")
        private QualityControl qualityControl;

        private AnalysisConfig(Builder builder) {
            this.propertiesControl = builder.propertiesControl;
            this.qualityControl = builder.qualityControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisConfig create() {
            return builder().build();
        }

        /**
         * @return propertiesControl
         */
        public PropertiesControl getPropertiesControl() {
            return this.propertiesControl;
        }

        /**
         * @return qualityControl
         */
        public QualityControl getQualityControl() {
            return this.qualityControl;
        }

        public static final class Builder {
            private PropertiesControl propertiesControl; 
            private QualityControl qualityControl; 

            private Builder() {
            } 

            private Builder(AnalysisConfig model) {
                this.propertiesControl = model.propertiesControl;
                this.qualityControl = model.qualityControl;
            } 

            /**
             * <p>The control on the attributes of the job output.</p>
             */
            public Builder propertiesControl(PropertiesControl propertiesControl) {
                this.propertiesControl = propertiesControl;
                return this;
            }

            /**
             * <p>The quality control on the job output.</p>
             */
            public Builder qualityControl(QualityControl qualityControl) {
                this.qualityControl = qualityControl;
                return this;
            }

            public AnalysisConfig build() {
                return new AnalysisConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class InputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private InputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            private Builder() {
            } 

            private Builder(InputFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
            } 

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>example.flv</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public InputFile build() {
                return new InputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class MNSMessageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        private MNSMessageResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.messageId = builder.messageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MNSMessageResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String messageId; 

            private Builder() {
            } 

            private Builder(MNSMessageResult model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.messageId = model.messageId;
            } 

            /**
             * <p>The error code returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.ResourceNotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated &quot;PipelineId&quot; cannot be found</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the message returned if the job was successful. This parameter is not returned if the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>3ca84a39a9024f19853b21be9cf9****</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            public MNSMessageResult build() {
                return new MNSMessageResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class Audio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Qscale")
        private String qscale;

        @com.aliyun.core.annotation.NameInMap("Samplerate")
        private String samplerate;

        private Audio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.samplerate = builder.samplerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String qscale; 
            private String samplerate; 

            private Builder() {
            } 

            private Builder(Audio model) {
                this.bitrate = model.bitrate;
                this.channels = model.channels;
                this.codec = model.codec;
                this.profile = model.profile;
                this.qscale = model.qscale;
                this.samplerate = model.samplerate;
            } 

            /**
             * <p>The audio bitrate of the output file.</p>
             * <ul>
             * <li>Unit: Kbit/s.</li>
             * <li>Default value: <strong>128</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The number of sound channels. Default value: <strong>2</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The audio codec format. Default value: <strong>acc</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>mp3</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The codec profile of the audio. Valid values if the <strong>Codec</strong> parameter is set to <strong>aac</strong>: aac_low, aac_he, aac_he_v2, aac_ld, and aac_eld.</p>
             * 
             * <strong>example:</strong>
             * <p>aac_low</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The level of quality control on the audio.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * <p>The sampling rate.</p>
             * <ul>
             * <li>Unit: Hz.</li>
             * <li>Default value: <strong>44100</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        private Container(Builder builder) {
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String format; 

            private Builder() {
            } 

            private Builder(Container model) {
                this.format = model.format;
            } 

            /**
             * <p>The container format.</p>
             * 
             * <strong>example:</strong>
             * <p>flv</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class Gif extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinalDelay")
        private String finalDelay;

        @com.aliyun.core.annotation.NameInMap("Loop")
        private String loop;

        private Gif(Builder builder) {
            this.finalDelay = builder.finalDelay;
            this.loop = builder.loop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gif create() {
            return builder().build();
        }

        /**
         * @return finalDelay
         */
        public String getFinalDelay() {
            return this.finalDelay;
        }

        /**
         * @return loop
         */
        public String getLoop() {
            return this.loop;
        }

        public static final class Builder {
            private String finalDelay; 
            private String loop; 

            private Builder() {
            } 

            private Builder(Gif model) {
                this.finalDelay = model.finalDelay;
                this.loop = model.loop;
            } 

            /**
             * <p>The interval between two consecutive loops for the GIF format. Unit: 0.01s. For example, a value of 500 indicates 5 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * <p>The number of loops for the GIF or WebP format. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder loop(String loop) {
                this.loop = loop;
                return this;
            }

            public Gif build() {
                return new Gif(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class Segment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        private Segment(Builder builder) {
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segment create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String duration; 

            private Builder() {
            } 

            private Builder(Segment model) {
                this.duration = model.duration;
            } 

            /**
             * <p>The length of the segment. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            public Segment build() {
                return new Segment(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class MuxConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gif")
        private Gif gif;

        @com.aliyun.core.annotation.NameInMap("Segment")
        private Segment segment;

        private MuxConfig(Builder builder) {
            this.gif = builder.gif;
            this.segment = builder.segment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MuxConfig create() {
            return builder().build();
        }

        /**
         * @return gif
         */
        public Gif getGif() {
            return this.gif;
        }

        /**
         * @return segment
         */
        public Segment getSegment() {
            return this.segment;
        }

        public static final class Builder {
            private Gif gif; 
            private Segment segment; 

            private Builder() {
            } 

            private Builder(MuxConfig model) {
                this.gif = model.gif;
                this.segment = model.segment;
            } 

            /**
             * <p>The transmuxing configurations for the GIF format.</p>
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * <p>The segment configurations.</p>
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            public MuxConfig build() {
                return new MuxConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class TransConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TransMode")
        private String transMode;

        private TransConfig(Builder builder) {
            this.transMode = builder.transMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransConfig create() {
            return builder().build();
        }

        /**
         * @return transMode
         */
        public String getTransMode() {
            return this.transMode;
        }

        public static final class Builder {
            private String transMode; 

            private Builder() {
            } 

            private Builder(TransConfig model) {
                this.transMode = model.transMode;
            } 

            /**
             * <p>The transcoding mode. Valid values: onepass, twopass, and CBR. Default value: <strong>onepass</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>onepass</p>
             */
            public Builder transMode(String transMode) {
                this.transMode = transMode;
                return this;
            }

            public TransConfig build() {
                return new TransConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class BitrateBnd extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private String max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private String min;

        private BitrateBnd(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BitrateBnd create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        public static final class Builder {
            private String max; 
            private String min; 

            private Builder() {
            } 

            private Builder(BitrateBnd model) {
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            public BitrateBnd build() {
                return new BitrateBnd(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("BitrateBnd")
        private BitrateBnd bitrateBnd;

        @com.aliyun.core.annotation.NameInMap("Bufsize")
        private String bufsize;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Crf")
        private String crf;

        @com.aliyun.core.annotation.NameInMap("Degrain")
        private String degrain;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Maxrate")
        private String maxrate;

        @com.aliyun.core.annotation.NameInMap("PixFmt")
        private String pixFmt;

        @com.aliyun.core.annotation.NameInMap("Preset")
        private String preset;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Qscale")
        private String qscale;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Video(Builder builder) {
            this.bitrate = builder.bitrate;
            this.bitrateBnd = builder.bitrateBnd;
            this.bufsize = builder.bufsize;
            this.codec = builder.codec;
            this.crf = builder.crf;
            this.degrain = builder.degrain;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.maxrate = builder.maxrate;
            this.pixFmt = builder.pixFmt;
            this.preset = builder.preset;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.scanMode = builder.scanMode;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bitrateBnd
         */
        public BitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        /**
         * @return bufsize
         */
        public String getBufsize() {
            return this.bufsize;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return crf
         */
        public String getCrf() {
            return this.crf;
        }

        /**
         * @return degrain
         */
        public String getDegrain() {
            return this.degrain;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public String getGop() {
            return this.gop;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return maxrate
         */
        public String getMaxrate() {
            return this.maxrate;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return scanMode
         */
        public String getScanMode() {
            return this.scanMode;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private BitrateBnd bitrateBnd; 
            private String bufsize; 
            private String codec; 
            private String crf; 
            private String degrain; 
            private String fps; 
            private String gop; 
            private String height; 
            private String maxrate; 
            private String pixFmt; 
            private String preset; 
            private String profile; 
            private String qscale; 
            private String scanMode; 
            private String width; 

            private Builder() {
            } 

            private Builder(Video model) {
                this.bitrate = model.bitrate;
                this.bitrateBnd = model.bitrateBnd;
                this.bufsize = model.bufsize;
                this.codec = model.codec;
                this.crf = model.crf;
                this.degrain = model.degrain;
                this.fps = model.fps;
                this.gop = model.gop;
                this.height = model.height;
                this.maxrate = model.maxrate;
                this.pixFmt = model.pixFmt;
                this.preset = model.preset;
                this.profile = model.profile;
                this.qscale = model.qscale;
                this.scanMode = model.scanMode;
                this.width = model.width;
            } 

            /**
             * <p>The average bitrate of the video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The average bitrate range of the video.</p>
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * <p>The size of the buffer.</p>
             * <ul>
             * <li>Unit: KB.</li>
             * <li>Default value: <strong>6000</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * <p>The video codec. Default value: <strong>H.264</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The constant rate factor.</p>
             * <ul>
             * <li>Default value if the Codec parameter is set to H.264: <strong>23</strong>. Default value if the Codec parameter is set to H.265: <strong>26</strong>.</li>
             * <li>If this parameter is returned, the setting of the Bitrate parameter is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * <p>The strength of the independent noise reduction algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * <ul>
             * <li>The value is 60 if the frame rate of the input video exceeds 60.</li>
             * <li>Default value: the frame rate of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The maximum number of frames between two keyframes. Default value: <strong>250</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The height of the video.</p>
             * <ul>
             * <li>Unit: pixel.</li>
             * <li>Default value: the height of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1880</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * <p>The pixel format for video color encoding. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
             * 
             * <strong>example:</strong>
             * <p>yuvj420p</p>
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * <p>The preset video algorithm. Valid values: veryfast, fast, medium, slow, and slower. Default value: <strong>medium</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * <p>The codec profile. Valid values:</p>
             * <ul>
             * <li><strong>baseline</strong>: applicable to mobile devices.</li>
             * <li><strong>main</strong>: applicable to standard-definition devices.</li>
             * <li><strong>high</strong>: applicable to high-definition devices.</li>
             * <li>Default value: <strong>high</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>baseline</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The level of quality control on the video.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * <p>The scan mode. Valid values:</p>
             * <ul>
             * <li><strong>interlaced</strong></li>
             * <li><strong>progressive</strong></li>
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
             * <p>The width of the video.</p>
             * <ul>
             * <li>Unit: pixel.</li>
             * <li>Default value: the width of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1990</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private TransConfig transConfig;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        private Template(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.id = builder.id;
            this.muxConfig = builder.muxConfig;
            this.name = builder.name;
            this.state = builder.state;
            this.transConfig = builder.transConfig;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return muxConfig
         */
        public MuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return transConfig
         */
        public TransConfig getTransConfig() {
            return this.transConfig;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private Audio audio; 
            private Container container; 
            private String id; 
            private MuxConfig muxConfig; 
            private String name; 
            private String state; 
            private TransConfig transConfig; 
            private Video video; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.audio = model.audio;
                this.container = model.container;
                this.id = model.id;
                this.muxConfig = model.muxConfig;
                this.name = model.name;
                this.state = model.state;
                this.transConfig = model.transConfig;
                this.video = model.video;
            } 

            /**
             * <p>The audio codec configurations.</p>
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The container format configurations.</p>
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The ID of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>S00000000-00****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The transmuxing configurations.</p>
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>FLV-UD</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the template.</p>
             * <ul>
             * <li><strong>Normal</strong>: The template is normal.</li>
             * <li><strong>Deleted</strong>: The template is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The general transcoding configurations.</p>
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * <p>The video codec configurations.</p>
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List<Template> template;

        private TemplateList(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public java.util.List<Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List<Template> template; 

            private Builder() {
            } 

            private Builder(TemplateList model) {
                this.template = model.template;
            } 

            /**
             * Template.
             */
            public Builder template(java.util.List<Template> template) {
                this.template = template;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAnalysisJobResponseBody</p>
     */
    public static class AnalysisJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisConfig")
        private AnalysisConfig analysisConfig;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Long percent;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TemplateList")
        private TemplateList templateList;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private AnalysisJob(Builder builder) {
            this.analysisConfig = builder.analysisConfig;
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.id = builder.id;
            this.inputFile = builder.inputFile;
            this.MNSMessageResult = builder.MNSMessageResult;
            this.message = builder.message;
            this.percent = builder.percent;
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
            this.state = builder.state;
            this.templateList = builder.templateList;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisJob create() {
            return builder().build();
        }

        /**
         * @return analysisConfig
         */
        public AnalysisConfig getAnalysisConfig() {
            return this.analysisConfig;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inputFile
         */
        public InputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return MNSMessageResult
         */
        public MNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Long getPercent() {
            return this.percent;
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
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return templateList
         */
        public TemplateList getTemplateList() {
            return this.templateList;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private AnalysisConfig analysisConfig; 
            private String code; 
            private String creationTime; 
            private String id; 
            private InputFile inputFile; 
            private MNSMessageResult MNSMessageResult; 
            private String message; 
            private Long percent; 
            private String pipelineId; 
            private String priority; 
            private String state; 
            private TemplateList templateList; 
            private String userData; 

            private Builder() {
            } 

            private Builder(AnalysisJob model) {
                this.analysisConfig = model.analysisConfig;
                this.code = model.code;
                this.creationTime = model.creationTime;
                this.id = model.id;
                this.inputFile = model.inputFile;
                this.MNSMessageResult = model.MNSMessageResult;
                this.message = model.message;
                this.percent = model.percent;
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
                this.state = model.state;
                this.templateList = model.templateList;
                this.userData = model.userData;
            } 

            /**
             * <p>The job configurations.</p>
             */
            public Builder analysisConfig(AnalysisConfig analysisConfig) {
                this.analysisConfig = analysisConfig;
                return this;
            }

            /**
             * <p>The error code returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.ResourceNotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-01-10T12:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the template analysis job.</p>
             * 
             * <strong>example:</strong>
             * <p>57f6aa3f84824309bcba67231b40****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The information about the job input.</p>
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The message sent by MNS to notify users of the job result.</p>
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * <p>The error message returned if the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated &quot;PipelineId&quot; cannot be found</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The transcoding progress.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Long percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The ID of the MPS queue to which the analysis job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>bb558c1cc25b45309aab5be44d19****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the job in the MPS queue to which the job was submitted.</p>
             * <ul>
             * <li>Valid values: <strong>1 to 10</strong>. A value of 10 indicates the highest priority.</li>
             * <li>Default value: <strong>10</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>Submitted</strong>: The job is submitted.</li>
             * <li><strong>Analyzing</strong>: The job is being run.</li>
             * <li><strong>Success</strong>: The job is successful.</li>
             * <li><strong>Fail</strong>: The job fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The matched preset templates.</p>
             */
            public Builder templateList(TemplateList templateList) {
                this.templateList = templateList;
                return this;
            }

            /**
             * <p>The custom data.</p>
             * 
             * <strong>example:</strong>
             * <p>testid-001</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public AnalysisJob build() {
                return new AnalysisJob(this);
            } 

        } 

    }
}
