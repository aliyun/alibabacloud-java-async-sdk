// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConnectKmsInstanceResponse} extends {@link TeaModel}
 *
 * <p>ConnectKmsInstanceResponse</p>
 */
public class ConnectKmsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConnectKmsInstanceResponseBody body;

    private ConnectKmsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConnectKmsInstanceResponse create() {
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
    public ConnectKmsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConnectKmsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConnectKmsInstanceResponseBody body);

        @Override
        ConnectKmsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConnectKmsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConnectKmsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConnectKmsInstanceResponse response) {
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
        public Builder body(ConnectKmsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConnectKmsInstanceResponse build() {
            return new ConnectKmsInstanceResponse(this);
        } 

    } 

}
