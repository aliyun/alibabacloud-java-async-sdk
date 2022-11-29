// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginApisResponse} extends {@link TeaModel}
 *
 * <p>DescribePluginApisResponse</p>
 */
public class DescribePluginApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePluginApisResponseBody body;

    private DescribePluginApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePluginApisResponse create() {
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
    public DescribePluginApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePluginApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePluginApisResponseBody body);

        @Override
        DescribePluginApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePluginApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePluginApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePluginApisResponse response) {
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
        public Builder body(DescribePluginApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePluginApisResponse build() {
            return new DescribePluginApisResponse(this);
        } 

    } 

}
