// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetHttpsOptionConfigResponse} extends {@link TeaModel}
 *
 * <p>SetHttpsOptionConfigResponse</p>
 */
public class SetHttpsOptionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetHttpsOptionConfigResponseBody body;

    private SetHttpsOptionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetHttpsOptionConfigResponse create() {
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
    public SetHttpsOptionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetHttpsOptionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetHttpsOptionConfigResponseBody body);

        @Override
        SetHttpsOptionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetHttpsOptionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetHttpsOptionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetHttpsOptionConfigResponse response) {
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
        public Builder body(SetHttpsOptionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetHttpsOptionConfigResponse build() {
            return new SetHttpsOptionConfigResponse(this);
        } 

    } 

}
