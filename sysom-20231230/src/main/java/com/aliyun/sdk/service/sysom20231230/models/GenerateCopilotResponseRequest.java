// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateCopilotResponseRequest} extends {@link RequestModel}
 *
 * <p>GenerateCopilotResponseRequest</p>
 */
public class GenerateCopilotResponseRequest extends Request {
    @Body
    @NameInMap("llmParamString")
    private String llmParamString;

    private GenerateCopilotResponseRequest(Builder builder) {
        super(builder);
        this.llmParamString = builder.llmParamString;
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
     * @return llmParamString
     */
    public String getLlmParamString() {
        return this.llmParamString;
    }

    public static final class Builder extends Request.Builder<GenerateCopilotResponseRequest, Builder> {
        private String llmParamString; 

        private Builder() {
            super();
        } 

        private Builder(GenerateCopilotResponseRequest request) {
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
        public GenerateCopilotResponseRequest build() {
            return new GenerateCopilotResponseRequest(this);
        } 

    } 

}
