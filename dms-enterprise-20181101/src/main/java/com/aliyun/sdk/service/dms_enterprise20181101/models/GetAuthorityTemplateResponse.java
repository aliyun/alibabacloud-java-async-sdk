// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorityTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetAuthorityTemplateResponse</p>
 */
public class GetAuthorityTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuthorityTemplateResponseBody body;

    private GetAuthorityTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuthorityTemplateResponse create() {
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
    public GetAuthorityTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthorityTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuthorityTemplateResponseBody body);

        @Override
        GetAuthorityTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthorityTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuthorityTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthorityTemplateResponse response) {
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
        public Builder body(GetAuthorityTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthorityTemplateResponse build() {
            return new GetAuthorityTemplateResponse(this);
        } 

    } 

}
