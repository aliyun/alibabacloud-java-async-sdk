// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadServerCertificateResponse} extends {@link TeaModel}
 *
 * <p>UploadServerCertificateResponse</p>
 */
public class UploadServerCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadServerCertificateResponseBody body;

    private UploadServerCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadServerCertificateResponse create() {
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
    public UploadServerCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadServerCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadServerCertificateResponseBody body);

        @Override
        UploadServerCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadServerCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadServerCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadServerCertificateResponse response) {
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
        public Builder body(UploadServerCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadServerCertificateResponse build() {
            return new UploadServerCertificateResponse(this);
        } 

    } 

}
