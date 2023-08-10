// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterUsedUtilizationResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterUsedUtilizationResponse</p>
 */
public class DescribeClusterUsedUtilizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterUsedUtilizationResponseBody body;

    private DescribeClusterUsedUtilizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterUsedUtilizationResponse create() {
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
    public DescribeClusterUsedUtilizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterUsedUtilizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterUsedUtilizationResponseBody body);

        @Override
        DescribeClusterUsedUtilizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterUsedUtilizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterUsedUtilizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterUsedUtilizationResponse response) {
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
        public Builder body(DescribeClusterUsedUtilizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterUsedUtilizationResponse build() {
            return new DescribeClusterUsedUtilizationResponse(this);
        } 

    } 

}
