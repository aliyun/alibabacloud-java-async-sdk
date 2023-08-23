// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciScalingConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeEciScalingConfigurationsResponse</p>
 */
public class DescribeEciScalingConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEciScalingConfigurationsResponseBody body;

    private DescribeEciScalingConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEciScalingConfigurationsResponse create() {
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
    public DescribeEciScalingConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEciScalingConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEciScalingConfigurationsResponseBody body);

        @Override
        DescribeEciScalingConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEciScalingConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEciScalingConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEciScalingConfigurationsResponse response) {
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
        public Builder body(DescribeEciScalingConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEciScalingConfigurationsResponse build() {
            return new DescribeEciScalingConfigurationsResponse(this);
        } 

    } 

}
