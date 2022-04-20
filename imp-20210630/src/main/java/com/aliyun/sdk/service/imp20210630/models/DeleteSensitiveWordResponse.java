// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSensitiveWordResponse} extends {@link TeaModel}
 *
 * <p>DeleteSensitiveWordResponse</p>
 */
public class DeleteSensitiveWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSensitiveWordResponseBody body;

    private DeleteSensitiveWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSensitiveWordResponse create() {
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
    public DeleteSensitiveWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSensitiveWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSensitiveWordResponseBody body);

        @Override
        DeleteSensitiveWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSensitiveWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSensitiveWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSensitiveWordResponse response) {
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
        public Builder body(DeleteSensitiveWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSensitiveWordResponse build() {
            return new DeleteSensitiveWordResponse(this);
        } 

    } 

}
