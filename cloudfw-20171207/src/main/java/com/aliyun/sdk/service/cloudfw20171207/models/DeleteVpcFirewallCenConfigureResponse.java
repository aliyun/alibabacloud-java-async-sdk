// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVpcFirewallCenConfigureResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcFirewallCenConfigureResponse</p>
 */
public class DeleteVpcFirewallCenConfigureResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteVpcFirewallCenConfigureResponseBody body;

    private DeleteVpcFirewallCenConfigureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteVpcFirewallCenConfigureResponse create() {
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
    public DeleteVpcFirewallCenConfigureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpcFirewallCenConfigureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteVpcFirewallCenConfigureResponseBody body);

        @Override
        DeleteVpcFirewallCenConfigureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpcFirewallCenConfigureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteVpcFirewallCenConfigureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpcFirewallCenConfigureResponse response) {
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
        public Builder body(DeleteVpcFirewallCenConfigureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpcFirewallCenConfigureResponse build() {
            return new DeleteVpcFirewallCenConfigureResponse(this);
        } 

    } 

}
