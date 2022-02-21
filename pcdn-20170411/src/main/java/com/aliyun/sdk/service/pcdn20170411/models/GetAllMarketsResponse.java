// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllMarketsResponse} extends {@link TeaModel}
 *
 * <p>GetAllMarketsResponse</p>
 */
public class GetAllMarketsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAllMarketsResponseBody body;

    private GetAllMarketsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAllMarketsResponse create() {
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
    public GetAllMarketsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAllMarketsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAllMarketsResponseBody body);

        @Override
        GetAllMarketsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAllMarketsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAllMarketsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAllMarketsResponse response) {
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
        public Builder body(GetAllMarketsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAllMarketsResponse build() {
            return new GetAllMarketsResponse(this);
        } 

    } 

}
