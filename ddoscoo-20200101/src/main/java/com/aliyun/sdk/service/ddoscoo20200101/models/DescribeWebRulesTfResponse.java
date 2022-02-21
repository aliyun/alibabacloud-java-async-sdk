// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebRulesTfResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebRulesTfResponse</p>
 */
public class DescribeWebRulesTfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebRulesTfResponseBody body;

    private DescribeWebRulesTfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebRulesTfResponse create() {
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
    public DescribeWebRulesTfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebRulesTfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebRulesTfResponseBody body);

        @Override
        DescribeWebRulesTfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebRulesTfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebRulesTfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebRulesTfResponse response) {
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
        public Builder body(DescribeWebRulesTfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebRulesTfResponse build() {
            return new DescribeWebRulesTfResponse(this);
        } 

    } 

}
