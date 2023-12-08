// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallsV2RouteListResponse} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2RouteListResponse</p>
 */
public class DescribeTrFirewallsV2RouteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTrFirewallsV2RouteListResponseBody body;

    private DescribeTrFirewallsV2RouteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTrFirewallsV2RouteListResponse create() {
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
    public DescribeTrFirewallsV2RouteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTrFirewallsV2RouteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTrFirewallsV2RouteListResponseBody body);

        @Override
        DescribeTrFirewallsV2RouteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTrFirewallsV2RouteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTrFirewallsV2RouteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTrFirewallsV2RouteListResponse response) {
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
        public Builder body(DescribeTrFirewallsV2RouteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTrFirewallsV2RouteListResponse build() {
            return new DescribeTrFirewallsV2RouteListResponse(this);
        } 

    } 

}
