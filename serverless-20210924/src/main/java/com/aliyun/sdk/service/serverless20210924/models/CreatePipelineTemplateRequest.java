// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineTemplateRequest</p>
 */
public class CreatePipelineTemplateRequest extends Request {
    @Body
    @NameInMap("body")
    private PipelineTemplate body;

    private CreatePipelineTemplateRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PipelineTemplate getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePipelineTemplateRequest, Builder> {
        private PipelineTemplate body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineTemplateRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PipelineTemplate body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineTemplateRequest build() {
            return new CreatePipelineTemplateRequest(this);
        } 

    } 

}
