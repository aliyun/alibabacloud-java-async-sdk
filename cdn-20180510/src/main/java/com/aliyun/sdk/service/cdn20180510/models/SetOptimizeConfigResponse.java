// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetOptimizeConfigResponse} extends {@link TeaModel}
 *
 * <p>SetOptimizeConfigResponse</p>
 */
public class SetOptimizeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetOptimizeConfigResponseBody body;

    private SetOptimizeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetOptimizeConfigResponse create() {
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
    public SetOptimizeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetOptimizeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetOptimizeConfigResponseBody body);

        @Override
        SetOptimizeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetOptimizeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetOptimizeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetOptimizeConfigResponse response) {
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
        public Builder body(SetOptimizeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetOptimizeConfigResponse build() {
            return new SetOptimizeConfigResponse(this);
        } 

    } 

}
