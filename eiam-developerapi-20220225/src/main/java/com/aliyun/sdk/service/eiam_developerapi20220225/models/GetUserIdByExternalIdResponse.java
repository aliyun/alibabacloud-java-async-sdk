// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByExternalIdResponse} extends {@link TeaModel}
 *
 * <p>GetUserIdByExternalIdResponse</p>
 */
public class GetUserIdByExternalIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserIdByExternalIdResponseBody body;

    private GetUserIdByExternalIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserIdByExternalIdResponse create() {
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
    public GetUserIdByExternalIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserIdByExternalIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserIdByExternalIdResponseBody body);

        @Override
        GetUserIdByExternalIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserIdByExternalIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserIdByExternalIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserIdByExternalIdResponse response) {
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
        public Builder body(GetUserIdByExternalIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserIdByExternalIdResponse build() {
            return new GetUserIdByExternalIdResponse(this);
        } 

    } 

}
