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
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetTransitRouterFlowTopNResponseBody body;

    private GetTransitRouterFlowTopNResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetTransitRouterFlowTopNResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTransitRouterFlowTopNResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetTransitRouterFlowTopNResponseBody body);

        @Override
        GetTransitRouterFlowTopNResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTransitRouterFlowTopNResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetTransitRouterFlowTopNResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTransitRouterFlowTopNResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
