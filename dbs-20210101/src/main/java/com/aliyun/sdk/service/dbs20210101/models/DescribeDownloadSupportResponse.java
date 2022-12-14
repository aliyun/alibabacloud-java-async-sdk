// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadSupportResponse} extends {@link TeaModel}
 *
 * <p>DescribeDownloadSupportResponse</p>
 */
public class DescribeDownloadSupportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDownloadSupportResponseBody body;

    private DescribeDownloadSupportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDownloadSupportResponse create() {
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
    public DescribeDownloadSupportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDownloadSupportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDownloadSupportResponseBody body);

        @Override
        DescribeDownloadSupportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDownloadSupportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDownloadSupportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDownloadSupportResponse response) {
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
        public Builder body(DescribeDownloadSupportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDownloadSupportResponse build() {
            return new DescribeDownloadSupportResponse(this);
        } 

    } 

}
