// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCorsDomainResponse} extends {@link TeaModel}
 *
 * <p>DeleteCorsDomainResponse</p>
 */
public class DeleteCorsDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCorsDomainResponseBody body;

    private DeleteCorsDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCorsDomainResponse create() {
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
    public DeleteCorsDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCorsDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCorsDomainResponseBody body);

        @Override
        DeleteCorsDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCorsDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCorsDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCorsDomainResponse response) {
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
        public Builder body(DeleteCorsDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCorsDomainResponse build() {
            return new DeleteCorsDomainResponse(this);
        } 

    } 

}
