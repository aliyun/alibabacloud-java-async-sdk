// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindUserResponse} extends {@link TeaModel}
 *
 * <p>BindUserResponse</p>
 */
public class BindUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindUserResponseBody body;

    private BindUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindUserResponse create() {
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
    public BindUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindUserResponseBody body);

        @Override
        BindUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindUserResponse response) {
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
        public Builder body(BindUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindUserResponse build() {
            return new BindUserResponse(this);
        } 

    } 

}
