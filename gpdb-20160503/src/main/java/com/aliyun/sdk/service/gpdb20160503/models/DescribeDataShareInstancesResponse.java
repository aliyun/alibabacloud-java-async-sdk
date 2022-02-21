// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataShareInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataShareInstancesResponse</p>
 */
public class DescribeDataShareInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataShareInstancesResponseBody body;

    private DescribeDataShareInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataShareInstancesResponse create() {
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
    public DescribeDataShareInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataShareInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataShareInstancesResponseBody body);

        @Override
        DescribeDataShareInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataShareInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataShareInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataShareInstancesResponse response) {
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
        public Builder body(DescribeDataShareInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataShareInstancesResponse build() {
            return new DescribeDataShareInstancesResponse(this);
        } 

    } 

}
