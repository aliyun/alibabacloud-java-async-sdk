// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNetInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterNetInfoResponse</p>
 */
public class DescribeClusterNetInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterNetInfoResponseBody body;

    private DescribeClusterNetInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterNetInfoResponse create() {
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
    public DescribeClusterNetInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterNetInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterNetInfoResponseBody body);

        @Override
        DescribeClusterNetInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterNetInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterNetInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterNetInfoResponse response) {
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
        public Builder body(DescribeClusterNetInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterNetInfoResponse build() {
            return new DescribeClusterNetInfoResponse(this);
        } 

    } 

}
