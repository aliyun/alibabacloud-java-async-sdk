// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserClusterNamespacesResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserClusterNamespacesResponse</p>
 */
public class DescribeUserClusterNamespacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < String > body;

    private DescribeUserClusterNamespacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserClusterNamespacesResponse create() {
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

    public interface Builder extends Response.Builder<DescribeUserClusterNamespacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < String > body);

        @Override
        DescribeUserClusterNamespacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserClusterNamespacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < String > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserClusterNamespacesResponse response) {
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
        public DescribeUserClusterNamespacesResponse build() {
            return new DescribeUserClusterNamespacesResponse(this);
        } 

    } 

}
