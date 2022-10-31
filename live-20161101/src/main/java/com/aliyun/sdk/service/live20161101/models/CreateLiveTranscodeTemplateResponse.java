// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveTranscodeTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateLiveTranscodeTemplateResponse</p>
 */
public class CreateLiveTranscodeTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLiveTranscodeTemplateResponseBody body;

    private CreateLiveTranscodeTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLiveTranscodeTemplateResponse create() {
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
    public CreateLiveTranscodeTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLiveTranscodeTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLiveTranscodeTemplateResponseBody body);

        @Override
        CreateLiveTranscodeTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLiveTranscodeTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLiveTranscodeTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLiveTranscodeTemplateResponse response) {
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
        public Builder body(CreateLiveTranscodeTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLiveTranscodeTemplateResponse build() {
            return new CreateLiveTranscodeTemplateResponse(this);
        } 

    } 

}
