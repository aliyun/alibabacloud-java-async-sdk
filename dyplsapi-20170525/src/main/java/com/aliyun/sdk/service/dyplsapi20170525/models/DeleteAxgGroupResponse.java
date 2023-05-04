// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAxgGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteAxgGroupResponse</p>
 */
public class DeleteAxgGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAxgGroupResponseBody body;

    private DeleteAxgGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAxgGroupResponse create() {
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
    public DeleteAxgGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAxgGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAxgGroupResponseBody body);

        @Override
        DeleteAxgGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAxgGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAxgGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAxgGroupResponse response) {
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
        public Builder body(DeleteAxgGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAxgGroupResponse build() {
            return new DeleteAxgGroupResponse(this);
        } 

    } 

}
