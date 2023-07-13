// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteEventRulesResponse</p>
 */
public class DeleteEventRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEventRulesResponseBody body;

    private DeleteEventRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEventRulesResponse create() {
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
    public DeleteEventRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEventRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEventRulesResponseBody body);

        @Override
        DeleteEventRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEventRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEventRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEventRulesResponse response) {
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
        public Builder body(DeleteEventRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventRulesResponse build() {
            return new DeleteEventRulesResponse(this);
        } 

    } 

}
