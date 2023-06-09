// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAudioTo3DAvatarVideoTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitAudioTo3DAvatarVideoTaskResponse</p>
 */
public class SubmitAudioTo3DAvatarVideoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitAudioTo3DAvatarVideoTaskResponseBody body;

    private SubmitAudioTo3DAvatarVideoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitAudioTo3DAvatarVideoTaskResponse create() {
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
    public SubmitAudioTo3DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitAudioTo3DAvatarVideoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitAudioTo3DAvatarVideoTaskResponseBody body);

        @Override
        SubmitAudioTo3DAvatarVideoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitAudioTo3DAvatarVideoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitAudioTo3DAvatarVideoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitAudioTo3DAvatarVideoTaskResponse response) {
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
        public Builder body(SubmitAudioTo3DAvatarVideoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitAudioTo3DAvatarVideoTaskResponse build() {
            return new SubmitAudioTo3DAvatarVideoTaskResponse(this);
        } 

    } 

}
