// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpeechResponseBody</p>
 */
public class QuerySpeechResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QuerySpeechResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySpeechResponseBody build() {
            return new QuerySpeechResponseBody(this);
        } 

    } 

    public static class SoundCodeConfig extends TeaModel {
        @NameInMap("AdditionalDuration")
        private Integer additionalDuration;

        @NameInMap("SoundCodeContent")
        private String soundCodeContent;

        private SoundCodeConfig(Builder builder) {
            this.additionalDuration = builder.additionalDuration;
            this.soundCodeContent = builder.soundCodeContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoundCodeConfig create() {
            return builder().build();
        }

        /**
         * @return additionalDuration
         */
        public Integer getAdditionalDuration() {
            return this.additionalDuration;
        }

        /**
         * @return soundCodeContent
         */
        public String getSoundCodeContent() {
            return this.soundCodeContent;
        }

        public static final class Builder {
            private Integer additionalDuration; 
            private String soundCodeContent; 

            /**
             * AdditionalDuration.
             */
            public Builder additionalDuration(Integer additionalDuration) {
                this.additionalDuration = additionalDuration;
                return this;
            }

            /**
             * SoundCodeContent.
             */
            public Builder soundCodeContent(String soundCodeContent) {
                this.soundCodeContent = soundCodeContent;
                return this;
            }

            public SoundCodeConfig build() {
                return new SoundCodeConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AudioFormat")
        private String audioFormat;

        @NameInMap("BizCode")
        private String bizCode;

        @NameInMap("EnableSoundCode")
        private Boolean enableSoundCode;

        @NameInMap("SoundCodeConfig")
        private SoundCodeConfig soundCodeConfig;

        @NameInMap("SpeechCode")
        private String speechCode;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("SpeechType")
        private String speechType;

        @NameInMap("Text")
        private String text;

        @NameInMap("Voice")
        private String voice;

        @NameInMap("Volume")
        private Integer volume;

        private Data(Builder builder) {
            this.audioFormat = builder.audioFormat;
            this.bizCode = builder.bizCode;
            this.enableSoundCode = builder.enableSoundCode;
            this.soundCodeConfig = builder.soundCodeConfig;
            this.speechCode = builder.speechCode;
            this.speechRate = builder.speechRate;
            this.speechType = builder.speechType;
            this.text = builder.text;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioFormat
         */
        public String getAudioFormat() {
            return this.audioFormat;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return enableSoundCode
         */
        public Boolean getEnableSoundCode() {
            return this.enableSoundCode;
        }

        /**
         * @return soundCodeConfig
         */
        public SoundCodeConfig getSoundCodeConfig() {
            return this.soundCodeConfig;
        }

        /**
         * @return speechCode
         */
        public String getSpeechCode() {
            return this.speechCode;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return speechType
         */
        public String getSpeechType() {
            return this.speechType;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String audioFormat; 
            private String bizCode; 
            private Boolean enableSoundCode; 
            private SoundCodeConfig soundCodeConfig; 
            private String speechCode; 
            private Integer speechRate; 
            private String speechType; 
            private String text; 
            private String voice; 
            private Integer volume; 

            /**
             * AudioFormat.
             */
            public Builder audioFormat(String audioFormat) {
                this.audioFormat = audioFormat;
                return this;
            }

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * EnableSoundCode.
             */
            public Builder enableSoundCode(Boolean enableSoundCode) {
                this.enableSoundCode = enableSoundCode;
                return this;
            }

            /**
             * SoundCodeConfig.
             */
            public Builder soundCodeConfig(SoundCodeConfig soundCodeConfig) {
                this.soundCodeConfig = soundCodeConfig;
                return this;
            }

            /**
             * SpeechCode.
             */
            public Builder speechCode(String speechCode) {
                this.speechCode = speechCode;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * SpeechType.
             */
            public Builder speechType(String speechType) {
                this.speechType = speechType;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
