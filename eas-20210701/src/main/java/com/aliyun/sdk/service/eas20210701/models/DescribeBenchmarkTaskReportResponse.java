// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBenchmarkTaskReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeBenchmarkTaskReportResponse</p>
 */
public class DescribeBenchmarkTaskReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBenchmarkTaskReportResponseBody body;

    private DescribeBenchmarkTaskReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBenchmarkTaskReportResponse create() {
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
    public DescribeBenchmarkTaskReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBenchmarkTaskReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBenchmarkTaskReportResponseBody body);

        @Override
        DescribeBenchmarkTaskReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBenchmarkTaskReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBenchmarkTaskReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBenchmarkTaskReportResponse response) {
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
        public Builder body(DescribeBenchmarkTaskReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBenchmarkTaskReportResponse build() {
            return new DescribeBenchmarkTaskReportResponse(this);
        } 

    } 

}
