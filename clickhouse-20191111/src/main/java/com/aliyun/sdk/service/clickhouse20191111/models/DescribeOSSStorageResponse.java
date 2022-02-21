// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOSSStorageResponse} extends {@link TeaModel}
 *
 * <p>DescribeOSSStorageResponse</p>
 */
public class DescribeOSSStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOSSStorageResponseBody body;

    private DescribeOSSStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOSSStorageResponse create() {
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
    public DescribeOSSStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOSSStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOSSStorageResponseBody body);

        @Override
        DescribeOSSStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOSSStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOSSStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOSSStorageResponse response) {
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
        public Builder body(DescribeOSSStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOSSStorageResponse build() {
            return new DescribeOSSStorageResponse(this);
        } 

    } 

}
