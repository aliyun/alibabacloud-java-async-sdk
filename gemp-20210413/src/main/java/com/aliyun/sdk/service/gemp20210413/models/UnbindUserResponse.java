// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindUserResponse} extends {@link TeaModel}
 *
 * <p>UnbindUserResponse</p>
 */
public class UnbindUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindUserResponseBody body;

    private UnbindUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindUserResponse create() {
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
    public UnbindUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindUserResponseBody body);

        @Override
        UnbindUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindUserResponse response) {
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
        public Builder body(UnbindUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindUserResponse build() {
            return new UnbindUserResponse(this);
        } 

    } 

}
