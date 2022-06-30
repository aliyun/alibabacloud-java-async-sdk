// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPriceRangeResponse} extends {@link TeaModel}
 *
 * <p>GetPriceRangeResponse</p>
 */
public class GetPriceRangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPriceRangeResponseBody body;

    private GetPriceRangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPriceRangeResponse create() {
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
    public GetPriceRangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPriceRangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPriceRangeResponseBody body);

        @Override
        GetPriceRangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPriceRangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPriceRangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPriceRangeResponse response) {
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
        public Builder body(GetPriceRangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPriceRangeResponse build() {
            return new GetPriceRangeResponse(this);
        } 

    } 

}
