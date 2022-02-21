// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVoiceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVoiceConfigResponseBody</p>
 */
public class DescribeVoiceConfigResponseBody extends TeaModel {
    @NameInMap("ApesIpList")
    private java.util.List < ApesIpList> apesIpList;

    @NameInMap("AsrAcousticModelId")
    private String asrAcousticModelId;

    @NameInMap("AsrClassVocabularyId")
    private String asrClassVocabularyId;

    @NameInMap("AsrCustomizationId")
    private String asrCustomizationId;

    @NameInMap("AsrVocabularyId")
    private String asrVocabularyId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpeechNoiseThreshold")
    private String speechNoiseThreshold;

    @NameInMap("SpeechRate")
    private Integer speechRate;

    @NameInMap("Voice")
    private String voice;

    @NameInMap("Volume")
    private Integer volume;

    private DescribeVoiceConfigResponseBody(Builder builder) {
        this.apesIpList = builder.apesIpList;
        this.asrAcousticModelId = builder.asrAcousticModelId;
        this.asrClassVocabularyId = builder.asrClassVocabularyId;
        this.asrCustomizationId = builder.asrCustomizationId;
        this.asrVocabularyId = builder.asrVocabularyId;
        this.requestId = builder.requestId;
        this.speechNoiseThreshold = builder.speechNoiseThreshold;
        this.speechRate = builder.speechRate;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVoiceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return apesIpList
     */
    public java.util.List < ApesIpList> getApesIpList() {
        return this.apesIpList;
    }

    /**
     * @return asrAcousticModelId
     */
    public String getAsrAcousticModelId() {
        return this.asrAcousticModelId;
    }

    /**
     * @return asrClassVocabularyId
     */
    public String getAsrClassVocabularyId() {
        return this.asrClassVocabularyId;
    }

    /**
     * @return asrCustomizationId
     */
    public String getAsrCustomizationId() {
        return this.asrCustomizationId;
    }

    /**
     * @return asrVocabularyId
     */
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return speechNoiseThreshold
     */
    public String getSpeechNoiseThreshold() {
        return this.speechNoiseThreshold;
    }

    /**
     * @return speechRate
     */
    public Integer getSpeechRate() {
        return this.speechRate;
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
        private java.util.List < ApesIpList> apesIpList; 
        private String asrAcousticModelId; 
        private String asrClassVocabularyId; 
        private String asrCustomizationId; 
        private String asrVocabularyId; 
        private String requestId; 
        private String speechNoiseThreshold; 
        private Integer speechRate; 
        private String voice; 
        private Integer volume; 

        /**
         * ApesIpList.
         */
        public Builder apesIpList(java.util.List < ApesIpList> apesIpList) {
            this.apesIpList = apesIpList;
            return this;
        }

        /**
         * AsrAcousticModelId.
         */
        public Builder asrAcousticModelId(String asrAcousticModelId) {
            this.asrAcousticModelId = asrAcousticModelId;
            return this;
        }

        /**
         * AsrClassVocabularyId.
         */
        public Builder asrClassVocabularyId(String asrClassVocabularyId) {
            this.asrClassVocabularyId = asrClassVocabularyId;
            return this;
        }

        /**
         * AsrCustomizationId.
         */
        public Builder asrCustomizationId(String asrCustomizationId) {
            this.asrCustomizationId = asrCustomizationId;
            return this;
        }

        /**
         * AsrVocabularyId.
         */
        public Builder asrVocabularyId(String asrVocabularyId) {
            this.asrVocabularyId = asrVocabularyId;
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
         * SpeechNoiseThreshold.
         */
        public Builder speechNoiseThreshold(String speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
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

        public DescribeVoiceConfigResponseBody build() {
            return new DescribeVoiceConfigResponseBody(this);
        } 

    } 

    public static class ApesIpList extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        private ApesIpList(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApesIpList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public ApesIpList build() {
                return new ApesIpList(this);
            } 

        } 

    }
}
