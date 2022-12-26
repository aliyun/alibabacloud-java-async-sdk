// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoListResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoListResponse</p>
 */
public class DescribeImageRepoListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageRepoListResponseBody body;

    private DescribeImageRepoListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageRepoListResponse create() {
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
    public DescribeImageRepoListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageRepoListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageRepoListResponseBody body);

        @Override
        DescribeImageRepoListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageRepoListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageRepoListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageRepoListResponse response) {
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
        public Builder body(DescribeImageRepoListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageRepoListResponse build() {
            return new DescribeImageRepoListResponse(this);
        } 

    } 

}
