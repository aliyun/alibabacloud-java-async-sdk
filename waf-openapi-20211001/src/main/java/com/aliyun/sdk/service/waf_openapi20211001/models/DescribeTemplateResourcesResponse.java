// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateResourcesResponse} extends {@link TeaModel}
 *
 * <p>DescribeTemplateResourcesResponse</p>
 */
public class DescribeTemplateResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTemplateResourcesResponseBody body;

    private DescribeTemplateResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTemplateResourcesResponse create() {
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
    public DescribeTemplateResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTemplateResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTemplateResourcesResponseBody body);

        @Override
        DescribeTemplateResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTemplateResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTemplateResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTemplateResourcesResponse response) {
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
        public Builder body(DescribeTemplateResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTemplateResourcesResponse build() {
            return new DescribeTemplateResourcesResponse(this);
        } 

    } 

}
