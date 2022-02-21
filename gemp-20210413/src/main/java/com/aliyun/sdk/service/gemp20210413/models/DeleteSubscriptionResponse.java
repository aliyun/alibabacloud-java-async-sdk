// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>DeleteSubscriptionResponse</p>
 */
public class DeleteSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSubscriptionResponseBody body;

    private DeleteSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSubscriptionResponse create() {
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
    public DeleteSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSubscriptionResponseBody body);

        @Override
        DeleteSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSubscriptionResponse response) {
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
        public Builder body(DeleteSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSubscriptionResponse build() {
            return new DeleteSubscriptionResponse(this);
        } 

    } 

}
