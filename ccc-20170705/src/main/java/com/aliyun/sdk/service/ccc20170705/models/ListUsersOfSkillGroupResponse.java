// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersOfSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>ListUsersOfSkillGroupResponse</p>
 */
public class ListUsersOfSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUsersOfSkillGroupResponseBody body;

    private ListUsersOfSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUsersOfSkillGroupResponse create() {
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
    public ListUsersOfSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUsersOfSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUsersOfSkillGroupResponseBody body);

        @Override
        ListUsersOfSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUsersOfSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUsersOfSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUsersOfSkillGroupResponse response) {
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
        public Builder body(ListUsersOfSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUsersOfSkillGroupResponse build() {
            return new ListUsersOfSkillGroupResponse(this);
        } 

    } 

}
