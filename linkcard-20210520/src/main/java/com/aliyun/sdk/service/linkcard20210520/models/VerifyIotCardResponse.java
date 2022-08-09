// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyIotCardResponse} extends {@link TeaModel}
 *
 * <p>VerifyIotCardResponse</p>
 */
public class VerifyIotCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyIotCardResponseBody body;

    private VerifyIotCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyIotCardResponse create() {
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
    public VerifyIotCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyIotCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyIotCardResponseBody body);

        @Override
        VerifyIotCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyIotCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyIotCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyIotCardResponse response) {
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
        public Builder body(VerifyIotCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyIotCardResponse build() {
            return new VerifyIotCardResponse(this);
        } 

    } 

}
