// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanJobsResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanJobsResponse</p>
 */
public class DescribeElasticPlanJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticPlanJobsResponseBody body;

    private DescribeElasticPlanJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticPlanJobsResponse create() {
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
    public DescribeElasticPlanJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticPlanJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticPlanJobsResponseBody body);

        @Override
        DescribeElasticPlanJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticPlanJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticPlanJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticPlanJobsResponse response) {
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
        public Builder body(DescribeElasticPlanJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticPlanJobsResponse build() {
            return new DescribeElasticPlanJobsResponse(this);
        } 

    } 

}
