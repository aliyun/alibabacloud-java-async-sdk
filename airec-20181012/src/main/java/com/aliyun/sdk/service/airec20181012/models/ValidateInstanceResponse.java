// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateInstanceResponse} extends {@link TeaModel}
 *
 * <p>ValidateInstanceResponse</p>
 */
public class ValidateInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateInstanceResponseBody body;

    private ValidateInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateInstanceResponse create() {
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
    public ValidateInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateInstanceResponseBody body);

        @Override
        ValidateInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateInstanceResponse response) {
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
        public Builder body(ValidateInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateInstanceResponse build() {
            return new ValidateInstanceResponse(this);
        } 

    } 

}
