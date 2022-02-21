// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserToGroupResponse} extends {@link TeaModel}
 *
 * <p>AddUserToGroupResponse</p>
 */
public class AddUserToGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserToGroupResponseBody body;

    private AddUserToGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserToGroupResponse create() {
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
    public AddUserToGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserToGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserToGroupResponseBody body);

        @Override
        AddUserToGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserToGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserToGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserToGroupResponse response) {
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
        public Builder body(AddUserToGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserToGroupResponse build() {
            return new AddUserToGroupResponse(this);
        } 

    } 

}
