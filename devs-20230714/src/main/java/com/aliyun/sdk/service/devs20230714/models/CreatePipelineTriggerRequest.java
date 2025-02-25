// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineTriggerRequest</p>
 */
public class CreatePipelineTriggerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PipelineTrigger body;

    private CreatePipelineTriggerRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PipelineTrigger getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePipelineTriggerRequest, Builder> {
        private PipelineTrigger body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineTriggerRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PipelineTrigger body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineTriggerRequest build() {
            return new CreatePipelineTriggerRequest(this);
        } 

    } 

}
