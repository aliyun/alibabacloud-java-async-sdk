// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPackageResponse} extends {@link TeaModel}
 *
 * <p>GetPackageResponse</p>
 */
public class GetPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPackageResponseBody body;

    private GetPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPackageResponse create() {
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
    public GetPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPackageResponseBody body);

        @Override
        GetPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPackageResponse response) {
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
        public Builder body(GetPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPackageResponse build() {
            return new GetPackageResponse(this);
        } 

    } 

}
