// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificateResponse} extends {@link TeaModel}
 *
 * <p>DescribeCACertificateResponse</p>
 */
public class DescribeCACertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCACertificateResponseBody body;

    private DescribeCACertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCACertificateResponse create() {
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
    public DescribeCACertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCACertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCACertificateResponseBody body);

        @Override
        DescribeCACertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCACertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCACertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCACertificateResponse response) {
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
        public Builder body(DescribeCACertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCACertificateResponse build() {
            return new DescribeCACertificateResponse(this);
        } 

    } 

}
