// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserGroupResponse</p>
 */
public class UpdateUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUserGroupResponseBody body;

    private UpdateUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUserGroupResponse create() {
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
    public UpdateUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUserGroupResponseBody body);

        @Override
        UpdateUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserGroupResponse response) {
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
        public Builder body(UpdateUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserGroupResponse build() {
            return new UpdateUserGroupResponse(this);
        } 

    } 

}
