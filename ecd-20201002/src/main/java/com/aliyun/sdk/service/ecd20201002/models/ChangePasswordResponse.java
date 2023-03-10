// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangePasswordResponse} extends {@link TeaModel}
 *
 * <p>ChangePasswordResponse</p>
 */
public class ChangePasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangePasswordResponseBody body;

    private ChangePasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangePasswordResponse create() {
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
    public ChangePasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangePasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangePasswordResponseBody body);

        @Override
        ChangePasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangePasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangePasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangePasswordResponse response) {
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
        public Builder body(ChangePasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangePasswordResponse build() {
            return new ChangePasswordResponse(this);
        } 

    } 

}
