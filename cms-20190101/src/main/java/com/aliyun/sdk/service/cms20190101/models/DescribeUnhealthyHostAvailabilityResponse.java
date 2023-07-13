// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUnhealthyHostAvailabilityResponse} extends {@link TeaModel}
 *
 * <p>DescribeUnhealthyHostAvailabilityResponse</p>
 */
public class DescribeUnhealthyHostAvailabilityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUnhealthyHostAvailabilityResponseBody body;

    private DescribeUnhealthyHostAvailabilityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUnhealthyHostAvailabilityResponse create() {
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
    public DescribeUnhealthyHostAvailabilityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUnhealthyHostAvailabilityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUnhealthyHostAvailabilityResponseBody body);

        @Override
        DescribeUnhealthyHostAvailabilityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUnhealthyHostAvailabilityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUnhealthyHostAvailabilityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUnhealthyHostAvailabilityResponse response) {
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
        public Builder body(DescribeUnhealthyHostAvailabilityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUnhealthyHostAvailabilityResponse build() {
            return new DescribeUnhealthyHostAvailabilityResponse(this);
        } 

    } 

}
