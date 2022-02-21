// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebhookContactsResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebhookContactsResponse</p>
 */
public class DescribeWebhookContactsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebhookContactsResponseBody body;

    private DescribeWebhookContactsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebhookContactsResponse create() {
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
    public DescribeWebhookContactsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebhookContactsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebhookContactsResponseBody body);

        @Override
        DescribeWebhookContactsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebhookContactsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebhookContactsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebhookContactsResponse response) {
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
        public Builder body(DescribeWebhookContactsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebhookContactsResponse build() {
            return new DescribeWebhookContactsResponse(this);
        } 

    } 

}
