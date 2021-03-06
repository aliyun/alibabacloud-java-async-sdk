// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContactResponse} extends {@link TeaModel}
 *
 * <p>DeleteContactResponse</p>
 */
public class DeleteContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteContactResponseBody body;

    private DeleteContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteContactResponse create() {
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
    public DeleteContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteContactResponseBody body);

        @Override
        DeleteContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteContactResponse response) {
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
        public Builder body(DeleteContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteContactResponse build() {
            return new DeleteContactResponse(this);
        } 

    } 

}
