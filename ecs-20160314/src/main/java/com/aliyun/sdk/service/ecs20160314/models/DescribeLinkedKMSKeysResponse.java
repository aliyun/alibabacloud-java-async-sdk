// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLinkedKMSKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeLinkedKMSKeysResponse</p>
 */
public class DescribeLinkedKMSKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLinkedKMSKeysResponseBody body;

    private DescribeLinkedKMSKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLinkedKMSKeysResponse create() {
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
    public DescribeLinkedKMSKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLinkedKMSKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLinkedKMSKeysResponseBody body);

        @Override
        DescribeLinkedKMSKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLinkedKMSKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLinkedKMSKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLinkedKMSKeysResponse response) {
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
        public Builder body(DescribeLinkedKMSKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLinkedKMSKeysResponse build() {
            return new DescribeLinkedKMSKeysResponse(this);
        } 

    } 

}
