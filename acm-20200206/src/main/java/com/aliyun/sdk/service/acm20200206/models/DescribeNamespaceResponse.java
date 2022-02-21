// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceResponse} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceResponse</p>
 */
public class DescribeNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNamespaceResponseBody body;

    private DescribeNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNamespaceResponse create() {
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
    public DescribeNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNamespaceResponseBody body);

        @Override
        DescribeNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNamespaceResponse response) {
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
        public Builder body(DescribeNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNamespaceResponse build() {
            return new DescribeNamespaceResponse(this);
        } 

    } 

}
