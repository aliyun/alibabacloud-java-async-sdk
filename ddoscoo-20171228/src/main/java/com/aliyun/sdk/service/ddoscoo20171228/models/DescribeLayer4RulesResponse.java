// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeLayer4RulesResponse</p>
 */
public class DescribeLayer4RulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLayer4RulesResponseBody body;

    private DescribeLayer4RulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLayer4RulesResponse create() {
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
    public DescribeLayer4RulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLayer4RulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLayer4RulesResponseBody body);

        @Override
        DescribeLayer4RulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLayer4RulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLayer4RulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLayer4RulesResponse response) {
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
        public Builder body(DescribeLayer4RulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLayer4RulesResponse build() {
            return new DescribeLayer4RulesResponse(this);
        } 

    } 

}
