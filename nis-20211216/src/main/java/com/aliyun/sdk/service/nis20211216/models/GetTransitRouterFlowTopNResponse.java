// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTransitRouterFlowTopNResponse} extends {@link TeaModel}
 *
 * <p>GetTransitRouterFlowTopNResponse</p>
 */
public class GetTransitRouterFlowTopNResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTransitRouterFlowTopNResponseBody body;

    private GetTransitRouterFlowTopNResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTransitRouterFlowTopNResponse create() {
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
    public GetTransitRouterFlowTopNResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTransitRouterFlowTopNResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTransitRouterFlowTopNResponseBody body);

        @Override
        GetTransitRouterFlowTopNResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTransitRouterFlowTopNResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTransitRouterFlowTopNResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTransitRouterFlowTopNResponse response) {
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
        public Builder body(GetTransitRouterFlowTopNResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTransitRouterFlowTopNResponse build() {
            return new GetTransitRouterFlowTopNResponse(this);
        } 

    } 

}
