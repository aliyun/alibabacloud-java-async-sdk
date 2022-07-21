// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSoundCodeLabelResponse} extends {@link TeaModel}
 *
 * <p>DeleteSoundCodeLabelResponse</p>
 */
public class DeleteSoundCodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSoundCodeLabelResponseBody body;

    private DeleteSoundCodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSoundCodeLabelResponse create() {
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
    public DeleteSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSoundCodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSoundCodeLabelResponseBody body);

        @Override
        DeleteSoundCodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSoundCodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSoundCodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSoundCodeLabelResponse response) {
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
        public Builder body(DeleteSoundCodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSoundCodeLabelResponse build() {
            return new DeleteSoundCodeLabelResponse(this);
        } 

    } 

}
