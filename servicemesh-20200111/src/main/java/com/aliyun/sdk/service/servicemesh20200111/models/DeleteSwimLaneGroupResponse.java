// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimLaneGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteSwimLaneGroupResponse</p>
 */
public class DeleteSwimLaneGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSwimLaneGroupResponseBody body;

    private DeleteSwimLaneGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSwimLaneGroupResponse create() {
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
    public DeleteSwimLaneGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSwimLaneGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSwimLaneGroupResponseBody body);

        @Override
        DeleteSwimLaneGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSwimLaneGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSwimLaneGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSwimLaneGroupResponse response) {
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
        public Builder body(DeleteSwimLaneGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSwimLaneGroupResponse build() {
            return new DeleteSwimLaneGroupResponse(this);
        } 

    } 

}
