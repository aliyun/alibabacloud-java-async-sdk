// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceTwoFactorResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceTwoFactorResponse</p>
 */
public class GetInstanceTwoFactorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceTwoFactorResponseBody body;

    private GetInstanceTwoFactorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceTwoFactorResponse create() {
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
    public GetInstanceTwoFactorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceTwoFactorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceTwoFactorResponseBody body);

        @Override
        GetInstanceTwoFactorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceTwoFactorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceTwoFactorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceTwoFactorResponse response) {
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
        public Builder body(GetInstanceTwoFactorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceTwoFactorResponse build() {
            return new GetInstanceTwoFactorResponse(this);
        } 

    } 

}
