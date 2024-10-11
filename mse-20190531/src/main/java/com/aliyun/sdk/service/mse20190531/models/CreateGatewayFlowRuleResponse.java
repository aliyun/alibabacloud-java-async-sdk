// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGatewayFlowRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateGatewayFlowRuleResponse</p>
 */
public class CreateGatewayFlowRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateGatewayFlowRuleResponseBody body;

    private CreateGatewayFlowRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateGatewayFlowRuleResponse create() {
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
    public CreateGatewayFlowRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGatewayFlowRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateGatewayFlowRuleResponseBody body);

        @Override
        CreateGatewayFlowRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGatewayFlowRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateGatewayFlowRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGatewayFlowRuleResponse response) {
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
        public Builder body(CreateGatewayFlowRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGatewayFlowRuleResponse build() {
            return new CreateGatewayFlowRuleResponse(this);
        } 

    } 

}
