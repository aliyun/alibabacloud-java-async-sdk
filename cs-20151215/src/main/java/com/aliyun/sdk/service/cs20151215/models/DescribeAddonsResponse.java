// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAddonsResponse</p>
 */
public class DescribeAddonsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAddonsResponseBody body;

    private DescribeAddonsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAddonsResponse create() {
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
    public DescribeAddonsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAddonsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAddonsResponseBody body);

        @Override
        DescribeAddonsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAddonsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAddonsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAddonsResponse response) {
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
        public Builder body(DescribeAddonsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAddonsResponse build() {
            return new DescribeAddonsResponse(this);
        } 

    } 

}
