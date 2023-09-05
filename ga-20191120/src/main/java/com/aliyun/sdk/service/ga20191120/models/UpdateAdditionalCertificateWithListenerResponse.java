// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAdditionalCertificateWithListenerResponse} extends {@link TeaModel}
 *
 * <p>UpdateAdditionalCertificateWithListenerResponse</p>
 */
public class UpdateAdditionalCertificateWithListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAdditionalCertificateWithListenerResponseBody body;

    private UpdateAdditionalCertificateWithListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public UpdateAdditionalCertificateWithListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAdditionalCertificateWithListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAdditionalCertificateWithListenerResponseBody body);

        @Override
        UpdateAdditionalCertificateWithListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAdditionalCertificateWithListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAdditionalCertificateWithListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAdditionalCertificateWithListenerResponse response) {
            super(response);
            this.headers = response.headers;
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
