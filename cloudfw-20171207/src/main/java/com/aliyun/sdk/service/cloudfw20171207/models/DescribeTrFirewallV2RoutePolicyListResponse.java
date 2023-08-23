// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallV2RoutePolicyListResponse} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallV2RoutePolicyListResponse</p>
 */
public class DescribeTrFirewallV2RoutePolicyListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTrFirewallV2RoutePolicyListResponseBody body;

    private DescribeTrFirewallV2RoutePolicyListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTrFirewallV2RoutePolicyListResponse create() {
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
    public DescribeTrFirewallV2RoutePolicyListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTrFirewallV2RoutePolicyListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTrFirewallV2RoutePolicyListResponseBody body);

        @Override
        DescribeTrFirewallV2RoutePolicyListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTrFirewallV2RoutePolicyListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTrFirewallV2RoutePolicyListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTrFirewallV2RoutePolicyListResponse response) {
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
        public Builder body(DescribeTrFirewallV2RoutePolicyListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTrFirewallV2RoutePolicyListResponse build() {
            return new DescribeTrFirewallV2RoutePolicyListResponse(this);
        } 

    } 

}
