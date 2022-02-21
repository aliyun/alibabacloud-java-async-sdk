// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveSmsTemplateResponse} extends {@link TeaModel}
 *
 * <p>ApproveSmsTemplateResponse</p>
 */
public class ApproveSmsTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApproveSmsTemplateResponseBody body;

    private ApproveSmsTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApproveSmsTemplateResponse create() {
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
    public ApproveSmsTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApproveSmsTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApproveSmsTemplateResponseBody body);

        @Override
        ApproveSmsTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApproveSmsTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApproveSmsTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApproveSmsTemplateResponse response) {
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
        public Builder body(ApproveSmsTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApproveSmsTemplateResponse build() {
            return new ApproveSmsTemplateResponse(this);
        } 

    } 

}
