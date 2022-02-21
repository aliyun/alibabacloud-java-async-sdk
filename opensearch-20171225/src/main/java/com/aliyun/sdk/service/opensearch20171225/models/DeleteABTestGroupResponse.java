// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteABTestGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteABTestGroupResponse</p>
 */
public class DeleteABTestGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteABTestGroupResponseBody body;

    private DeleteABTestGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteABTestGroupResponse create() {
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
    public DeleteABTestGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteABTestGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteABTestGroupResponseBody body);

        @Override
        DeleteABTestGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteABTestGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteABTestGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteABTestGroupResponse response) {
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
        public Builder body(DeleteABTestGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteABTestGroupResponse build() {
            return new DeleteABTestGroupResponse(this);
        } 

    } 

}
