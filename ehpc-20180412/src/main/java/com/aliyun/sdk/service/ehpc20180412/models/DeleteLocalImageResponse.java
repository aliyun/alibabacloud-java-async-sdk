// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLocalImageResponse} extends {@link TeaModel}
 *
 * <p>DeleteLocalImageResponse</p>
 */
public class DeleteLocalImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLocalImageResponseBody body;

    private DeleteLocalImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLocalImageResponse create() {
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
    public DeleteLocalImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLocalImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLocalImageResponseBody body);

        @Override
        DeleteLocalImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLocalImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLocalImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLocalImageResponse response) {
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
        public Builder body(DeleteLocalImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLocalImageResponse build() {
            return new DeleteLocalImageResponse(this);
        } 

    } 

}
