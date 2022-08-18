// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableApplicationResponse} extends {@link TeaModel}
 *
 * <p>DisableApplicationResponse</p>
 */
public class DisableApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableApplicationResponseBody body;

    private DisableApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableApplicationResponse create() {
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
    public DisableApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableApplicationResponseBody body);

        @Override
        DisableApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableApplicationResponse response) {
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
        public Builder body(DisableApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableApplicationResponse build() {
            return new DisableApplicationResponse(this);
        } 

    } 

}
