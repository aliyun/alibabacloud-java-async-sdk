// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageQuerySharedSpeechOpenResponse} extends {@link TeaModel}
 *
 * <p>PageQuerySharedSpeechOpenResponse</p>
 */
public class PageQuerySharedSpeechOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PageQuerySharedSpeechOpenResponseBody body;

    private PageQuerySharedSpeechOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PageQuerySharedSpeechOpenResponse create() {
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
    public PageQuerySharedSpeechOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageQuerySharedSpeechOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PageQuerySharedSpeechOpenResponseBody body);

        @Override
        PageQuerySharedSpeechOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageQuerySharedSpeechOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PageQuerySharedSpeechOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageQuerySharedSpeechOpenResponse response) {
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
        public Builder body(PageQuerySharedSpeechOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageQuerySharedSpeechOpenResponse build() {
            return new PageQuerySharedSpeechOpenResponse(this);
        } 

    } 

}
