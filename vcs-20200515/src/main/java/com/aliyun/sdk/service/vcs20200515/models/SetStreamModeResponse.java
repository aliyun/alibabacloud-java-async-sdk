// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStreamModeResponse} extends {@link TeaModel}
 *
 * <p>SetStreamModeResponse</p>
 */
public class SetStreamModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetStreamModeResponseBody body;

    private SetStreamModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetStreamModeResponse create() {
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
    public SetStreamModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetStreamModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetStreamModeResponseBody body);

        @Override
        SetStreamModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetStreamModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetStreamModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetStreamModeResponse response) {
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
        public Builder body(SetStreamModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetStreamModeResponse build() {
            return new SetStreamModeResponse(this);
        } 

    } 

}
