// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAudioFileResponse} extends {@link TeaModel}
 *
 * <p>ModifyAudioFileResponse</p>
 */
public class ModifyAudioFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAudioFileResponseBody body;

    private ModifyAudioFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAudioFileResponse create() {
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
    public ModifyAudioFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAudioFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAudioFileResponseBody body);

        @Override
        ModifyAudioFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAudioFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAudioFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAudioFileResponse response) {
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
        public Builder body(ModifyAudioFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAudioFileResponse build() {
            return new ModifyAudioFileResponse(this);
        } 

    } 

}
