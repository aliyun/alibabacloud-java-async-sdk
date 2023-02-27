// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRamUsersResponse} extends {@link TeaModel}
 *
 * <p>ListRamUsersResponse</p>
 */
public class ListRamUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRamUsersResponseBody body;

    private ListRamUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRamUsersResponse create() {
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
    public ListRamUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRamUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRamUsersResponseBody body);

        @Override
        ListRamUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRamUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRamUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRamUsersResponse response) {
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
        public Builder body(ListRamUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRamUsersResponse build() {
            return new ListRamUsersResponse(this);
        } 

    } 

}
