// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>DisableSubscriptionResponse</p>
 */
public class DisableSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSubscriptionResponseBody body;

    private DisableSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSubscriptionResponse create() {
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
    public DisableSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSubscriptionResponseBody body);

        @Override
        DisableSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSubscriptionResponse response) {
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
        public Builder body(DisableSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSubscriptionResponse build() {
            return new DisableSubscriptionResponse(this);
        } 

    } 

}
