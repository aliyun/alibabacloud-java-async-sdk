// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainConsortiumResponse} extends {@link TeaModel}
 *
 * <p>DeleteAntChainConsortiumResponse</p>
 */
public class DeleteAntChainConsortiumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAntChainConsortiumResponseBody body;

    private DeleteAntChainConsortiumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAntChainConsortiumResponse create() {
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
    public DeleteAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAntChainConsortiumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAntChainConsortiumResponseBody body);

        @Override
        DeleteAntChainConsortiumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAntChainConsortiumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAntChainConsortiumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAntChainConsortiumResponse response) {
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
        public Builder body(DeleteAntChainConsortiumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAntChainConsortiumResponse build() {
            return new DeleteAntChainConsortiumResponse(this);
        } 

    } 

}
