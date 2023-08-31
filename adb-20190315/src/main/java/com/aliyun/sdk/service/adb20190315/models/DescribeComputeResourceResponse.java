// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComputeResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeComputeResourceResponse</p>
 */
public class DescribeComputeResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeComputeResourceResponseBody body;

    private DescribeComputeResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeComputeResourceResponse create() {
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
    public DescribeComputeResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeComputeResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeComputeResourceResponseBody body);

        @Override
        DescribeComputeResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeComputeResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeComputeResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeComputeResourceResponse response) {
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
        public Builder body(DescribeComputeResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeComputeResourceResponse build() {
            return new DescribeComputeResourceResponse(this);
        } 

    } 

}
