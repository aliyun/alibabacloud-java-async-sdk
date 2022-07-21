// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSoundCodeAudioResponse} extends {@link TeaModel}
 *
 * <p>GetSoundCodeAudioResponse</p>
 */
public class GetSoundCodeAudioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSoundCodeAudioResponseBody body;

    private GetSoundCodeAudioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSoundCodeAudioResponse create() {
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
    public GetSoundCodeAudioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSoundCodeAudioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSoundCodeAudioResponseBody body);

        @Override
        GetSoundCodeAudioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSoundCodeAudioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSoundCodeAudioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSoundCodeAudioResponse response) {
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
        public Builder body(GetSoundCodeAudioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSoundCodeAudioResponse build() {
            return new GetSoundCodeAudioResponse(this);
        } 

    } 

}
