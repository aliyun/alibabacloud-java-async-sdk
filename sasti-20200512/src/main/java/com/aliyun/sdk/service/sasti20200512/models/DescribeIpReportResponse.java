// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpReportResponse</p>
 */
public class DescribeIpReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpReportResponseBody body;

    private DescribeIpReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpReportResponse create() {
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
    public DescribeIpReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpReportResponseBody body);

        @Override
        DescribeIpReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpReportResponse response) {
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
        public Builder body(DescribeIpReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpReportResponse build() {
            return new DescribeIpReportResponse(this);
        } 

    } 

}
