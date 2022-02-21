// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCcConfigResponse} extends {@link TeaModel}
 *
 * <p>SetCcConfigResponse</p>
 */
public class SetCcConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCcConfigResponseBody body;

    private SetCcConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCcConfigResponse create() {
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
    public SetCcConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCcConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCcConfigResponseBody body);

        @Override
        SetCcConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCcConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCcConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCcConfigResponse response) {
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
        public Builder body(SetCcConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCcConfigResponse build() {
            return new SetCcConfigResponse(this);
        } 

    } 

}
