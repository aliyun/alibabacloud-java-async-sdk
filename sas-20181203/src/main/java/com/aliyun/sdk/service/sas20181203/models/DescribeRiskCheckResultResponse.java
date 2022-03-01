// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckResultResponse</p>
 */
public class DescribeRiskCheckResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRiskCheckResultResponseBody body;

    private DescribeRiskCheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRiskCheckResultResponse create() {
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
    public DescribeRiskCheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRiskCheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRiskCheckResultResponseBody body);

        @Override
        DescribeRiskCheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRiskCheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRiskCheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRiskCheckResultResponse response) {
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
        public Builder body(DescribeRiskCheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRiskCheckResultResponse build() {
            return new DescribeRiskCheckResultResponse(this);
        } 

    } 

}
