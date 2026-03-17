// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link UnbindSmartAccessGatewayResponse} extends {@link TeaModel}
 *
 * <p>UnbindSmartAccessGatewayResponse</p>
 */
public class UnbindSmartAccessGatewayResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UnbindSmartAccessGatewayResponseBody body;

    private UnbindSmartAccessGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UnbindSmartAccessGatewayResponse create() {
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
    public UnbindSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindSmartAccessGatewayResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UnbindSmartAccessGatewayResponseBody body);

        @Override
        UnbindSmartAccessGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindSmartAccessGatewayResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UnbindSmartAccessGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindSmartAccessGatewayResponse response) {
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
        public Builder body(UnbindSmartAccessGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindSmartAccessGatewayResponse build() {
            return new UnbindSmartAccessGatewayResponse(this);
        } 

    } 

}
