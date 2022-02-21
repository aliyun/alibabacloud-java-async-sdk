// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceBrandResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeviceBrandResponse</p>
 */
public class DescribeDeviceBrandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeviceBrandResponseBody body;

    private DescribeDeviceBrandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeviceBrandResponse create() {
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
    public DescribeDeviceBrandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeviceBrandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeviceBrandResponseBody body);

        @Override
        DescribeDeviceBrandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeviceBrandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeviceBrandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeviceBrandResponse response) {
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
        public Builder body(DescribeDeviceBrandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeviceBrandResponse build() {
            return new DescribeDeviceBrandResponse(this);
        } 

    } 

}
