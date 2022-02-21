// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpeechResponse} extends {@link TeaModel}
 *
 * <p>CreateSpeechResponse</p>
 */
public class CreateSpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSpeechResponseBody body;

    private CreateSpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSpeechResponse create() {
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
    public CreateSpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSpeechResponseBody body);

        @Override
        CreateSpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSpeechResponse response) {
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
        public Builder body(CreateSpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSpeechResponse build() {
            return new CreateSpeechResponse(this);
        } 

    } 

}
