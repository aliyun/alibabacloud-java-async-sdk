// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrimaryTrunksOfSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyPrimaryTrunksOfSkillGroupResponse</p>
 */
public class ModifyPrimaryTrunksOfSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPrimaryTrunksOfSkillGroupResponseBody body;

    private ModifyPrimaryTrunksOfSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPrimaryTrunksOfSkillGroupResponse create() {
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
    public ModifyPrimaryTrunksOfSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPrimaryTrunksOfSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPrimaryTrunksOfSkillGroupResponseBody body);

        @Override
        ModifyPrimaryTrunksOfSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPrimaryTrunksOfSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPrimaryTrunksOfSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPrimaryTrunksOfSkillGroupResponse response) {
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
        public Builder body(ModifyPrimaryTrunksOfSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPrimaryTrunksOfSkillGroupResponse build() {
            return new ModifyPrimaryTrunksOfSkillGroupResponse(this);
        } 

    } 

}
