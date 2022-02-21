// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourcesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourcesResponse</p>
 */
public class DescribeAvailableResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAvailableResourcesResponseBody body;

    private DescribeAvailableResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAvailableResourcesResponse create() {
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
    public DescribeAvailableResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAvailableResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAvailableResourcesResponseBody body);

        @Override
        DescribeAvailableResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAvailableResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAvailableResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAvailableResourcesResponse response) {
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
        public Builder body(DescribeAvailableResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAvailableResourcesResponse build() {
            return new DescribeAvailableResourcesResponse(this);
        } 

    } 

}
