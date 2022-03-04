// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentSetsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentSetsResponse</p>
 */
public class DescribeDeploymentSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeploymentSetsResponseBody body;

    private DescribeDeploymentSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeploymentSetsResponse create() {
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
    public DescribeDeploymentSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeploymentSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeploymentSetsResponseBody body);

        @Override
        DescribeDeploymentSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeploymentSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeploymentSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeploymentSetsResponse response) {
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
        public Builder body(DescribeDeploymentSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeploymentSetsResponse build() {
            return new DescribeDeploymentSetsResponse(this);
        } 

    } 

}
