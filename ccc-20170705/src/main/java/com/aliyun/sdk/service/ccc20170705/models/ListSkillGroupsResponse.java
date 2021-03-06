// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListSkillGroupsResponse</p>
 */
public class ListSkillGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSkillGroupsResponseBody body;

    private ListSkillGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSkillGroupsResponse create() {
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
    public ListSkillGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSkillGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSkillGroupsResponseBody body);

        @Override
        ListSkillGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSkillGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSkillGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSkillGroupsResponse response) {
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
        public Builder body(ListSkillGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSkillGroupsResponse build() {
            return new ListSkillGroupsResponse(this);
        } 

    } 

}
