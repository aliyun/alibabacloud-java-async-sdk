// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessageGetByKeyResponse} extends {@link TeaModel}
 *
 * <p>OnsMessageGetByKeyResponse</p>
 */
public class OnsMessageGetByKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsMessageGetByKeyResponseBody body;

    private OnsMessageGetByKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsMessageGetByKeyResponse create() {
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
    public OnsMessageGetByKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsMessageGetByKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsMessageGetByKeyResponseBody body);

        @Override
        OnsMessageGetByKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsMessageGetByKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsMessageGetByKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsMessageGetByKeyResponse response) {
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
        public Builder body(OnsMessageGetByKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsMessageGetByKeyResponse build() {
            return new OnsMessageGetByKeyResponse(this);
        } 

    } 

}
