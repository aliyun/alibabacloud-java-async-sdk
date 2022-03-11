// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHostResponse} extends {@link TeaModel}
 *
 * <p>DeleteHostResponse</p>
 */
public class DeleteHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHostResponseBody body;

    private DeleteHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHostResponse create() {
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
    public DeleteHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHostResponseBody body);

        @Override
        DeleteHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHostResponse response) {
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
        public Builder body(DeleteHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHostResponse build() {
            return new DeleteHostResponse(this);
        } 

    } 

}
