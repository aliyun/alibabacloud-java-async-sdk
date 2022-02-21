// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSetReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataSetReportResponse</p>
 */
public class DescribeDataSetReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataSetReportResponseBody body;

    private DescribeDataSetReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataSetReportResponse create() {
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
    public DescribeDataSetReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataSetReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataSetReportResponseBody body);

        @Override
        DescribeDataSetReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataSetReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataSetReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataSetReportResponse response) {
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
        public Builder body(DescribeDataSetReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataSetReportResponse build() {
            return new DescribeDataSetReportResponse(this);
        } 

    } 

}
