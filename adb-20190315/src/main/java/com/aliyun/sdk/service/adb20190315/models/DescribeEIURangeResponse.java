// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEIURangeResponse} extends {@link TeaModel}
 *
 * <p>DescribeEIURangeResponse</p>
 */
public class DescribeEIURangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEIURangeResponseBody body;

    private DescribeEIURangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEIURangeResponse create() {
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
    public DescribeEIURangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEIURangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEIURangeResponseBody body);

        @Override
        DescribeEIURangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEIURangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEIURangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEIURangeResponse response) {
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
        public Builder body(DescribeEIURangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEIURangeResponse build() {
            return new DescribeEIURangeResponse(this);
        } 

    } 

}
