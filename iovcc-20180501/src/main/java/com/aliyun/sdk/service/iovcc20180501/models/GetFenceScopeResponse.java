// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFenceScopeResponse} extends {@link TeaModel}
 *
 * <p>GetFenceScopeResponse</p>
 */
public class GetFenceScopeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFenceScopeResponseBody body;

    private GetFenceScopeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFenceScopeResponse create() {
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
    public GetFenceScopeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFenceScopeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFenceScopeResponseBody body);

        @Override
        GetFenceScopeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFenceScopeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFenceScopeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFenceScopeResponse response) {
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
        public Builder body(GetFenceScopeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFenceScopeResponse build() {
            return new GetFenceScopeResponse(this);
        } 

    } 

}
