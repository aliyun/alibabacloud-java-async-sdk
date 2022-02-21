// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUsersResponse} extends {@link TeaModel}
 *
 * <p>FindUsersResponse</p>
 */
public class FindUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindUsersResponseBody body;

    private FindUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindUsersResponse create() {
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
    public FindUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindUsersResponseBody body);

        @Override
        FindUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindUsersResponse response) {
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
        public Builder body(FindUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindUsersResponse build() {
            return new FindUsersResponse(this);
        } 

    } 

}
