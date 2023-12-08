// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResourceDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterResourceDetailResponse</p>
 */
public class DescribeClusterResourceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterResourceDetailResponseBody body;

    private DescribeClusterResourceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterResourceDetailResponse create() {
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
    public DescribeClusterResourceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterResourceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterResourceDetailResponseBody body);

        @Override
        DescribeClusterResourceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterResourceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterResourceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterResourceDetailResponse response) {
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
        public Builder body(DescribeClusterResourceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterResourceDetailResponse build() {
            return new DescribeClusterResourceDetailResponse(this);
        } 

    } 

}
