// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExternalAgentResponse} extends {@link TeaModel}
 *
 * <p>DescribeExternalAgentResponse</p>
 */
public class DescribeExternalAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExternalAgentResponseBody body;

    private DescribeExternalAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExternalAgentResponse create() {
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
    public DescribeExternalAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExternalAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExternalAgentResponseBody body);

        @Override
        DescribeExternalAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExternalAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExternalAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExternalAgentResponse response) {
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
        public Builder body(DescribeExternalAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExternalAgentResponse build() {
            return new DescribeExternalAgentResponse(this);
        } 

    } 

}
