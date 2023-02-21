// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationBiddingResponse} extends {@link TeaModel}
 *
 * <p>GetOcOperationBiddingResponse</p>
 */
public class GetOcOperationBiddingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcOperationBiddingResponseBody body;

    private GetOcOperationBiddingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcOperationBiddingResponse create() {
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
    public GetOcOperationBiddingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcOperationBiddingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcOperationBiddingResponseBody body);

        @Override
        GetOcOperationBiddingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcOperationBiddingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcOperationBiddingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcOperationBiddingResponse response) {
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
        public Builder body(GetOcOperationBiddingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcOperationBiddingResponse build() {
            return new GetOcOperationBiddingResponse(this);
        } 

    } 

}
