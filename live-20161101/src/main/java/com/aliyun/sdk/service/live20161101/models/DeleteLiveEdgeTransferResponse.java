// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveEdgeTransferResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveEdgeTransferResponse</p>
 */
public class DeleteLiveEdgeTransferResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveEdgeTransferResponseBody body;

    private DeleteLiveEdgeTransferResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveEdgeTransferResponse create() {
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
    public DeleteLiveEdgeTransferResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveEdgeTransferResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveEdgeTransferResponseBody body);

        @Override
        DeleteLiveEdgeTransferResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveEdgeTransferResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveEdgeTransferResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveEdgeTransferResponse response) {
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
        public Builder body(DeleteLiveEdgeTransferResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveEdgeTransferResponse build() {
            return new DeleteLiveEdgeTransferResponse(this);
        } 

    } 

}
