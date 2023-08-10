// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAppGroupRequest</p>
 */
public class CreateAppGroupRequest extends Request {
    @Body
    @NameInMap("body")
    private AppGroup body;

    private CreateAppGroupRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public AppGroup getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAppGroupRequest, Builder> {
        private AppGroup body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppGroupRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(AppGroup body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateAppGroupRequest build() {
            return new CreateAppGroupRequest(this);
        } 

    } 

}
