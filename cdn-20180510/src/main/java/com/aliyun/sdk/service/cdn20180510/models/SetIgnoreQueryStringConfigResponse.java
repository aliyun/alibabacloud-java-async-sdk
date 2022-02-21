// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIgnoreQueryStringConfigResponse} extends {@link TeaModel}
 *
 * <p>SetIgnoreQueryStringConfigResponse</p>
 */
public class SetIgnoreQueryStringConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetIgnoreQueryStringConfigResponseBody body;

    private SetIgnoreQueryStringConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetIgnoreQueryStringConfigResponse create() {
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
    public SetIgnoreQueryStringConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetIgnoreQueryStringConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetIgnoreQueryStringConfigResponseBody body);

        @Override
        SetIgnoreQueryStringConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetIgnoreQueryStringConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetIgnoreQueryStringConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetIgnoreQueryStringConfigResponse response) {
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
        public Builder body(SetIgnoreQueryStringConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetIgnoreQueryStringConfigResponse build() {
            return new SetIgnoreQueryStringConfigResponse(this);
        } 

    } 

}
