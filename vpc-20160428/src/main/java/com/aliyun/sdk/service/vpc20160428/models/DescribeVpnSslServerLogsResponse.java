// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnSslServerLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpnSslServerLogsResponse</p>
 */
public class DescribeVpnSslServerLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpnSslServerLogsResponseBody body;

    private DescribeVpnSslServerLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpnSslServerLogsResponse create() {
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
    public DescribeVpnSslServerLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpnSslServerLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpnSslServerLogsResponseBody body);

        @Override
        DescribeVpnSslServerLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpnSslServerLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpnSslServerLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpnSslServerLogsResponse response) {
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
        public Builder body(DescribeVpnSslServerLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpnSslServerLogsResponse build() {
            return new DescribeVpnSslServerLogsResponse(this);
        } 

    } 

}
