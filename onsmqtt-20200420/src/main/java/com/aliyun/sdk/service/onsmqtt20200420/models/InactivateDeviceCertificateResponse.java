// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InactivateDeviceCertificateResponse} extends {@link TeaModel}
 *
 * <p>InactivateDeviceCertificateResponse</p>
 */
public class InactivateDeviceCertificateResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private InactivateDeviceCertificateResponseBody body;

    private InactivateDeviceCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static InactivateDeviceCertificateResponse create() {
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
    public InactivateDeviceCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InactivateDeviceCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(InactivateDeviceCertificateResponseBody body);

        @Override
        InactivateDeviceCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InactivateDeviceCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private InactivateDeviceCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InactivateDeviceCertificateResponse response) {
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
        public Builder body(InactivateDeviceCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InactivateDeviceCertificateResponse build() {
            return new InactivateDeviceCertificateResponse(this);
        } 

    } 

}
