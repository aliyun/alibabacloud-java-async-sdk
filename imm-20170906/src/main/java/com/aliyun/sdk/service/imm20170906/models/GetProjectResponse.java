// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectResponse} extends {@link TeaModel}
 *
 * <p>GetProjectResponse</p>
 */
public class GetProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProjectResponseBody body;

    private GetProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProjectResponse create() {
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
    public GetProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProjectResponseBody body);

        @Override
        GetProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProjectResponse response) {
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
        public Builder body(GetProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProjectResponse build() {
            return new GetProjectResponse(this);
        } 

    } 

}
