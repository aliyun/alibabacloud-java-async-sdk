// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificatesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCACertificatesResponse</p>
 */
public class DescribeCACertificatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCACertificatesResponseBody body;

    private DescribeCACertificatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCACertificatesResponse create() {
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
    public DescribeCACertificatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCACertificatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCACertificatesResponseBody body);

        @Override
        DescribeCACertificatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCACertificatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCACertificatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCACertificatesResponse response) {
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
        public Builder body(DescribeCACertificatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCACertificatesResponse build() {
            return new DescribeCACertificatesResponse(this);
        } 

    } 

}
