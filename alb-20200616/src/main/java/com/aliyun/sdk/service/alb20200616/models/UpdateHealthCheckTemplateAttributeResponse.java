// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHealthCheckTemplateAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateHealthCheckTemplateAttributeResponse</p>
 */
public class UpdateHealthCheckTemplateAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHealthCheckTemplateAttributeResponseBody body;

    private UpdateHealthCheckTemplateAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHealthCheckTemplateAttributeResponse create() {
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
    public UpdateHealthCheckTemplateAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHealthCheckTemplateAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHealthCheckTemplateAttributeResponseBody body);

        @Override
        UpdateHealthCheckTemplateAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHealthCheckTemplateAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHealthCheckTemplateAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHealthCheckTemplateAttributeResponse response) {
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
        public Builder body(UpdateHealthCheckTemplateAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHealthCheckTemplateAttributeResponse build() {
            return new UpdateHealthCheckTemplateAttributeResponse(this);
        } 

    } 

}
