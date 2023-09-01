// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetServiceTemplateResponse</p>
 */
public class GetServiceTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceTemplateResponseBody body;

    private GetServiceTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceTemplateResponse create() {
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
    public GetServiceTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceTemplateResponseBody body);

        @Override
        GetServiceTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceTemplateResponse response) {
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
        public Builder body(GetServiceTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceTemplateResponse build() {
            return new GetServiceTemplateResponse(this);
        } 

    } 

}
