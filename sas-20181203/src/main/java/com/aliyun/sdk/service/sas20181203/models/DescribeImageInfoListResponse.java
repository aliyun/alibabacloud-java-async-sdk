// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageInfoListResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageInfoListResponse</p>
 */
public class DescribeImageInfoListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageInfoListResponseBody body;

    private DescribeImageInfoListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageInfoListResponse create() {
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
    public DescribeImageInfoListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageInfoListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageInfoListResponseBody body);

        @Override
        DescribeImageInfoListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageInfoListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageInfoListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageInfoListResponse response) {
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
        public Builder body(DescribeImageInfoListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageInfoListResponse build() {
            return new DescribeImageInfoListResponse(this);
        } 

    } 

}
