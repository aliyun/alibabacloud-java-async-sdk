// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecretsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecretsResponse</p>
 */
public class DescribeSecretsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecretsResponseBody body;

    private DescribeSecretsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecretsResponse create() {
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
    public DescribeSecretsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecretsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecretsResponseBody body);

        @Override
        DescribeSecretsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecretsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecretsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecretsResponse response) {
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
        public Builder body(DescribeSecretsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecretsResponse build() {
            return new DescribeSecretsResponse(this);
        } 

    } 

}
