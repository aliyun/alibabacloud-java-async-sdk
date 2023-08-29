// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBootResponse} extends {@link TeaModel}
 *
 * <p>DescribeBootResponse</p>
 */
public class DescribeBootResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBootResponseBody body;

    private DescribeBootResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBootResponse create() {
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
    public DescribeBootResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBootResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBootResponseBody body);

        @Override
        DescribeBootResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBootResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBootResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBootResponse response) {
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
        public Builder body(DescribeBootResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBootResponse build() {
            return new DescribeBootResponse(this);
        } 

    } 

}
