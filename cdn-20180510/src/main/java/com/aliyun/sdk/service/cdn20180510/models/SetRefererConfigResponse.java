// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRefererConfigResponse} extends {@link TeaModel}
 *
 * <p>SetRefererConfigResponse</p>
 */
public class SetRefererConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRefererConfigResponseBody body;

    private SetRefererConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRefererConfigResponse create() {
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
    public SetRefererConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRefererConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRefererConfigResponseBody body);

        @Override
        SetRefererConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRefererConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRefererConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRefererConfigResponse response) {
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
        public Builder body(SetRefererConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRefererConfigResponse build() {
            return new SetRefererConfigResponse(this);
        } 

    } 

}
