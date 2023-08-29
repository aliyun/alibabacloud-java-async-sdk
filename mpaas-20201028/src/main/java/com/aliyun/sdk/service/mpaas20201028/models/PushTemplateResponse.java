// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushTemplateResponse} extends {@link TeaModel}
 *
 * <p>PushTemplateResponse</p>
 */
public class PushTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushTemplateResponseBody body;

    private PushTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushTemplateResponse create() {
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
    public PushTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushTemplateResponseBody body);

        @Override
        PushTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushTemplateResponse response) {
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
        public Builder body(PushTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushTemplateResponse build() {
            return new PushTemplateResponse(this);
        } 

    } 

}
