// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceAllocationResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceAllocationResponse</p>
 */
public class DescribeResourceAllocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceAllocationResponseBody body;

    private DescribeResourceAllocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceAllocationResponse create() {
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
    public DescribeResourceAllocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceAllocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceAllocationResponseBody body);

        @Override
        DescribeResourceAllocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceAllocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceAllocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceAllocationResponse response) {
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
        public Builder body(DescribeResourceAllocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceAllocationResponse build() {
            return new DescribeResourceAllocationResponse(this);
        } 

    } 

}
