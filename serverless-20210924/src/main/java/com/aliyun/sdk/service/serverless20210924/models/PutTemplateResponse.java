// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutTemplateResponse} extends {@link TeaModel}
 *
 * <p>PutTemplateResponse</p>
 */
public class PutTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Template body;

    private PutTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutTemplateResponse create() {
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
    public Template getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Template body);

        @Override
        PutTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Template body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutTemplateResponse response) {
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
        public Builder body(Template body) {
            this.body = body;
            return this;
        }

        @Override
        public PutTemplateResponse build() {
            return new PutTemplateResponse(this);
        } 

    } 

}
