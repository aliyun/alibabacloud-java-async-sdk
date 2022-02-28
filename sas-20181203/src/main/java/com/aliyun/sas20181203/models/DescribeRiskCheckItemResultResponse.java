// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckItemResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckItemResultResponse</p>
 */
public class DescribeRiskCheckItemResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRiskCheckItemResultResponseBody body;

    private DescribeRiskCheckItemResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRiskCheckItemResultResponse create() {
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
    public DescribeRiskCheckItemResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRiskCheckItemResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRiskCheckItemResultResponseBody body);

        @Override
        DescribeRiskCheckItemResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRiskCheckItemResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRiskCheckItemResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRiskCheckItemResultResponse response) {
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
        public Builder body(DescribeRiskCheckItemResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRiskCheckItemResultResponse build() {
            return new DescribeRiskCheckItemResultResponse(this);
        } 

    } 

}
