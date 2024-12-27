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
         * llmParamString.
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
