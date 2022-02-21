// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateAdditionalCertificatesFromListenerResponse} extends {@link TeaModel}
 *
 * <p>DissociateAdditionalCertificatesFromListenerResponse</p>
 */
public class DissociateAdditionalCertificatesFromListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateAdditionalCertificatesFromListenerResponseBody body;

    private DissociateAdditionalCertificatesFromListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateAdditionalCertificatesFromListenerResponse create() {
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
    public DissociateAdditionalCertificatesFromListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateAdditionalCertificatesFromListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateAdditionalCertificatesFromListenerResponseBody body);

        @Override
        DissociateAdditionalCertificatesFromListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateAdditionalCertificatesFromListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateAdditionalCertificatesFromListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateAdditionalCertificatesFromListenerResponse response) {
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
        public Builder body(DissociateAdditionalCertificatesFromListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateAdditionalCertificatesFromListenerResponse build() {
            return new DissociateAdditionalCertificatesFromListenerResponse(this);
        } 

    } 

}
