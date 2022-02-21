// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>CreateSubscriptionResponse</p>
 */
public class CreateSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSubscriptionResponseBody body;

    private CreateSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSubscriptionResponse create() {
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
    public CreateSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSubscriptionResponseBody body);

        @Override
        CreateSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSubscriptionResponse response) {
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
        public Builder body(CreateSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSubscriptionResponse build() {
            return new CreateSubscriptionResponse(this);
        } 

    } 

}
