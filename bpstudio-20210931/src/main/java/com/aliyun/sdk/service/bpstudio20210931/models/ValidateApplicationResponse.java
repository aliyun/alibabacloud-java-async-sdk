// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateApplicationResponse} extends {@link TeaModel}
 *
 * <p>ValidateApplicationResponse</p>
 */
public class ValidateApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateApplicationResponseBody body;

    private ValidateApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateApplicationResponse create() {
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
    public ValidateApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateApplicationResponseBody body);

        @Override
        ValidateApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateApplicationResponse response) {
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
        public Builder body(ValidateApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateApplicationResponse build() {
            return new ValidateApplicationResponse(this);
        } 

    } 

}
