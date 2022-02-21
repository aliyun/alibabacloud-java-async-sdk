// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttackAnalysisDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeAttackAnalysisDataResponse</p>
 */
public class DescribeAttackAnalysisDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAttackAnalysisDataResponseBody body;

    private DescribeAttackAnalysisDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAttackAnalysisDataResponse create() {
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
    public DescribeAttackAnalysisDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAttackAnalysisDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAttackAnalysisDataResponseBody body);

        @Override
        DescribeAttackAnalysisDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAttackAnalysisDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAttackAnalysisDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAttackAnalysisDataResponse response) {
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
        public Builder body(DescribeAttackAnalysisDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAttackAnalysisDataResponse build() {
            return new DescribeAttackAnalysisDataResponse(this);
        } 

    } 

}
