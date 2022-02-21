// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEvaluationResultsResponse} extends {@link TeaModel}
 *
 * <p>DescribeEvaluationResultsResponse</p>
 */
public class DescribeEvaluationResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEvaluationResultsResponseBody body;

    private DescribeEvaluationResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEvaluationResultsResponse create() {
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
    public DescribeEvaluationResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEvaluationResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEvaluationResultsResponseBody body);

        @Override
        DescribeEvaluationResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEvaluationResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEvaluationResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEvaluationResultsResponse response) {
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
        public Builder body(DescribeEvaluationResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEvaluationResultsResponse build() {
            return new DescribeEvaluationResultsResponse(this);
        } 

    } 

}
