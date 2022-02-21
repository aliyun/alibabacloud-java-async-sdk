// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserGroupResponse} extends {@link TeaModel}
 *
 * <p>AddFaceUserGroupResponse</p>
 */
public class AddFaceUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFaceUserGroupResponseBody body;

    private AddFaceUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFaceUserGroupResponse create() {
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
    public AddFaceUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFaceUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFaceUserGroupResponseBody body);

        @Override
        AddFaceUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFaceUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFaceUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFaceUserGroupResponse response) {
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
        public Builder body(AddFaceUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFaceUserGroupResponse build() {
            return new AddFaceUserGroupResponse(this);
        } 

    } 

}
