// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GotoPresetResponse} extends {@link TeaModel}
 *
 * <p>GotoPresetResponse</p>
 */
public class GotoPresetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GotoPresetResponseBody body;

    private GotoPresetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GotoPresetResponse create() {
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
    public GotoPresetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GotoPresetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GotoPresetResponseBody body);

        @Override
        GotoPresetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GotoPresetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GotoPresetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GotoPresetResponse response) {
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
        public Builder body(GotoPresetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GotoPresetResponse build() {
            return new GotoPresetResponse(this);
        } 

    } 

}
