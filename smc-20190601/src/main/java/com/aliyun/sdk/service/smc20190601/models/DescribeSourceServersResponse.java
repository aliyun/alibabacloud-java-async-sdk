// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSourceServersResponse} extends {@link TeaModel}
 *
 * <p>DescribeSourceServersResponse</p>
 */
public class DescribeSourceServersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSourceServersResponseBody body;

    private DescribeSourceServersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSourceServersResponse create() {
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
    public DescribeSourceServersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSourceServersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSourceServersResponseBody body);

        @Override
        DescribeSourceServersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSourceServersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSourceServersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSourceServersResponse response) {
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
        public Builder body(DescribeSourceServersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSourceServersResponse build() {
            return new DescribeSourceServersResponse(this);
        } 

    } 

}
