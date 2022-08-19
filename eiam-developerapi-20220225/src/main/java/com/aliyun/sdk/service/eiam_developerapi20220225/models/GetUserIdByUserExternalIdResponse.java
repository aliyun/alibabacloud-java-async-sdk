// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByUserExternalIdResponse} extends {@link TeaModel}
 *
 * <p>GetUserIdByUserExternalIdResponse</p>
 */
public class GetUserIdByUserExternalIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserIdByUserExternalIdResponseBody body;

    private GetUserIdByUserExternalIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserIdByUserExternalIdResponse create() {
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
    public GetUserIdByUserExternalIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserIdByUserExternalIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserIdByUserExternalIdResponseBody body);

        @Override
        GetUserIdByUserExternalIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserIdByUserExternalIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserIdByUserExternalIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserIdByUserExternalIdResponse response) {
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
        public Builder body(GetUserIdByUserExternalIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserIdByUserExternalIdResponse build() {
            return new GetUserIdByUserExternalIdResponse(this);
        } 

    } 

}
