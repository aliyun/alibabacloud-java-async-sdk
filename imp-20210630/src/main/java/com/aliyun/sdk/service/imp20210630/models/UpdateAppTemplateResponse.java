// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppTemplateResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppTemplateResponse</p>
 */
public class UpdateAppTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppTemplateResponseBody body;

    private UpdateAppTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppTemplateResponse create() {
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
    public UpdateAppTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppTemplateResponseBody body);

        @Override
        UpdateAppTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppTemplateResponse response) {
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
        public Builder body(UpdateAppTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppTemplateResponse build() {
            return new UpdateAppTemplateResponse(this);
        } 

    } 

}
