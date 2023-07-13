// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagKeyListResponse} extends {@link TeaModel}
 *
 * <p>DescribeTagKeyListResponse</p>
 */
public class DescribeTagKeyListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTagKeyListResponseBody body;

    private DescribeTagKeyListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTagKeyListResponse create() {
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
    public DescribeTagKeyListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTagKeyListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTagKeyListResponseBody body);

        @Override
        DescribeTagKeyListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTagKeyListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTagKeyListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTagKeyListResponse response) {
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
        public Builder body(DescribeTagKeyListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTagKeyListResponse build() {
            return new DescribeTagKeyListResponse(this);
        } 

    } 

}
