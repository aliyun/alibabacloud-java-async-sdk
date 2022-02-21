// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamTranscodeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamTranscodeInfoResponseBody</p>
 */
public class DescribeLiveStreamTranscodeInfoResponseBody extends TeaModel {
    @NameInMap("DomainTranscodeList")
    private DomainTranscodeList domainTranscodeList;

    @NameInMap("RequestId")
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

        /**
         * DomainTranscodeList.
         */
        public Builder domainTranscodeList(DomainTranscodeList domainTranscodeList) {
            this.domainTranscodeList = domainTranscodeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamTranscodeInfoResponseBody build() {
            return new DescribeLiveStreamTranscodeInfoResponseBody(this);
        } 

    } 

    public static class CustomTranscodeParameters extends TeaModel {
        @NameInMap("AudioBitrate")
        private Integer audioBitrate;

        @NameInMap("AudioChannelNum")
        private Integer audioChannelNum;

        @NameInMap("AudioCodec")
        private String audioCodec;

        @NameInMap("AudioProfile")
        private String audioProfile;

        @NameInMap("AudioRate")
        private Integer audioRate;

        @NameInMap("Bframes")
        private String bframes;

        @NameInMap("FPS")
        private Integer FPS;

        @NameInMap("Gop")
        private String gop;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("RtsFlag")
        private String rtsFlag;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("VideoBitrate")
        private Integer videoBitrate;

        @NameInMap("VideoProfile")
        private String videoProfile;

        @NameInMap("Width")
        private Integer width;

        private CustomTranscodeParameters(Builder builder) {
            this.audioBitrate = builder.audioBitrate;
            this.audioChannelNum = builder.audioChannelNum;
            this.audioCodec = builder.audioCodec;
            this.audioProfile = builder.audioProfile;
            this.audioRate = builder.audioRate;
            this.bframes = builder.bframes;
            this.FPS = builder.FPS;
            this.gop = builder.gop;
            this.height = builder.height;
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
         * @return FPS
         */
        public Integer getFPS() {
            return this.FPS;
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
            private Integer FPS; 
            private String gop; 
            private Integer height; 
            private String rtsFlag; 
            private String templateType; 
            private Integer videoBitrate; 
            private String videoProfile; 
            private Integer width; 

            /**
             * AudioBitrate.
             */
            public Builder audioBitrate(Integer audioBitrate) {
                this.audioBitrate = audioBitrate;
                return this;
            }

            /**
             * AudioChannelNum.
             */
            public Builder audioChannelNum(Integer audioChannelNum) {
                this.audioChannelNum = audioChannelNum;
                return this;
            }

            /**
             * AudioCodec.
             */
            public Builder audioCodec(String audioCodec) {
                this.audioCodec = audioCodec;
                return this;
            }

            /**
             * AudioProfile.
             */
            public Builder audioProfile(String audioProfile) {
                this.audioProfile = audioProfile;
                return this;
            }

            /**
             * AudioRate.
             */
            public Builder audioRate(Integer audioRate) {
                this.audioRate = audioRate;
                return this;
            }

            /**
             * Bframes.
             */
            public Builder bframes(String bframes) {
                this.bframes = bframes;
                return this;
            }

            /**
             * FPS.
             */
            public Builder FPS(Integer FPS) {
                this.FPS = FPS;
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
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * RtsFlag.
             */
            public Builder rtsFlag(String rtsFlag) {
                this.rtsFlag = rtsFlag;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * VideoBitrate.
             */
            public Builder videoBitrate(Integer videoBitrate) {
                this.videoBitrate = videoBitrate;
                return this;
            }

            /**
             * VideoProfile.
             */
            public Builder videoProfile(String videoProfile) {
                this.videoProfile = videoProfile;
                return this;
            }

            /**
             * Width.
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
    public static class EncryptParameters extends TeaModel {
        @NameInMap("EncryptType")
        private String encryptType;

        @NameInMap("KmsKeyExpireInterval")
        private String kmsKeyExpireInterval;

        @NameInMap("KmsKeyID")
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

            /**
             * EncryptType.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * KmsKeyExpireInterval.
             */
            public Builder kmsKeyExpireInterval(String kmsKeyExpireInterval) {
                this.kmsKeyExpireInterval = kmsKeyExpireInterval;
                return this;
            }

            /**
             * KmsKeyID.
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
    public static class DomainTranscodeInfo extends TeaModel {
        @NameInMap("CustomTranscodeParameters")
        private CustomTranscodeParameters customTranscodeParameters;

        @NameInMap("EncryptParameters")
        private EncryptParameters encryptParameters;

        @NameInMap("TranscodeApp")
        private String transcodeApp;

        @NameInMap("TranscodeName")
        private String transcodeName;

        @NameInMap("TranscodeTemplate")
        private String transcodeTemplate;

        private DomainTranscodeInfo(Builder builder) {
            this.customTranscodeParameters = builder.customTranscodeParameters;
            this.encryptParameters = builder.encryptParameters;
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
            private String transcodeApp; 
            private String transcodeName; 
            private String transcodeTemplate; 

            /**
             * CustomTranscodeParameters.
             */
            public Builder customTranscodeParameters(CustomTranscodeParameters customTranscodeParameters) {
                this.customTranscodeParameters = customTranscodeParameters;
                return this;
            }

            /**
             * EncryptParameters.
             */
            public Builder encryptParameters(EncryptParameters encryptParameters) {
                this.encryptParameters = encryptParameters;
                return this;
            }

            /**
             * TranscodeApp.
             */
            public Builder transcodeApp(String transcodeApp) {
                this.transcodeApp = transcodeApp;
                return this;
            }

            /**
             * TranscodeName.
             */
            public Builder transcodeName(String transcodeName) {
                this.transcodeName = transcodeName;
                return this;
            }

            /**
             * TranscodeTemplate.
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
    public static class DomainTranscodeList extends TeaModel {
        @NameInMap("DomainTranscodeInfo")
        private java.util.List < DomainTranscodeInfo> domainTranscodeInfo;

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
        public java.util.List < DomainTranscodeInfo> getDomainTranscodeInfo() {
            return this.domainTranscodeInfo;
        }

        public static final class Builder {
            private java.util.List < DomainTranscodeInfo> domainTranscodeInfo; 

            /**
             * DomainTranscodeInfo.
             */
            public Builder domainTranscodeInfo(java.util.List < DomainTranscodeInfo> domainTranscodeInfo) {
                this.domainTranscodeInfo = domainTranscodeInfo;
                return this;
            }

            public DomainTranscodeList build() {
                return new DomainTranscodeList(this);
            } 

        } 

    }
}
