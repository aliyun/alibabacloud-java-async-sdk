// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeExposedInstanceDetailResponse</p>
 */
public class DescribeExposedInstanceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExposedInstanceDetailResponseBody body;

    private DescribeExposedInstanceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExposedInstanceDetailResponse create() {
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
    public DescribeExposedInstanceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExposedInstanceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExposedInstanceDetailResponseBody body);

        @Override
        DescribeExposedInstanceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExposedInstanceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExposedInstanceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExposedInstanceDetailResponse response) {
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
        public Builder body(DescribeExposedInstanceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExposedInstanceDetailResponse build() {
            return new DescribeExposedInstanceDetailResponse(this);
        } 

    } 

}
