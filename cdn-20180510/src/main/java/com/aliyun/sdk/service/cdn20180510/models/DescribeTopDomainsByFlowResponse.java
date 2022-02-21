// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopDomainsByFlowResponse} extends {@link TeaModel}
 *
 * <p>DescribeTopDomainsByFlowResponse</p>
 */
public class DescribeTopDomainsByFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTopDomainsByFlowResponseBody body;

    private DescribeTopDomainsByFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTopDomainsByFlowResponse create() {
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
    public DescribeTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTopDomainsByFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTopDomainsByFlowResponseBody body);

        @Override
        DescribeTopDomainsByFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTopDomainsByFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTopDomainsByFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTopDomainsByFlowResponse response) {
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
        public Builder body(DescribeTopDomainsByFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTopDomainsByFlowResponse build() {
            return new DescribeTopDomainsByFlowResponse(this);
        } 

    } 

}
