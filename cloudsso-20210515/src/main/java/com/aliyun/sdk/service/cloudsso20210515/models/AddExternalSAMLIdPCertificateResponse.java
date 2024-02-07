// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddExternalSAMLIdPCertificateResponse} extends {@link TeaModel}
 *
 * <p>AddExternalSAMLIdPCertificateResponse</p>
 */
public class AddExternalSAMLIdPCertificateResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AddExternalSAMLIdPCertificateResponseBody body;

    private AddExternalSAMLIdPCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddExternalSAMLIdPCertificateResponse create() {
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
    public AddExternalSAMLIdPCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddExternalSAMLIdPCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddExternalSAMLIdPCertificateResponseBody body);

        @Override
        AddExternalSAMLIdPCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddExternalSAMLIdPCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddExternalSAMLIdPCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddExternalSAMLIdPCertificateResponse response) {
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
        public Builder body(AddExternalSAMLIdPCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddExternalSAMLIdPCertificateResponse build() {
            return new AddExternalSAMLIdPCertificateResponse(this);
        } 

    } 

}
