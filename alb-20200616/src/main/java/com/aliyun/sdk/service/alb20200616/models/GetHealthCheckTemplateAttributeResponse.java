// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHealthCheckTemplateAttributeResponse} extends {@link TeaModel}
 *
 * <p>GetHealthCheckTemplateAttributeResponse</p>
 */
public class GetHealthCheckTemplateAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHealthCheckTemplateAttributeResponseBody body;

    private GetHealthCheckTemplateAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHealthCheckTemplateAttributeResponse create() {
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
    public GetHealthCheckTemplateAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHealthCheckTemplateAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHealthCheckTemplateAttributeResponseBody body);

        @Override
        GetHealthCheckTemplateAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHealthCheckTemplateAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHealthCheckTemplateAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHealthCheckTemplateAttributeResponse response) {
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
        public Builder body(GetHealthCheckTemplateAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHealthCheckTemplateAttributeResponse build() {
            return new GetHealthCheckTemplateAttributeResponse(this);
        } 

    } 

}
