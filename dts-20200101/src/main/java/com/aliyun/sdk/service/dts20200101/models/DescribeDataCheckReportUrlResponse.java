// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCheckReportUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataCheckReportUrlResponse</p>
 */
public class DescribeDataCheckReportUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataCheckReportUrlResponseBody body;

    private DescribeDataCheckReportUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataCheckReportUrlResponse create() {
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
    public DescribeDataCheckReportUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataCheckReportUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataCheckReportUrlResponseBody body);

        @Override
        DescribeDataCheckReportUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataCheckReportUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataCheckReportUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataCheckReportUrlResponse response) {
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
        public Builder body(DescribeDataCheckReportUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataCheckReportUrlResponse build() {
            return new DescribeDataCheckReportUrlResponse(this);
        } 

    } 

}
