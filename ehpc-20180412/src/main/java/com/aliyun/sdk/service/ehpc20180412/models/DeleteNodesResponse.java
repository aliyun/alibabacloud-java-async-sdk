// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodesResponse} extends {@link TeaModel}
 *
 * <p>DeleteNodesResponse</p>
 */
public class DeleteNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNodesResponseBody body;

    private DeleteNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNodesResponse create() {
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
    public DeleteNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNodesResponseBody body);

        @Override
        DeleteNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNodesResponse response) {
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
        public Builder body(DeleteNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNodesResponse build() {
            return new DeleteNodesResponse(this);
        } 

    } 

}
