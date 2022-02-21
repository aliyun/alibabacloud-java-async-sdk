// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackageStateResponse} extends {@link TeaModel}
 *
 * <p>DescribePackageStateResponse</p>
 */
public class DescribePackageStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePackageStateResponseBody body;

    private DescribePackageStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePackageStateResponse create() {
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
    public DescribePackageStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePackageStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePackageStateResponseBody body);

        @Override
        DescribePackageStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePackageStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePackageStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePackageStateResponse response) {
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
        public Builder body(DescribePackageStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePackageStateResponse build() {
            return new DescribePackageStateResponse(this);
        } 

    } 

}
