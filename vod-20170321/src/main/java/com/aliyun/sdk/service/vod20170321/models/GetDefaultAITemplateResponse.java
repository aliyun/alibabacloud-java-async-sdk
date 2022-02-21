// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDefaultAITemplateResponse} extends {@link TeaModel}
 *
 * <p>GetDefaultAITemplateResponse</p>
 */
public class GetDefaultAITemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDefaultAITemplateResponseBody body;

    private GetDefaultAITemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDefaultAITemplateResponse create() {
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
    public GetDefaultAITemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDefaultAITemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDefaultAITemplateResponseBody body);

        @Override
        GetDefaultAITemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDefaultAITemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDefaultAITemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDefaultAITemplateResponse response) {
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
        public Builder body(GetDefaultAITemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDefaultAITemplateResponse build() {
            return new GetDefaultAITemplateResponse(this);
        } 

    } 

}
