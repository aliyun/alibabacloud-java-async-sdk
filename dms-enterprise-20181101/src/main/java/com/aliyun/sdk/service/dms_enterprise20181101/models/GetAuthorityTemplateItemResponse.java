// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorityTemplateItemResponse} extends {@link TeaModel}
 *
 * <p>GetAuthorityTemplateItemResponse</p>
 */
public class GetAuthorityTemplateItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuthorityTemplateItemResponseBody body;

    private GetAuthorityTemplateItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuthorityTemplateItemResponse create() {
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
    public GetAuthorityTemplateItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuthorityTemplateItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuthorityTemplateItemResponseBody body);

        @Override
        GetAuthorityTemplateItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuthorityTemplateItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuthorityTemplateItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuthorityTemplateItemResponse response) {
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
        public Builder body(GetAuthorityTemplateItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuthorityTemplateItemResponse build() {
            return new GetAuthorityTemplateItemResponse(this);
        } 

    } 

}
