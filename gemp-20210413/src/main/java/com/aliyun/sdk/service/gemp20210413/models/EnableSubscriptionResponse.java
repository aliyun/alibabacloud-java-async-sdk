// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>EnableSubscriptionResponse</p>
 */
public class EnableSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSubscriptionResponseBody body;

    private EnableSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSubscriptionResponse create() {
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
    public EnableSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSubscriptionResponseBody body);

        @Override
        EnableSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSubscriptionResponse response) {
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
        public Builder body(EnableSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSubscriptionResponse build() {
            return new EnableSubscriptionResponse(this);
        } 

    } 

}
