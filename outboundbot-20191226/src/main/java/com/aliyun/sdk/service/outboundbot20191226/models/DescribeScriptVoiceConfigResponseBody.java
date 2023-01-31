// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScriptVoiceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScriptVoiceConfigResponseBody</p>
 */
public class DescribeScriptVoiceConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScriptVoiceConfig")
    private ScriptVoiceConfig scriptVoiceConfig;

    @NameInMap("Success")
    private Boolean success;

    private DescribeScriptVoiceConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scriptVoiceConfig = builder.scriptVoiceConfig;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScriptVoiceConfigResponseBody create() {
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
     * @return scriptVoiceConfig
     */
    public ScriptVoiceConfig getScriptVoiceConfig() {
        return this.scriptVoiceConfig;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private ScriptVoiceConfig scriptVoiceConfig; 
        private Boolean success; 

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
         * ScriptVoiceConfig.
         */
        public Builder scriptVoiceConfig(ScriptVoiceConfig scriptVoiceConfig) {
            this.scriptVoiceConfig = scriptVoiceConfig;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeScriptVoiceConfigResponseBody build() {
            return new DescribeScriptVoiceConfigResponseBody(this);
        } 

    } 

    public static class ScriptVoiceConfig extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ScriptContent")
        private String scriptContent;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptVoiceConfigId")
        private String scriptVoiceConfigId;

        @NameInMap("ScriptWaveformRelation")
        private String scriptWaveformRelation;

        @NameInMap("Source")
        private String source;

        @NameInMap("Type")
        private String type;

        private ScriptVoiceConfig(Builder builder) {
            this.instanceId = builder.instanceId;
            this.scriptContent = builder.scriptContent;
            this.scriptId = builder.scriptId;
            this.scriptVoiceConfigId = builder.scriptVoiceConfigId;
            this.scriptWaveformRelation = builder.scriptWaveformRelation;
            this.source = builder.source;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptVoiceConfig create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return scriptContent
         */
        public String getScriptContent() {
            return this.scriptContent;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptVoiceConfigId
         */
        public String getScriptVoiceConfigId() {
            return this.scriptVoiceConfigId;
        }

        /**
         * @return scriptWaveformRelation
         */
        public String getScriptWaveformRelation() {
            return this.scriptWaveformRelation;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instanceId; 
            private String scriptContent; 
            private String scriptId; 
            private String scriptVoiceConfigId; 
            private String scriptWaveformRelation; 
            private String source; 
            private String type; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ScriptContent.
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
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
             * ScriptVoiceConfigId.
             */
            public Builder scriptVoiceConfigId(String scriptVoiceConfigId) {
                this.scriptVoiceConfigId = scriptVoiceConfigId;
                return this;
            }

            /**
             * ScriptWaveformRelation.
             */
            public Builder scriptWaveformRelation(String scriptWaveformRelation) {
                this.scriptWaveformRelation = scriptWaveformRelation;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ScriptVoiceConfig build() {
                return new ScriptVoiceConfig(this);
            } 

        } 

    }
}
