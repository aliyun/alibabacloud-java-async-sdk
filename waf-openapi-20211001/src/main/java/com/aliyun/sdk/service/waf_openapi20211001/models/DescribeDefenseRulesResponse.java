// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRulesResponse</p>
 */
public class DescribeDefenseRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDefenseRulesResponseBody body;

    private DescribeDefenseRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDefenseRulesResponse create() {
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
    public DescribeDefenseRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDefenseRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDefenseRulesResponseBody body);

        @Override
        DescribeDefenseRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDefenseRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDefenseRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDefenseRulesResponse response) {
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
        public Builder body(DescribeDefenseRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDefenseRulesResponse build() {
            return new DescribeDefenseRulesResponse(this);
        } 

    } 

}
