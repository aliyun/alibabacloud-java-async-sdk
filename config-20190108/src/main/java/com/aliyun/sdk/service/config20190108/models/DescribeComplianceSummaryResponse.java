// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComplianceSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescribeComplianceSummaryResponse</p>
 */
public class DescribeComplianceSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeComplianceSummaryResponseBody body;

    private DescribeComplianceSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeComplianceSummaryResponse create() {
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
    public DescribeComplianceSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeComplianceSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeComplianceSummaryResponseBody body);

        @Override
        DescribeComplianceSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeComplianceSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeComplianceSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeComplianceSummaryResponse response) {
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
        public Builder body(DescribeComplianceSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeComplianceSummaryResponse build() {
            return new DescribeComplianceSummaryResponse(this);
        } 

    } 

}
