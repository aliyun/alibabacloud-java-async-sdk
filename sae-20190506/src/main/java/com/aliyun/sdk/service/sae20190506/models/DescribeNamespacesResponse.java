// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespacesResponse} extends {@link TeaModel}
 *
 * <p>DescribeNamespacesResponse</p>
 */
public class DescribeNamespacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNamespacesResponseBody body;

    private DescribeNamespacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNamespacesResponse create() {
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
    public DescribeNamespacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNamespacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNamespacesResponseBody body);

        @Override
        DescribeNamespacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNamespacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNamespacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNamespacesResponse response) {
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
        public Builder body(DescribeNamespacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNamespacesResponse build() {
            return new DescribeNamespacesResponse(this);
        } 

    } 

}
