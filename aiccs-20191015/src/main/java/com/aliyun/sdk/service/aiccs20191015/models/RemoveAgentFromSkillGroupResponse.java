// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAgentFromSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveAgentFromSkillGroupResponse</p>
 */
public class RemoveAgentFromSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAgentFromSkillGroupResponseBody body;

    private RemoveAgentFromSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAgentFromSkillGroupResponse create() {
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
    public RemoveAgentFromSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAgentFromSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAgentFromSkillGroupResponseBody body);

        @Override
        RemoveAgentFromSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAgentFromSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAgentFromSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAgentFromSkillGroupResponse response) {
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
        public Builder body(RemoveAgentFromSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAgentFromSkillGroupResponse build() {
            return new RemoveAgentFromSkillGroupResponse(this);
        } 

    } 

}
