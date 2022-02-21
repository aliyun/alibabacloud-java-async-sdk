// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectResponse} extends {@link TeaModel}
 *
 * <p>DescribeProjectResponse</p>
 */
public class DescribeProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProjectResponseBody body;

    private DescribeProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProjectResponse create() {
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
    public DescribeProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProjectResponseBody body);

        @Override
        DescribeProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProjectResponse response) {
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
        public Builder body(DescribeProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProjectResponse build() {
            return new DescribeProjectResponse(this);
        } 

    } 

}
