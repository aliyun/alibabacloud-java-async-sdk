// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAdditionalCertificateWithListenerResponse} extends {@link TeaModel}
 *
 * <p>UpdateAdditionalCertificateWithListenerResponse</p>
 */
public class UpdateAdditionalCertificateWithListenerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateAdditionalCertificateWithListenerResponseBody body;

    private UpdateAdditionalCertificateWithListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateAdditionalCertificateWithListenerResponse create() {
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
    public UpdateAdditionalCertificateWithListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAdditionalCertificateWithListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateAdditionalCertificateWithListenerResponseBody body);

        @Override
        UpdateAdditionalCertificateWithListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAdditionalCertificateWithListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateAdditionalCertificateWithListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAdditionalCertificateWithListenerResponse response) {
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
        public Builder body(UpdateAdditionalCertificateWithListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAdditionalCertificateWithListenerResponse build() {
            return new UpdateAdditionalCertificateWithListenerResponse(this);
        } 

    } 

}
