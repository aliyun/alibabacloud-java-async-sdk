// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCachesResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageCachesResponse</p>
 */
public class DescribeImageCachesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageCachesResponseBody body;

    private DescribeImageCachesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageCachesResponse create() {
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
    public DescribeImageCachesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageCachesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageCachesResponseBody body);

        @Override
        DescribeImageCachesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageCachesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageCachesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageCachesResponse response) {
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
        public Builder body(DescribeImageCachesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageCachesResponse build() {
            return new DescribeImageCachesResponse(this);
        } 

    } 

}
