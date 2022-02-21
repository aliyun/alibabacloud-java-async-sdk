// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFCTriggerResponse} extends {@link TeaModel}
 *
 * <p>DeleteFCTriggerResponse</p>
 */
public class DeleteFCTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFCTriggerResponseBody body;

    private DeleteFCTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFCTriggerResponse create() {
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
    public DeleteFCTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFCTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFCTriggerResponseBody body);

        @Override
        DeleteFCTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFCTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFCTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFCTriggerResponse response) {
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
        public Builder body(DeleteFCTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFCTriggerResponse build() {
            return new DeleteFCTriggerResponse(this);
        } 

    } 

}
