// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowTopUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowTopUrlResponse</p>
 */
public class DescribeFlowTopUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowTopUrlResponseBody body;

    private DescribeFlowTopUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowTopUrlResponse create() {
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
    public DescribeFlowTopUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowTopUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowTopUrlResponseBody body);

        @Override
        DescribeFlowTopUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowTopUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowTopUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowTopUrlResponse response) {
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
        public Builder body(DescribeFlowTopUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowTopUrlResponse build() {
            return new DescribeFlowTopUrlResponse(this);
        } 

    } 

}
