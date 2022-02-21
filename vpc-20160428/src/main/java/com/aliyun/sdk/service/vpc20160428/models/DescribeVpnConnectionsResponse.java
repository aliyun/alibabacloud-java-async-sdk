// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnConnectionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpnConnectionsResponse</p>
 */
public class DescribeVpnConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpnConnectionsResponseBody body;

    private DescribeVpnConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpnConnectionsResponse create() {
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
    public DescribeVpnConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpnConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpnConnectionsResponseBody body);

        @Override
        DescribeVpnConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpnConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpnConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpnConnectionsResponse response) {
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
        public Builder body(DescribeVpnConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpnConnectionsResponse build() {
            return new DescribeVpnConnectionsResponse(this);
        } 

    } 

}
