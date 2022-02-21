// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommonGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteCommonGroupResponse</p>
 */
public class DeleteCommonGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCommonGroupResponseBody body;

    private DeleteCommonGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCommonGroupResponse create() {
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
    public DeleteCommonGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCommonGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCommonGroupResponseBody body);

        @Override
        DeleteCommonGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCommonGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCommonGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCommonGroupResponse response) {
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
        public Builder body(DeleteCommonGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCommonGroupResponse build() {
            return new DeleteCommonGroupResponse(this);
        } 

    } 

}
