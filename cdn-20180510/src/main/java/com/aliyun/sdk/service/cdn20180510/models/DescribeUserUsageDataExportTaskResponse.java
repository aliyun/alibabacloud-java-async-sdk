// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserUsageDataExportTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserUsageDataExportTaskResponse</p>
 */
public class DescribeUserUsageDataExportTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserUsageDataExportTaskResponseBody body;

    private DescribeUserUsageDataExportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserUsageDataExportTaskResponse create() {
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
    public DescribeUserUsageDataExportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserUsageDataExportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserUsageDataExportTaskResponseBody body);

        @Override
        DescribeUserUsageDataExportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserUsageDataExportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserUsageDataExportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserUsageDataExportTaskResponse response) {
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
        public Builder body(DescribeUserUsageDataExportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserUsageDataExportTaskResponse build() {
            return new DescribeUserUsageDataExportTaskResponse(this);
        } 

    } 

}
