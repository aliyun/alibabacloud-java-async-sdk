// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCorpGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListCorpGroupsResponse</p>
 */
public class ListCorpGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCorpGroupsResponseBody body;

    private ListCorpGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCorpGroupsResponse create() {
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
    public ListCorpGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCorpGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCorpGroupsResponseBody body);

        @Override
        ListCorpGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCorpGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCorpGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCorpGroupsResponse response) {
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
        public Builder body(ListCorpGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCorpGroupsResponse build() {
            return new ListCorpGroupsResponse(this);
        } 

    } 

}
