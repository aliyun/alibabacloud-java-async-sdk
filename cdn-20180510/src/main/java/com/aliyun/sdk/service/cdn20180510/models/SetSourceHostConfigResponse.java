// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSourceHostConfigResponse} extends {@link TeaModel}
 *
 * <p>SetSourceHostConfigResponse</p>
 */
public class SetSourceHostConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSourceHostConfigResponseBody body;

    private SetSourceHostConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSourceHostConfigResponse create() {
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
    public SetSourceHostConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSourceHostConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSourceHostConfigResponseBody body);

        @Override
        SetSourceHostConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSourceHostConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSourceHostConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSourceHostConfigResponse response) {
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
        public Builder body(SetSourceHostConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSourceHostConfigResponse build() {
            return new SetSourceHostConfigResponse(this);
        } 

    } 

}
