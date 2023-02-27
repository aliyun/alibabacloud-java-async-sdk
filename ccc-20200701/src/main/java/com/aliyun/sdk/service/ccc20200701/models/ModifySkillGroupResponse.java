// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySkillGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifySkillGroupResponse</p>
 */
public class ModifySkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySkillGroupResponseBody body;

    private ModifySkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySkillGroupResponse create() {
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
    public ModifySkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySkillGroupResponseBody body);

        @Override
        ModifySkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySkillGroupResponse response) {
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
        public Builder body(ModifySkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySkillGroupResponse build() {
            return new ModifySkillGroupResponse(this);
        } 

    } 

}
