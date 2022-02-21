// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthPriceResponse} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPriceResponse</p>
 */
public class DescribeBandwidthPriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBandwidthPriceResponseBody body;

    private DescribeBandwidthPriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBandwidthPriceResponse create() {
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
    public DescribeBandwidthPriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBandwidthPriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBandwidthPriceResponseBody body);

        @Override
        DescribeBandwidthPriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBandwidthPriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBandwidthPriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBandwidthPriceResponse response) {
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
        public Builder body(DescribeBandwidthPriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBandwidthPriceResponse build() {
            return new DescribeBandwidthPriceResponse(this);
        } 

    } 

}
