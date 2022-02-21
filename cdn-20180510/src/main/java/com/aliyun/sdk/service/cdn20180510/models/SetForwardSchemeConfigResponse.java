// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetForwardSchemeConfigResponse} extends {@link TeaModel}
 *
 * <p>SetForwardSchemeConfigResponse</p>
 */
public class SetForwardSchemeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetForwardSchemeConfigResponseBody body;

    private SetForwardSchemeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetForwardSchemeConfigResponse create() {
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
    public SetForwardSchemeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetForwardSchemeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetForwardSchemeConfigResponseBody body);

        @Override
        SetForwardSchemeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetForwardSchemeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetForwardSchemeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetForwardSchemeConfigResponse response) {
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
        public Builder body(SetForwardSchemeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetForwardSchemeConfigResponse build() {
            return new SetForwardSchemeConfigResponse(this);
        } 

    } 

}
