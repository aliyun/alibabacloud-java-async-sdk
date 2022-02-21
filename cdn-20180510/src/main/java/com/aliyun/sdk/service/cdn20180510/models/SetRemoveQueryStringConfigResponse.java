// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRemoveQueryStringConfigResponse} extends {@link TeaModel}
 *
 * <p>SetRemoveQueryStringConfigResponse</p>
 */
public class SetRemoveQueryStringConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRemoveQueryStringConfigResponseBody body;

    private SetRemoveQueryStringConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRemoveQueryStringConfigResponse create() {
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
    public SetRemoveQueryStringConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRemoveQueryStringConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRemoveQueryStringConfigResponseBody body);

        @Override
        SetRemoveQueryStringConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRemoveQueryStringConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRemoveQueryStringConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRemoveQueryStringConfigResponse response) {
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
        public Builder body(SetRemoveQueryStringConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRemoveQueryStringConfigResponse build() {
            return new SetRemoveQueryStringConfigResponse(this);
        } 

    } 

}
