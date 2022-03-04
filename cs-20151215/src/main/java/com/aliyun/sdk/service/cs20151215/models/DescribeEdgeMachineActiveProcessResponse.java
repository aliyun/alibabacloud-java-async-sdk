// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineActiveProcessResponse} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineActiveProcessResponse</p>
 */
public class DescribeEdgeMachineActiveProcessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEdgeMachineActiveProcessResponseBody body;

    private DescribeEdgeMachineActiveProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEdgeMachineActiveProcessResponse create() {
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
    public DescribeEdgeMachineActiveProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEdgeMachineActiveProcessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEdgeMachineActiveProcessResponseBody body);

        @Override
        DescribeEdgeMachineActiveProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEdgeMachineActiveProcessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEdgeMachineActiveProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEdgeMachineActiveProcessResponse response) {
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
        public Builder body(DescribeEdgeMachineActiveProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEdgeMachineActiveProcessResponse build() {
            return new DescribeEdgeMachineActiveProcessResponse(this);
        } 

    } 

}
