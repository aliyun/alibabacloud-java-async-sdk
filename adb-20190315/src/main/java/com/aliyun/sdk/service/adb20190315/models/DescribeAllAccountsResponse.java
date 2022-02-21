// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllAccountsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAllAccountsResponse</p>
 */
public class DescribeAllAccountsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAllAccountsResponseBody body;

    private DescribeAllAccountsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAllAccountsResponse create() {
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
    public DescribeAllAccountsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAllAccountsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAllAccountsResponseBody body);

        @Override
        DescribeAllAccountsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAllAccountsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAllAccountsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAllAccountsResponse response) {
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
        public Builder body(DescribeAllAccountsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAllAccountsResponse build() {
            return new DescribeAllAccountsResponse(this);
        } 

    } 

}
