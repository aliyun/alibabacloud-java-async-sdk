// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForceDeleteExpressConnectRouterResponse} extends {@link TeaModel}
 *
 * <p>ForceDeleteExpressConnectRouterResponse</p>
 */
public class ForceDeleteExpressConnectRouterResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ForceDeleteExpressConnectRouterResponseBody body;

    private ForceDeleteExpressConnectRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ForceDeleteExpressConnectRouterResponse create() {
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
    public ForceDeleteExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ForceDeleteExpressConnectRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ForceDeleteExpressConnectRouterResponseBody body);

        @Override
        ForceDeleteExpressConnectRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ForceDeleteExpressConnectRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ForceDeleteExpressConnectRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ForceDeleteExpressConnectRouterResponse response) {
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
        public Builder body(ForceDeleteExpressConnectRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ForceDeleteExpressConnectRouterResponse build() {
            return new ForceDeleteExpressConnectRouterResponse(this);
        } 

    } 

}
