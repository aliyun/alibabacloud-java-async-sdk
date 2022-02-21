// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteParameterGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteParameterGroupResponse</p>
 */
public class DeleteParameterGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteParameterGroupResponseBody body;

    private DeleteParameterGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteParameterGroupResponse create() {
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
    public DeleteParameterGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteParameterGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteParameterGroupResponseBody body);

        @Override
        DeleteParameterGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteParameterGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteParameterGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteParameterGroupResponse response) {
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
        public Builder body(DeleteParameterGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteParameterGroupResponse build() {
            return new DeleteParameterGroupResponse(this);
        } 

    } 

}
