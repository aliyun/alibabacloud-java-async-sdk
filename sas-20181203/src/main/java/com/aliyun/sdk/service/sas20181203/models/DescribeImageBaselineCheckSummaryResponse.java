// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineCheckSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineCheckSummaryResponse</p>
 */
public class DescribeImageBaselineCheckSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageBaselineCheckSummaryResponseBody body;

    private DescribeImageBaselineCheckSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageBaselineCheckSummaryResponse create() {
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
    public DescribeImageBaselineCheckSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageBaselineCheckSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageBaselineCheckSummaryResponseBody body);

        @Override
        DescribeImageBaselineCheckSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageBaselineCheckSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageBaselineCheckSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageBaselineCheckSummaryResponse response) {
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
        public Builder body(DescribeImageBaselineCheckSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageBaselineCheckSummaryResponse build() {
            return new DescribeImageBaselineCheckSummaryResponse(this);
        } 

    } 

}
