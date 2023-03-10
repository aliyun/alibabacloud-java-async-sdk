// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetPasswordResponse} extends {@link TeaModel}
 *
 * <p>ResetPasswordResponse</p>
 */
public class ResetPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetPasswordResponseBody body;

    private ResetPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetPasswordResponse create() {
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
    public ResetPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetPasswordResponseBody body);

        @Override
        ResetPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetPasswordResponse response) {
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
        public Builder body(ResetPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetPasswordResponse build() {
            return new ResetPasswordResponse(this);
        } 

    } 

}
