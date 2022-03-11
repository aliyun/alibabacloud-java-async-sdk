// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachHostAccountsToUserGroupResponse} extends {@link TeaModel}
 *
 * <p>AttachHostAccountsToUserGroupResponse</p>
 */
public class AttachHostAccountsToUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachHostAccountsToUserGroupResponseBody body;

    private AttachHostAccountsToUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachHostAccountsToUserGroupResponse create() {
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
    public AttachHostAccountsToUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachHostAccountsToUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachHostAccountsToUserGroupResponseBody body);

        @Override
        AttachHostAccountsToUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachHostAccountsToUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachHostAccountsToUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachHostAccountsToUserGroupResponse response) {
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
        public Builder body(AttachHostAccountsToUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachHostAccountsToUserGroupResponse build() {
            return new AttachHostAccountsToUserGroupResponse(this);
        } 

    } 

}
