// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteSkillGroupResponse</p>
 */
public class DeleteSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSkillGroupResponseBody body;

    private DeleteSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSkillGroupResponse create() {
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
    public DeleteSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSkillGroupResponseBody body);

        @Override
        DeleteSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSkillGroupResponse response) {
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
        public Builder body(DeleteSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSkillGroupResponse build() {
            return new DeleteSkillGroupResponse(this);
        } 

    } 

}
