// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageVulWhiteListResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageVulWhiteListResponse</p>
 */
public class DescribeImageVulWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageVulWhiteListResponseBody body;

    private DescribeImageVulWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageVulWhiteListResponse create() {
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
    public DescribeImageVulWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageVulWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageVulWhiteListResponseBody body);

        @Override
        DescribeImageVulWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageVulWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageVulWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageVulWhiteListResponse response) {
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
        public Builder body(DescribeImageVulWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageVulWhiteListResponse build() {
            return new DescribeImageVulWhiteListResponse(this);
        } 

    } 

}
