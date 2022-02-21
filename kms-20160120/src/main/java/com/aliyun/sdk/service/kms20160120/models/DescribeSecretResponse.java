// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecretResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecretResponse</p>
 */
public class DescribeSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecretResponseBody body;

    private DescribeSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecretResponse create() {
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
    public DescribeSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecretResponseBody body);

        @Override
        DescribeSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecretResponse response) {
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
        public Builder body(DescribeSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecretResponse build() {
            return new DescribeSecretResponse(this);
        } 

    } 

}
