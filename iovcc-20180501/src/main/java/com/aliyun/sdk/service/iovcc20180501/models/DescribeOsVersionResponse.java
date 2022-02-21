// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOsVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeOsVersionResponse</p>
 */
public class DescribeOsVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOsVersionResponseBody body;

    private DescribeOsVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOsVersionResponse create() {
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
    public DescribeOsVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOsVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOsVersionResponseBody body);

        @Override
        DescribeOsVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOsVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOsVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOsVersionResponse response) {
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
        public Builder body(DescribeOsVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOsVersionResponse build() {
            return new DescribeOsVersionResponse(this);
        } 

    } 

}
