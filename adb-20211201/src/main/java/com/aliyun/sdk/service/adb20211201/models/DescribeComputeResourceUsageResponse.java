// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComputeResourceUsageResponse} extends {@link TeaModel}
 *
 * <p>DescribeComputeResourceUsageResponse</p>
 */
public class DescribeComputeResourceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeComputeResourceUsageResponseBody body;

    private DescribeComputeResourceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeComputeResourceUsageResponse create() {
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
    public DescribeComputeResourceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeComputeResourceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeComputeResourceUsageResponseBody body);

        @Override
        DescribeComputeResourceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeComputeResourceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeComputeResourceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeComputeResourceUsageResponse response) {
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
        public Builder body(DescribeComputeResourceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeComputeResourceUsageResponse build() {
            return new DescribeComputeResourceUsageResponse(this);
        } 

    } 

}
