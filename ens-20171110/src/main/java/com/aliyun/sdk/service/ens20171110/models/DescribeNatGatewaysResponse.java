// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatGatewaysResponse} extends {@link TeaModel}
 *
 * <p>DescribeNatGatewaysResponse</p>
 */
public class DescribeNatGatewaysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNatGatewaysResponseBody body;

    private DescribeNatGatewaysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNatGatewaysResponse create() {
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
    public DescribeNatGatewaysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNatGatewaysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNatGatewaysResponseBody body);

        @Override
        DescribeNatGatewaysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNatGatewaysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNatGatewaysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNatGatewaysResponse response) {
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
        public Builder body(DescribeNatGatewaysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNatGatewaysResponse build() {
            return new DescribeNatGatewaysResponse(this);
        } 

    } 

}
