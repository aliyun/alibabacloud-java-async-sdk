// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableCertificatesResponse} extends {@link TeaModel}
 *
 * <p>ListAvailableCertificatesResponse</p>
 */
public class ListAvailableCertificatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAvailableCertificatesResponseBody body;

    private ListAvailableCertificatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAvailableCertificatesResponse create() {
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
    public ListAvailableCertificatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAvailableCertificatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAvailableCertificatesResponseBody body);

        @Override
        ListAvailableCertificatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAvailableCertificatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAvailableCertificatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAvailableCertificatesResponse response) {
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
        public Builder body(ListAvailableCertificatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAvailableCertificatesResponse build() {
            return new ListAvailableCertificatesResponse(this);
        } 

    } 

}
