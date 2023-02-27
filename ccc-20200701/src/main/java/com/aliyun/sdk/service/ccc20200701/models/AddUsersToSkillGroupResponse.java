// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersToSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>AddUsersToSkillGroupResponse</p>
 */
public class AddUsersToSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUsersToSkillGroupResponseBody body;

    private AddUsersToSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUsersToSkillGroupResponse create() {
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
    public AddUsersToSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUsersToSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUsersToSkillGroupResponseBody body);

        @Override
        AddUsersToSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUsersToSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUsersToSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUsersToSkillGroupResponse response) {
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
        public Builder body(AddUsersToSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUsersToSkillGroupResponse build() {
            return new AddUsersToSkillGroupResponse(this);
        } 

    } 

}
