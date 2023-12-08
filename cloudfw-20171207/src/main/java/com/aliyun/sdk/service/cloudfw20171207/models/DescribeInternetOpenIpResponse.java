// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetOpenIpResponse} extends {@link TeaModel}
 *
 * <p>DescribeInternetOpenIpResponse</p>
 */
public class DescribeInternetOpenIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInternetOpenIpResponseBody body;

    private DescribeInternetOpenIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInternetOpenIpResponse create() {
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
    public DescribeInternetOpenIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInternetOpenIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInternetOpenIpResponseBody body);

        @Override
        DescribeInternetOpenIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInternetOpenIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInternetOpenIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInternetOpenIpResponse response) {
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
        public Builder body(DescribeInternetOpenIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInternetOpenIpResponse build() {
            return new DescribeInternetOpenIpResponse(this);
        } 

    } 

}
