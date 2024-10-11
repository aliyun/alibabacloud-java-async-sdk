// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteGatewayIsolationRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteGatewayIsolationRuleResponse</p>
 */
public class DeleteGatewayIsolationRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteGatewayIsolationRuleResponseBody body;

    private DeleteGatewayIsolationRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteGatewayIsolationRuleResponse create() {
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
    public DeleteGatewayIsolationRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGatewayIsolationRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteGatewayIsolationRuleResponseBody body);

        @Override
        DeleteGatewayIsolationRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGatewayIsolationRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteGatewayIsolationRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGatewayIsolationRuleResponse response) {
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
        public Builder body(DeleteGatewayIsolationRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGatewayIsolationRuleResponse build() {
            return new DeleteGatewayIsolationRuleResponse(this);
        } 

    } 

}
