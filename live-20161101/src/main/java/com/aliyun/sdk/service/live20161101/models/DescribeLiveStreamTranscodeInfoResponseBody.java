// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamTranscodeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamTranscodeInfoResponseBody</p>
 */
public class DescribeLiveStreamTranscodeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTranscodeList")
    private DomainTranscodeList domainTranscodeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamTranscodeInfoResponseBody(Builder builder) {
        this.domainTranscodeList = builder.domainTranscodeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamTranscodeInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainTranscodeList
     */
    public DomainTranscodeList getDomainTranscodeList() {
        return this.domainTranscodeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainTranscodeList domainTranscodeList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamTranscodeInfoResponseBody model) {
            this.domainTranscodeList = model.domainTranscodeList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The transcoding configurations.</p>
         */
        public Builder domainTranscodeList(DomainTranscodeList domainTranscodeList) {
            this.domainTranscodeList = domainTranscodeList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62136AE6-7793-45ED-B14A-60D19A9486D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamTranscodeInfoResponseBody build() {
            return new DescribeLiveStreamTranscodeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamTranscodeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamTranscodeInfoResponseBody</p>
     */
    public static class CustomTranscodeParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioBitrate")
        private Integer audioBitrate;

        @com.aliyun.core.annotation.NameInMap("AudioChannelNum")
        private Integer audioChannelNum;

        @com.aliyun.core.annotation.NameInMap("AudioCodec")
        private String audioCodec;

        @com.aliyun.core.annotation.NameInMap("AudioProfile")
        private String audioProfile;

        @com.aliyun.core.annotation.NameInMap("AudioRate")
        private Integer audioRate;

        @com.aliyun.core.annotation.NameInMap("Bframes")
        private String bframes;

        @com.aliyun.core.annotation.NameInMap("BitrateWithSource")
        private java.util.Map<String, ?> bitrateWithSource;

        @com.aliyun.core.annotation.NameInMap("ExtWithSource")
        private java.util.Map<String, ?> extWithSource;

        @com.aliyun.core.annotation.NameInMap("FPS")
        private Integer FPS;

        @com.aliyun.core.annotation.NameInMap("FpsWithSource")
        private java.util.Map<String, ?> fpsWithSource;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("ResWithSource")
        private java.util.Map<String, ?> resWithSource;

        @com.aliyun.core.annotation.NameInMap("RtsFlag")
        private String rtsFlag;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("VideoBitrate")
        private Integer videoBitrate;

        @com.aliyun.core.annotation.NameInMap("VideoProfile")
        private String videoProfile;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private CustomTranscodeParameters(Builder builder) {
            this.audioBitrate = builder.audioBitrate;
            this.audioChannelNum = builder.audioChannelNum;
            this.audioCodec = builder.audioCodec;
            this.audioProfile = builder.audioProfile;
            this.audioRate = builder.audioRate;
            this.bframes = builder.bframes;
            this.bitrateWithSource = builder.bitrateWithSource;
            this.extWithSource = builder.extWithSource;
            this.FPS = builder.FPS;
            this.fpsWithSource = builder.fpsWithSource;
            this.gop = builder.gop;
            this.height = builder.height;
            this.resWithSource = builder.resWithSource;
            this.rtsFlag = builder.rtsFlag;
            this.templateType = builder.templateType;
            this.videoBitrate = builder.videoBitrate;
            this.videoProfile = builder.videoProfile;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomTranscodeParameters create() {
            return builder().build();
        }

        /**
         * @return audioBitrate
         */
        public Integer getAudioBitrate() {
            return this.audioBitrate;
        }

        /**
         * @return audioChannelNum
         */
        public Integer getAudioChannelNum() {
            return this.audioChannelNum;
        }

        /**
         * @return audioCodec
         */
        public String getAudioCodec() {
            return this.audioCodec;
        }

        /**
         * @return audioProfile
         */
        public String getAudioProfile() {
            return this.audioProfile;
        }

        /**
         * @return audioRate
         */
        public Integer getAudioRate() {
            return this.audioRate;
        }

        /**
         * @return bframes
         */
        public String getBframes() {
            return this.bframes;
        }

        /**
         * @return bitrateWithSource
         */
        public java.util.Map<String, ?> getBitrateWithSource() {
            return this.bitrateWithSource;
        }

        /**
         * @return extWithSource
         */
        public java.util.Map<String, ?> getExtWithSource() {
            return this.extWithSource;
        }

        /**
         * @return FPS
         */
        public Integer getFPS() {
            return this.FPS;
        }

        /**
         * @return fpsWithSource
         */
        public java.util.Map<String, ?> getFpsWithSource() {
            return this.fpsWithSource;
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
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return resWithSource
         */
        public java.util.Map<String, ?> getResWithSource() {
            return this.resWithSource;
        }

        /**
         * @return rtsFlag
         */
        public String getRtsFlag() {
            return this.rtsFlag;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return videoBitrate
         */
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        /**
         * @return videoProfile
         */
        public String getVideoProfile() {
            return this.videoProfile;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer audioBitrate; 
            private Integer audioChannelNum; 
            private String audioCodec; 
            private String audioProfile; 
            private Integer audioRate; 
            private String bframes; 
            private java.util.Map<String, ?> bitrateWithSource; 
            private java.util.Map<String, ?> extWithSource; 
            private Integer FPS; 
            private java.util.Map<String, ?> fpsWithSource; 
            private String gop; 
            private Integer height; 
            private java.util.Map<String, ?> resWithSource; 
            private String rtsFlag; 
            private String templateType; 
            private Integer videoBitrate; 
            private String videoProfile; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(CustomTranscodeParameters model) {
                this.audioBitrate = model.audioBitrate;
                this.audioChannelNum = model.audioChannelNum;
                this.audioCodec = model.audioCodec;
                this.audioProfile = model.audioProfile;
                this.audioRate = model.audioRate;
                this.bframes = model.bframes;
                this.bitrateWithSource = model.bitrateWithSource;
                this.extWithSource = model.extWithSource;
                this.FPS = model.FPS;
                this.fpsWithSource = model.fpsWithSource;
                this.gop = model.gop;
                this.height = model.height;
                this.resWithSource = model.resWithSource;
                this.rtsFlag = model.rtsFlag;
                this.templateType = model.templateType;
                this.videoBitrate = model.videoBitrate;
                this.videoProfile = model.videoProfile;
                this.width = model.width;
            } 

            /**
             * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: <strong>1 to 1000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder audioBitrate(Integer audioBitrate) {
                this.audioBitrate = audioBitrate;
                return this;
            }

            /**
             * <p>The number of sound channels. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: mono</li>
             * <li><strong>2</strong>: binaural</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder audioChannelNum(Integer audioChannelNum) {
                this.audioChannelNum = audioChannelNum;
                return this;
            }

            /**
             * <p>The audio encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>ACC</p>
             */
            public Builder audioCodec(String audioCodec) {
                this.audioCodec = audioCodec;
                return this;
            }

            /**
             * <p>The audio encoding profile. Valid values:</p>
             * <ul>
             * <li><strong>aac_low</strong></li>
             * <li><strong>aac_he</strong></li>
             * <li><strong>aac_he_v2</strong></li>
             * <li><strong>aac_ld</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aac_low</p>
             */
            public Builder audioProfile(String audioProfile) {
                this.audioProfile = audioProfile;
                return this;
            }

            /**
             * <p>The audio sampling rate. Valid values: <strong>22050 to 96000</strong>.</p>
             * <blockquote>
             * <p> If the value of AudioProfile is <strong>aac_ld</strong>, the audio sampling rate cannot exceed 44100.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder audioRate(Integer audioRate) {
                this.audioRate = audioRate;
                return this;
            }

            /**
             * <p>Indicates whether B-frame removal is enabled. Fixed value: <strong>0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bframes(String bframes) {
                this.bframes = bframes;
                return this;
            }

            /**
             * <p>The source-based bitrate settings.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;UpLimit&quot;:2500,&quot;LowerLimit&quot;:800,&quot;Factor&quot;:1}</p>
             */
            public Builder bitrateWithSource(java.util.Map<String, ?> bitrateWithSource) {
                this.bitrateWithSource = bitrateWithSource;
                return this;
            }

            /**
             * <p>Other source-based settings.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;KeyFrameOpen&quot;:&quot;yes&quot;,&quot;Copyts&quot;:&quot;yes&quot;,&quot;SeiMode&quot;:1}</p>
             */
            public Builder extWithSource(java.util.Map<String, ?> extWithSource) {
                this.extWithSource = extWithSource;
                return this;
            }

            /**
             * <p>The frame rate of the output video. Unit: frames per second (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder FPS(Integer FPS) {
                this.FPS = FPS;
                return this;
            }

            /**
             * <p>The source-based frame rate settings.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;UpLimit&quot;:60,&quot;LowerLimit&quot;:1}</p>
             */
            public Builder fpsWithSource(java.util.Map<String, ?> fpsWithSource) {
                this.fpsWithSource = fpsWithSource;
                return this;
            }

            /**
             * <p>The group of pictures (GOP) size of the output video. Unit: frames. Valid values: <strong>1 to 3000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The height of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The source-based resolution settings.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Type&quot;:&quot;short&quot;,&quot;Value&quot;:&quot;1080&quot;}</p>
             */
            public Builder resWithSource(java.util.Map<String, ?> resWithSource) {
                this.resWithSource = resWithSource;
                return this;
            }

            /**
             * <p>The Real-Time Transcoding (RTS) flag. Fixed value: <strong>true</strong>.</p>
             * <blockquote>
             * <p> This parameter is returned only if RTS is used for transcoding.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder rtsFlag(String rtsFlag) {
                this.rtsFlag = rtsFlag;
                return this;
            }

            /**
             * <p>The type of the custom transcoding template. Valid values:</p>
             * <ul>
             * <li><strong>h264</strong>: custom H.264 standard transcoding</li>
             * <li><strong>h264-nbhd</strong>: custom H.264 Narrowband HD™ transcoding</li>
             * <li><strong>h265</strong>: custom H.265 standard transcoding</li>
             * <li><strong>h265-nbhd</strong>: custom H.265 Narrowband HD™ transcoding</li>
             * <li><strong>audio</strong>: audio-only transcoding</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>h264</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The bitrate of the output video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder videoBitrate(Integer videoBitrate) {
                this.videoBitrate = videoBitrate;
                return this;
            }

            /**
             * <p>The video encoding profile. Valid values:</p>
             * <ul>
             * <li><strong>baseline</strong>: suitable for mobile devices.</li>
             * <li><strong>main</strong>: suitable for standard-definition devices.</li>
             * <li><strong>high</strong>: suitable for high-definition devices.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder videoProfile(String videoProfile) {
                this.videoProfile = videoProfile;
                return this;
            }

            /**
             * <p>The width of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CustomTranscodeParameters build() {
                return new CustomTranscodeParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamTranscodeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamTranscodeInfoResponseBody</p>
     */
    public static class EncryptParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("KmsKeyExpireInterval")
        private String kmsKeyExpireInterval;

        @com.aliyun.core.annotation.NameInMap("KmsKeyID")
        private String kmsKeyID;

        private EncryptParameters(Builder builder) {
            this.encryptType = builder.encryptType;
            this.kmsKeyExpireInterval = builder.kmsKeyExpireInterval;
            this.kmsKeyID = builder.kmsKeyID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptParameters create() {
            return builder().build();
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return kmsKeyExpireInterval
         */
        public String getKmsKeyExpireInterval() {
            return this.kmsKeyExpireInterval;
        }

        /**
         * @return kmsKeyID
         */
        public String getKmsKeyID() {
            return this.kmsKeyID;
        }

        public static final class Builder {
            private String encryptType; 
            private String kmsKeyExpireInterval; 
            private String kmsKeyID; 

            private Builder() {
            } 

            private Builder(EncryptParameters model) {
                this.encryptType = model.encryptType;
                this.kmsKeyExpireInterval = model.kmsKeyExpireInterval;
                this.kmsKeyID = model.kmsKeyID;
            } 

            /**
             * <p>The type of encryption. Fixed value: <strong>aliyun</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>The rotation period of the CMK. Valid values: <strong>60 to 3600</strong>. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder kmsKeyExpireInterval(String kmsKeyExpireInterval) {
                this.kmsKeyExpireInterval = kmsKeyExpireInterval;
                return this;
            }

            /**
             * <p>The ID of the customer master key (CMK) in Key Management Service (KMS).</p>
             * 
             * <strong>example:</strong>
             * <p>afce5722-81d2-43c3-9930-7601da11****</p>
             */
            public Builder kmsKeyID(String kmsKeyID) {
                this.kmsKeyID = kmsKeyID;
                return this;
            }

            public EncryptParameters build() {
                return new EncryptParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamTranscodeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamTranscodeInfoResponseBody</p>
     */
    public static class DomainTranscodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomTranscodeParameters")
        private CustomTranscodeParameters customTranscodeParameters;

        @com.aliyun.core.annotation.NameInMap("EncryptParameters")
        private EncryptParameters encryptParameters;

        @com.aliyun.core.annotation.NameInMap("IsLazy")
        private Boolean isLazy;

        @com.aliyun.core.annotation.NameInMap("TranscodeApp")
        private String transcodeApp;

        @com.aliyun.core.annotation.NameInMap("TranscodeName")
        private String transcodeName;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplate")
        private String transcodeTemplate;

        private DomainTranscodeInfo(Builder builder) {
            this.customTranscodeParameters = builder.customTranscodeParameters;
            this.encryptParameters = builder.encryptParameters;
            this.isLazy = builder.isLazy;
            this.transcodeApp = builder.transcodeApp;
            this.transcodeName = builder.transcodeName;
            this.transcodeTemplate = builder.transcodeTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTranscodeInfo create() {
            return builder().build();
        }

        /**
         * @return customTranscodeParameters
         */
        public CustomTranscodeParameters getCustomTranscodeParameters() {
            return this.customTranscodeParameters;
        }

        /**
         * @return encryptParameters
         */
        public EncryptParameters getEncryptParameters() {
            return this.encryptParameters;
        }

        /**
         * @return isLazy
         */
        public Boolean getIsLazy() {
            return this.isLazy;
        }

        /**
         * @return transcodeApp
         */
        public String getTranscodeApp() {
            return this.transcodeApp;
        }

        /**
         * @return transcodeName
         */
        public String getTranscodeName() {
            return this.transcodeName;
        }

        /**
         * @return transcodeTemplate
         */
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public static final class Builder {
            private CustomTranscodeParameters customTranscodeParameters; 
            private EncryptParameters encryptParameters; 
            private Boolean isLazy; 
            private String transcodeApp; 
            private String transcodeName; 
            private String transcodeTemplate; 

            private Builder() {
            } 

            private Builder(DomainTranscodeInfo model) {
                this.customTranscodeParameters = model.customTranscodeParameters;
                this.encryptParameters = model.encryptParameters;
                this.isLazy = model.isLazy;
                this.transcodeApp = model.transcodeApp;
                this.transcodeName = model.transcodeName;
                this.transcodeTemplate = model.transcodeTemplate;
            } 

            /**
             * <p>The custom transcoding configuration.</p>
             */
            public Builder customTranscodeParameters(CustomTranscodeParameters customTranscodeParameters) {
                this.customTranscodeParameters = customTranscodeParameters;
                return this;
            }

            /**
             * <p>The encryption settings.</p>
             */
            public Builder encryptParameters(EncryptParameters encryptParameters) {
                this.encryptParameters = encryptParameters;
                return this;
            }

            /**
             * <p>Indicates whether forcible transcoding is used. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Delayed transcoding is used.</li>
             * <li><strong>false</strong>: Forcible transcoding is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isLazy(Boolean isLazy) {
                this.isLazy = isLazy;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder transcodeApp(String transcodeApp) {
                this.transcodeApp = transcodeApp;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder transcodeName(String transcodeName) {
                this.transcodeName = transcodeName;
                return this;
            }

            /**
             * <p>The transcoding template ID. Valid values:</p>
             * <ul>
             * <li><p><strong>Standard transcoding</strong>:</p>
             * <ul>
             * <li><strong>lld</strong>: low definition</li>
             * <li><strong>lsd</strong>: standard definition</li>
             * <li><strong>lhd</strong>: high definition</li>
             * <li><strong>lud</strong>: ultra-high definition</li>
             * </ul>
             * </li>
             * <li><p><strong>Narrowband HD™ transcoding</strong>:</p>
             * <ul>
             * <li><strong>ld</strong>: low definition</li>
             * <li><strong>sd</strong>: standard definition</li>
             * <li><strong>hd</strong>: high definition</li>
             * <li><strong>ud</strong>: ultra-high definition</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lld</p>
             */
            public Builder transcodeTemplate(String transcodeTemplate) {
                this.transcodeTemplate = transcodeTemplate;
                return this;
            }

            public DomainTranscodeInfo build() {
                return new DomainTranscodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamTranscodeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamTranscodeInfoResponseBody</p>
     */
    public static class DomainTranscodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainTranscodeInfo")
        private java.util.List<DomainTranscodeInfo> domainTranscodeInfo;

        private DomainTranscodeList(Builder builder) {
            this.domainTranscodeInfo = builder.domainTranscodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTranscodeList create() {
            return builder().build();
        }

        /**
         * @return domainTranscodeInfo
         */
        public java.util.List<DomainTranscodeInfo> getDomainTranscodeInfo() {
            return this.domainTranscodeInfo;
        }

        public static final class Builder {
            private java.util.List<DomainTranscodeInfo> domainTranscodeInfo; 

            private Builder() {
            } 

            private Builder(DomainTranscodeList model) {
                this.domainTranscodeInfo = model.domainTranscodeInfo;
            } 

            /**
             * DomainTranscodeInfo.
             */
            public Builder domainTranscodeInfo(java.util.List<DomainTranscodeInfo> domainTranscodeInfo) {
                this.domainTranscodeInfo = domainTranscodeInfo;
                return this;
            }

            public DomainTranscodeList build() {
                return new DomainTranscodeList(this);
            } 

        } 

    }
}
