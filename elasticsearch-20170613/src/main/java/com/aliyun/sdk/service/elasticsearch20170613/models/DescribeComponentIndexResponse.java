// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentIndexResponse} extends {@link TeaModel}
 *
 * <p>DescribeComponentIndexResponse</p>
 */
public class DescribeComponentIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeComponentIndexResponseBody body;

    private DescribeComponentIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeComponentIndexResponse create() {
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
    public DescribeComponentIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeComponentIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeComponentIndexResponseBody body);

        @Override
        DescribeComponentIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeComponentIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeComponentIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeComponentIndexResponse response) {
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
        public Builder body(DescribeComponentIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeComponentIndexResponse build() {
            return new DescribeComponentIndexResponse(this);
        } 

    } 

}
