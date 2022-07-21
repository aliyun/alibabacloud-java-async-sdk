// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSoundCodeResponse} extends {@link TeaModel}
 *
 * <p>UpdateSoundCodeResponse</p>
 */
public class UpdateSoundCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSoundCodeResponseBody body;

    private UpdateSoundCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSoundCodeResponse create() {
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
    public UpdateSoundCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSoundCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSoundCodeResponseBody body);

        @Override
        UpdateSoundCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSoundCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSoundCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSoundCodeResponse response) {
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
        public Builder body(UpdateSoundCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSoundCodeResponse build() {
            return new UpdateSoundCodeResponse(this);
        } 

    } 

}
