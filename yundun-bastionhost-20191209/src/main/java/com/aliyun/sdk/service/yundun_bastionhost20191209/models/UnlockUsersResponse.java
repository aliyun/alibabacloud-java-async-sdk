// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockUsersResponse} extends {@link TeaModel}
 *
 * <p>UnlockUsersResponse</p>
 */
public class UnlockUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnlockUsersResponseBody body;

    private UnlockUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnlockUsersResponse create() {
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
    public UnlockUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnlockUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnlockUsersResponseBody body);

        @Override
        UnlockUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnlockUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnlockUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnlockUsersResponse response) {
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
        public Builder body(UnlockUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnlockUsersResponse build() {
            return new UnlockUsersResponse(this);
        } 

    } 

}
