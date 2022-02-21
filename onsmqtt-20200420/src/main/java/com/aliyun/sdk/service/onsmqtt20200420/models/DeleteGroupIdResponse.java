// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteGroupIdResponse</p>
 */
public class DeleteGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGroupIdResponseBody body;

    private DeleteGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGroupIdResponse create() {
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
    public DeleteGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGroupIdResponseBody body);

        @Override
        DeleteGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGroupIdResponse response) {
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
        public Builder body(DeleteGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGroupIdResponse build() {
            return new DeleteGroupIdResponse(this);
        } 

    } 

}
