// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespacesWithCreateResponse} extends {@link TeaModel}
 *
 * <p>DescribeNamespacesWithCreateResponse</p>
 */
public class DescribeNamespacesWithCreateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNamespacesWithCreateResponseBody body;

    private DescribeNamespacesWithCreateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNamespacesWithCreateResponse create() {
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
    public DescribeNamespacesWithCreateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNamespacesWithCreateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNamespacesWithCreateResponseBody body);

        @Override
        DescribeNamespacesWithCreateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNamespacesWithCreateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNamespacesWithCreateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNamespacesWithCreateResponse response) {
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
        public Builder body(DescribeNamespacesWithCreateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNamespacesWithCreateResponse build() {
            return new DescribeNamespacesWithCreateResponse(this);
        } 

    } 

}
