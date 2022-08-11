// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExtensionResponse} extends {@link TeaModel}
 *
 * <p>GetExtensionResponse</p>
 */
public class GetExtensionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExtensionResponseBody body;

    private GetExtensionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExtensionResponse create() {
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
    public GetExtensionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExtensionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExtensionResponseBody body);

        @Override
        GetExtensionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExtensionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExtensionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExtensionResponse response) {
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
        public Builder body(GetExtensionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExtensionResponse build() {
            return new GetExtensionResponse(this);
        } 

    } 

}
