// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllPlatformTypesResponse} extends {@link TeaModel}
 *
 * <p>GetAllPlatformTypesResponse</p>
 */
public class GetAllPlatformTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAllPlatformTypesResponseBody body;

    private GetAllPlatformTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAllPlatformTypesResponse create() {
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
    public GetAllPlatformTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAllPlatformTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAllPlatformTypesResponseBody body);

        @Override
        GetAllPlatformTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAllPlatformTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAllPlatformTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAllPlatformTypesResponse response) {
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
        public Builder body(GetAllPlatformTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAllPlatformTypesResponse build() {
            return new GetAllPlatformTypesResponse(this);
        } 

    } 

}
