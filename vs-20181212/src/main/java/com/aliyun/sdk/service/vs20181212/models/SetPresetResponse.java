// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPresetResponse} extends {@link TeaModel}
 *
 * <p>SetPresetResponse</p>
 */
public class SetPresetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPresetResponseBody body;

    private SetPresetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPresetResponse create() {
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
    public SetPresetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPresetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPresetResponseBody body);

        @Override
        SetPresetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPresetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPresetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPresetResponse response) {
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
        public Builder body(SetPresetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPresetResponse build() {
            return new SetPresetResponse(this);
        } 

    } 

}
