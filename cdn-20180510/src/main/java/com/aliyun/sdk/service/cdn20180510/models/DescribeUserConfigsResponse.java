// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserConfigsResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserConfigsResponse</p>
 */
public class DescribeUserConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserConfigsResponseBody body;

    private DescribeUserConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserConfigsResponse create() {
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
    public DescribeUserConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserConfigsResponseBody body);

        @Override
        DescribeUserConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserConfigsResponse response) {
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
        public Builder body(DescribeUserConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserConfigsResponse build() {
            return new DescribeUserConfigsResponse(this);
        } 

    } 

}
