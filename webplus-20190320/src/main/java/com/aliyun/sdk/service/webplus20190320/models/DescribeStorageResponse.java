// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageResponse} extends {@link TeaModel}
 *
 * <p>DescribeStorageResponse</p>
 */
public class DescribeStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStorageResponseBody body;

    private DescribeStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStorageResponse create() {
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
    public DescribeStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStorageResponseBody body);

        @Override
        DescribeStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStorageResponse response) {
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
        public Builder body(DescribeStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStorageResponse build() {
            return new DescribeStorageResponse(this);
        } 

    } 

}
