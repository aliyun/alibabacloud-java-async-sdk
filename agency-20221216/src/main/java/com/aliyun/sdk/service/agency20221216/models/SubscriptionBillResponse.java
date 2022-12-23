// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscriptionBillResponse} extends {@link TeaModel}
 *
 * <p>SubscriptionBillResponse</p>
 */
public class SubscriptionBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubscriptionBillResponseBody body;

    private SubscriptionBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubscriptionBillResponse create() {
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
    public SubscriptionBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubscriptionBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubscriptionBillResponseBody body);

        @Override
        SubscriptionBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubscriptionBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubscriptionBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubscriptionBillResponse response) {
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
        public Builder body(SubscriptionBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubscriptionBillResponse build() {
            return new SubscriptionBillResponse(this);
        } 

    } 

}
