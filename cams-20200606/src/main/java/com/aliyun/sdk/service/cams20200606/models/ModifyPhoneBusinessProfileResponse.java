// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPhoneBusinessProfileResponse} extends {@link TeaModel}
 *
 * <p>ModifyPhoneBusinessProfileResponse</p>
 */
public class ModifyPhoneBusinessProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPhoneBusinessProfileResponseBody body;

    private ModifyPhoneBusinessProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPhoneBusinessProfileResponse create() {
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
    public ModifyPhoneBusinessProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPhoneBusinessProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPhoneBusinessProfileResponseBody body);

        @Override
        ModifyPhoneBusinessProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPhoneBusinessProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPhoneBusinessProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPhoneBusinessProfileResponse response) {
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
        public Builder body(ModifyPhoneBusinessProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPhoneBusinessProfileResponse build() {
            return new ModifyPhoneBusinessProfileResponse(this);
        } 

    } 

}
