// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginSchemasResponse} extends {@link TeaModel}
 *
 * <p>DescribePluginSchemasResponse</p>
 */
public class DescribePluginSchemasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePluginSchemasResponseBody body;

    private DescribePluginSchemasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePluginSchemasResponse create() {
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
    public DescribePluginSchemasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePluginSchemasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePluginSchemasResponseBody body);

        @Override
        DescribePluginSchemasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePluginSchemasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePluginSchemasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePluginSchemasResponse response) {
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
        public Builder body(DescribePluginSchemasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePluginSchemasResponse build() {
            return new DescribePluginSchemasResponse(this);
        } 

    } 

}
