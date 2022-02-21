// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModificationPriceResponse} extends {@link TeaModel}
 *
 * <p>DescribeModificationPriceResponse</p>
 */
public class DescribeModificationPriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeModificationPriceResponseBody body;

    private DescribeModificationPriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeModificationPriceResponse create() {
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
    public DescribeModificationPriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeModificationPriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeModificationPriceResponseBody body);

        @Override
        DescribeModificationPriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeModificationPriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeModificationPriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeModificationPriceResponse response) {
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
        public Builder body(DescribeModificationPriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeModificationPriceResponse build() {
            return new DescribeModificationPriceResponse(this);
        } 

    } 

}
