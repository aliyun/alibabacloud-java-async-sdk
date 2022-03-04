// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNamespacesResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterNamespacesResponse</p>
 */
public class DescribeClusterNamespacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < String > body;

    private DescribeClusterNamespacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterNamespacesResponse create() {
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
    public java.util.List < String > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterNamespacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < String > body);

        @Override
        DescribeClusterNamespacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterNamespacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < String > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterNamespacesResponse response) {
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
        public Builder body(java.util.List < String > body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterNamespacesResponse build() {
            return new DescribeClusterNamespacesResponse(this);
        } 

    } 

}
