// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupUserSaveResponse} extends {@link TeaModel}
 *
 * <p>GroupUserSaveResponse</p>
 */
public class GroupUserSaveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GroupUserSaveResponseBody body;

    private GroupUserSaveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GroupUserSaveResponse create() {
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
    public GroupUserSaveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GroupUserSaveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GroupUserSaveResponseBody body);

        @Override
        GroupUserSaveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GroupUserSaveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GroupUserSaveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GroupUserSaveResponse response) {
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
        public Builder body(GroupUserSaveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GroupUserSaveResponse build() {
            return new GroupUserSaveResponse(this);
        } 

    } 

}
