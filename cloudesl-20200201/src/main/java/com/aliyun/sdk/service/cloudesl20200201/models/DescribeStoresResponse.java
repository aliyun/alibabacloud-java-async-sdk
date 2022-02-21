// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoresResponse} extends {@link TeaModel}
 *
 * <p>DescribeStoresResponse</p>
 */
public class DescribeStoresResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStoresResponseBody body;

    private DescribeStoresResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStoresResponse create() {
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
    public DescribeStoresResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStoresResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStoresResponseBody body);

        @Override
        DescribeStoresResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStoresResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStoresResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStoresResponse response) {
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
        public Builder body(DescribeStoresResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStoresResponse build() {
            return new DescribeStoresResponse(this);
        } 

    } 

}
