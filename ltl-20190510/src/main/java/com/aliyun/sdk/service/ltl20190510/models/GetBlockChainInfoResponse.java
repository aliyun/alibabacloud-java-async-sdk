// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlockChainInfoResponse} extends {@link TeaModel}
 *
 * <p>GetBlockChainInfoResponse</p>
 */
public class GetBlockChainInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBlockChainInfoResponseBody body;

    private GetBlockChainInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBlockChainInfoResponse create() {
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
    public GetBlockChainInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBlockChainInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBlockChainInfoResponseBody body);

        @Override
        GetBlockChainInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBlockChainInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBlockChainInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBlockChainInfoResponse response) {
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
        public Builder body(GetBlockChainInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBlockChainInfoResponse build() {
            return new GetBlockChainInfoResponse(this);
        } 

    } 

}
