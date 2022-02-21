// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParentPlatformResponse} extends {@link TeaModel}
 *
 * <p>DescribeParentPlatformResponse</p>
 */
public class DescribeParentPlatformResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeParentPlatformResponseBody body;

    private DescribeParentPlatformResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeParentPlatformResponse create() {
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
    public DescribeParentPlatformResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeParentPlatformResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeParentPlatformResponseBody body);

        @Override
        DescribeParentPlatformResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeParentPlatformResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeParentPlatformResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeParentPlatformResponse response) {
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
        public Builder body(DescribeParentPlatformResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeParentPlatformResponse build() {
            return new DescribeParentPlatformResponse(this);
        } 

    } 

}
