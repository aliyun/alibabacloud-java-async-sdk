// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappTemplateDetailResponse} extends {@link TeaModel}
 *
 * <p>GetChatappTemplateDetailResponse</p>
 */
public class GetChatappTemplateDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChatappTemplateDetailResponseBody body;

    private GetChatappTemplateDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChatappTemplateDetailResponse create() {
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
    public GetChatappTemplateDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChatappTemplateDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChatappTemplateDetailResponseBody body);

        @Override
        GetChatappTemplateDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChatappTemplateDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChatappTemplateDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChatappTemplateDetailResponse response) {
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
        public Builder body(GetChatappTemplateDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChatappTemplateDetailResponse build() {
            return new GetChatappTemplateDetailResponse(this);
        } 

    } 

}
