// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link AicsOpenApiInvokeResponse} extends {@link TeaModel}
 *
 * <p>AicsOpenApiInvokeResponse</p>
 */
public class AicsOpenApiInvokeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AicsOpenApiInvokeResponseBody body;

    private AicsOpenApiInvokeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AicsOpenApiInvokeResponse create() {
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
    public AicsOpenApiInvokeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AicsOpenApiInvokeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AicsOpenApiInvokeResponseBody body);

        @Override
        AicsOpenApiInvokeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AicsOpenApiInvokeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AicsOpenApiInvokeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AicsOpenApiInvokeResponse response) {
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
        public Builder body(AicsOpenApiInvokeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AicsOpenApiInvokeResponse build() {
            return new AicsOpenApiInvokeResponse(this);
        } 

    } 

}
