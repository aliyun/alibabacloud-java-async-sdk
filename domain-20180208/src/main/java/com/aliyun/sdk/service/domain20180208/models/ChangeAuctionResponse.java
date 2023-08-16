// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeAuctionResponse} extends {@link TeaModel}
 *
 * <p>ChangeAuctionResponse</p>
 */
public class ChangeAuctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeAuctionResponseBody body;

    private ChangeAuctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeAuctionResponse create() {
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
    public ChangeAuctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeAuctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeAuctionResponseBody body);

        @Override
        ChangeAuctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeAuctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeAuctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeAuctionResponse response) {
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
        public Builder body(ChangeAuctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeAuctionResponse build() {
            return new ChangeAuctionResponse(this);
        } 

    } 

}
