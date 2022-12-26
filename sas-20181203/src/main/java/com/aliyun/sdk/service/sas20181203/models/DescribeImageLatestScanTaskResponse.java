// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageLatestScanTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageLatestScanTaskResponse</p>
 */
public class DescribeImageLatestScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageLatestScanTaskResponseBody body;

    private DescribeImageLatestScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageLatestScanTaskResponse create() {
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
    public DescribeImageLatestScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageLatestScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageLatestScanTaskResponseBody body);

        @Override
        DescribeImageLatestScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageLatestScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageLatestScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageLatestScanTaskResponse response) {
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
        public Builder body(DescribeImageLatestScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageLatestScanTaskResponse build() {
            return new DescribeImageLatestScanTaskResponse(this);
        } 

    } 

}
