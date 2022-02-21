// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceLicenseKeyResponse} extends {@link TeaModel}
 *
 * <p>DescribeTraceLicenseKeyResponse</p>
 */
public class DescribeTraceLicenseKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTraceLicenseKeyResponseBody body;

    private DescribeTraceLicenseKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTraceLicenseKeyResponse create() {
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
    public DescribeTraceLicenseKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTraceLicenseKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTraceLicenseKeyResponseBody body);

        @Override
        DescribeTraceLicenseKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTraceLicenseKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTraceLicenseKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTraceLicenseKeyResponse response) {
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
        public Builder body(DescribeTraceLicenseKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTraceLicenseKeyResponse build() {
            return new DescribeTraceLicenseKeyResponse(this);
        } 

    } 

}
