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
 * {@link CpuHighAgentStreamResponseRequest} extends {@link RequestModel}
 *
 * <p>CpuHighAgentStreamResponseRequest</p>
 */
public class CpuHighAgentStreamResponseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("llmParamString")
    private String llmParamString;

    private CpuHighAgentStreamResponseRequest(Builder builder) {
        super(builder);
        this.llmParamString = builder.llmParamString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CpuHighAgentStreamResponseRequest create() {
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

    public static final class Builder extends Request.Builder<CpuHighAgentStreamResponseRequest, Builder> {
        private String llmParamString; 

        private Builder() {
            super();
        } 

        private Builder(CpuHighAgentStreamResponseRequest request) {
            super(request);
            this.llmParamString = request.llmParamString;
        } 

        /**
         * <p>The input parameter for the CPU high agent service. Refer to the standard LLM API input parameter dict. Convert it to a string and pass it in llmParamString.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;llmParamString&quot;: &quot;{\&quot;messages\&quot;: [{\&quot;role\&quot;: \&quot;user\&quot;, \&quot;content\&quot;: \&quot;The CPU utilization of instance i-67890 for user 12345 has been high in the last 2 minutes. Analyze the cause based on the flame graph information from the last 2 minutes.\&quot;}]}&quot;</p>
         */
        public Builder llmParamString(String llmParamString) {
            this.putBodyParameter("llmParamString", llmParamString);
            this.llmParamString = llmParamString;
            return this;
        }

        @Override
        public CpuHighAgentStreamResponseRequest build() {
            return new CpuHighAgentStreamResponseRequest(this);
        } 

    } 

}
