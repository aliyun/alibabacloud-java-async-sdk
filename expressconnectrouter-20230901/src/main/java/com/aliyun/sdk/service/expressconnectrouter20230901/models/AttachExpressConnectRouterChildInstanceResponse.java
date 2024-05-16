// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachExpressConnectRouterChildInstanceResponse} extends {@link TeaModel}
 *
 * <p>AttachExpressConnectRouterChildInstanceResponse</p>
 */
public class AttachExpressConnectRouterChildInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AttachExpressConnectRouterChildInstanceResponseBody body;

    private AttachExpressConnectRouterChildInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AttachExpressConnectRouterChildInstanceResponse create() {
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
    public AttachExpressConnectRouterChildInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachExpressConnectRouterChildInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AttachExpressConnectRouterChildInstanceResponseBody body);

        @Override
        AttachExpressConnectRouterChildInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachExpressConnectRouterChildInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AttachExpressConnectRouterChildInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachExpressConnectRouterChildInstanceResponse response) {
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
        public Builder body(AttachExpressConnectRouterChildInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachExpressConnectRouterChildInstanceResponse build() {
            return new AttachExpressConnectRouterChildInstanceResponse(this);
        } 

    } 

}
