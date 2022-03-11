// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostGroupAccountsFromUserGroupResponse} extends {@link TeaModel}
 *
 * <p>DetachHostGroupAccountsFromUserGroupResponse</p>
 */
public class DetachHostGroupAccountsFromUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachHostGroupAccountsFromUserGroupResponseBody body;

    private DetachHostGroupAccountsFromUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachHostGroupAccountsFromUserGroupResponse create() {
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
    public DetachHostGroupAccountsFromUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachHostGroupAccountsFromUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachHostGroupAccountsFromUserGroupResponseBody body);

        @Override
        DetachHostGroupAccountsFromUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachHostGroupAccountsFromUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachHostGroupAccountsFromUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachHostGroupAccountsFromUserGroupResponse response) {
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
        public Builder body(DetachHostGroupAccountsFromUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachHostGroupAccountsFromUserGroupResponse build() {
            return new DetachHostGroupAccountsFromUserGroupResponse(this);
        } 

    } 

}
