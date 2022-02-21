// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySkillGroupOfUserResponse} extends {@link TeaModel}
 *
 * <p>ModifySkillGroupOfUserResponse</p>
 */
public class ModifySkillGroupOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySkillGroupOfUserResponseBody body;

    private ModifySkillGroupOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySkillGroupOfUserResponse create() {
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
    public ModifySkillGroupOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySkillGroupOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySkillGroupOfUserResponseBody body);

        @Override
        ModifySkillGroupOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySkillGroupOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySkillGroupOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySkillGroupOfUserResponse response) {
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
        public Builder body(ModifySkillGroupOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySkillGroupOfUserResponse build() {
            return new ModifySkillGroupOfUserResponse(this);
        } 

    } 

}
