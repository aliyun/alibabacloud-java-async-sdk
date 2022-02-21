// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAgilityTunnelCertsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAgilityTunnelCertsResponse</p>
 */
public class DescribeAgilityTunnelCertsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DescribeAgilityTunnelCertsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static DescribeAgilityTunnelCertsResponse create() {
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

    public interface Builder extends Response.Builder<DescribeAgilityTunnelCertsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DescribeAgilityTunnelCertsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAgilityTunnelCertsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAgilityTunnelCertsResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DescribeAgilityTunnelCertsResponse build() {
            return new DescribeAgilityTunnelCertsResponse(this);
        } 

    } 

}
