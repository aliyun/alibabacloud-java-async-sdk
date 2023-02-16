// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetMemberDeletionPermissionResponse} extends {@link TeaModel}
 *
 * <p>SetMemberDeletionPermissionResponse</p>
 */
public class SetMemberDeletionPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetMemberDeletionPermissionResponseBody body;

    private SetMemberDeletionPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetMemberDeletionPermissionResponse create() {
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
    public SetMemberDeletionPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetMemberDeletionPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetMemberDeletionPermissionResponseBody body);

        @Override
        SetMemberDeletionPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetMemberDeletionPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetMemberDeletionPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetMemberDeletionPermissionResponse response) {
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
        public Builder body(SetMemberDeletionPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetMemberDeletionPermissionResponse build() {
            return new SetMemberDeletionPermissionResponse(this);
        } 

    } 

}
