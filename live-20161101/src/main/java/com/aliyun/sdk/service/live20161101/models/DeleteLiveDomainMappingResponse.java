// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveDomainMappingResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveDomainMappingResponse</p>
 */
public class DeleteLiveDomainMappingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveDomainMappingResponseBody body;

    private DeleteLiveDomainMappingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveDomainMappingResponse create() {
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
    public DeleteLiveDomainMappingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveDomainMappingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveDomainMappingResponseBody body);

        @Override
        DeleteLiveDomainMappingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveDomainMappingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveDomainMappingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveDomainMappingResponse response) {
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
        public Builder body(DeleteLiveDomainMappingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveDomainMappingResponse build() {
            return new DeleteLiveDomainMappingResponse(this);
        } 

    } 

}
