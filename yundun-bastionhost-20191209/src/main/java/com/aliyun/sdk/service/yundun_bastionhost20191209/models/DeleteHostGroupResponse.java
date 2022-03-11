// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHostGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteHostGroupResponse</p>
 */
public class DeleteHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHostGroupResponseBody body;

    private DeleteHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHostGroupResponse create() {
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
    public DeleteHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHostGroupResponseBody body);

        @Override
        DeleteHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHostGroupResponse response) {
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
        public Builder body(DeleteHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHostGroupResponse build() {
            return new DeleteHostGroupResponse(this);
        } 

    } 

}
