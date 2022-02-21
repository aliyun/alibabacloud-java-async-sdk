// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageResponse</p>
 */
public class DescribeResourceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceUsageResponseBody body;

    private DescribeResourceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceUsageResponse create() {
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
    public DescribeResourceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceUsageResponseBody body);

        @Override
        DescribeResourceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceUsageResponse response) {
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
        public Builder body(DescribeResourceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceUsageResponse build() {
            return new DescribeResourceUsageResponse(this);
        } 

    } 

}
