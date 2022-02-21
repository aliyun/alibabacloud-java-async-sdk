// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAuthConfigResponse} extends {@link TeaModel}
 *
 * <p>SetAuthConfigResponse</p>
 */
public class SetAuthConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetAuthConfigResponseBody body;

    private SetAuthConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetAuthConfigResponse create() {
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
    public SetAuthConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetAuthConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetAuthConfigResponseBody body);

        @Override
        SetAuthConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetAuthConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetAuthConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetAuthConfigResponse response) {
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
        public Builder body(SetAuthConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetAuthConfigResponse build() {
            return new SetAuthConfigResponse(this);
        } 

    } 

}
