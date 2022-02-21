// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEngineNamepaceResponse} extends {@link TeaModel}
 *
 * <p>GetEngineNamepaceResponse</p>
 */
public class GetEngineNamepaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEngineNamepaceResponseBody body;

    private GetEngineNamepaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEngineNamepaceResponse create() {
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
    public GetEngineNamepaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEngineNamepaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEngineNamepaceResponseBody body);

        @Override
        GetEngineNamepaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEngineNamepaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEngineNamepaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEngineNamepaceResponse response) {
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
        public Builder body(GetEngineNamepaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEngineNamepaceResponse build() {
            return new GetEngineNamepaceResponse(this);
        } 

    } 

}
