// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeABTestExperimentResponse} extends {@link TeaModel}
 *
 * <p>DescribeABTestExperimentResponse</p>
 */
public class DescribeABTestExperimentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeABTestExperimentResponseBody body;

    private DescribeABTestExperimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeABTestExperimentResponse create() {
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
    public DescribeABTestExperimentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeABTestExperimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeABTestExperimentResponseBody body);

        @Override
        DescribeABTestExperimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeABTestExperimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeABTestExperimentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeABTestExperimentResponse response) {
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
        public Builder body(DescribeABTestExperimentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeABTestExperimentResponse build() {
            return new DescribeABTestExperimentResponse(this);
        } 

    } 

}
