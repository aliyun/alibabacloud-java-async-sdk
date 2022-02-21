// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterInstanceResponse} extends {@link TeaModel}
 *
 * <p>RegisterInstanceResponse</p>
 */
public class RegisterInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterInstanceResponseBody body;

    private RegisterInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterInstanceResponse create() {
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
    public RegisterInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterInstanceResponseBody body);

        @Override
        RegisterInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterInstanceResponse response) {
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
        public Builder body(RegisterInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterInstanceResponse build() {
            return new RegisterInstanceResponse(this);
        } 

    } 

}
