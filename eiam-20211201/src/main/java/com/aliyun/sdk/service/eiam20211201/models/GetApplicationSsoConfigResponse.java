// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationSsoConfigResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationSsoConfigResponse</p>
 */
public class GetApplicationSsoConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApplicationSsoConfigResponseBody body;

    private GetApplicationSsoConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApplicationSsoConfigResponse create() {
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
    public GetApplicationSsoConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationSsoConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApplicationSsoConfigResponseBody body);

        @Override
        GetApplicationSsoConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationSsoConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApplicationSsoConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationSsoConfigResponse response) {
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
        public Builder body(GetApplicationSsoConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationSsoConfigResponse build() {
            return new GetApplicationSsoConfigResponse(this);
        } 

    } 

}
