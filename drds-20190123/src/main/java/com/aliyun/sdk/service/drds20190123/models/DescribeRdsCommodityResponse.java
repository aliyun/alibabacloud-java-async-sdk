// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsCommodityResponse} extends {@link TeaModel}
 *
 * <p>DescribeRdsCommodityResponse</p>
 */
public class DescribeRdsCommodityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRdsCommodityResponseBody body;

    private DescribeRdsCommodityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRdsCommodityResponse create() {
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
    public DescribeRdsCommodityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRdsCommodityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRdsCommodityResponseBody body);

        @Override
        DescribeRdsCommodityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRdsCommodityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRdsCommodityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRdsCommodityResponse response) {
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
        public Builder body(DescribeRdsCommodityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRdsCommodityResponse build() {
            return new DescribeRdsCommodityResponse(this);
        } 

    } 

}
