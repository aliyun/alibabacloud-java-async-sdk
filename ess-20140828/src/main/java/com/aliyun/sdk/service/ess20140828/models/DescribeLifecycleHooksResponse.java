// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleHooksResponse} extends {@link TeaModel}
 *
 * <p>DescribeLifecycleHooksResponse</p>
 */
public class DescribeLifecycleHooksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLifecycleHooksResponseBody body;

    private DescribeLifecycleHooksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLifecycleHooksResponse create() {
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
    public DescribeLifecycleHooksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLifecycleHooksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLifecycleHooksResponseBody body);

        @Override
        DescribeLifecycleHooksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLifecycleHooksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLifecycleHooksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLifecycleHooksResponse response) {
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
        public Builder body(DescribeLifecycleHooksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLifecycleHooksResponse build() {
            return new DescribeLifecycleHooksResponse(this);
        } 

    } 

}
