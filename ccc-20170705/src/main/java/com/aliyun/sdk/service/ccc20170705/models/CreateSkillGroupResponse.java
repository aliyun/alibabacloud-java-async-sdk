// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateSkillGroupResponse</p>
 */
public class CreateSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSkillGroupResponseBody body;

    private CreateSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSkillGroupResponse create() {
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
    public CreateSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSkillGroupResponseBody body);

        @Override
        CreateSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSkillGroupResponse response) {
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
        public Builder body(CreateSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSkillGroupResponse build() {
            return new CreateSkillGroupResponse(this);
        } 

    } 

}
