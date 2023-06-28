// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomDomainRequest</p>
 */
public class CreateCustomDomainRequest extends Request {
    @Body
    @NameInMap("request")
    @Validation(required = true)
    private CreateCustomDomainInput request;

    private CreateCustomDomainRequest(Builder builder) {
        super(builder);
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return request
     */
    public CreateCustomDomainInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<CreateCustomDomainRequest, Builder> {
        private CreateCustomDomainInput request; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomDomainRequest request) {
            super(request);
            this.request = request.request;
        } 

        /**
         * request.
         */
        public Builder request(CreateCustomDomainInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public CreateCustomDomainRequest build() {
            return new CreateCustomDomainRequest(this);
        } 

    } 

}
