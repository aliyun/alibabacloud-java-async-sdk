// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersFromSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveUsersFromSkillGroupResponse</p>
 */
public class RemoveUsersFromSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveUsersFromSkillGroupResponseBody body;

    private RemoveUsersFromSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveUsersFromSkillGroupResponse create() {
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
    public RemoveUsersFromSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveUsersFromSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveUsersFromSkillGroupResponseBody body);

        @Override
        RemoveUsersFromSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveUsersFromSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveUsersFromSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveUsersFromSkillGroupResponse response) {
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
        public Builder body(RemoveUsersFromSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveUsersFromSkillGroupResponse build() {
            return new RemoveUsersFromSkillGroupResponse(this);
        } 

    } 

}
