// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshUserSessionResponse} extends {@link TeaModel}
 *
 * <p>RefreshUserSessionResponse</p>
 */
public class RefreshUserSessionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshUserSessionResponseBody body;

    private RefreshUserSessionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshUserSessionResponse create() {
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
    public RefreshUserSessionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshUserSessionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshUserSessionResponseBody body);

        @Override
        RefreshUserSessionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshUserSessionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshUserSessionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshUserSessionResponse response) {
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
        public Builder body(RefreshUserSessionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshUserSessionResponse build() {
            return new RefreshUserSessionResponse(this);
        } 

    } 

}
