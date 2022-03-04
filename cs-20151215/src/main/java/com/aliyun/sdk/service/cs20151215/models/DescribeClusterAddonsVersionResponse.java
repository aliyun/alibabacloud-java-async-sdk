// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonsVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterAddonsVersionResponse</p>
 */
public class DescribeClusterAddonsVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.Map < String, ? > body;

    private DescribeClusterAddonsVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterAddonsVersionResponse create() {
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
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterAddonsVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.Map < String, ? > body);

        @Override
        DescribeClusterAddonsVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterAddonsVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.Map < String, ? > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterAddonsVersionResponse response) {
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
        public Builder body(java.util.Map < String, ? > body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterAddonsVersionResponse build() {
            return new DescribeClusterAddonsVersionResponse(this);
        } 

    } 

}
