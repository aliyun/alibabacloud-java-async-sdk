// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateAdditionalCertificatesWithListenerResponse} extends {@link TeaModel}
 *
 * <p>AssociateAdditionalCertificatesWithListenerResponse</p>
 */
public class AssociateAdditionalCertificatesWithListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateAdditionalCertificatesWithListenerResponseBody body;

    private AssociateAdditionalCertificatesWithListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateAdditionalCertificatesWithListenerResponse create() {
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
    public AssociateAdditionalCertificatesWithListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateAdditionalCertificatesWithListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateAdditionalCertificatesWithListenerResponseBody body);

        @Override
        AssociateAdditionalCertificatesWithListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateAdditionalCertificatesWithListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateAdditionalCertificatesWithListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateAdditionalCertificatesWithListenerResponse response) {
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
        public Builder body(AssociateAdditionalCertificatesWithListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateAdditionalCertificatesWithListenerResponse build() {
            return new AssociateAdditionalCertificatesWithListenerResponse(this);
        } 

    } 

}
