// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhysicalConnectionsResponse} extends {@link TeaModel}
 *
 * <p>DescribePhysicalConnectionsResponse</p>
 */
public class DescribePhysicalConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePhysicalConnectionsResponseBody body;

    private DescribePhysicalConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePhysicalConnectionsResponse create() {
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
    public DescribePhysicalConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePhysicalConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePhysicalConnectionsResponseBody body);

        @Override
        DescribePhysicalConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePhysicalConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePhysicalConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePhysicalConnectionsResponse response) {
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
        public Builder body(DescribePhysicalConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePhysicalConnectionsResponse build() {
            return new DescribePhysicalConnectionsResponse(this);
        } 

    } 

}
