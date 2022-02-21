// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveDomainPlayMappingResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveDomainPlayMappingResponse</p>
 */
public class DeleteLiveDomainPlayMappingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveDomainPlayMappingResponseBody body;

    private DeleteLiveDomainPlayMappingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveDomainPlayMappingResponse create() {
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
    public DeleteLiveDomainPlayMappingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveDomainPlayMappingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveDomainPlayMappingResponseBody body);

        @Override
        DeleteLiveDomainPlayMappingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveDomainPlayMappingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveDomainPlayMappingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveDomainPlayMappingResponse response) {
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
        public Builder body(DeleteLiveDomainPlayMappingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveDomainPlayMappingResponse build() {
            return new DeleteLiveDomainPlayMappingResponse(this);
        } 

    } 

}
