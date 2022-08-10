// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessibleRegionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccessibleRegionsResponse</p>
 */
public class DescribeAccessibleRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccessibleRegionsResponseBody body;

    private DescribeAccessibleRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccessibleRegionsResponse create() {
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
    public DescribeAccessibleRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccessibleRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccessibleRegionsResponseBody body);

        @Override
        DescribeAccessibleRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccessibleRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccessibleRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccessibleRegionsResponse response) {
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
        public Builder body(DescribeAccessibleRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccessibleRegionsResponse build() {
            return new DescribeAccessibleRegionsResponse(this);
        } 

    } 

}
