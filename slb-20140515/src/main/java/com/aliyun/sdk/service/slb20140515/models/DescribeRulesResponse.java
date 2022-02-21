// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeRulesResponse</p>
 */
public class DescribeRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRulesResponseBody body;

    private DescribeRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRulesResponse create() {
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
    public DescribeRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRulesResponseBody body);

        @Override
        DescribeRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRulesResponse response) {
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
        public Builder body(DescribeRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRulesResponse build() {
            return new DescribeRulesResponse(this);
        } 

    } 

}
