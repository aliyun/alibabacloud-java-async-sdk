// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterConfigResponse} extends {@link TeaModel}
 *
 * <p>SetCasterConfigResponse</p>
 */
public class SetCasterConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCasterConfigResponseBody body;

    private SetCasterConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCasterConfigResponse create() {
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
    public SetCasterConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCasterConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCasterConfigResponseBody body);

        @Override
        SetCasterConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCasterConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCasterConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCasterConfigResponse response) {
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
        public Builder body(SetCasterConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCasterConfigResponse build() {
            return new SetCasterConfigResponse(this);
        } 

    } 

}
