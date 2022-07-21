// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSoundCodeLabelResponse} extends {@link TeaModel}
 *
 * <p>CreateSoundCodeLabelResponse</p>
 */
public class CreateSoundCodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSoundCodeLabelResponseBody body;

    private CreateSoundCodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSoundCodeLabelResponse create() {
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
    public CreateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSoundCodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSoundCodeLabelResponseBody body);

        @Override
        CreateSoundCodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSoundCodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSoundCodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSoundCodeLabelResponse response) {
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
        public Builder body(CreateSoundCodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSoundCodeLabelResponse build() {
            return new CreateSoundCodeLabelResponse(this);
        } 

    } 

}
