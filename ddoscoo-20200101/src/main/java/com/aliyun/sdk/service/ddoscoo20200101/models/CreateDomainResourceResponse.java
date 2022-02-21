// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainResourceResponse} extends {@link TeaModel}
 *
 * <p>CreateDomainResourceResponse</p>
 */
public class CreateDomainResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDomainResourceResponseBody body;

    private CreateDomainResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDomainResourceResponse create() {
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
    public CreateDomainResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDomainResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDomainResourceResponseBody body);

        @Override
        CreateDomainResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDomainResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDomainResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDomainResourceResponse response) {
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
        public Builder body(CreateDomainResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDomainResourceResponse build() {
            return new CreateDomainResourceResponse(this);
        } 

    } 

}
