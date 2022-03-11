// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyInstanceADAuthServerResponse} extends {@link TeaModel}
 *
 * <p>VerifyInstanceADAuthServerResponse</p>
 */
public class VerifyInstanceADAuthServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyInstanceADAuthServerResponseBody body;

    private VerifyInstanceADAuthServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyInstanceADAuthServerResponse create() {
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
    public VerifyInstanceADAuthServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyInstanceADAuthServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyInstanceADAuthServerResponseBody body);

        @Override
        VerifyInstanceADAuthServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyInstanceADAuthServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyInstanceADAuthServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyInstanceADAuthServerResponse response) {
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
        public Builder body(VerifyInstanceADAuthServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyInstanceADAuthServerResponse build() {
            return new VerifyInstanceADAuthServerResponse(this);
        } 

    } 

}
