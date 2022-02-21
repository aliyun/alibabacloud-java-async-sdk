// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateListenerLogConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateListenerLogConfigResponse</p>
 */
public class UpdateListenerLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateListenerLogConfigResponseBody body;

    private UpdateListenerLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateListenerLogConfigResponse create() {
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
    public UpdateListenerLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateListenerLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateListenerLogConfigResponseBody body);

        @Override
        UpdateListenerLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateListenerLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateListenerLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateListenerLogConfigResponse response) {
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
        public Builder body(UpdateListenerLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateListenerLogConfigResponse build() {
            return new UpdateListenerLogConfigResponse(this);
        } 

    } 

}
