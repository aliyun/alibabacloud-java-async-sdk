// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetErrorPageConfigResponse} extends {@link TeaModel}
 *
 * <p>SetErrorPageConfigResponse</p>
 */
public class SetErrorPageConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetErrorPageConfigResponseBody body;

    private SetErrorPageConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetErrorPageConfigResponse create() {
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
    public SetErrorPageConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetErrorPageConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetErrorPageConfigResponseBody body);

        @Override
        SetErrorPageConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetErrorPageConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetErrorPageConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetErrorPageConfigResponse response) {
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
        public Builder body(SetErrorPageConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetErrorPageConfigResponse build() {
            return new SetErrorPageConfigResponse(this);
        } 

    } 

}
