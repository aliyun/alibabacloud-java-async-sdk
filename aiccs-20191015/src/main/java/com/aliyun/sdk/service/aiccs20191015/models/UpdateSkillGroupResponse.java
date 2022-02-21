// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateSkillGroupResponse</p>
 */
public class UpdateSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSkillGroupResponseBody body;

    private UpdateSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSkillGroupResponse create() {
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
    public UpdateSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSkillGroupResponseBody body);

        @Override
        UpdateSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSkillGroupResponse response) {
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
        public Builder body(UpdateSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSkillGroupResponse build() {
            return new UpdateSkillGroupResponse(this);
        } 

    } 

}
