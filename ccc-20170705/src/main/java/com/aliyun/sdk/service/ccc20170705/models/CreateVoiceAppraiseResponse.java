// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVoiceAppraiseResponse} extends {@link TeaModel}
 *
 * <p>CreateVoiceAppraiseResponse</p>
 */
public class CreateVoiceAppraiseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVoiceAppraiseResponseBody body;

    private CreateVoiceAppraiseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVoiceAppraiseResponse create() {
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
    public CreateVoiceAppraiseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVoiceAppraiseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVoiceAppraiseResponseBody body);

        @Override
        CreateVoiceAppraiseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVoiceAppraiseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVoiceAppraiseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVoiceAppraiseResponse response) {
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
        public Builder body(CreateVoiceAppraiseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVoiceAppraiseResponse build() {
            return new CreateVoiceAppraiseResponse(this);
        } 

    } 

}
