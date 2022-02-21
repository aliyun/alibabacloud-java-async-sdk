// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConversationDetailByContactIdResponse} extends {@link TeaModel}
 *
 * <p>GetConversationDetailByContactIdResponse</p>
 */
public class GetConversationDetailByContactIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConversationDetailByContactIdResponseBody body;

    private GetConversationDetailByContactIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConversationDetailByContactIdResponse create() {
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
    public GetConversationDetailByContactIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConversationDetailByContactIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConversationDetailByContactIdResponseBody body);

        @Override
        GetConversationDetailByContactIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConversationDetailByContactIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConversationDetailByContactIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConversationDetailByContactIdResponse response) {
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
        public Builder body(GetConversationDetailByContactIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConversationDetailByContactIdResponse build() {
            return new GetConversationDetailByContactIdResponse(this);
        } 

    } 

}
