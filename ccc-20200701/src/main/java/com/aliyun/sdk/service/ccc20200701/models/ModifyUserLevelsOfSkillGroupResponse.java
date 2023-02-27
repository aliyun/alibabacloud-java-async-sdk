// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserLevelsOfSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserLevelsOfSkillGroupResponse</p>
 */
public class ModifyUserLevelsOfSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserLevelsOfSkillGroupResponseBody body;

    private ModifyUserLevelsOfSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserLevelsOfSkillGroupResponse create() {
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
    public ModifyUserLevelsOfSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserLevelsOfSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserLevelsOfSkillGroupResponseBody body);

        @Override
        ModifyUserLevelsOfSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserLevelsOfSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserLevelsOfSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserLevelsOfSkillGroupResponse response) {
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
        public Builder body(ModifyUserLevelsOfSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserLevelsOfSkillGroupResponse build() {
            return new ModifyUserLevelsOfSkillGroupResponse(this);
        } 

    } 

}
