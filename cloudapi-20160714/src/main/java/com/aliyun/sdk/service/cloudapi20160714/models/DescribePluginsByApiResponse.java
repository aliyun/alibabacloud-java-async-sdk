// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginsByApiResponse} extends {@link TeaModel}
 *
 * <p>DescribePluginsByApiResponse</p>
 */
public class DescribePluginsByApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePluginsByApiResponseBody body;

    private DescribePluginsByApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePluginsByApiResponse create() {
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
    public DescribePluginsByApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePluginsByApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePluginsByApiResponseBody body);

        @Override
        DescribePluginsByApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePluginsByApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePluginsByApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePluginsByApiResponse response) {
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
        public Builder body(DescribePluginsByApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePluginsByApiResponse build() {
            return new DescribePluginsByApiResponse(this);
        } 

    } 

}
