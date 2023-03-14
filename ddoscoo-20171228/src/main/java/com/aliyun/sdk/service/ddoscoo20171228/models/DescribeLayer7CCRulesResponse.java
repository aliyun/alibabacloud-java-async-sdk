// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer7CCRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeLayer7CCRulesResponse</p>
 */
public class DescribeLayer7CCRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLayer7CCRulesResponseBody body;

    private DescribeLayer7CCRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLayer7CCRulesResponse create() {
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
    public DescribeLayer7CCRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLayer7CCRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLayer7CCRulesResponseBody body);

        @Override
        DescribeLayer7CCRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLayer7CCRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLayer7CCRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLayer7CCRulesResponse response) {
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
        public Builder body(DescribeLayer7CCRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLayer7CCRulesResponse build() {
            return new DescribeLayer7CCRulesResponse(this);
        } 

    } 

}
