// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssObjectDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeOssObjectDetailResponse</p>
 */
public class DescribeOssObjectDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOssObjectDetailResponseBody body;

    private DescribeOssObjectDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOssObjectDetailResponse create() {
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
    public DescribeOssObjectDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOssObjectDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOssObjectDetailResponseBody body);

        @Override
        DescribeOssObjectDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOssObjectDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOssObjectDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOssObjectDetailResponse response) {
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
        public Builder body(DescribeOssObjectDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOssObjectDetailResponse build() {
            return new DescribeOssObjectDetailResponse(this);
        } 

    } 

}
