// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCertificatesResponse} extends {@link TeaModel}
 *
 * <p>ListCertificatesResponse</p>
 */
public class ListCertificatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCertificatesResponseBody body;

    private ListCertificatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCertificatesResponse create() {
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
    public ListCertificatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCertificatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCertificatesResponseBody body);

        @Override
        ListCertificatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCertificatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCertificatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCertificatesResponse response) {
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
        public Builder body(ListCertificatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCertificatesResponse build() {
            return new ListCertificatesResponse(this);
        } 

    } 

}
