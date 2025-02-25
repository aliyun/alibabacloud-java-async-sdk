// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomDomainRequest</p>
 */
public class CreateCustomDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCustomDomainInput body;

    private CreateCustomDomainRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
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
     * @return body
     */
    public CreateCustomDomainInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateCustomDomainRequest, Builder> {
        private CreateCustomDomainInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomDomainRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The information about the custom domain name.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateCustomDomainInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomDomainRequest build() {
            return new CreateCustomDomainRequest(this);
        } 

    } 

}
