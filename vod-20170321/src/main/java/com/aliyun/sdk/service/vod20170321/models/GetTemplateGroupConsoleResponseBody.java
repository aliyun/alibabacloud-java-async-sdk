// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateGroupConsoleResponseBody</p>
 */
public class GetTemplateGroupConsoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateGroup")
    private TemplateGroup templateGroup;

    private GetTemplateGroupConsoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateGroup = builder.templateGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateGroupConsoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateGroup
     */
    public TemplateGroup getTemplateGroup() {
        return this.templateGroup;
    }

    public static final class Builder {
        private String requestId; 
        private TemplateGroup templateGroup; 

        private Builder() {
        } 

        private Builder(GetTemplateGroupConsoleResponseBody model) {
            this.requestId = model.requestId;
            this.templateGroup = model.templateGroup;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateGroup.
         */
        public Builder templateGroup(TemplateGroup templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }

        public GetTemplateGroupConsoleResponseBody build() {
            return new GetTemplateGroupConsoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Remove")
        private String remove;

        @com.aliyun.core.annotation.NameInMap("Samplerate")
        private String samplerate;

        private Audio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.remove = builder.remove;
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
         * @return remove
         */
        public String getRemove() {
            return this.remove;
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
            private String remove; 
            private String samplerate; 

            private Builder() {
            } 

            private Builder(Audio model) {
                this.bitrate = model.bitrate;
                this.channels = model.channels;
                this.codec = model.codec;
                this.profile = model.profile;
                this.remove = model.remove;
                this.samplerate = model.samplerate;
            } 

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
             * Remove.
             */
            public Builder remove(String remove) {
                this.remove = remove;
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
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
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
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
     */
    public static class EncryptionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DecryptKeyUri")
        private String decryptKeyUri;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("KeyEncryptMethod")
        private String keyEncryptMethod;

        private EncryptionConfig(Builder builder) {
            this.decryptKeyUri = builder.decryptKeyUri;
            this.encryptType = builder.encryptType;
            this.keyEncryptMethod = builder.keyEncryptMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptionConfig create() {
            return builder().build();
        }

        /**
         * @return decryptKeyUri
         */
        public String getDecryptKeyUri() {
            return this.decryptKeyUri;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return keyEncryptMethod
         */
        public String getKeyEncryptMethod() {
            return this.keyEncryptMethod;
        }

        public static final class Builder {
            private String decryptKeyUri; 
            private String encryptType; 
            private String keyEncryptMethod; 

            private Builder() {
            } 

            private Builder(EncryptionConfig model) {
                this.decryptKeyUri = model.decryptKeyUri;
                this.encryptType = model.encryptType;
                this.keyEncryptMethod = model.keyEncryptMethod;
            } 

            /**
             * DecryptKeyUri.
             */
            public Builder decryptKeyUri(String decryptKeyUri) {
                this.decryptKeyUri = decryptKeyUri;
                return this;
            }

            /**
             * EncryptType.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * KeyEncryptMethod.
             */
            public Builder keyEncryptMethod(String keyEncryptMethod) {
                this.keyEncryptMethod = keyEncryptMethod;
                return this;
            }

            public EncryptionConfig build() {
                return new EncryptionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
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
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
     */
    public static class MuxConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Segment")
        private Segment segment;

        private MuxConfig(Builder builder) {
            this.segment = builder.segment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MuxConfig create() {
            return builder().build();
        }

        /**
         * @return segment
         */
        public Segment getSegment() {
            return this.segment;
        }

        public static final class Builder {
            private Segment segment; 

            private Builder() {
            } 

            private Builder(MuxConfig model) {
                this.segment = model.segment;
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
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
     */
    public static class TransConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrate")
        private String isCheckAudioBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrateFail")
        private String isCheckAudioBitrateFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckReso")
        private String isCheckReso;

        @com.aliyun.core.annotation.NameInMap("IsCheckResoFail")
        private String isCheckResoFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrate")
        private String isCheckVideoBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrateFail")
        private String isCheckVideoBitrateFail;

        @com.aliyun.core.annotation.NameInMap("TransMode")
        private String transMode;

        private TransConfig(Builder builder) {
            this.isCheckAudioBitrate = builder.isCheckAudioBitrate;
            this.isCheckAudioBitrateFail = builder.isCheckAudioBitrateFail;
            this.isCheckReso = builder.isCheckReso;
            this.isCheckResoFail = builder.isCheckResoFail;
            this.isCheckVideoBitrate = builder.isCheckVideoBitrate;
            this.isCheckVideoBitrateFail = builder.isCheckVideoBitrateFail;
            this.transMode = builder.transMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransConfig create() {
            return builder().build();
        }

        /**
         * @return isCheckAudioBitrate
         */
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        /**
         * @return isCheckAudioBitrateFail
         */
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        /**
         * @return isCheckReso
         */
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        /**
         * @return isCheckResoFail
         */
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        /**
         * @return isCheckVideoBitrate
         */
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        /**
         * @return isCheckVideoBitrateFail
         */
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        /**
         * @return transMode
         */
        public String getTransMode() {
            return this.transMode;
        }

        public static final class Builder {
            private String isCheckAudioBitrate; 
            private String isCheckAudioBitrateFail; 
            private String isCheckReso; 
            private String isCheckResoFail; 
            private String isCheckVideoBitrate; 
            private String isCheckVideoBitrateFail; 
            private String transMode; 

            private Builder() {
            } 

            private Builder(TransConfig model) {
                this.isCheckAudioBitrate = model.isCheckAudioBitrate;
                this.isCheckAudioBitrateFail = model.isCheckAudioBitrateFail;
                this.isCheckReso = model.isCheckReso;
                this.isCheckResoFail = model.isCheckResoFail;
                this.isCheckVideoBitrate = model.isCheckVideoBitrate;
                this.isCheckVideoBitrateFail = model.isCheckVideoBitrateFail;
                this.transMode = model.transMode;
            } 

            /**
             * IsCheckAudioBitrate.
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * IsCheckAudioBitrateFail.
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * IsCheckReso.
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * IsCheckResoFail.
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * IsCheckVideoBitrate.
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * IsCheckVideoBitrateFail.
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

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
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
     */
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Bufsize")
        private String bufsize;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Crf")
        private String crf;

        @com.aliyun.core.annotation.NameInMap("Crop")
        private String crop;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("LongShortMode")
        private String longShortMode;

        @com.aliyun.core.annotation.NameInMap("Maxrate")
        private String maxrate;

        @com.aliyun.core.annotation.NameInMap("Pad")
        private String pad;

        @com.aliyun.core.annotation.NameInMap("PixFmt")
        private String pixFmt;

        @com.aliyun.core.annotation.NameInMap("Preset")
        private String preset;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Remove")
        private String remove;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Video(Builder builder) {
            this.bitrate = builder.bitrate;
            this.bufsize = builder.bufsize;
            this.codec = builder.codec;
            this.crf = builder.crf;
            this.crop = builder.crop;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.longShortMode = builder.longShortMode;
            this.maxrate = builder.maxrate;
            this.pad = builder.pad;
            this.pixFmt = builder.pixFmt;
            this.preset = builder.preset;
            this.profile = builder.profile;
            this.remove = builder.remove;
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
         * @return crop
         */
        public String getCrop() {
            return this.crop;
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
         * @return longShortMode
         */
        public String getLongShortMode() {
            return this.longShortMode;
        }

        /**
         * @return maxrate
         */
        public String getMaxrate() {
            return this.maxrate;
        }

        /**
         * @return pad
         */
        public String getPad() {
            return this.pad;
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
         * @return remove
         */
        public String getRemove() {
            return this.remove;
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
            private String bufsize; 
            private String codec; 
            private String crf; 
            private String crop; 
            private String fps; 
            private String gop; 
            private String height; 
            private String longShortMode; 
            private String maxrate; 
            private String pad; 
            private String pixFmt; 
            private String preset; 
            private String profile; 
            private String remove; 
            private String scanMode; 
            private String width; 

            private Builder() {
            } 

            private Builder(Video model) {
                this.bitrate = model.bitrate;
                this.bufsize = model.bufsize;
                this.codec = model.codec;
                this.crf = model.crf;
                this.crop = model.crop;
                this.fps = model.fps;
                this.gop = model.gop;
                this.height = model.height;
                this.longShortMode = model.longShortMode;
                this.maxrate = model.maxrate;
                this.pad = model.pad;
                this.pixFmt = model.pixFmt;
                this.preset = model.preset;
                this.profile = model.profile;
                this.remove = model.remove;
                this.scanMode = model.scanMode;
                this.width = model.width;
            } 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
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
             * Crop.
             */
            public Builder crop(String crop) {
                this.crop = crop;
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
             * LongShortMode.
             */
            public Builder longShortMode(String longShortMode) {
                this.longShortMode = longShortMode;
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
             * Pad.
             */
            public Builder pad(String pad) {
                this.pad = pad;
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
             * Remove.
             */
            public Builder remove(String remove) {
                this.remove = remove;
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
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Encrypt")
        private String encrypt;

        @com.aliyun.core.annotation.NameInMap("EncryptionConfig")
        private EncryptionConfig encryptionConfig;

        @com.aliyun.core.annotation.NameInMap("IsLocked")
        private String isLocked;

        @com.aliyun.core.annotation.NameInMap("MediaDefinition")
        private String mediaDefinition;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NarrowBand")
        private String narrowBand;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private TransConfig transConfig;

        @com.aliyun.core.annotation.NameInMap("UseWaterMark")
        private String useWaterMark;

        @com.aliyun.core.annotation.NameInMap("UserWaterMark")
        private String userWaterMark;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        private Template(Builder builder) {
            this.audio = builder.audio;
            this.condition = builder.condition;
            this.container = builder.container;
            this.definition = builder.definition;
            this.encrypt = builder.encrypt;
            this.encryptionConfig = builder.encryptionConfig;
            this.isLocked = builder.isLocked;
            this.mediaDefinition = builder.mediaDefinition;
            this.muxConfig = builder.muxConfig;
            this.name = builder.name;
            this.narrowBand = builder.narrowBand;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.transConfig = builder.transConfig;
            this.useWaterMark = builder.useWaterMark;
            this.userWaterMark = builder.userWaterMark;
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
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return encrypt
         */
        public String getEncrypt() {
            return this.encrypt;
        }

        /**
         * @return encryptionConfig
         */
        public EncryptionConfig getEncryptionConfig() {
            return this.encryptionConfig;
        }

        /**
         * @return isLocked
         */
        public String getIsLocked() {
            return this.isLocked;
        }

        /**
         * @return mediaDefinition
         */
        public String getMediaDefinition() {
            return this.mediaDefinition;
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
         * @return narrowBand
         */
        public String getNarrowBand() {
            return this.narrowBand;
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
         * @return transConfig
         */
        public TransConfig getTransConfig() {
            return this.transConfig;
        }

        /**
         * @return useWaterMark
         */
        public String getUseWaterMark() {
            return this.useWaterMark;
        }

        /**
         * @return userWaterMark
         */
        public String getUserWaterMark() {
            return this.userWaterMark;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private Audio audio; 
            private String condition; 
            private Container container; 
            private String definition; 
            private String encrypt; 
            private EncryptionConfig encryptionConfig; 
            private String isLocked; 
            private String mediaDefinition; 
            private MuxConfig muxConfig; 
            private String name; 
            private String narrowBand; 
            private String status; 
            private String templateId; 
            private TransConfig transConfig; 
            private String useWaterMark; 
            private String userWaterMark; 
            private Video video; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.audio = model.audio;
                this.condition = model.condition;
                this.container = model.container;
                this.definition = model.definition;
                this.encrypt = model.encrypt;
                this.encryptionConfig = model.encryptionConfig;
                this.isLocked = model.isLocked;
                this.mediaDefinition = model.mediaDefinition;
                this.muxConfig = model.muxConfig;
                this.name = model.name;
                this.narrowBand = model.narrowBand;
                this.status = model.status;
                this.templateId = model.templateId;
                this.transConfig = model.transConfig;
                this.useWaterMark = model.useWaterMark;
                this.userWaterMark = model.userWaterMark;
                this.video = model.video;
            } 

            /**
             * Audio.
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
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
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * Encrypt.
             */
            public Builder encrypt(String encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * EncryptionConfig.
             */
            public Builder encryptionConfig(EncryptionConfig encryptionConfig) {
                this.encryptionConfig = encryptionConfig;
                return this;
            }

            /**
             * IsLocked.
             */
            public Builder isLocked(String isLocked) {
                this.isLocked = isLocked;
                return this;
            }

            /**
             * MediaDefinition.
             */
            public Builder mediaDefinition(String mediaDefinition) {
                this.mediaDefinition = mediaDefinition;
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
             * NarrowBand.
             */
            public Builder narrowBand(String narrowBand) {
                this.narrowBand = narrowBand;
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
             * TransConfig.
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * UseWaterMark.
             */
            public Builder useWaterMark(String useWaterMark) {
                this.useWaterMark = useWaterMark;
                return this;
            }

            /**
             * UserWaterMark.
             */
            public Builder userWaterMark(String userWaterMark) {
                this.userWaterMark = userWaterMark;
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
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List<Template> template;

        private Templates(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
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

            private Builder(Templates model) {
                this.template = model.template;
            } 

            /**
             * Template.
             */
            public Builder template(java.util.List<Template> template) {
                this.template = template;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateGroupConsoleResponseBody</p>
     */
    public static class TemplateGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultGroup")
        private String defaultGroup;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupSymbol")
        private String groupSymbol;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("IsLocked")
        private String isLocked;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Templates")
        private Templates templates;

        @com.aliyun.core.annotation.NameInMap("TranscodeMode")
        private String transcodeMode;

        private TemplateGroup(Builder builder) {
            this.defaultGroup = builder.defaultGroup;
            this.groupId = builder.groupId;
            this.groupSymbol = builder.groupSymbol;
            this.groupType = builder.groupType;
            this.isLocked = builder.isLocked;
            this.name = builder.name;
            this.status = builder.status;
            this.templates = builder.templates;
            this.transcodeMode = builder.transcodeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateGroup create() {
            return builder().build();
        }

        /**
         * @return defaultGroup
         */
        public String getDefaultGroup() {
            return this.defaultGroup;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupSymbol
         */
        public String getGroupSymbol() {
            return this.groupSymbol;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return isLocked
         */
        public String getIsLocked() {
            return this.isLocked;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templates
         */
        public Templates getTemplates() {
            return this.templates;
        }

        /**
         * @return transcodeMode
         */
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        public static final class Builder {
            private String defaultGroup; 
            private String groupId; 
            private String groupSymbol; 
            private String groupType; 
            private String isLocked; 
            private String name; 
            private String status; 
            private Templates templates; 
            private String transcodeMode; 

            private Builder() {
            } 

            private Builder(TemplateGroup model) {
                this.defaultGroup = model.defaultGroup;
                this.groupId = model.groupId;
                this.groupSymbol = model.groupSymbol;
                this.groupType = model.groupType;
                this.isLocked = model.isLocked;
                this.name = model.name;
                this.status = model.status;
                this.templates = model.templates;
                this.transcodeMode = model.transcodeMode;
            } 

            /**
             * DefaultGroup.
             */
            public Builder defaultGroup(String defaultGroup) {
                this.defaultGroup = defaultGroup;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupSymbol.
             */
            public Builder groupSymbol(String groupSymbol) {
                this.groupSymbol = groupSymbol;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * IsLocked.
             */
            public Builder isLocked(String isLocked) {
                this.isLocked = isLocked;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Templates.
             */
            public Builder templates(Templates templates) {
                this.templates = templates;
                return this;
            }

            /**
             * TranscodeMode.
             */
            public Builder transcodeMode(String transcodeMode) {
                this.transcodeMode = transcodeMode;
                return this;
            }

            public TemplateGroup build() {
                return new TemplateGroup(this);
            } 

        } 

    }
}
