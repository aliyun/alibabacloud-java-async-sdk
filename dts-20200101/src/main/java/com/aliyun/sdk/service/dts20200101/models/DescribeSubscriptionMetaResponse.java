// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionMetaResponse} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionMetaResponse</p>
 */
public class DescribeSubscriptionMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSubscriptionMetaResponseBody body;

    private DescribeSubscriptionMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSubscriptionMetaResponse create() {
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
    public DescribeSubscriptionMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSubscriptionMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSubscriptionMetaResponseBody body);

        @Override
        DescribeSubscriptionMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSubscriptionMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSubscriptionMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSubscriptionMetaResponse response) {
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
        public Builder body(DescribeSubscriptionMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSubscriptionMetaResponse build() {
            return new DescribeSubscriptionMetaResponse(this);
        } 

    } 

}
