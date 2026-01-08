// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link RequestWhatsappConversionApiResponse} extends {@link TeaModel}
 *
 * <p>RequestWhatsappConversionApiResponse</p>
 */
public class RequestWhatsappConversionApiResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RequestWhatsappConversionApiResponseBody body;

    private RequestWhatsappConversionApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RequestWhatsappConversionApiResponse create() {
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
    public RequestWhatsappConversionApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RequestWhatsappConversionApiResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RequestWhatsappConversionApiResponseBody body);

        @Override
        RequestWhatsappConversionApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RequestWhatsappConversionApiResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RequestWhatsappConversionApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RequestWhatsappConversionApiResponse response) {
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
        public Builder body(RequestWhatsappConversionApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RequestWhatsappConversionApiResponse build() {
            return new RequestWhatsappConversionApiResponse(this);
        } 

    } 

}
