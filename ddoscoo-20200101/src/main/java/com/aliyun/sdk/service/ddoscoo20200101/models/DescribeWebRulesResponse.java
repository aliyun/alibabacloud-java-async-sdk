// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebRulesResponse</p>
 */
public class DescribeWebRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebRulesResponseBody body;

    private DescribeWebRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebRulesResponse create() {
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
    public DescribeWebRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebRulesResponseBody body);

        @Override
        DescribeWebRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebRulesResponse response) {
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
        public Builder body(DescribeWebRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebRulesResponse build() {
            return new DescribeWebRulesResponse(this);
        } 

    } 

}
