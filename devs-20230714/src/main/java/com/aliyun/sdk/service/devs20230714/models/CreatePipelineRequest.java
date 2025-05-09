// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link CreatePipelineRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineRequest</p>
 */
public class CreatePipelineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Pipeline body;

    private CreatePipelineRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Pipeline getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePipelineRequest, Builder> {
        private Pipeline body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Pipeline body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineRequest build() {
            return new CreatePipelineRequest(this);
        } 

    } 

}
