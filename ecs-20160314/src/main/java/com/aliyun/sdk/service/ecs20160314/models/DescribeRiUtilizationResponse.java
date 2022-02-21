// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiUtilizationResponse} extends {@link TeaModel}
 *
 * <p>DescribeRiUtilizationResponse</p>
 */
public class DescribeRiUtilizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRiUtilizationResponseBody body;

    private DescribeRiUtilizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRiUtilizationResponse create() {
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
    public DescribeRiUtilizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRiUtilizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRiUtilizationResponseBody body);

        @Override
        DescribeRiUtilizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRiUtilizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRiUtilizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRiUtilizationResponse response) {
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
        public Builder body(DescribeRiUtilizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRiUtilizationResponse build() {
            return new DescribeRiUtilizationResponse(this);
        } 

    } 

}
