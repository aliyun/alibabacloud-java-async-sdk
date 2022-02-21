// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetAppTemplateResponse</p>
 */
public class GetAppTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppTemplateResponseBody body;

    private GetAppTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppTemplateResponse create() {
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
    public GetAppTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppTemplateResponseBody body);

        @Override
        GetAppTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppTemplateResponse response) {
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
        public Builder body(GetAppTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppTemplateResponse build() {
            return new GetAppTemplateResponse(this);
        } 

    } 

}
