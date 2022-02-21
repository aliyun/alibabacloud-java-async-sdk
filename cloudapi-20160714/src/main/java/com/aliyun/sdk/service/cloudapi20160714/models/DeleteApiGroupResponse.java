// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApiGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteApiGroupResponse</p>
 */
public class DeleteApiGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteApiGroupResponseBody body;

    private DeleteApiGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteApiGroupResponse create() {
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
    public DeleteApiGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApiGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteApiGroupResponseBody body);

        @Override
        DeleteApiGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApiGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteApiGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApiGroupResponse response) {
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
        public Builder body(DeleteApiGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApiGroupResponse build() {
            return new DeleteApiGroupResponse(this);
        } 

    } 

}
