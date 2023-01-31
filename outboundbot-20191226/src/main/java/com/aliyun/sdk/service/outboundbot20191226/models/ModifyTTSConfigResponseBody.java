// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTTSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTTSConfigResponseBody</p>
 */
public class ModifyTTSConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TTSConfig")
    private TTSConfig TTSConfig;

    private ModifyTTSConfigResponseBody(Builder builder) {
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

    public static ModifyTTSConfigResponseBody create() {
        return builder().build();
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

        public ModifyTTSConfigResponseBody build() {
            return new ModifyTTSConfigResponseBody(this);
        } 

    } 

    public static class TTSConfig extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("SpeechRate")
        private String speechRate;

        @NameInMap("TTSConfigId")
        private String TTSConfigId;

        @NameInMap("Voice")
        private String voice;

        @NameInMap("Volume")
        private String volume;

        private TTSConfig(Builder builder) {
            this.instanceId = builder.instanceId;
            this.scriptId = builder.scriptId;
            this.speechRate = builder.speechRate;
            this.TTSConfigId = builder.TTSConfigId;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return speechRate
         */
        public String getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return TTSConfigId
         */
        public String getTTSConfigId() {
            return this.TTSConfigId;
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
            private String instanceId; 
            private String scriptId; 
            private String speechRate; 
            private String TTSConfigId; 
            private String voice; 
            private String volume; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
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
             * TTSConfigId.
             */
            public Builder TTSConfigId(String TTSConfigId) {
                this.TTSConfigId = TTSConfigId;
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
