// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsAccountsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRdsAccountsResponse</p>
 */
public class DescribeRdsAccountsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRdsAccountsResponseBody body;

    private DescribeRdsAccountsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRdsAccountsResponse create() {
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
    public DescribeRdsAccountsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRdsAccountsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRdsAccountsResponseBody body);

        @Override
        DescribeRdsAccountsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRdsAccountsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRdsAccountsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRdsAccountsResponse response) {
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
        public Builder body(DescribeRdsAccountsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRdsAccountsResponse build() {
            return new DescribeRdsAccountsResponse(this);
        } 

    } 

}
