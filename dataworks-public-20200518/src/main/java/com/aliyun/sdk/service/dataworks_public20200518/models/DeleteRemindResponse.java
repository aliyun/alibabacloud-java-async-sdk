// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRemindResponse} extends {@link TeaModel}
 *
 * <p>DeleteRemindResponse</p>
 */
public class DeleteRemindResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRemindResponseBody body;

    private DeleteRemindResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRemindResponse create() {
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
    public DeleteRemindResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRemindResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRemindResponseBody body);

        @Override
        DeleteRemindResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRemindResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRemindResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRemindResponse response) {
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
        public Builder body(DeleteRemindResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRemindResponse build() {
            return new DeleteRemindResponse(this);
        } 

    } 

}
