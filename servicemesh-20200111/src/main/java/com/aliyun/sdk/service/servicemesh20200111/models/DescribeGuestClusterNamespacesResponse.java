// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterNamespacesResponse} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterNamespacesResponse</p>
 */
public class DescribeGuestClusterNamespacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGuestClusterNamespacesResponseBody body;

    private DescribeGuestClusterNamespacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGuestClusterNamespacesResponse create() {
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
    public DescribeGuestClusterNamespacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGuestClusterNamespacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGuestClusterNamespacesResponseBody body);

        @Override
        DescribeGuestClusterNamespacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGuestClusterNamespacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGuestClusterNamespacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGuestClusterNamespacesResponse response) {
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
        public Builder body(DescribeGuestClusterNamespacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGuestClusterNamespacesResponse build() {
            return new DescribeGuestClusterNamespacesResponse(this);
        } 

    } 

}
