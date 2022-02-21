// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountNotificationResponse} extends {@link TeaModel}
 *
 * <p>ModifyAccountNotificationResponse</p>
 */
public class ModifyAccountNotificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAccountNotificationResponseBody body;

    private ModifyAccountNotificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAccountNotificationResponse create() {
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
    public ModifyAccountNotificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAccountNotificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAccountNotificationResponseBody body);

        @Override
        ModifyAccountNotificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAccountNotificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAccountNotificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAccountNotificationResponse response) {
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
        public Builder body(ModifyAccountNotificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAccountNotificationResponse build() {
            return new ModifyAccountNotificationResponse(this);
        } 

    } 

}
