// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackListResponse} extends {@link TeaModel}
 *
 * <p>DescribePackListResponse</p>
 */
public class DescribePackListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePackListResponseBody body;

    private DescribePackListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePackListResponse create() {
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
    public DescribePackListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePackListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePackListResponseBody body);

        @Override
        DescribePackListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePackListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePackListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePackListResponse response) {
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
        public Builder body(DescribePackListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePackListResponse build() {
            return new DescribePackListResponse(this);
        } 

    } 

}
