// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnConnectionLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpnConnectionLogsResponse</p>
 */
public class DescribeVpnConnectionLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpnConnectionLogsResponseBody body;

    private DescribeVpnConnectionLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpnConnectionLogsResponse create() {
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
    public DescribeVpnConnectionLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpnConnectionLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpnConnectionLogsResponseBody body);

        @Override
        DescribeVpnConnectionLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpnConnectionLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpnConnectionLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpnConnectionLogsResponse response) {
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
        public Builder body(DescribeVpnConnectionLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpnConnectionLogsResponse build() {
            return new DescribeVpnConnectionLogsResponse(this);
        } 

    } 

}
