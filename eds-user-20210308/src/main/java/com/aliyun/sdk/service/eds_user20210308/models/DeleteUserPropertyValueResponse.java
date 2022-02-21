// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserPropertyValueResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserPropertyValueResponse</p>
 */
public class DeleteUserPropertyValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserPropertyValueResponseBody body;

    private DeleteUserPropertyValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserPropertyValueResponse create() {
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
    public DeleteUserPropertyValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserPropertyValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserPropertyValueResponseBody body);

        @Override
        DeleteUserPropertyValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserPropertyValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserPropertyValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserPropertyValueResponse response) {
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
        public Builder body(DeleteUserPropertyValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserPropertyValueResponse build() {
            return new DeleteUserPropertyValueResponse(this);
        } 

    } 

}
