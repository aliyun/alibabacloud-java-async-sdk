// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteGroupResponse</p>
 */
public class DeleteGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGroupResponseBody body;

    private DeleteGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGroupResponse create() {
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
    public DeleteGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGroupResponseBody body);

        @Override
        DeleteGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGroupResponse response) {
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
        public Builder body(DeleteGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGroupResponse build() {
            return new DeleteGroupResponse(this);
        } 

    } 

}
