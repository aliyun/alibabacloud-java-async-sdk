// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExternalSAMLIdPCertificatesResponse} extends {@link TeaModel}
 *
 * <p>ListExternalSAMLIdPCertificatesResponse</p>
 */
public class ListExternalSAMLIdPCertificatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExternalSAMLIdPCertificatesResponseBody body;

    private ListExternalSAMLIdPCertificatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExternalSAMLIdPCertificatesResponse create() {
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
    public ListExternalSAMLIdPCertificatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExternalSAMLIdPCertificatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExternalSAMLIdPCertificatesResponseBody body);

        @Override
        ListExternalSAMLIdPCertificatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExternalSAMLIdPCertificatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExternalSAMLIdPCertificatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExternalSAMLIdPCertificatesResponse response) {
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
        public Builder body(ListExternalSAMLIdPCertificatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExternalSAMLIdPCertificatesResponse build() {
            return new ListExternalSAMLIdPCertificatesResponse(this);
        } 

    } 

}
