// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableGatewayIpv6Response} extends {@link TeaModel}
 *
 * <p>EnableGatewayIpv6Response</p>
 */
public class EnableGatewayIpv6Response extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private EnableGatewayIpv6ResponseBody body;

    private EnableGatewayIpv6Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnableGatewayIpv6Response create() {
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
    public EnableGatewayIpv6ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableGatewayIpv6Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnableGatewayIpv6ResponseBody body);

        @Override
        EnableGatewayIpv6Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableGatewayIpv6Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private EnableGatewayIpv6ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableGatewayIpv6Response response) {
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
        public Builder body(EnableGatewayIpv6ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableGatewayIpv6Response build() {
            return new EnableGatewayIpv6Response(this);
        } 

    } 

}
