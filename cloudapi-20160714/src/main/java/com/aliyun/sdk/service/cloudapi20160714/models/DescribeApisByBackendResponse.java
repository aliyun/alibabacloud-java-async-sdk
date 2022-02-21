// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisByBackendResponse} extends {@link TeaModel}
 *
 * <p>DescribeApisByBackendResponse</p>
 */
public class DescribeApisByBackendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApisByBackendResponseBody body;

    private DescribeApisByBackendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApisByBackendResponse create() {
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
    public DescribeApisByBackendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApisByBackendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApisByBackendResponseBody body);

        @Override
        DescribeApisByBackendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApisByBackendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApisByBackendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApisByBackendResponse response) {
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
        public Builder body(DescribeApisByBackendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApisByBackendResponse build() {
            return new DescribeApisByBackendResponse(this);
        } 

    } 

}
