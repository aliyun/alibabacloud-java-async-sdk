// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainContractProjectResponse} extends {@link TeaModel}
 *
 * <p>DeleteAntChainContractProjectResponse</p>
 */
public class DeleteAntChainContractProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAntChainContractProjectResponseBody body;

    private DeleteAntChainContractProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAntChainContractProjectResponse create() {
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
    public DeleteAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAntChainContractProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAntChainContractProjectResponseBody body);

        @Override
        DeleteAntChainContractProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAntChainContractProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAntChainContractProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAntChainContractProjectResponse response) {
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
        public Builder body(DeleteAntChainContractProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAntChainContractProjectResponse build() {
            return new DeleteAntChainContractProjectResponse(this);
        } 

    } 

}
