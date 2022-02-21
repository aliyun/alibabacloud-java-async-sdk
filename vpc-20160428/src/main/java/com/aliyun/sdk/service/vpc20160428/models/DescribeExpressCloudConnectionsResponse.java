// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressCloudConnectionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeExpressCloudConnectionsResponse</p>
 */
public class DescribeExpressCloudConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExpressCloudConnectionsResponseBody body;

    private DescribeExpressCloudConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExpressCloudConnectionsResponse create() {
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
    public DescribeExpressCloudConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExpressCloudConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExpressCloudConnectionsResponseBody body);

        @Override
        DescribeExpressCloudConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExpressCloudConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExpressCloudConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExpressCloudConnectionsResponse response) {
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
        public Builder body(DescribeExpressCloudConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExpressCloudConnectionsResponse build() {
            return new DescribeExpressCloudConnectionsResponse(this);
        } 

    } 

}
