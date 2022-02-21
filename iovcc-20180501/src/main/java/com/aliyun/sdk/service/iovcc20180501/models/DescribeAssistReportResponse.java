// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssistReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeAssistReportResponse</p>
 */
public class DescribeAssistReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAssistReportResponseBody body;

    private DescribeAssistReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAssistReportResponse create() {
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
    public DescribeAssistReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAssistReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAssistReportResponseBody body);

        @Override
        DescribeAssistReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAssistReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAssistReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAssistReportResponse response) {
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
        public Builder body(DescribeAssistReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAssistReportResponse build() {
            return new DescribeAssistReportResponse(this);
        } 

    } 

}
