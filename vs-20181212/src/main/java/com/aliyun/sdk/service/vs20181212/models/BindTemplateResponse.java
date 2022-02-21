// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindTemplateResponse} extends {@link TeaModel}
 *
 * <p>BindTemplateResponse</p>
 */
public class BindTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindTemplateResponseBody body;

    private BindTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindTemplateResponse create() {
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
    public BindTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindTemplateResponseBody body);

        @Override
        BindTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindTemplateResponse response) {
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
        public Builder body(BindTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindTemplateResponse build() {
            return new BindTemplateResponse(this);
        } 

    } 

}
