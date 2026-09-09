// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GenerateCopilotResponseRequest} extends {@link RequestModel}
 *
 * <p>GenerateCopilotResponseRequest</p>
 */
public class GenerateCopilotResponseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("llmParamString")
    private String llmParamString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private GenerateCopilotResponseRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.llmParamString = builder.llmParamString;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCopilotResponseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return llmParamString
     */
    public String getLlmParamString() {
        return this.llmParamString;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<GenerateCopilotResponseRequest, Builder> {
        private String xDebugId; 
        private String llmParamString; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(GenerateCopilotResponseRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.llmParamString = request.llmParamString;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>The input parameter for the Copilot LLM service. Refer to the standard LLM API input parameter dict, convert it to a string, and pass it to llmParamString.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;model\&quot;:\&quot;Qwen-7B-Chat\&quot;,\&quot;temperature\&quot;:0.9,\&quot;max_tokens\&quot;:1000,\&quot;top_p\&quot;:1,\&quot;frequency_penalty\&quot;:0.0,\&quot;presence_penalty\&quot;:0.6,\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;I am an OS engineer\&quot;},{\&quot;role\&quot;:\&quot;assistant\&quot;,\&quot;content\&quot;:\&quot;Hello. I am an AI language model, happy to help you. What can I do for you?\&quot;},{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;Do you know what Alinux is?\&quot;}]}&quot;</p>
         */
        public Builder llmParamString(String llmParamString) {
            this.putBodyParameter("llmParamString", llmParamString);
            this.llmParamString = llmParamString;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public GenerateCopilotResponseRequest build() {
            return new GenerateCopilotResponseRequest(this);
        } 

    } 

}
