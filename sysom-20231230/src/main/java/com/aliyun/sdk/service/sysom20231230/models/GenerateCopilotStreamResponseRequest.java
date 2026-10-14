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
 * {@link GenerateCopilotStreamResponseRequest} extends {@link RequestModel}
 *
 * <p>GenerateCopilotStreamResponseRequest</p>
 */
public class GenerateCopilotStreamResponseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("llmParamString")
    private String llmParamString;

    private GenerateCopilotStreamResponseRequest(Builder builder) {
        super(builder);
        this.llmParamString = builder.llmParamString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCopilotStreamResponseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return llmParamString
     */
    public String getLlmParamString() {
        return this.llmParamString;
    }

    public static final class Builder extends Request.Builder<GenerateCopilotStreamResponseRequest, Builder> {
        private String llmParamString; 

        private Builder() {
            super();
        } 

        private Builder(GenerateCopilotStreamResponseRequest request) {
            super(request);
            this.llmParamString = request.llmParamString;
        } 

        /**
         * <p>The input parameter for the Copilot LLM service. Refer to the standard LLM interface input parameter dict. Convert the dict to a string and pass it to llmParamString.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;model\&quot;:\&quot;Qwen-7B-Chat\&quot;,\&quot;temperature\&quot;:0.9,\&quot;max_tokens\&quot;:1000,\&quot;top_p\&quot;:1,\&quot;frequency_penalty\&quot;:0.0,\&quot;presence_penalty\&quot;:0.6,\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;I am an OS engineer\&quot;},{\&quot;role\&quot;:\&quot;assistant\&quot;,\&quot;content\&quot;:\&quot;Hello. I am an AI language model, happy to help you. What can I do for you?\&quot;},{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;Do you know what Alinux is?\&quot;}]}&quot;</p>
         */
        public Builder llmParamString(String llmParamString) {
            this.putBodyParameter("llmParamString", llmParamString);
            this.llmParamString = llmParamString;
            return this;
        }

        @Override
        public GenerateCopilotStreamResponseRequest build() {
            return new GenerateCopilotStreamResponseRequest(this);
        } 

    } 

}
