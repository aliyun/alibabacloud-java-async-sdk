// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeTTSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTTSConfigResponseBody</p>
 */
public class DescribeTTSConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TTSConfig")
    private TTSConfig TTSConfig;

    private DescribeTTSConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.TTSConfig = builder.TTSConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTTSConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return TTSConfig
     */
    public TTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TTSConfig TTSConfig; 

        private Builder() {
        } 

        private Builder(DescribeTTSConfigResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.TTSConfig = model.TTSConfig;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * TTSConfig.
         */
        public Builder TTSConfig(TTSConfig TTSConfig) {
            this.TTSConfig = TTSConfig;
            return this;
        }

        public DescribeTTSConfigResponseBody build() {
            return new DescribeTTSConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTTSConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTTSConfigResponseBody</p>
     */
    public static class TTSConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NlsServiceType")
        private String nlsServiceType;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private String speechRate;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private String volume;

        private TTSConfig(Builder builder) {
            this.appKey = builder.appKey;
            this.instanceId = builder.instanceId;
            this.nlsServiceType = builder.nlsServiceType;
            this.speechRate = builder.speechRate;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TTSConfig create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nlsServiceType
         */
        public String getNlsServiceType() {
            return this.nlsServiceType;
        }

        /**
         * @return speechRate
         */
        public String getSpeechRate() {
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
        public String getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String appKey; 
            private String instanceId; 
            private String nlsServiceType; 
            private String speechRate; 
            private String voice; 
            private String volume; 

            private Builder() {
            } 

            private Builder(TTSConfig model) {
                this.appKey = model.appKey;
                this.instanceId = model.instanceId;
                this.nlsServiceType = model.nlsServiceType;
                this.speechRate = model.speechRate;
                this.voice = model.voice;
                this.volume = model.volume;
            } 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NlsServiceType.
             */
            public Builder nlsServiceType(String nlsServiceType) {
                this.nlsServiceType = nlsServiceType;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(String speechRate) {
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
            public Builder volume(String volume) {
                this.volume = volume;
                return this;
            }

            public TTSConfig build() {
                return new TTSConfig(this);
            } 

        } 

    }
}
