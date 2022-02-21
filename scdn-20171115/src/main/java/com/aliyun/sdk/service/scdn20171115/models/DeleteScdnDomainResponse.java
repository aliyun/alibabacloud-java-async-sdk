// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScdnDomainResponse} extends {@link TeaModel}
 *
 * <p>DeleteScdnDomainResponse</p>
 */
public class DeleteScdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScdnDomainResponseBody body;

    private DeleteScdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScdnDomainResponse create() {
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
    public DeleteScdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScdnDomainResponseBody body);

        @Override
        DeleteScdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScdnDomainResponse response) {
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
        public Builder body(DeleteScdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScdnDomainResponse build() {
            return new DeleteScdnDomainResponse(this);
        } 

    } 

}
