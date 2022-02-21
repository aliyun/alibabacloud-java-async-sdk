// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoreConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeStoreConfigResponse</p>
 */
public class DescribeStoreConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStoreConfigResponseBody body;

    private DescribeStoreConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStoreConfigResponse create() {
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
    public DescribeStoreConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStoreConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStoreConfigResponseBody body);

        @Override
        DescribeStoreConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStoreConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStoreConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStoreConfigResponse response) {
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
        public Builder body(DescribeStoreConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStoreConfigResponse build() {
            return new DescribeStoreConfigResponse(this);
        } 

    } 

}
