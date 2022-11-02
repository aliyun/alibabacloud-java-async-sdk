// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainResponse} extends {@link TeaModel}
 *
 * <p>DeleteDomainResponse</p>
 */
public class DeleteDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDomainResponseBody body;

    private DeleteDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDomainResponse create() {
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
    public DeleteDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDomainResponseBody body);

        @Override
        DeleteDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDomainResponse response) {
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
        public Builder body(DeleteDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDomainResponse build() {
            return new DeleteDomainResponse(this);
        } 

    } 

}
