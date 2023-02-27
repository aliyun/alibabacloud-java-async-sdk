// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySkillLevelsOfUserResponse} extends {@link TeaModel}
 *
 * <p>ModifySkillLevelsOfUserResponse</p>
 */
public class ModifySkillLevelsOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySkillLevelsOfUserResponseBody body;

    private ModifySkillLevelsOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySkillLevelsOfUserResponse create() {
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
    public ModifySkillLevelsOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySkillLevelsOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySkillLevelsOfUserResponseBody body);

        @Override
        ModifySkillLevelsOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySkillLevelsOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySkillLevelsOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySkillLevelsOfUserResponse response) {
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
        public Builder body(ModifySkillLevelsOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySkillLevelsOfUserResponse build() {
            return new ModifySkillLevelsOfUserResponse(this);
        } 

    } 

}
