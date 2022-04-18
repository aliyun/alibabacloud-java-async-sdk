// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataAssetsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataAssetsResponse</p>
 */
public class DescribeDataAssetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataAssetsResponseBody body;

    private DescribeDataAssetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataAssetsResponse create() {
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
    public DescribeDataAssetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataAssetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataAssetsResponseBody body);

        @Override
        DescribeDataAssetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataAssetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataAssetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataAssetsResponse response) {
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
        public Builder body(DescribeDataAssetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataAssetsResponse build() {
            return new DescribeDataAssetsResponse(this);
        } 

    } 

}
