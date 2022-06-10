// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDSEntityResponse} extends {@link TeaModel}
 *
 * <p>DeleteDSEntityResponse</p>
 */
public class DeleteDSEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDSEntityResponseBody body;

    private DeleteDSEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDSEntityResponse create() {
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
    public DeleteDSEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDSEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDSEntityResponseBody body);

        @Override
        DeleteDSEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDSEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDSEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDSEntityResponse response) {
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
        public Builder body(DeleteDSEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDSEntityResponse build() {
            return new DeleteDSEntityResponse(this);
        } 

    } 

}
