// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBLinksResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBLinksResponse</p>
 */
public class DescribeDBLinksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBLinksResponseBody body;

    private DescribeDBLinksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBLinksResponse create() {
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
    public DescribeDBLinksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBLinksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBLinksResponseBody body);

        @Override
        DescribeDBLinksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBLinksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBLinksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBLinksResponse response) {
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
        public Builder body(DescribeDBLinksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBLinksResponse build() {
            return new DescribeDBLinksResponse(this);
        } 

    } 

}
