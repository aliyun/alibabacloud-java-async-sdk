// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeSocialSecurityCardResponse} extends {@link TeaModel}
 *
 * <p>RecognizeSocialSecurityCardResponse</p>
 */
public class RecognizeSocialSecurityCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeSocialSecurityCardResponseBody body;

    private RecognizeSocialSecurityCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeSocialSecurityCardResponse create() {
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
    public RecognizeSocialSecurityCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeSocialSecurityCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeSocialSecurityCardResponseBody body);

        @Override
        RecognizeSocialSecurityCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeSocialSecurityCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeSocialSecurityCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeSocialSecurityCardResponse response) {
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
        public Builder body(RecognizeSocialSecurityCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeSocialSecurityCardResponse build() {
            return new RecognizeSocialSecurityCardResponse(this);
        } 

    } 

}
