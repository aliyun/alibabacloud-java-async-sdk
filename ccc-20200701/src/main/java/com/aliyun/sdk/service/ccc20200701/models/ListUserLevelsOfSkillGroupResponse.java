// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserLevelsOfSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>ListUserLevelsOfSkillGroupResponse</p>
 */
public class ListUserLevelsOfSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserLevelsOfSkillGroupResponseBody body;

    private ListUserLevelsOfSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserLevelsOfSkillGroupResponse create() {
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
    public ListUserLevelsOfSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserLevelsOfSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserLevelsOfSkillGroupResponseBody body);

        @Override
        ListUserLevelsOfSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserLevelsOfSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserLevelsOfSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserLevelsOfSkillGroupResponse response) {
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
        public Builder body(ListUserLevelsOfSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserLevelsOfSkillGroupResponse build() {
            return new ListUserLevelsOfSkillGroupResponse(this);
        } 

    } 

}
