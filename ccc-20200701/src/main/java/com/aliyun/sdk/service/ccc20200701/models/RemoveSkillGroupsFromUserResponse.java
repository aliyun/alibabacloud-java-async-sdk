// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSkillGroupsFromUserResponse} extends {@link TeaModel}
 *
 * <p>RemoveSkillGroupsFromUserResponse</p>
 */
public class RemoveSkillGroupsFromUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveSkillGroupsFromUserResponseBody body;

    private RemoveSkillGroupsFromUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveSkillGroupsFromUserResponse create() {
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
    public RemoveSkillGroupsFromUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSkillGroupsFromUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveSkillGroupsFromUserResponseBody body);

        @Override
        RemoveSkillGroupsFromUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSkillGroupsFromUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveSkillGroupsFromUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSkillGroupsFromUserResponse response) {
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
        public Builder body(RemoveSkillGroupsFromUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSkillGroupsFromUserResponse build() {
            return new RemoveSkillGroupsFromUserResponse(this);
        } 

    } 

}
