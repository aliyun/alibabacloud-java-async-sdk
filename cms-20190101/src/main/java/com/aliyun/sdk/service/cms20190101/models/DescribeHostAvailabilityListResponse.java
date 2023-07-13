// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostAvailabilityListResponse} extends {@link TeaModel}
 *
 * <p>DescribeHostAvailabilityListResponse</p>
 */
public class DescribeHostAvailabilityListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHostAvailabilityListResponseBody body;

    private DescribeHostAvailabilityListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHostAvailabilityListResponse create() {
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
    public DescribeHostAvailabilityListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHostAvailabilityListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHostAvailabilityListResponseBody body);

        @Override
        DescribeHostAvailabilityListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHostAvailabilityListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHostAvailabilityListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHostAvailabilityListResponse response) {
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
        public Builder body(DescribeHostAvailabilityListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHostAvailabilityListResponse build() {
            return new DescribeHostAvailabilityListResponse(this);
        } 

    } 

}
