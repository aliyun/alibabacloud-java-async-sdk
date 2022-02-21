// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncUsersResponse} extends {@link TeaModel}
 *
 * <p>SyncUsersResponse</p>
 */
public class SyncUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncUsersResponseBody body;

    private SyncUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncUsersResponse create() {
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
    public SyncUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncUsersResponseBody body);

        @Override
        SyncUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncUsersResponse response) {
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
        public Builder body(SyncUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncUsersResponse build() {
            return new SyncUsersResponse(this);
        } 

    } 

}
