// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUsersResponse} extends {@link TeaModel}
 *
 * <p>DeleteUsersResponse</p>
 */
public class DeleteUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUsersResponseBody body;

    private DeleteUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUsersResponse create() {
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
    public DeleteUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUsersResponseBody body);

        @Override
        DeleteUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUsersResponse response) {
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
        public Builder body(DeleteUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUsersResponse build() {
            return new DeleteUsersResponse(this);
        } 

    } 

}
