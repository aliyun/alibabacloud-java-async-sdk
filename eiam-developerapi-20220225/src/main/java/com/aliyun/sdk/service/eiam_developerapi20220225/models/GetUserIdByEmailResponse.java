// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByEmailResponse} extends {@link TeaModel}
 *
 * <p>GetUserIdByEmailResponse</p>
 */
public class GetUserIdByEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserIdByEmailResponseBody body;

    private GetUserIdByEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserIdByEmailResponse create() {
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
    public GetUserIdByEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserIdByEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserIdByEmailResponseBody body);

        @Override
        GetUserIdByEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserIdByEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserIdByEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserIdByEmailResponse response) {
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
        public Builder body(GetUserIdByEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserIdByEmailResponse build() {
            return new GetUserIdByEmailResponse(this);
        } 

    } 

}
