// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeAuctionResponse} extends {@link TeaModel}
 *
 * <p>GetOcJusticeAuctionResponse</p>
 */
public class GetOcJusticeAuctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcJusticeAuctionResponseBody body;

    private GetOcJusticeAuctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcJusticeAuctionResponse create() {
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
    public GetOcJusticeAuctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcJusticeAuctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcJusticeAuctionResponseBody body);

        @Override
        GetOcJusticeAuctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcJusticeAuctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcJusticeAuctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcJusticeAuctionResponse response) {
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
        public Builder body(GetOcJusticeAuctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcJusticeAuctionResponse build() {
            return new GetOcJusticeAuctionResponse(this);
        } 

    } 

}
