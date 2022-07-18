// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStressRequest} extends {@link RequestModel}
 *
 * <p>CreateStressRequest</p>
 */
public class CreateStressRequest extends Request {
    @Body
    @NameInMap("body")
    private String body;

    private CreateStressRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateStressRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateStressRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateStressRequest build() {
            return new CreateStressRequest(this);
        } 

    } 

}
