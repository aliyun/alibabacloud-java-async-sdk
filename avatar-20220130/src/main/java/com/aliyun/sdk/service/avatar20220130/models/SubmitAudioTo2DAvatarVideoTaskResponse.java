// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAudioTo2DAvatarVideoTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitAudioTo2DAvatarVideoTaskResponse</p>
 */
public class SubmitAudioTo2DAvatarVideoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitAudioTo2DAvatarVideoTaskResponseBody body;

    private SubmitAudioTo2DAvatarVideoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitAudioTo2DAvatarVideoTaskResponse create() {
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
    public SubmitAudioTo2DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitAudioTo2DAvatarVideoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitAudioTo2DAvatarVideoTaskResponseBody body);

        @Override
        SubmitAudioTo2DAvatarVideoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitAudioTo2DAvatarVideoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitAudioTo2DAvatarVideoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitAudioTo2DAvatarVideoTaskResponse response) {
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
        public Builder body(SubmitAudioTo2DAvatarVideoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitAudioTo2DAvatarVideoTaskResponse build() {
            return new SubmitAudioTo2DAvatarVideoTaskResponse(this);
        } 

    } 

}
