// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationVerifyCodeResponse} extends {@link TeaModel}
 *
 * <p>GetMigrationVerifyCodeResponse</p>
 */
public class GetMigrationVerifyCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMigrationVerifyCodeResponseBody body;

    private GetMigrationVerifyCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMigrationVerifyCodeResponse create() {
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
    public GetMigrationVerifyCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMigrationVerifyCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMigrationVerifyCodeResponseBody body);

        @Override
        GetMigrationVerifyCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMigrationVerifyCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMigrationVerifyCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMigrationVerifyCodeResponse response) {
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
        public Builder body(GetMigrationVerifyCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMigrationVerifyCodeResponse build() {
            return new GetMigrationVerifyCodeResponse(this);
        } 

    } 

}
