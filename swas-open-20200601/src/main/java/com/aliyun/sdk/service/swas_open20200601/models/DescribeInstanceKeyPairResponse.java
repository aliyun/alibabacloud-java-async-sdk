// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceKeyPairResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceKeyPairResponse</p>
 */
public class DescribeInstanceKeyPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceKeyPairResponseBody body;

    private DescribeInstanceKeyPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstanceKeyPairResponse create() {
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
    public DescribeInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstanceKeyPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstanceKeyPairResponseBody body);

        @Override
        DescribeInstanceKeyPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstanceKeyPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceKeyPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstanceKeyPairResponse response) {
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
        public Builder body(DescribeInstanceKeyPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstanceKeyPairResponse build() {
            return new DescribeInstanceKeyPairResponse(this);
        } 

    } 

}
