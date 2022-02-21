// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveEdgeTransferResponse} extends {@link TeaModel}
 *
 * <p>SetLiveEdgeTransferResponse</p>
 */
public class SetLiveEdgeTransferResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLiveEdgeTransferResponseBody body;

    private SetLiveEdgeTransferResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLiveEdgeTransferResponse create() {
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
    public SetLiveEdgeTransferResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLiveEdgeTransferResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLiveEdgeTransferResponseBody body);

        @Override
        SetLiveEdgeTransferResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLiveEdgeTransferResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLiveEdgeTransferResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLiveEdgeTransferResponse response) {
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
        public Builder body(SetLiveEdgeTransferResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLiveEdgeTransferResponse build() {
            return new SetLiveEdgeTransferResponse(this);
        } 

    } 

}
