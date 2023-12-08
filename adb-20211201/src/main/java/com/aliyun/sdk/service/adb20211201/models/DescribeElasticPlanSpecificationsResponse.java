// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanSpecificationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanSpecificationsResponse</p>
 */
public class DescribeElasticPlanSpecificationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticPlanSpecificationsResponseBody body;

    private DescribeElasticPlanSpecificationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticPlanSpecificationsResponse create() {
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
    public DescribeElasticPlanSpecificationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticPlanSpecificationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticPlanSpecificationsResponseBody body);

        @Override
        DescribeElasticPlanSpecificationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticPlanSpecificationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticPlanSpecificationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticPlanSpecificationsResponse response) {
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
        public Builder body(DescribeElasticPlanSpecificationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticPlanSpecificationsResponse build() {
            return new DescribeElasticPlanSpecificationsResponse(this);
        } 

    } 

}
