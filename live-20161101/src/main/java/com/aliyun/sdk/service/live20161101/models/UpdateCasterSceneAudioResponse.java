// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCasterSceneAudioResponse} extends {@link TeaModel}
 *
 * <p>UpdateCasterSceneAudioResponse</p>
 */
public class UpdateCasterSceneAudioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCasterSceneAudioResponseBody body;

    private UpdateCasterSceneAudioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCasterSceneAudioResponse create() {
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
    public UpdateCasterSceneAudioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCasterSceneAudioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCasterSceneAudioResponseBody body);

        @Override
        UpdateCasterSceneAudioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCasterSceneAudioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCasterSceneAudioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCasterSceneAudioResponse response) {
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
        public Builder body(UpdateCasterSceneAudioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCasterSceneAudioResponse build() {
            return new UpdateCasterSceneAudioResponse(this);
        } 

    } 

}
