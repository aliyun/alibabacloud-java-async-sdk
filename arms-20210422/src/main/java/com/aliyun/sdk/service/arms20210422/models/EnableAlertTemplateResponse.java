// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAlertTemplateResponse} extends {@link TeaModel}
 *
 * <p>EnableAlertTemplateResponse</p>
 */
public class EnableAlertTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableAlertTemplateResponseBody body;

    private EnableAlertTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableAlertTemplateResponse create() {
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
    public EnableAlertTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableAlertTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableAlertTemplateResponseBody body);

        @Override
        EnableAlertTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableAlertTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableAlertTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableAlertTemplateResponse response) {
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
        public Builder body(EnableAlertTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableAlertTemplateResponse build() {
            return new EnableAlertTemplateResponse(this);
        } 

    } 

}
