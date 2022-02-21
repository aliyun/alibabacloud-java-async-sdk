// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMqttTokenResponse} extends {@link TeaModel}
 *
 * <p>GetMqttTokenResponse</p>
 */
public class GetMqttTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMqttTokenResponseBody body;

    private GetMqttTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMqttTokenResponse create() {
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
    public GetMqttTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMqttTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMqttTokenResponseBody body);

        @Override
        GetMqttTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMqttTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMqttTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMqttTokenResponse response) {
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
        public Builder body(GetMqttTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMqttTokenResponse build() {
            return new GetMqttTokenResponse(this);
        } 

    } 

}
