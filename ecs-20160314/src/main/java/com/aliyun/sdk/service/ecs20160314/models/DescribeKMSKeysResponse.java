// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKMSKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeKMSKeysResponse</p>
 */
public class DescribeKMSKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeKMSKeysResponseBody body;

    private DescribeKMSKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeKMSKeysResponse create() {
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
    public DescribeKMSKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeKMSKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeKMSKeysResponseBody body);

        @Override
        DescribeKMSKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeKMSKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeKMSKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeKMSKeysResponse response) {
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
        public Builder body(DescribeKMSKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeKMSKeysResponse build() {
            return new DescribeKMSKeysResponse(this);
        } 

    } 

}
