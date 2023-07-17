// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAlertTemplateResponse} extends {@link TeaModel}
 *
 * <p>DisableAlertTemplateResponse</p>
 */
public class DisableAlertTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableAlertTemplateResponseBody body;

    private DisableAlertTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableAlertTemplateResponse create() {
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
    public DisableAlertTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableAlertTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableAlertTemplateResponseBody body);

        @Override
        DisableAlertTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableAlertTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableAlertTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableAlertTemplateResponse response) {
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
        public Builder body(DisableAlertTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableAlertTemplateResponse build() {
            return new DisableAlertTemplateResponse(this);
        } 

    } 

}
