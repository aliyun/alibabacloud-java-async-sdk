// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link TransitIntegratedDirectionResponse} extends {@link TeaModel}
 *
 * <p>TransitIntegratedDirectionResponse</p>
 */
public class TransitIntegratedDirectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TransitIntegratedDirectionResponseBody body;

    private TransitIntegratedDirectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TransitIntegratedDirectionResponse create() {
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
    public TransitIntegratedDirectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransitIntegratedDirectionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(TransitIntegratedDirectionResponseBody body);

        @Override
        TransitIntegratedDirectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransitIntegratedDirectionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private TransitIntegratedDirectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransitIntegratedDirectionResponse response) {
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
        public Builder body(TransitIntegratedDirectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransitIntegratedDirectionResponse build() {
            return new TransitIntegratedDirectionResponse(this);
        } 

    } 

}
