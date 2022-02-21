// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSupportedResourceTypesResponse} extends {@link TeaModel}
 *
 * <p>GetSupportedResourceTypesResponse</p>
 */
public class GetSupportedResourceTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSupportedResourceTypesResponseBody body;

    private GetSupportedResourceTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSupportedResourceTypesResponse create() {
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
    public GetSupportedResourceTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSupportedResourceTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSupportedResourceTypesResponseBody body);

        @Override
        GetSupportedResourceTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSupportedResourceTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSupportedResourceTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSupportedResourceTypesResponse response) {
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
        public Builder body(GetSupportedResourceTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSupportedResourceTypesResponse build() {
            return new GetSupportedResourceTypesResponse(this);
        } 

    } 

}
