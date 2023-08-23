// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyUserResponse} extends {@link TeaModel}
 *
 * <p>VerifyUserResponse</p>
 */
public class VerifyUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyUserResponseBody body;

    private VerifyUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyUserResponse create() {
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
    public VerifyUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyUserResponseBody body);

        @Override
        VerifyUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyUserResponse response) {
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
        public Builder body(VerifyUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyUserResponse build() {
            return new VerifyUserResponse(this);
        } 

    } 

}
