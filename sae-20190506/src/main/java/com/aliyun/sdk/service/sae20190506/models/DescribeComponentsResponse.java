// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentsResponse} extends {@link TeaModel}
 *
 * <p>DescribeComponentsResponse</p>
 */
public class DescribeComponentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeComponentsResponseBody body;

    private DescribeComponentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeComponentsResponse create() {
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
    public DescribeComponentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeComponentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeComponentsResponseBody body);

        @Override
        DescribeComponentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeComponentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeComponentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeComponentsResponse response) {
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
        public Builder body(DescribeComponentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeComponentsResponse build() {
            return new DescribeComponentsResponse(this);
        } 

    } 

}
