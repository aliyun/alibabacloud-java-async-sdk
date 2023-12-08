// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserAssetIPTrafficInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserAssetIPTrafficInfoResponse</p>
 */
public class DescribeUserAssetIPTrafficInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserAssetIPTrafficInfoResponseBody body;

    private DescribeUserAssetIPTrafficInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserAssetIPTrafficInfoResponse create() {
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
    public DescribeUserAssetIPTrafficInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserAssetIPTrafficInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserAssetIPTrafficInfoResponseBody body);

        @Override
        DescribeUserAssetIPTrafficInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserAssetIPTrafficInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserAssetIPTrafficInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserAssetIPTrafficInfoResponse response) {
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
        public Builder body(DescribeUserAssetIPTrafficInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserAssetIPTrafficInfoResponse build() {
            return new DescribeUserAssetIPTrafficInfoResponse(this);
        } 

    } 

}
