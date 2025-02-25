// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link UAIDConversionResponse} extends {@link TeaModel}
 *
 * <p>UAIDConversionResponse</p>
 */
public class UAIDConversionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UAIDConversionResponseBody body;

    private UAIDConversionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UAIDConversionResponse create() {
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
    public UAIDConversionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UAIDConversionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UAIDConversionResponseBody body);

        @Override
        UAIDConversionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UAIDConversionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UAIDConversionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UAIDConversionResponse response) {
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
        public Builder body(UAIDConversionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UAIDConversionResponse build() {
            return new UAIDConversionResponse(this);
        } 

    } 

}
