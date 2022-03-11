// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostAccountsFromUserGroupResponse} extends {@link TeaModel}
 *
 * <p>DetachHostAccountsFromUserGroupResponse</p>
 */
public class DetachHostAccountsFromUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachHostAccountsFromUserGroupResponseBody body;

    private DetachHostAccountsFromUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachHostAccountsFromUserGroupResponse create() {
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
    public DetachHostAccountsFromUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachHostAccountsFromUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachHostAccountsFromUserGroupResponseBody body);

        @Override
        DetachHostAccountsFromUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachHostAccountsFromUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachHostAccountsFromUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachHostAccountsFromUserGroupResponse response) {
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
        public Builder body(DetachHostAccountsFromUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachHostAccountsFromUserGroupResponse build() {
            return new DetachHostAccountsFromUserGroupResponse(this);
        } 

    } 

}
