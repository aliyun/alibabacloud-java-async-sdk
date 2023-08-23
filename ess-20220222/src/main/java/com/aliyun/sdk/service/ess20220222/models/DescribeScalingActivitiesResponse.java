// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivitiesResponse} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivitiesResponse</p>
 */
public class DescribeScalingActivitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingActivitiesResponseBody body;

    private DescribeScalingActivitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingActivitiesResponse create() {
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
    public DescribeScalingActivitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingActivitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingActivitiesResponseBody body);

        @Override
        DescribeScalingActivitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingActivitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingActivitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingActivitiesResponse response) {
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
        public Builder body(DescribeScalingActivitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingActivitiesResponse build() {
            return new DescribeScalingActivitiesResponse(this);
        } 

    } 

}
