// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAutoScaleConfigResponse} extends {@link TeaModel}
 *
 * <p>SetAutoScaleConfigResponse</p>
 */
public class SetAutoScaleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetAutoScaleConfigResponseBody body;

    private SetAutoScaleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetAutoScaleConfigResponse create() {
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
    public SetAutoScaleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetAutoScaleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetAutoScaleConfigResponseBody body);

        @Override
        SetAutoScaleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetAutoScaleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetAutoScaleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetAutoScaleConfigResponse response) {
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
        public Builder body(SetAutoScaleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetAutoScaleConfigResponse build() {
            return new SetAutoScaleConfigResponse(this);
        } 

    } 

}
