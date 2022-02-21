// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshMqttTokenResponse} extends {@link TeaModel}
 *
 * <p>RefreshMqttTokenResponse</p>
 */
public class RefreshMqttTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshMqttTokenResponseBody body;

    private RefreshMqttTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshMqttTokenResponse create() {
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
    public RefreshMqttTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshMqttTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshMqttTokenResponseBody body);

        @Override
        RefreshMqttTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshMqttTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshMqttTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshMqttTokenResponse response) {
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
        public Builder body(RefreshMqttTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshMqttTokenResponse build() {
            return new RefreshMqttTokenResponse(this);
        } 

    } 

}
