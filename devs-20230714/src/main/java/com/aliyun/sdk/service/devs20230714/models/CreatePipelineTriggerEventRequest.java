// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineTriggerEventRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineTriggerEventRequest</p>
 */
public class CreatePipelineTriggerEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PipelineTriggerEvent body;

    private CreatePipelineTriggerEventRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineTriggerEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PipelineTriggerEvent getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePipelineTriggerEventRequest, Builder> {
        private PipelineTriggerEvent body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineTriggerEventRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PipelineTriggerEvent body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineTriggerEventRequest build() {
            return new CreatePipelineTriggerEventRequest(this);
        } 

    } 

}
