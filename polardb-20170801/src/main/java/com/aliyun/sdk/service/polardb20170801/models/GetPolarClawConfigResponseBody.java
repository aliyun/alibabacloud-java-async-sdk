// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link GetPolarClawConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolarClawConfigResponseBody</p>
 */
public class GetPolarClawConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.NameInMap("Hash")
    private String hash;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OpenclawVersion")
    private String openclawVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPolarClawConfigResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.config = builder.config;
        this.hash = builder.hash;
        this.message = builder.message;
        this.openclawVersion = builder.openclawVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolarClawConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return openclawVersion
     */
    public String getOpenclawVersion() {
        return this.openclawVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private java.util.Map<String, ?> config; 
        private String hash; 
        private String message; 
        private String openclawVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPolarClawConfigResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.config = model.config;
            this.hash = model.hash;
            this.message = model.message;
            this.openclawVersion = model.openclawVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The configuration object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;models&quot;: &quot;{\&quot;mode\&quot;:\&quot;merge\&quot;,\&quot;providers\&quot;:{\&quot;bailian\&quot;:{\&quot;models\&quot;:[{\&quot;input\&quot;:[\&quot;text\&quot;,\&quot;image\&quot;],\&quot;name\&quot;:\&quot;qwen3.6-plus\&quot;,\&quot;api\&quot;:\&quot;openai-completions\&quot;,\&quot;id\&quot;:\&quot;qwen3.6-plus\&quot;,\&quot;compat\&quot;:{\&quot;supportsUsageInStreaming\&quot;:true}}],\&quot;baseUrl\&quot;:\&quot;<a href="https://dashscope.aliyuncs.com/compatible-mode/v1%5C%5C%22,%5C%5C%22apiKey%5C%5C%22:%5C%5C%22__OPENCLAW_REDACTED__%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22%7D,%5C%5C%22polardbCustom%5C%5C%22:%7B%5C%5C%22models%5C%5C%22:%5B%7B%5C%5C%22name%5C%5C%22:%5C%5C%22qwen3-max%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22,%5C%5C%22id%5C%5C%22:%5C%5C%22qwen3-max%5C%5C%22%7D%5D,%5C%5C%22baseUrl%5C%5C%22:%5C%5C%22https://dashscope.aliyuncs.com/compatible-mode/v1%5C%5C%22,%5C%5C%22apiKey%5C%5C%22:%5C%5C%22__OPENCLAW_REDACTED__%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22%7D,%5C%5C%22polardb%5C%5C%22:%7B%5C%5C%22models%5C%5C%22:%5B%5D,%5C%5C%22baseUrl%5C%5C%22:%5C%5C%22https://dashscope.aliyuncs.com/compatible-mode/v1%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22%7D%7D%7D">https://dashscope.aliyuncs.com/compatible-mode/v1\\&quot;,\\&quot;apiKey\\&quot;:\\&quot;__OPENCLAW_REDACTED__\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;},\\&quot;polardbCustom\\&quot;:{\\&quot;models\\&quot;:[{\\&quot;name\\&quot;:\\&quot;qwen3-max\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;,\\&quot;id\\&quot;:\\&quot;qwen3-max\\&quot;}],\\&quot;baseUrl\\&quot;:\\&quot;https://dashscope.aliyuncs.com/compatible-mode/v1\\&quot;,\\&quot;apiKey\\&quot;:\\&quot;__OPENCLAW_REDACTED__\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;},\\&quot;polardb\\&quot;:{\\&quot;models\\&quot;:[],\\&quot;baseUrl\\&quot;:\\&quot;https://dashscope.aliyuncs.com/compatible-mode/v1\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;}}}</a>&quot;
         * }</p>
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The configuration hash.</p>
         * 
         * <strong>example:</strong>
         * <p>005b55a8e870aaf866598e48a6af0bdbfa3fef704770c5e1cbad99648beaa661</p>
         */
        public Builder hash(String hash) {
            this.hash = hash;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The version of OpenClaw.</p>
         * 
         * <strong>example:</strong>
         * <p>2026.3.28</p>
         */
        public Builder openclawVersion(String openclawVersion) {
            this.openclawVersion = openclawVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolarClawConfigResponseBody build() {
            return new GetPolarClawConfigResponseBody(this);
        } 

    } 

}
