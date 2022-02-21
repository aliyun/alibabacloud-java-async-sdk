// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginsResponse} extends {@link TeaModel}
 *
 * <p>DescribePluginsResponse</p>
 */
public class DescribePluginsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePluginsResponseBody body;

    private DescribePluginsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePluginsResponse create() {
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
    public DescribePluginsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePluginsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePluginsResponseBody body);

        @Override
        DescribePluginsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePluginsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePluginsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePluginsResponse response) {
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
        public Builder body(DescribePluginsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePluginsResponse build() {
            return new DescribePluginsResponse(this);
        } 

    } 

}
