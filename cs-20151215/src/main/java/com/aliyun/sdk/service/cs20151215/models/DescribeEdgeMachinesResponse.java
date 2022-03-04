// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachinesResponse} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachinesResponse</p>
 */
public class DescribeEdgeMachinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEdgeMachinesResponseBody body;

    private DescribeEdgeMachinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEdgeMachinesResponse create() {
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
    public DescribeEdgeMachinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEdgeMachinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEdgeMachinesResponseBody body);

        @Override
        DescribeEdgeMachinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEdgeMachinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEdgeMachinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEdgeMachinesResponse response) {
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
        public Builder body(DescribeEdgeMachinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEdgeMachinesResponse build() {
            return new DescribeEdgeMachinesResponse(this);
        } 

    } 

}
