// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAnalysisJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAnalysisJobListResponseBody</p>
 */
public class QueryAnalysisJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnalysisJobList")
    private AnalysisJobList analysisJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAnalysisJobIds")
    private NonExistAnalysisJobIds nonExistAnalysisJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAnalysisJobListResponseBody(Builder builder) {
        this.analysisJobList = builder.analysisJobList;
        this.nonExistAnalysisJobIds = builder.nonExistAnalysisJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAnalysisJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return analysisJobList
     */
    public AnalysisJobList getAnalysisJobList() {
        return this.analysisJobList;
    }

    /**
     * @return nonExistAnalysisJobIds
     */
    public NonExistAnalysisJobIds getNonExistAnalysisJobIds() {
        return this.nonExistAnalysisJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AnalysisJobList analysisJobList; 
        private NonExistAnalysisJobIds nonExistAnalysisJobIds; 
        private String requestId; 

        /**
         * The IDs of template analysis jobs.
         */
        public Builder analysisJobList(AnalysisJobList analysisJobList) {
            this.analysisJobList = analysisJobList;
            return this;
        }

        /**
         * The message sent by Message Service (MNS) to notify the user of the job result.
         */
        public Builder nonExistAnalysisJobIds(NonExistAnalysisJobIds nonExistAnalysisJobIds) {
            this.nonExistAnalysisJobIds = nonExistAnalysisJobIds;
            return this;
        }

        /**
         * The status of the job. Valid values:
         * <p>
         * 
         * *   **Submitted**: The job has been submitted.
         * *   **Analyzing**: The job is being run.
         * *   **Success**: The job is successful.
         * *   **Fail**: The job fails.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAnalysisJobListResponseBody build() {
            return new QueryAnalysisJobListResponseBody(this);
        } 

    } 

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

            /**
             * The height of the video image after the margins are cropped out.
             * <p>
             * 
             * >  This parameter is invalid if the Mode parameter is set to Auto or None.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The left margin to be cropped out.
             * <p>
             * 
             * >  This parameter is invalid if the Mode parameter is set to Auto or None.
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * The cropping mode. Valid values:
             * <p>
             * 
             * *   **Auto**: Cropping was automatically run.
             * *   **Force**: Cropping was forced to run.
             * *   **None**: Cropping was forced not to run.
             * *   This parameter is required if the value of the Crop parameter is not an empty JSON {}.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The top margin to be cropped out.
             * <p>
             * 
             * >  This parameter is invalid if the Mode parameter is set to Auto or None.
             */
            public Builder top(String top) {
                this.top = top;
                return this;
            }

            /**
             * The width of the video image after the margins are cropped out.
             * <p>
             * 
             * >  This parameter is invalid if the Mode parameter is set to Auto or None.
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

            /**
             * The cropping configuration of the video image.
             */
            public Builder crop(Crop crop) {
                this.crop = crop;
                return this;
            }

            /**
             * Specifies whether deinterlacing was forced to run. Valid values:
             * <p>
             * 
             * *   **Auto**: Deinterlacing was automatically run.
             * *   **Force**: Deinterlacing was forced to run.
             * *   **None**: Deinterlacing was forced not to run.
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

            /**
             * The playback mode. Valid values:
             * <p>
             * 
             * *   **network**: online playback.
             * *   **local**: playback on on-premises devices.
             * *   Default value: **network**.
             */
            public Builder methodStreaming(String methodStreaming) {
                this.methodStreaming = methodStreaming;
                return this;
            }

            /**
             * The quality level of the job output. Default value: **25**.
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

            /**
             * The control on the attributes of the job output.
             */
            public Builder propertiesControl(PropertiesControl propertiesControl) {
                this.propertiesControl = propertiesControl;
                return this;
            }

            /**
             * The quality control on the job output.
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

            /**
             * The name of the OSS bucket in which the input file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The region in which OSS resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the Object Storage Service (OSS) object that is used as the input file.
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

            /**
             * The error code returned if the job failed. This parameter is not returned if the job was successful.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned if the job failed. This parameter is not returned if the job was successful.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the message returned if the job was successful. This parameter is not returned if the job failed.
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

            /**
             * The audio bitrate of the output file.
             * <p>
             * 
             * *   Valid values: **8 to 1000**.
             * *   Unit: Kbit/s.
             * *   Default value: **128**.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The number of sound channels. Default value: **2**.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * The audio codec. Default value: **aac**. Valid values:
             * <p>
             * 
             * *   **aac**
             * *   **mp3**
             * *   **vorbis**
             * *   **flac**
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * The codec profile of the audio. Valid values when the **Codec** parameter is set to **aac**:
             * <p>
             * 
             * *   **aac_low**
             * *   **aac_he**
             * *   **aac_he_v2**
             * *   **aac_ld**
             * *   **aac_eld**
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The level of quality control on the audio.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * The sampling rate.
             * <p>
             * 
             * *   Unit: Hz.
             * *   Default value: **44100**.
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

            /**
             * The container format.
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

            /**
             * The interval between two consecutive loops for the GIF format. Unit: 0.01 second. For example, a value of 500 indicates 5 seconds.
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * The number of loops for the GIF or WebP format. Default value: 0.
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

            /**
             * The segment length. Unit: seconds.
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

            /**
             * The transmuxing configurations for the GIF format.
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * The segment configurations.
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

            /**
             * The transcoding mode. Default value: **onepass**. Valid values:
             * <p>
             * 
             * *   **onepass**
             * *   **twopass**
             * *   **CBR**
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

            /**
             * The upper limit of the total bitrate. Unit: Kbit/s.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * The lower limit of the total bitrate. Unit: Kbit/s.
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

            /**
             * The average bitrate of the video. Unit: Kbit/s.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The average bitrate range of the video.
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * The buffer size.
             * <p>
             * 
             * *   Unit: KB.
             * *   Default value: **6000**.
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * The codec. Valid values: H.264 and H.265. Default value: **H.264**.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * The constant rate factor.
             * <p>
             * 
             * *   Default value when the the Codec parameter is set to H.264: **23**, default value when the the Codec parameter is set to H.265: **26**.
             * *   If this parameter is specified, the value of the Bitrate parameter becomes invalid.
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * The strength of the independent noise reduction algorithm.
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * The frame rate of the video.
             * <p>
             * 
             * *   The value is 60 if the frame rate of the input file exceeds 60.
             * *   Default value: **the frame rate of the input video**.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The maximum number of frames between two keyframes. Default value: **250**.
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * The height of the video.
             * <p>
             * 
             * *   Unit: pixel.
             * *   Default value: **the height of the input video**.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The maximum bitrate of the video.
             * <p>
             * 
             * *   Valid values: **10 to 50000**.
             * *   Unit: Kbit/s.
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * The preset video algorithm. Valid values: veryfast, fast, medium, slow, and slower. Default value: **medium**.
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * The codec profile. Valid values:
             * <p>
             * 
             * *   **baseline**: applicable to mobile devices.
             * *   **main**: applicable to standard-definition devices.
             * *   **high**: applicable to high-definition devices.
             * *   Default value: **high**.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The level of quality control on the video.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * The scan mode. Valid values:
             * <p>
             * 
             * *   **interlaced**
             * *   **progressive**
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * The width of the video.
             * <p>
             * 
             * *   Unit: pixel.
             * *   Default value: **the width of the input video**.
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

            /**
             * The audio codec configurations.
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * The container format configurations.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * The transcoding template ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The transmuxing configurations.
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The state of the template. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **Deleted**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The general transcoding configurations.
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * The video codec configurations.
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
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List < Template> template;

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
        public java.util.List < Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List < Template> template; 

            /**
             * Template.
             */
            public Builder template(java.util.List < Template> template) {
                this.template = template;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
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

            /**
             * The job configurations.
             */
            public Builder analysisConfig(AnalysisConfig analysisConfig) {
                this.analysisConfig = analysisConfig;
                return this;
            }

            /**
             * The error code returned if the job fails.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the template analysis job.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The information about the job input.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * The message sent by Message Service (MNS) to notify users of the job result.
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * The error message returned if the job failed.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The transcoding progress.
             */
            public Builder percent(Long percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the MPS queue to which the job was submitted.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The priority of the job in the ApsaraVideo Media Processing (MPS) queue to which the job was submitted.
             * <p>
             * 
             * *   Valid values: **1 to 10**. The value 10 indicates the highest priority.
             * *   Default value: **10**.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The job status.
             * <p>
             * 
             * *   **Submitted**: The job was submitted.
             * *   **Analyzing**: The job is in progress.
             * *   **Success**: The job was successful.
             * *   **Fail**: The job failed.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The matched preset templates.
             */
            public Builder templateList(TemplateList templateList) {
                this.templateList = templateList;
                return this;
            }

            /**
             * The custom data.
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
    public static class AnalysisJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisJob")
        private java.util.List < AnalysisJob> analysisJob;

        private AnalysisJobList(Builder builder) {
            this.analysisJob = builder.analysisJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisJobList create() {
            return builder().build();
        }

        /**
         * @return analysisJob
         */
        public java.util.List < AnalysisJob> getAnalysisJob() {
            return this.analysisJob;
        }

        public static final class Builder {
            private java.util.List < AnalysisJob> analysisJob; 

            /**
             * AnalysisJob.
             */
            public Builder analysisJob(java.util.List < AnalysisJob> analysisJob) {
                this.analysisJob = analysisJob;
                return this;
            }

            public AnalysisJobList build() {
                return new AnalysisJobList(this);
            } 

        } 

    }
    public static class NonExistAnalysisJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistAnalysisJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAnalysisJobIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistAnalysisJobIds build() {
                return new NonExistAnalysisJobIds(this);
            } 

        } 

    }
}
