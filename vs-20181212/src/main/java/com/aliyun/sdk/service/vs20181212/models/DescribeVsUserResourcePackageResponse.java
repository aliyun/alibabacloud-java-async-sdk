// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsUserResourcePackageResponse} extends {@link TeaModel}
 *
 * <p>DescribeVsUserResourcePackageResponse</p>
 */
public class DescribeVsUserResourcePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVsUserResourcePackageResponseBody body;

    private DescribeVsUserResourcePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVsUserResourcePackageResponse create() {
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
    public DescribeVsUserResourcePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVsUserResourcePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVsUserResourcePackageResponseBody body);

        @Override
        DescribeVsUserResourcePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVsUserResourcePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVsUserResourcePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVsUserResourcePackageResponse response) {
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
        public Builder body(DescribeVsUserResourcePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVsUserResourcePackageResponse build() {
            return new DescribeVsUserResourcePackageResponse(this);
        } 

    } 

}
