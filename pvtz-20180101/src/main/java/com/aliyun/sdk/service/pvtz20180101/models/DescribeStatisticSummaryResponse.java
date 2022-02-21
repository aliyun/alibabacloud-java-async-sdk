// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStatisticSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescribeStatisticSummaryResponse</p>
 */
public class DescribeStatisticSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStatisticSummaryResponseBody body;

    private DescribeStatisticSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStatisticSummaryResponse create() {
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
    public DescribeStatisticSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStatisticSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStatisticSummaryResponseBody body);

        @Override
        DescribeStatisticSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStatisticSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStatisticSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStatisticSummaryResponse response) {
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
        public Builder body(DescribeStatisticSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStatisticSummaryResponse build() {
            return new DescribeStatisticSummaryResponse(this);
        } 

    } 

}
