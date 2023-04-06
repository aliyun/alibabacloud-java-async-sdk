// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableUserResponse} extends {@link TeaModel}
 *
 * <p>EnableUserResponse</p>
 */
public class EnableUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableUserResponseBody body;

    private EnableUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableUserResponse create() {
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
    public EnableUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableUserResponseBody body);

        @Override
        EnableUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableUserResponse response) {
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
        public Builder body(EnableUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableUserResponse build() {
            return new EnableUserResponse(this);
        } 

    } 

}
