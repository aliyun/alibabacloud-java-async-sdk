// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserApplicationsResponse} extends {@link TeaModel}
 *
 * <p>GetUserApplicationsResponse</p>
 */
public class GetUserApplicationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserApplicationsResponseBody body;

    private GetUserApplicationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserApplicationsResponse create() {
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
    public GetUserApplicationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserApplicationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserApplicationsResponseBody body);

        @Override
        GetUserApplicationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserApplicationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserApplicationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserApplicationsResponse response) {
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
        public Builder body(GetUserApplicationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserApplicationsResponse build() {
            return new GetUserApplicationsResponse(this);
        } 

    } 

}
