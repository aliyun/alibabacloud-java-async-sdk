// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommodityPriceResponse} extends {@link TeaModel}
 *
 * <p>DescribeCommodityPriceResponse</p>
 */
public class DescribeCommodityPriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCommodityPriceResponseBody body;

    private DescribeCommodityPriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCommodityPriceResponse create() {
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
    public DescribeCommodityPriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCommodityPriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCommodityPriceResponseBody body);

        @Override
        DescribeCommodityPriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCommodityPriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCommodityPriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCommodityPriceResponse response) {
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
        public Builder body(DescribeCommodityPriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCommodityPriceResponse build() {
            return new DescribeCommodityPriceResponse(this);
        } 

    } 

}
