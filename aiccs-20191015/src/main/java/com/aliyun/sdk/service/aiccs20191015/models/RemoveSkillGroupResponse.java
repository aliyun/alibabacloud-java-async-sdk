// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveSkillGroupResponse</p>
 */
public class RemoveSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveSkillGroupResponseBody body;

    private RemoveSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveSkillGroupResponse create() {
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
    public RemoveSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveSkillGroupResponseBody body);

        @Override
        RemoveSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSkillGroupResponse response) {
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
        public Builder body(RemoveSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSkillGroupResponse build() {
            return new RemoveSkillGroupResponse(this);
        } 

    } 

}
