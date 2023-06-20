// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLicenseResponse} extends {@link TeaModel}
 *
 * <p>DescribeLicenseResponse</p>
 */
public class DescribeLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLicenseResponseBody body;

    private DescribeLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLicenseResponse create() {
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
    public DescribeLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLicenseResponseBody body);

        @Override
        DescribeLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLicenseResponse response) {
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
        public Builder body(DescribeLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLicenseResponse build() {
            return new DescribeLicenseResponse(this);
        } 

    } 

}
