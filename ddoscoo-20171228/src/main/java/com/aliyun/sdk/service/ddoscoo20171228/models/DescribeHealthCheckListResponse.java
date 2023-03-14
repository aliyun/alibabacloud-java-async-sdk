// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckListResponse} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckListResponse</p>
 */
public class DescribeHealthCheckListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHealthCheckListResponseBody body;

    private DescribeHealthCheckListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHealthCheckListResponse create() {
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
    public DescribeHealthCheckListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHealthCheckListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHealthCheckListResponseBody body);

        @Override
        DescribeHealthCheckListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHealthCheckListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHealthCheckListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHealthCheckListResponse response) {
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
        public Builder body(DescribeHealthCheckListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHealthCheckListResponse build() {
            return new DescribeHealthCheckListResponse(this);
        } 

    } 

}
