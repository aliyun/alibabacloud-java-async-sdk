// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRandomPasswordResponse} extends {@link TeaModel}
 *
 * <p>GetRandomPasswordResponse</p>
 */
public class GetRandomPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRandomPasswordResponseBody body;

    private GetRandomPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRandomPasswordResponse create() {
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
    public GetRandomPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRandomPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRandomPasswordResponseBody body);

        @Override
        GetRandomPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRandomPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRandomPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRandomPasswordResponse response) {
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
        public Builder body(GetRandomPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRandomPasswordResponse build() {
            return new GetRandomPasswordResponse(this);
        } 

    } 

}
