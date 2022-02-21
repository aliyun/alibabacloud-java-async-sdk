// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSSLCertResponse} extends {@link TeaModel}
 *
 * <p>ListSSLCertResponse</p>
 */
public class ListSSLCertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSSLCertResponseBody body;

    private ListSSLCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSSLCertResponse create() {
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
    public ListSSLCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSSLCertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSSLCertResponseBody body);

        @Override
        ListSSLCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSSLCertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSSLCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSSLCertResponse response) {
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
        public Builder body(ListSSLCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSSLCertResponse build() {
            return new ListSSLCertResponse(this);
        } 

    } 

}
