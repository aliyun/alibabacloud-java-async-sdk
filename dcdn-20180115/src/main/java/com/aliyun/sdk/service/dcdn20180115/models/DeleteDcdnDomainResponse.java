// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnDomainResponse} extends {@link TeaModel}
 *
 * <p>DeleteDcdnDomainResponse</p>
 */
public class DeleteDcdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDcdnDomainResponseBody body;

    private DeleteDcdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDcdnDomainResponse create() {
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
    public DeleteDcdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDcdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDcdnDomainResponseBody body);

        @Override
        DeleteDcdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDcdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDcdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDcdnDomainResponse response) {
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
        public Builder body(DeleteDcdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDcdnDomainResponse build() {
            return new DeleteDcdnDomainResponse(this);
        } 

    } 

}
