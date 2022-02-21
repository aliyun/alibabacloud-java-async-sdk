// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenerCertificatesResponse} extends {@link TeaModel}
 *
 * <p>ListListenerCertificatesResponse</p>
 */
public class ListListenerCertificatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListListenerCertificatesResponseBody body;

    private ListListenerCertificatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListListenerCertificatesResponse create() {
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
    public ListListenerCertificatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListListenerCertificatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListListenerCertificatesResponseBody body);

        @Override
        ListListenerCertificatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListListenerCertificatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListListenerCertificatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListListenerCertificatesResponse response) {
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
        public Builder body(ListListenerCertificatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListListenerCertificatesResponse build() {
            return new ListListenerCertificatesResponse(this);
        } 

    } 

}
