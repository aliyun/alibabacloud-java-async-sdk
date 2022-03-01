// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteChangeSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteChangeSetResponse</p>
 */
public class DeleteChangeSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteChangeSetResponseBody body;

    private DeleteChangeSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteChangeSetResponse create() {
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
    public DeleteChangeSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteChangeSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteChangeSetResponseBody body);

        @Override
        DeleteChangeSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteChangeSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteChangeSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteChangeSetResponse response) {
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
        public Builder body(DeleteChangeSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteChangeSetResponse build() {
            return new DeleteChangeSetResponse(this);
        } 

    } 

}
