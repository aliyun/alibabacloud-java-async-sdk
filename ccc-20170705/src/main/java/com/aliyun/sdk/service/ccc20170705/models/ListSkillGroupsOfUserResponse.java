// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupsOfUserResponse} extends {@link TeaModel}
 *
 * <p>ListSkillGroupsOfUserResponse</p>
 */
public class ListSkillGroupsOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSkillGroupsOfUserResponseBody body;

    private ListSkillGroupsOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSkillGroupsOfUserResponse create() {
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
    public ListSkillGroupsOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSkillGroupsOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSkillGroupsOfUserResponseBody body);

        @Override
        ListSkillGroupsOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSkillGroupsOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSkillGroupsOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSkillGroupsOfUserResponse response) {
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
        public Builder body(ListSkillGroupsOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSkillGroupsOfUserResponse build() {
            return new ListSkillGroupsOfUserResponse(this);
        } 

    } 

}
