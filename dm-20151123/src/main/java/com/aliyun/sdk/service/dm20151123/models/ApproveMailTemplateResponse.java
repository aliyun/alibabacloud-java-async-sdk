// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveMailTemplateResponse} extends {@link TeaModel}
 *
 * <p>ApproveMailTemplateResponse</p>
 */
public class ApproveMailTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApproveMailTemplateResponseBody body;

    private ApproveMailTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApproveMailTemplateResponse create() {
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
    public ApproveMailTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApproveMailTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApproveMailTemplateResponseBody body);

        @Override
        ApproveMailTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApproveMailTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApproveMailTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApproveMailTemplateResponse response) {
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
        public Builder body(ApproveMailTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApproveMailTemplateResponse build() {
            return new ApproveMailTemplateResponse(this);
        } 

    } 

}
