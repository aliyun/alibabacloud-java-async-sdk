// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserToUserGroupResponse} extends {@link TeaModel}
 *
 * <p>AddFaceUserToUserGroupResponse</p>
 */
public class AddFaceUserToUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFaceUserToUserGroupResponseBody body;

    private AddFaceUserToUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFaceUserToUserGroupResponse create() {
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
    public AddFaceUserToUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFaceUserToUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFaceUserToUserGroupResponseBody body);

        @Override
        AddFaceUserToUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFaceUserToUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFaceUserToUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFaceUserToUserGroupResponse response) {
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
        public Builder body(AddFaceUserToUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFaceUserToUserGroupResponse build() {
            return new AddFaceUserToUserGroupResponse(this);
        } 

    } 

}
