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
 * {@link DescribeScriptVoiceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScriptVoiceConfigResponseBody</p>
 */
public class DescribeScriptVoiceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScriptVoiceConfig")
    private ScriptVoiceConfig scriptVoiceConfig;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(DescribeScriptVoiceConfigResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.scriptVoiceConfig = model.scriptVoiceConfig;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scene voice configuration information.</p>
         */
        public Builder scriptVoiceConfig(ScriptVoiceConfig scriptVoiceConfig) {
            this.scriptVoiceConfig = scriptVoiceConfig;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeScriptVoiceConfigResponseBody build() {
            return new DescribeScriptVoiceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScriptVoiceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScriptVoiceConfigResponseBody</p>
     */
    public static class ScriptVoiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ScriptContent")
        private String scriptContent;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptVoiceConfigId")
        private String scriptVoiceConfigId;

        @com.aliyun.core.annotation.NameInMap("ScriptWaveformRelation")
        private String scriptWaveformRelation;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(ScriptVoiceConfig model) {
                this.instanceId = model.instanceId;
                this.scriptContent = model.scriptContent;
                this.scriptId = model.scriptId;
                this.scriptVoiceConfigId = model.scriptVoiceConfigId;
                this.scriptWaveformRelation = model.scriptWaveformRelation;
                this.source = model.source;
                this.type = model.type;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>291cfc6a-8703-4bdd-a99d-9cba32d5288a</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The script content.</p>
             * 
             * <strong>example:</strong>
             * <p>Your Huabei payment is overdue and needs to be processed. Can you handle it now?</p>
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
                return this;
            }

            /**
             * <p>The scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>947e0875-b5d4-4b33-b18c-7b2cf85bcb4f</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The scene voice configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2a07b634-e15d-445f-bbcb-fc4ea2df7b87</p>
             */
            public Builder scriptVoiceConfigId(String scriptVoiceConfigId) {
                this.scriptVoiceConfigId = scriptVoiceConfigId;
                return this;
            }

            /**
             * <p>The script recording data. This parameter has a value only when Type is set to WAVEFORM.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ScriptContent&quot;:&quot;May I ask if you are&quot;,&quot;ScriptWaveformId&quot;:&quot;07db2f0a-acb2-4e68-b9f4-66397414f50c&quot;},{&quot;ScriptContent&quot;:&quot;?&quot;,&quot;ScriptWaveformId&quot;:&quot;c2a69440-03e3-406e-b0a9-a9791fccb31b&quot;}]</p>
             */
            public Builder scriptWaveformRelation(String scriptWaveformRelation) {
                this.scriptWaveformRelation = scriptWaveformRelation;
                return this;
            }

            /**
             * <p>The script source.</p>
             * 
             * <strong>example:</strong>
             * <p>DIALOGUE_FLOW</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The recording type. Valid values:</p>
             * <ul>
             * <li>WAVEFORM: recording.</li>
             * <li>TTS: text-to-speech.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TTS</p>
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
