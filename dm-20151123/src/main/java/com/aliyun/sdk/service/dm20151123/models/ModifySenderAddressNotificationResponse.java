// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySenderAddressNotificationResponse} extends {@link TeaModel}
 *
 * <p>ModifySenderAddressNotificationResponse</p>
 */
public class ModifySenderAddressNotificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySenderAddressNotificationResponseBody body;

    private ModifySenderAddressNotificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySenderAddressNotificationResponse create() {
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
    public ModifySenderAddressNotificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySenderAddressNotificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySenderAddressNotificationResponseBody body);

        @Override
        ModifySenderAddressNotificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySenderAddressNotificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySenderAddressNotificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySenderAddressNotificationResponse response) {
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
        public Builder body(ModifySenderAddressNotificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySenderAddressNotificationResponse build() {
            return new ModifySenderAddressNotificationResponse(this);
        } 

    } 

}
