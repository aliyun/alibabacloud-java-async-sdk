// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServerGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteServerGroupResponse</p>
 */
public class DeleteServerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServerGroupResponseBody body;

    private DeleteServerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServerGroupResponse create() {
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
    public DeleteServerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServerGroupResponseBody body);

        @Override
        DeleteServerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServerGroupResponse response) {
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
        public Builder body(DeleteServerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServerGroupResponse build() {
            return new DeleteServerGroupResponse(this);
        } 

    } 

}
