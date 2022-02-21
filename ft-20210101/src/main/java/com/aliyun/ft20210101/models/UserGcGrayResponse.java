// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserGcGrayResponse} extends {@link TeaModel}
 *
 * <p>UserGcGrayResponse</p>
 */
public class UserGcGrayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UserGcGrayResponseBody body;

    private UserGcGrayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UserGcGrayResponse create() {
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
    public UserGcGrayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UserGcGrayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UserGcGrayResponseBody body);

        @Override
        UserGcGrayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UserGcGrayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UserGcGrayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UserGcGrayResponse response) {
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
        public Builder body(UserGcGrayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UserGcGrayResponse build() {
            return new UserGcGrayResponse(this);
        } 

    } 

}
