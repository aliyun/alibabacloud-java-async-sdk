// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStreamVodListResponse} extends {@link TeaModel}
 *
 * <p>DescribeStreamVodListResponse</p>
 */
public class DescribeStreamVodListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStreamVodListResponseBody body;

    private DescribeStreamVodListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStreamVodListResponse create() {
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
    public DescribeStreamVodListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStreamVodListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStreamVodListResponseBody body);

        @Override
        DescribeStreamVodListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStreamVodListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStreamVodListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStreamVodListResponse response) {
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
        public Builder body(DescribeStreamVodListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStreamVodListResponse build() {
            return new DescribeStreamVodListResponse(this);
        } 

    } 

}
