// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceListResponse} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceListResponse</p>
 */
public class DescribeNamespaceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNamespaceListResponseBody body;

    private DescribeNamespaceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNamespaceListResponse create() {
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
    public DescribeNamespaceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNamespaceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNamespaceListResponseBody body);

        @Override
        DescribeNamespaceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNamespaceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNamespaceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNamespaceListResponse response) {
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
        public Builder body(DescribeNamespaceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNamespaceListResponse build() {
            return new DescribeNamespaceListResponse(this);
        } 

    } 

}
