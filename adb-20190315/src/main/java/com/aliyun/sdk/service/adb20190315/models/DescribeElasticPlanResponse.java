// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanResponse</p>
 */
public class DescribeElasticPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticPlanResponseBody body;

    private DescribeElasticPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticPlanResponse create() {
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
    public DescribeElasticPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticPlanResponseBody body);

        @Override
        DescribeElasticPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticPlanResponse response) {
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
        public Builder body(DescribeElasticPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticPlanResponse build() {
            return new DescribeElasticPlanResponse(this);
        } 

    } 

}
