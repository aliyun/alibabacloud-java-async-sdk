// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnCrossAccountAuthorizationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpnCrossAccountAuthorizationsResponse</p>
 */
public class DescribeVpnCrossAccountAuthorizationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpnCrossAccountAuthorizationsResponseBody body;

    private DescribeVpnCrossAccountAuthorizationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpnCrossAccountAuthorizationsResponse create() {
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
    public DescribeVpnCrossAccountAuthorizationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpnCrossAccountAuthorizationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpnCrossAccountAuthorizationsResponseBody body);

        @Override
        DescribeVpnCrossAccountAuthorizationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpnCrossAccountAuthorizationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpnCrossAccountAuthorizationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpnCrossAccountAuthorizationsResponse response) {
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
        public Builder body(DescribeVpnCrossAccountAuthorizationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpnCrossAccountAuthorizationsResponse build() {
            return new DescribeVpnCrossAccountAuthorizationsResponse(this);
        } 

    } 

}
