// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGlobalQuestionResponse} extends {@link TeaModel}
 *
 * <p>DeleteGlobalQuestionResponse</p>
 */
public class DeleteGlobalQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGlobalQuestionResponseBody body;

    private DeleteGlobalQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGlobalQuestionResponse create() {
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
    public DeleteGlobalQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGlobalQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGlobalQuestionResponseBody body);

        @Override
        DeleteGlobalQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGlobalQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGlobalQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGlobalQuestionResponse response) {
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
        public Builder body(DeleteGlobalQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGlobalQuestionResponse build() {
            return new DeleteGlobalQuestionResponse(this);
        } 

    } 

}
