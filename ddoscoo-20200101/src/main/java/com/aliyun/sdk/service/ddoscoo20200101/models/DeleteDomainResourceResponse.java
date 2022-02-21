// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteDomainResourceResponse</p>
 */
public class DeleteDomainResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDomainResourceResponseBody body;

    private DeleteDomainResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDomainResourceResponse create() {
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
    public DeleteDomainResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDomainResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDomainResourceResponseBody body);

        @Override
        DeleteDomainResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDomainResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDomainResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDomainResourceResponse response) {
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
        public Builder body(DeleteDomainResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDomainResourceResponse build() {
            return new DeleteDomainResourceResponse(this);
        } 

    } 

}
