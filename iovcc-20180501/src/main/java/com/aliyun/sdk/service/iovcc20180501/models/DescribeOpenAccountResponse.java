// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpenAccountResponse} extends {@link TeaModel}
 *
 * <p>DescribeOpenAccountResponse</p>
 */
public class DescribeOpenAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOpenAccountResponseBody body;

    private DescribeOpenAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOpenAccountResponse create() {
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
    public DescribeOpenAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOpenAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOpenAccountResponseBody body);

        @Override
        DescribeOpenAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOpenAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOpenAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOpenAccountResponse response) {
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
        public Builder body(DescribeOpenAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOpenAccountResponse build() {
            return new DescribeOpenAccountResponse(this);
        } 

    } 

}
