// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetCustomTemplateResponse</p>
 */
public class GetCustomTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCustomTemplateResponseBody body;

    private GetCustomTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCustomTemplateResponse create() {
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
    public GetCustomTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCustomTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCustomTemplateResponseBody body);

        @Override
        GetCustomTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCustomTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCustomTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCustomTemplateResponse response) {
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
        public Builder body(GetCustomTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCustomTemplateResponse build() {
            return new GetCustomTemplateResponse(this);
        } 

    } 

}
