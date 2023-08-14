// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIdleInstanceCullerResponse} extends {@link TeaModel}
 *
 * <p>GetIdleInstanceCullerResponse</p>
 */
public class GetIdleInstanceCullerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIdleInstanceCullerResponseBody body;

    private GetIdleInstanceCullerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIdleInstanceCullerResponse create() {
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
    public GetIdleInstanceCullerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIdleInstanceCullerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIdleInstanceCullerResponseBody body);

        @Override
        GetIdleInstanceCullerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIdleInstanceCullerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIdleInstanceCullerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIdleInstanceCullerResponse response) {
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
        public Builder body(GetIdleInstanceCullerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIdleInstanceCullerResponse build() {
            return new GetIdleInstanceCullerResponse(this);
        } 

    } 

}
