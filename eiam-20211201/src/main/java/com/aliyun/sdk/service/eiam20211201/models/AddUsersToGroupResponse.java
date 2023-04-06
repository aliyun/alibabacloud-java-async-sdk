// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersToGroupResponse} extends {@link TeaModel}
 *
 * <p>AddUsersToGroupResponse</p>
 */
public class AddUsersToGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUsersToGroupResponseBody body;

    private AddUsersToGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUsersToGroupResponse create() {
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
    public AddUsersToGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUsersToGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUsersToGroupResponseBody body);

        @Override
        AddUsersToGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUsersToGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUsersToGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUsersToGroupResponse response) {
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
        public Builder body(AddUsersToGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUsersToGroupResponse build() {
            return new AddUsersToGroupResponse(this);
        } 

    } 

}
