// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainResponse} extends {@link TeaModel}
 *
 * <p>CreateDomainResponse</p>
 */
public class CreateDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDomainResponseBody body;

    private CreateDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDomainResponse create() {
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
    public CreateDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDomainResponseBody body);

        @Override
        CreateDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDomainResponse response) {
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
        public Builder body(CreateDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDomainResponse build() {
            return new CreateDomainResponse(this);
        } 

    } 

}
