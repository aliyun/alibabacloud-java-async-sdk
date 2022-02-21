// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConferenceUsersResponse} extends {@link TeaModel}
 *
 * <p>ListConferenceUsersResponse</p>
 */
public class ListConferenceUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConferenceUsersResponseBody body;

    private ListConferenceUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConferenceUsersResponse create() {
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
    public ListConferenceUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConferenceUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConferenceUsersResponseBody body);

        @Override
        ListConferenceUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConferenceUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConferenceUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConferenceUsersResponse response) {
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
        public Builder body(ListConferenceUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConferenceUsersResponse build() {
            return new ListConferenceUsersResponse(this);
        } 

    } 

}
