// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteJobGroupResponse</p>
 */
public class DeleteJobGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteJobGroupResponseBody body;

    private DeleteJobGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteJobGroupResponse create() {
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
    public DeleteJobGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteJobGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteJobGroupResponseBody body);

        @Override
        DeleteJobGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteJobGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteJobGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteJobGroupResponse response) {
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
        public Builder body(DeleteJobGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteJobGroupResponse build() {
            return new DeleteJobGroupResponse(this);
        } 

    } 

}
