// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDSEntityValueResponse} extends {@link TeaModel}
 *
 * <p>DeleteDSEntityValueResponse</p>
 */
public class DeleteDSEntityValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDSEntityValueResponseBody body;

    private DeleteDSEntityValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDSEntityValueResponse create() {
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
    public DeleteDSEntityValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDSEntityValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDSEntityValueResponseBody body);

        @Override
        DeleteDSEntityValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDSEntityValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDSEntityValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDSEntityValueResponse response) {
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
        public Builder body(DeleteDSEntityValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDSEntityValueResponse build() {
            return new DeleteDSEntityValueResponse(this);
        } 

    } 

}
