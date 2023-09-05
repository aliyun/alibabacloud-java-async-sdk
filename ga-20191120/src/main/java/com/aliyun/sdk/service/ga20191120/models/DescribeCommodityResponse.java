// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommodityResponse} extends {@link TeaModel}
 *
 * <p>DescribeCommodityResponse</p>
 */
public class DescribeCommodityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCommodityResponseBody body;

    private DescribeCommodityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCommodityResponse create() {
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
    public DescribeCommodityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCommodityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCommodityResponseBody body);

        @Override
        DescribeCommodityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCommodityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCommodityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCommodityResponse response) {
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
        public Builder body(DescribeCommodityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCommodityResponse build() {
            return new DescribeCommodityResponse(this);
        } 

    } 

}
