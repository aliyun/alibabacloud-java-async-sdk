// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateAdditionalCertificatesWithListenerResponse} extends {@link TeaModel}
 *
 * <p>DissociateAdditionalCertificatesWithListenerResponse</p>
 */
public class DissociateAdditionalCertificatesWithListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateAdditionalCertificatesWithListenerResponseBody body;

    private DissociateAdditionalCertificatesWithListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateAdditionalCertificatesWithListenerResponse create() {
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
    public DissociateAdditionalCertificatesWithListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateAdditionalCertificatesWithListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateAdditionalCertificatesWithListenerResponseBody body);

        @Override
        DissociateAdditionalCertificatesWithListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateAdditionalCertificatesWithListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateAdditionalCertificatesWithListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateAdditionalCertificatesWithListenerResponse response) {
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
        public Builder body(DissociateAdditionalCertificatesWithListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateAdditionalCertificatesWithListenerResponse build() {
            return new DissociateAdditionalCertificatesWithListenerResponse(this);
        } 

    } 

}
