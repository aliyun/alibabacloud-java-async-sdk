// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateInfoByIDResponse} extends {@link TeaModel}
 *
 * <p>DescribeCertificateInfoByIDResponse</p>
 */
public class DescribeCertificateInfoByIDResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCertificateInfoByIDResponseBody body;

    private DescribeCertificateInfoByIDResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCertificateInfoByIDResponse create() {
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
    public DescribeCertificateInfoByIDResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCertificateInfoByIDResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCertificateInfoByIDResponseBody body);

        @Override
        DescribeCertificateInfoByIDResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCertificateInfoByIDResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCertificateInfoByIDResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCertificateInfoByIDResponse response) {
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
        public Builder body(DescribeCertificateInfoByIDResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCertificateInfoByIDResponse build() {
            return new DescribeCertificateInfoByIDResponse(this);
        } 

    } 

}
