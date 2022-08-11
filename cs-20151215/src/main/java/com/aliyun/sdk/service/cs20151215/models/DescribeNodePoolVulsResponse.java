// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodePoolVulsResponse} extends {@link TeaModel}
 *
 * <p>DescribeNodePoolVulsResponse</p>
 */
public class DescribeNodePoolVulsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNodePoolVulsResponseBody body;

    private DescribeNodePoolVulsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNodePoolVulsResponse create() {
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
    public DescribeNodePoolVulsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNodePoolVulsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNodePoolVulsResponseBody body);

        @Override
        DescribeNodePoolVulsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNodePoolVulsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNodePoolVulsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNodePoolVulsResponse response) {
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
        public Builder body(DescribeNodePoolVulsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNodePoolVulsResponse build() {
            return new DescribeNodePoolVulsResponse(this);
        } 

    } 

}
