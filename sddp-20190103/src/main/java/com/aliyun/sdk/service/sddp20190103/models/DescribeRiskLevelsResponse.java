// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskLevelsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRiskLevelsResponse</p>
 */
public class DescribeRiskLevelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRiskLevelsResponseBody body;

    private DescribeRiskLevelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRiskLevelsResponse create() {
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
    public DescribeRiskLevelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRiskLevelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRiskLevelsResponseBody body);

        @Override
        DescribeRiskLevelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRiskLevelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRiskLevelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRiskLevelsResponse response) {
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
        public Builder body(DescribeRiskLevelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRiskLevelsResponse build() {
            return new DescribeRiskLevelsResponse(this);
        } 

    } 

}
