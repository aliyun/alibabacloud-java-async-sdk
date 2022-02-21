// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindTemplateResponse} extends {@link TeaModel}
 *
 * <p>UnbindTemplateResponse</p>
 */
public class UnbindTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindTemplateResponseBody body;

    private UnbindTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindTemplateResponse create() {
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
    public UnbindTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindTemplateResponseBody body);

        @Override
        UnbindTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindTemplateResponse response) {
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
        public Builder body(UnbindTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindTemplateResponse build() {
            return new UnbindTemplateResponse(this);
        } 

    } 

}
