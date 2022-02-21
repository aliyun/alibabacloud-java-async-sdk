// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersResponse} extends {@link TeaModel}
 *
 * <p>RemoveUsersResponse</p>
 */
public class RemoveUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveUsersResponseBody body;

    private RemoveUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveUsersResponse create() {
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
    public RemoveUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveUsersResponseBody body);

        @Override
        RemoveUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveUsersResponse response) {
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
        public Builder body(RemoveUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveUsersResponse build() {
            return new RemoveUsersResponse(this);
        } 

    } 

}
