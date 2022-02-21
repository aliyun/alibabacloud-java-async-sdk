// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnDomainResponse} extends {@link TeaModel}
 *
 * <p>DeleteCdnDomainResponse</p>
 */
public class DeleteCdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCdnDomainResponseBody body;

    private DeleteCdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCdnDomainResponse create() {
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
    public DeleteCdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCdnDomainResponseBody body);

        @Override
        DeleteCdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCdnDomainResponse response) {
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
        public Builder body(DeleteCdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCdnDomainResponse build() {
            return new DeleteCdnDomainResponse(this);
        } 

    } 

}
