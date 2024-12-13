// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ActiveDeviceCertificateResponse} extends {@link TeaModel}
 *
 * <p>ActiveDeviceCertificateResponse</p>
 */
public class ActiveDeviceCertificateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ActiveDeviceCertificateResponseBody body;

    private ActiveDeviceCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ActiveDeviceCertificateResponse create() {
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
    public ActiveDeviceCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActiveDeviceCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ActiveDeviceCertificateResponseBody body);

        @Override
        ActiveDeviceCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActiveDeviceCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ActiveDeviceCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActiveDeviceCertificateResponse response) {
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
        public Builder body(ActiveDeviceCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActiveDeviceCertificateResponse build() {
            return new ActiveDeviceCertificateResponse(this);
        } 

    } 

}
