// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentBySkillGroupIdResponse} extends {@link TeaModel}
 *
 * <p>ListAgentBySkillGroupIdResponse</p>
 */
public class ListAgentBySkillGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentBySkillGroupIdResponseBody body;

    private ListAgentBySkillGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentBySkillGroupIdResponse create() {
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
    public ListAgentBySkillGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentBySkillGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentBySkillGroupIdResponseBody body);

        @Override
        ListAgentBySkillGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentBySkillGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentBySkillGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentBySkillGroupIdResponse response) {
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
        public Builder body(ListAgentBySkillGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentBySkillGroupIdResponse build() {
            return new ListAgentBySkillGroupIdResponse(this);
        } 

    } 

}
