// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainExtensionResponse} extends {@link TeaModel}
 *
 * <p>CreateDomainExtensionResponse</p>
 */
public class CreateDomainExtensionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDomainExtensionResponseBody body;

    private CreateDomainExtensionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDomainExtensionResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public CreateDomainExtensionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDomainExtensionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDomainExtensionResponseBody body);

        @Override
        CreateDomainExtensionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDomainExtensionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDomainExtensionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDomainExtensionResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(CreateDomainExtensionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDomainExtensionResponse build() {
            return new CreateDomainExtensionResponse(this);
        } 

    } 

}
