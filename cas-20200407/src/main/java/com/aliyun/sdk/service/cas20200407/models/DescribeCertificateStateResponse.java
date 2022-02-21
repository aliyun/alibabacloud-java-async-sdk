// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateStateResponse} extends {@link TeaModel}
 *
 * <p>DescribeCertificateStateResponse</p>
 */
public class DescribeCertificateStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCertificateStateResponseBody body;

    private DescribeCertificateStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCertificateStateResponse create() {
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
    public DescribeCertificateStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCertificateStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCertificateStateResponseBody body);

        @Override
        DescribeCertificateStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCertificateStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCertificateStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCertificateStateResponse response) {
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
        public Builder body(DescribeCertificateStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCertificateStateResponse build() {
            return new DescribeCertificateStateResponse(this);
        } 

    } 

}
