// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHeadersResponse} extends {@link TeaModel}
 *
 * <p>DescribeHeadersResponse</p>
 */
public class DescribeHeadersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHeadersResponseBody body;

    private DescribeHeadersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHeadersResponse create() {
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
    public DescribeHeadersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHeadersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHeadersResponseBody body);

        @Override
        DescribeHeadersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHeadersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHeadersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHeadersResponse response) {
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
        public Builder body(DescribeHeadersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHeadersResponse build() {
            return new DescribeHeadersResponse(this);
        } 

    } 

}
