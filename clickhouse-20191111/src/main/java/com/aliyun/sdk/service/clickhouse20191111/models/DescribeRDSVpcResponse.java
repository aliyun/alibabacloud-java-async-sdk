// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSVpcResponse} extends {@link TeaModel}
 *
 * <p>DescribeRDSVpcResponse</p>
 */
public class DescribeRDSVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRDSVpcResponseBody body;

    private DescribeRDSVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRDSVpcResponse create() {
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
    public DescribeRDSVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRDSVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRDSVpcResponseBody body);

        @Override
        DescribeRDSVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRDSVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRDSVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRDSVpcResponse response) {
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
        public Builder body(DescribeRDSVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRDSVpcResponse build() {
            return new DescribeRDSVpcResponse(this);
        } 

    } 

}
