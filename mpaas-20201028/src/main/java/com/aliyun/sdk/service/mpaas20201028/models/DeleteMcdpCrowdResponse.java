// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcdpCrowdResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcdpCrowdResponse</p>
 */
public class DeleteMcdpCrowdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcdpCrowdResponseBody body;

    private DeleteMcdpCrowdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcdpCrowdResponse create() {
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
    public DeleteMcdpCrowdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcdpCrowdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcdpCrowdResponseBody body);

        @Override
        DeleteMcdpCrowdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcdpCrowdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcdpCrowdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcdpCrowdResponse response) {
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
        public Builder body(DeleteMcdpCrowdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcdpCrowdResponse build() {
            return new DeleteMcdpCrowdResponse(this);
        } 

    } 

}
