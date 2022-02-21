// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAITemplateResponse} extends {@link TeaModel}
 *
 * <p>UpdateAITemplateResponse</p>
 */
public class UpdateAITemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAITemplateResponseBody body;

    private UpdateAITemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAITemplateResponse create() {
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
    public UpdateAITemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAITemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAITemplateResponseBody body);

        @Override
        UpdateAITemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAITemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAITemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAITemplateResponse response) {
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
        public Builder body(UpdateAITemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAITemplateResponse build() {
            return new UpdateAITemplateResponse(this);
        } 

    } 

}
