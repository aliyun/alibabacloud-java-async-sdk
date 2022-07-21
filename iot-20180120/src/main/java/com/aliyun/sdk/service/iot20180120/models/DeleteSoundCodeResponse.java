// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSoundCodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteSoundCodeResponse</p>
 */
public class DeleteSoundCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSoundCodeResponseBody body;

    private DeleteSoundCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSoundCodeResponse create() {
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
    public DeleteSoundCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSoundCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSoundCodeResponseBody body);

        @Override
        DeleteSoundCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSoundCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSoundCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSoundCodeResponse response) {
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
        public Builder body(DeleteSoundCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSoundCodeResponse build() {
            return new DeleteSoundCodeResponse(this);
        } 

    } 

}
