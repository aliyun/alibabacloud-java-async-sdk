// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConversationDetailResponse} extends {@link TeaModel}
 *
 * <p>GetConversationDetailResponse</p>
 */
public class GetConversationDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConversationDetailResponseBody body;

    private GetConversationDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConversationDetailResponse create() {
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
    public GetConversationDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConversationDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConversationDetailResponseBody body);

        @Override
        GetConversationDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConversationDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConversationDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConversationDetailResponse response) {
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
        public Builder body(GetConversationDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConversationDetailResponse build() {
            return new GetConversationDetailResponse(this);
        } 

    } 

}
