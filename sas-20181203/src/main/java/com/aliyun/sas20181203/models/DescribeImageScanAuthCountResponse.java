// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageScanAuthCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageScanAuthCountResponse</p>
 */
public class DescribeImageScanAuthCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageScanAuthCountResponseBody body;

    private DescribeImageScanAuthCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageScanAuthCountResponse create() {
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
    public DescribeImageScanAuthCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageScanAuthCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageScanAuthCountResponseBody body);

        @Override
        DescribeImageScanAuthCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageScanAuthCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageScanAuthCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageScanAuthCountResponse response) {
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
        public Builder body(DescribeImageScanAuthCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageScanAuthCountResponse build() {
            return new DescribeImageScanAuthCountResponse(this);
        } 

    } 

}
