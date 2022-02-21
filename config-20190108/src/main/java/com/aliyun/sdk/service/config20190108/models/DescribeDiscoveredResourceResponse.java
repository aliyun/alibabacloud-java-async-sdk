// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiscoveredResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiscoveredResourceResponse</p>
 */
public class DescribeDiscoveredResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiscoveredResourceResponseBody body;

    private DescribeDiscoveredResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiscoveredResourceResponse create() {
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
    public DescribeDiscoveredResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiscoveredResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiscoveredResourceResponseBody body);

        @Override
        DescribeDiscoveredResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiscoveredResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiscoveredResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiscoveredResourceResponse response) {
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
        public Builder body(DescribeDiscoveredResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiscoveredResourceResponse build() {
            return new DescribeDiscoveredResourceResponse(this);
        } 

    } 

}
