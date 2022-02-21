// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppGroupDataReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppGroupDataReportResponse</p>
 */
public class DescribeAppGroupDataReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppGroupDataReportResponseBody body;

    private DescribeAppGroupDataReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppGroupDataReportResponse create() {
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
    public DescribeAppGroupDataReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppGroupDataReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppGroupDataReportResponseBody body);

        @Override
        DescribeAppGroupDataReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppGroupDataReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppGroupDataReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppGroupDataReportResponse response) {
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
        public Builder body(DescribeAppGroupDataReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppGroupDataReportResponse build() {
            return new DescribeAppGroupDataReportResponse(this);
        } 

    } 

}
