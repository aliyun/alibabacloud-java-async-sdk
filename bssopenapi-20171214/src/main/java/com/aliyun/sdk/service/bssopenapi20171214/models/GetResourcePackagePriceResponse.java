// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcePackagePriceResponse} extends {@link TeaModel}
 *
 * <p>GetResourcePackagePriceResponse</p>
 */
public class GetResourcePackagePriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourcePackagePriceResponseBody body;

    private GetResourcePackagePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourcePackagePriceResponse create() {
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
    public GetResourcePackagePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourcePackagePriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourcePackagePriceResponseBody body);

        @Override
        GetResourcePackagePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourcePackagePriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourcePackagePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourcePackagePriceResponse response) {
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
        public Builder body(GetResourcePackagePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourcePackagePriceResponse build() {
            return new GetResourcePackagePriceResponse(this);
        } 

    } 

}
