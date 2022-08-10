// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageConstraintsResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageConstraintsResponse</p>
 */
public class DescribeImageConstraintsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageConstraintsResponseBody body;

    private DescribeImageConstraintsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageConstraintsResponse create() {
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
    public DescribeImageConstraintsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageConstraintsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageConstraintsResponseBody body);

        @Override
        DescribeImageConstraintsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageConstraintsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageConstraintsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageConstraintsResponse response) {
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
        public Builder body(DescribeImageConstraintsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageConstraintsResponse build() {
            return new DescribeImageConstraintsResponse(this);
        } 

    } 

}
