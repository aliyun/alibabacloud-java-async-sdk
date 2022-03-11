// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersFromGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveUsersFromGroupResponse</p>
 */
public class RemoveUsersFromGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveUsersFromGroupResponseBody body;

    private RemoveUsersFromGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveUsersFromGroupResponse create() {
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
    public RemoveUsersFromGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveUsersFromGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveUsersFromGroupResponseBody body);

        @Override
        RemoveUsersFromGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveUsersFromGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveUsersFromGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveUsersFromGroupResponse response) {
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
        public Builder body(RemoveUsersFromGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveUsersFromGroupResponse build() {
            return new RemoveUsersFromGroupResponse(this);
        } 

    } 

}
