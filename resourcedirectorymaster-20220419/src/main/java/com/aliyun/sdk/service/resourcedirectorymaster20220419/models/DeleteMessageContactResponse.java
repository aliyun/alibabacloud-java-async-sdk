// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMessageContactResponse} extends {@link TeaModel}
 *
 * <p>DeleteMessageContactResponse</p>
 */
public class DeleteMessageContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMessageContactResponseBody body;

    private DeleteMessageContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMessageContactResponse create() {
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
    public DeleteMessageContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMessageContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMessageContactResponseBody body);

        @Override
        DeleteMessageContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMessageContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMessageContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMessageContactResponse response) {
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
        public Builder body(DeleteMessageContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMessageContactResponse build() {
            return new DeleteMessageContactResponse(this);
        } 

    } 

}
