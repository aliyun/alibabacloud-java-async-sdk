// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAITemplateResponse} extends {@link TeaModel}
 *
 * <p>GetAITemplateResponse</p>
 */
public class GetAITemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAITemplateResponseBody body;

    private GetAITemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAITemplateResponse create() {
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
    public GetAITemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAITemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAITemplateResponseBody body);

        @Override
        GetAITemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAITemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAITemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAITemplateResponse response) {
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
        public Builder body(GetAITemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAITemplateResponse build() {
            return new GetAITemplateResponse(this);
        } 

    } 

}
