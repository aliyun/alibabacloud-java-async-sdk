// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTriggerResponse} extends {@link TeaModel}
 *
 * <p>DeleteTriggerResponse</p>
 */
public class DeleteTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTriggerResponseBody body;

    private DeleteTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTriggerResponse create() {
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
    public DeleteTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTriggerResponseBody body);

        @Override
        DeleteTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTriggerResponse response) {
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
        public Builder body(DeleteTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTriggerResponse build() {
            return new DeleteTriggerResponse(this);
        } 

    } 

}
