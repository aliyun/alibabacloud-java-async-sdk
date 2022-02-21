// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeHealthStatusResponse</p>
 */
public class DescribeHealthStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHealthStatusResponseBody body;

    private DescribeHealthStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHealthStatusResponse create() {
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
    public DescribeHealthStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHealthStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHealthStatusResponseBody body);

        @Override
        DescribeHealthStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHealthStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHealthStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHealthStatusResponse response) {
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
        public Builder body(DescribeHealthStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHealthStatusResponse build() {
            return new DescribeHealthStatusResponse(this);
        } 

    } 

}
