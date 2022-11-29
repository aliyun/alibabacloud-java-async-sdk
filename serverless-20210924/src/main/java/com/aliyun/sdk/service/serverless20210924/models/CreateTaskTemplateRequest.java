// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskTemplateRequest</p>
 */
public class CreateTaskTemplateRequest extends Request {
    @Body
    @NameInMap("body")
    private TaskTemplate body;

    private CreateTaskTemplateRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public TaskTemplate getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateTaskTemplateRequest, Builder> {
        private TaskTemplate body; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskTemplateRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(TaskTemplate body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateTaskTemplateRequest build() {
            return new CreateTaskTemplateRequest(this);
        } 

    } 

}
