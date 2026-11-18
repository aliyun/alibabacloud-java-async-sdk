// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyTairAIGatewayParameterResponse} extends {@link TeaModel}
 *
 * <p>ModifyTairAIGatewayParameterResponse</p>
 */
public class ModifyTairAIGatewayParameterResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyTairAIGatewayParameterResponseBody body;

    private ModifyTairAIGatewayParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyTairAIGatewayParameterResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public ModifyTairAIGatewayParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTairAIGatewayParameterResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyTairAIGatewayParameterResponseBody body);

        @Override
        ModifyTairAIGatewayParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTairAIGatewayParameterResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyTairAIGatewayParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTairAIGatewayParameterResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(ModifyTairAIGatewayParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTairAIGatewayParameterResponse build() {
            return new ModifyTairAIGatewayParameterResponse(this);
        } 

    } 

}
