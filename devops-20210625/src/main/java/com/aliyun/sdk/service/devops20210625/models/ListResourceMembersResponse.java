// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceMembersResponse} extends {@link TeaModel}
 *
 * <p>ListResourceMembersResponse</p>
 */
public class ListResourceMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceMembersResponseBody body;

    private ListResourceMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceMembersResponse create() {
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
    public ListResourceMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceMembersResponseBody body);

        @Override
        ListResourceMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceMembersResponse response) {
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
        public Builder body(ListResourceMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceMembersResponse build() {
            return new ListResourceMembersResponse(this);
        } 

    } 

}
