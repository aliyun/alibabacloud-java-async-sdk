// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteIpv4GatewayResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpv4GatewayResponse</p>
 */
public class DeleteIpv4GatewayResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteIpv4GatewayResponseBody body;

    private DeleteIpv4GatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteIpv4GatewayResponse create() {
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
    public DeleteIpv4GatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpv4GatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteIpv4GatewayResponseBody body);

        @Override
        DeleteIpv4GatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpv4GatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteIpv4GatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpv4GatewayResponse response) {
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
        public Builder body(DeleteIpv4GatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpv4GatewayResponse build() {
            return new DeleteIpv4GatewayResponse(this);
        } 

    } 

}
