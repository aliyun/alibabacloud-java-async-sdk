// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogStoreExistStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreExistStatusResponse</p>
 */
public class DescribeLogStoreExistStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogStoreExistStatusResponseBody body;

    private DescribeLogStoreExistStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogStoreExistStatusResponse create() {
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
    public DescribeLogStoreExistStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogStoreExistStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogStoreExistStatusResponseBody body);

        @Override
        DescribeLogStoreExistStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogStoreExistStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogStoreExistStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogStoreExistStatusResponse response) {
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
        public Builder body(DescribeLogStoreExistStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogStoreExistStatusResponse build() {
            return new DescribeLogStoreExistStatusResponse(this);
        } 

    } 

}
