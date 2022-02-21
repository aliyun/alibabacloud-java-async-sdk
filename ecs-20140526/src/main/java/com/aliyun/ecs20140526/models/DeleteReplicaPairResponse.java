// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteReplicaPairResponse} extends {@link TeaModel}
 *
 * <p>DeleteReplicaPairResponse</p>
 */
public class DeleteReplicaPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteReplicaPairResponseBody body;

    private DeleteReplicaPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteReplicaPairResponse create() {
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
    public DeleteReplicaPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteReplicaPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteReplicaPairResponseBody body);

        @Override
        DeleteReplicaPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteReplicaPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteReplicaPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteReplicaPairResponse response) {
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
        public Builder body(DeleteReplicaPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteReplicaPairResponse build() {
            return new DeleteReplicaPairResponse(this);
        } 

    } 

}
