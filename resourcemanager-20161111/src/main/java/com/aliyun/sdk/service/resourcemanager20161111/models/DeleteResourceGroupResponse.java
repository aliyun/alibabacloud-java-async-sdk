// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteResourceGroupResponse</p>
 */
public class DeleteResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResourceGroupResponseBody body;

    private DeleteResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResourceGroupResponse create() {
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
    public DeleteResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResourceGroupResponseBody body);

        @Override
        DeleteResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResourceGroupResponse response) {
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
        public Builder body(DeleteResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResourceGroupResponse build() {
            return new DeleteResourceGroupResponse(this);
        } 

    } 

}
