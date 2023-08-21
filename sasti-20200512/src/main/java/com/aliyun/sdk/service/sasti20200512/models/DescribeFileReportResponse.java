// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeFileReportResponse</p>
 */
public class DescribeFileReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFileReportResponseBody body;

    private DescribeFileReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFileReportResponse create() {
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
    public DescribeFileReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFileReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFileReportResponseBody body);

        @Override
        DescribeFileReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFileReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFileReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFileReportResponse response) {
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
        public Builder body(DescribeFileReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFileReportResponse build() {
            return new DescribeFileReportResponse(this);
        } 

    } 

}
