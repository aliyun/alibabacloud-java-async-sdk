// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssDownloadsForSQLServerResponse} extends {@link TeaModel}
 *
 * <p>DescribeOssDownloadsForSQLServerResponse</p>
 */
public class DescribeOssDownloadsForSQLServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOssDownloadsForSQLServerResponseBody body;

    private DescribeOssDownloadsForSQLServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOssDownloadsForSQLServerResponse create() {
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
    public DescribeOssDownloadsForSQLServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOssDownloadsForSQLServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOssDownloadsForSQLServerResponseBody body);

        @Override
        DescribeOssDownloadsForSQLServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOssDownloadsForSQLServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOssDownloadsForSQLServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOssDownloadsForSQLServerResponse response) {
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
        public Builder body(DescribeOssDownloadsForSQLServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOssDownloadsForSQLServerResponse build() {
            return new DescribeOssDownloadsForSQLServerResponse(this);
        } 

    } 

}
