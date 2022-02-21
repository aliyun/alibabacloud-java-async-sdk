// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscriptionInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateSubscriptionInstanceResponse</p>
 */
public class CreateSubscriptionInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSubscriptionInstanceResponseBody body;

    private CreateSubscriptionInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSubscriptionInstanceResponse create() {
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
    public CreateSubscriptionInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSubscriptionInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSubscriptionInstanceResponseBody body);

        @Override
        CreateSubscriptionInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSubscriptionInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSubscriptionInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSubscriptionInstanceResponse response) {
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
        public Builder body(CreateSubscriptionInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSubscriptionInstanceResponse build() {
            return new CreateSubscriptionInstanceResponse(this);
        } 

    } 

}
