// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCertificateStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateCertificateStatusResponse</p>
 */
public class UpdateCertificateStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCertificateStatusResponseBody body;

    private UpdateCertificateStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCertificateStatusResponse create() {
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
    public UpdateCertificateStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCertificateStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCertificateStatusResponseBody body);

        @Override
        UpdateCertificateStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCertificateStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCertificateStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCertificateStatusResponse response) {
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
        public Builder body(UpdateCertificateStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCertificateStatusResponse build() {
            return new UpdateCertificateStatusResponse(this);
        } 

    } 

}
