// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectionalGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteDirectionalGroupResponse</p>
 */
public class DeleteDirectionalGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDirectionalGroupResponseBody body;

    private DeleteDirectionalGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDirectionalGroupResponse create() {
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
    public DeleteDirectionalGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDirectionalGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDirectionalGroupResponseBody body);

        @Override
        DeleteDirectionalGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDirectionalGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDirectionalGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDirectionalGroupResponse response) {
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
        public Builder body(DeleteDirectionalGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDirectionalGroupResponse build() {
            return new DeleteDirectionalGroupResponse(this);
        } 

    } 

}
