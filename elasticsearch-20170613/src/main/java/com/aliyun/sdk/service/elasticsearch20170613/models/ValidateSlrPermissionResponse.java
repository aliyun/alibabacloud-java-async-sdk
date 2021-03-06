// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateSlrPermissionResponse} extends {@link TeaModel}
 *
 * <p>ValidateSlrPermissionResponse</p>
 */
public class ValidateSlrPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateSlrPermissionResponseBody body;

    private ValidateSlrPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateSlrPermissionResponse create() {
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
    public ValidateSlrPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateSlrPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateSlrPermissionResponseBody body);

        @Override
        ValidateSlrPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateSlrPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateSlrPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateSlrPermissionResponse response) {
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
        public Builder body(ValidateSlrPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateSlrPermissionResponse build() {
            return new ValidateSlrPermissionResponse(this);
        } 

    } 

}
