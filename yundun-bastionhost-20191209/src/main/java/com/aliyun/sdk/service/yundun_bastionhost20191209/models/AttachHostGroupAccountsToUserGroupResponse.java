// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachHostGroupAccountsToUserGroupResponse} extends {@link TeaModel}
 *
 * <p>AttachHostGroupAccountsToUserGroupResponse</p>
 */
public class AttachHostGroupAccountsToUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachHostGroupAccountsToUserGroupResponseBody body;

    private AttachHostGroupAccountsToUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachHostGroupAccountsToUserGroupResponse create() {
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
    public AttachHostGroupAccountsToUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachHostGroupAccountsToUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachHostGroupAccountsToUserGroupResponseBody body);

        @Override
        AttachHostGroupAccountsToUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachHostGroupAccountsToUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachHostGroupAccountsToUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachHostGroupAccountsToUserGroupResponse response) {
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
        public Builder body(AttachHostGroupAccountsToUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachHostGroupAccountsToUserGroupResponse build() {
            return new AttachHostGroupAccountsToUserGroupResponse(this);
        } 

    } 

}
