// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssDownloadsResponse} extends {@link TeaModel}
 *
 * <p>DescribeOssDownloadsResponse</p>
 */
public class DescribeOssDownloadsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOssDownloadsResponseBody body;

    private DescribeOssDownloadsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOssDownloadsResponse create() {
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
    public DescribeOssDownloadsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOssDownloadsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOssDownloadsResponseBody body);

        @Override
        DescribeOssDownloadsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOssDownloadsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOssDownloadsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOssDownloadsResponse response) {
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
        public Builder body(DescribeOssDownloadsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOssDownloadsResponse build() {
            return new DescribeOssDownloadsResponse(this);
        } 

    } 

}
