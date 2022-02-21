// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticDailyPlanResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticDailyPlanResponse</p>
 */
public class DescribeElasticDailyPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticDailyPlanResponseBody body;

    private DescribeElasticDailyPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticDailyPlanResponse create() {
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
    public DescribeElasticDailyPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticDailyPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticDailyPlanResponseBody body);

        @Override
        DescribeElasticDailyPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticDailyPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticDailyPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticDailyPlanResponse response) {
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
        public Builder body(DescribeElasticDailyPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticDailyPlanResponse build() {
            return new DescribeElasticDailyPlanResponse(this);
        } 

    } 

}
