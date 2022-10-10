// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClassListResponse} extends {@link TeaModel}
 *
 * <p>DescribeClassListResponse</p>
 */
public class DescribeClassListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClassListResponseBody body;

    private DescribeClassListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClassListResponse create() {
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
    public DescribeClassListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClassListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClassListResponseBody body);

        @Override
        DescribeClassListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClassListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClassListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClassListResponse response) {
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
        public Builder body(DescribeClassListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClassListResponse build() {
            return new DescribeClassListResponse(this);
        } 

    } 

}
