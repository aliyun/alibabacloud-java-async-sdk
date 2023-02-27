// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBriefSkillGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListBriefSkillGroupsResponse</p>
 */
public class ListBriefSkillGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBriefSkillGroupsResponseBody body;

    private ListBriefSkillGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBriefSkillGroupsResponse create() {
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
    public ListBriefSkillGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBriefSkillGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBriefSkillGroupsResponseBody body);

        @Override
        ListBriefSkillGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBriefSkillGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBriefSkillGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBriefSkillGroupsResponse response) {
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
        public Builder body(ListBriefSkillGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBriefSkillGroupsResponse build() {
            return new ListBriefSkillGroupsResponse(this);
        } 

    } 

}
