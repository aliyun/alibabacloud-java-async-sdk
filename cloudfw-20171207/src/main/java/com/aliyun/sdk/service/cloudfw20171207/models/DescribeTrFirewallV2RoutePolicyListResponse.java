// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallV2RoutePolicyListResponse} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallV2RoutePolicyListResponse</p>
 */
public class DescribeTrFirewallV2RoutePolicyListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeTrFirewallV2RoutePolicyListResponseBody body;

    private DescribeTrFirewallV2RoutePolicyListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeTrFirewallV2RoutePolicyListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTrFirewallV2RoutePolicyListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeTrFirewallV2RoutePolicyListResponseBody body);

        @Override
        DescribeTrFirewallV2RoutePolicyListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTrFirewallV2RoutePolicyListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeTrFirewallV2RoutePolicyListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTrFirewallV2RoutePolicyListResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
