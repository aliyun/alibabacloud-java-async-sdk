// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteExpressConnectTrafficQosResponse} extends {@link TeaModel}
 *
 * <p>DeleteExpressConnectTrafficQosResponse</p>
 */
public class DeleteExpressConnectTrafficQosResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteExpressConnectTrafficQosResponseBody body;

    private DeleteExpressConnectTrafficQosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteExpressConnectTrafficQosResponse create() {
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
    public DeleteExpressConnectTrafficQosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExpressConnectTrafficQosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteExpressConnectTrafficQosResponseBody body);

        @Override
        DeleteExpressConnectTrafficQosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExpressConnectTrafficQosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteExpressConnectTrafficQosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExpressConnectTrafficQosResponse response) {
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
        public Builder body(DeleteExpressConnectTrafficQosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExpressConnectTrafficQosResponse build() {
            return new DeleteExpressConnectTrafficQosResponse(this);
        } 

    } 

}
