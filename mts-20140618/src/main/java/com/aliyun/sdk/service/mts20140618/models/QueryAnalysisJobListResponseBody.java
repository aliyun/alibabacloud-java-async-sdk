// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAnalysisJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAnalysisJobListResponseBody</p>
 */
public class QueryAnalysisJobListResponseBody extends TeaModel {
    @NameInMap("AnalysisJobList")
    private AnalysisJobList analysisJobList;

    @NameInMap("NonExistAnalysisJobIds")
    private NonExistAnalysisJobIds nonExistAnalysisJobIds;

    @NameInMap("RequestId")
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
         * AnalysisJobList.
         */
        public Builder analysisJobList(AnalysisJobList analysisJobList) {
            this.analysisJobList = analysisJobList;
            return this;
        }

        /**
         * NonExistAnalysisJobIds.
         */
        public Builder nonExistAnalysisJobIds(NonExistAnalysisJobIds nonExistAnalysisJobIds) {
            this.nonExistAnalysisJobIds = nonExistAnalysisJobIds;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Height")
        private String height;

        @NameInMap("Left")
        private String left;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Top")
        private String top;

        @NameInMap("Width")
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
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(String top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
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
        @NameInMap("Crop")
        private Crop crop;

        @NameInMap("Deinterlace")
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
             * Crop.
             */
            public Builder crop(Crop crop) {
                this.crop = crop;
                return this;
            }

            /**
             * Deinterlace.
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
        @NameInMap("MethodStreaming")
        private String methodStreaming;

        @NameInMap("RateQuality")
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
             * MethodStreaming.
             */
            public Builder methodStreaming(String methodStreaming) {
                this.methodStreaming = methodStreaming;
                return this;
            }

            /**
             * RateQuality.
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
        @NameInMap("PropertiesControl")
        private PropertiesControl propertiesControl;

        @NameInMap("QualityControl")
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
             * PropertiesControl.
             */
            public Builder propertiesControl(PropertiesControl propertiesControl) {
                this.propertiesControl = propertiesControl;
                return this;
            }

            /**
             * QualityControl.
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
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
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
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
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
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("MessageId")
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * MessageId.
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
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Channels")
        private String channels;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Qscale")
        private String qscale;

        @NameInMap("Samplerate")
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
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Qscale.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * Samplerate.
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
        @NameInMap("Format")
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
             * Format.
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
        @NameInMap("FinalDelay")
        private String finalDelay;

        @NameInMap("Loop")
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
             * FinalDelay.
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * Loop.
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
        @NameInMap("Duration")
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
             * Duration.
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
        @NameInMap("Gif")
        private Gif gif;

        @NameInMap("Segment")
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
             * Gif.
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * Segment.
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
        @NameInMap("TransMode")
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
             * TransMode.
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
        @NameInMap("Max")
        private String max;

        @NameInMap("Min")
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
             * Max.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
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
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("BitrateBnd")
        private BitrateBnd bitrateBnd;

        @NameInMap("Bufsize")
        private String bufsize;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Crf")
        private String crf;

        @NameInMap("Degrain")
        private String degrain;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Gop")
        private String gop;

        @NameInMap("Height")
        private String height;

        @NameInMap("Maxrate")
        private String maxrate;

        @NameInMap("PixFmt")
        private String pixFmt;

        @NameInMap("Preset")
        private String preset;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Qscale")
        private String qscale;

        @NameInMap("ScanMode")
        private String scanMode;

        @NameInMap("Width")
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
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * BitrateBnd.
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * Bufsize.
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Crf.
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * Degrain.
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Gop.
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Maxrate.
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * PixFmt.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * Preset.
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Qscale.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * ScanMode.
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * Width.
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
        @NameInMap("Audio")
        private Audio audio;

        @NameInMap("Container")
        private Container container;

        @NameInMap("Id")
        private String id;

        @NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @NameInMap("Name")
        private String name;

        @NameInMap("State")
        private String state;

        @NameInMap("TransConfig")
        private TransConfig transConfig;

        @NameInMap("Video")
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
             * Audio.
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * Container.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MuxConfig.
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TransConfig.
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * Video.
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
        @NameInMap("Template")
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
        @NameInMap("AnalysisConfig")
        private AnalysisConfig analysisConfig;

        @NameInMap("Code")
        private String code;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("InputFile")
        private InputFile inputFile;

        @NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        private String message;

        @NameInMap("Percent")
        private Long percent;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("State")
        private String state;

        @NameInMap("TemplateList")
        private TemplateList templateList;

        @NameInMap("UserData")
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
             * AnalysisConfig.
             */
            public Builder analysisConfig(AnalysisConfig analysisConfig) {
                this.analysisConfig = analysisConfig;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InputFile.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * MNSMessageResult.
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(Long percent) {
                this.percent = percent;
                return this;
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
            public Builder priority(String priority) {
                this.priority = priority;
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
             * TemplateList.
             */
            public Builder templateList(TemplateList templateList) {
                this.templateList = templateList;
                return this;
            }

            /**
             * UserData.
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
        @NameInMap("AnalysisJob")
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
        @NameInMap("String")
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
