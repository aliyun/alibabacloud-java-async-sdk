// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeRiskTypeResponse</p>
 */
public class DescribeRiskTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRiskTypeResponseBody body;

    private DescribeRiskTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRiskTypeResponse create() {
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
    public DescribeRiskTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRiskTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRiskTypeResponseBody body);

        @Override
        DescribeRiskTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRiskTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRiskTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRiskTypeResponse response) {
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
        public Builder body(DescribeRiskTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRiskTypeResponse build() {
            return new DescribeRiskTypeResponse(this);
        } 

    } 

}
