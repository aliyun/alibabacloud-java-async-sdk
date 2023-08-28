// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeployGraphResponse} extends {@link TeaModel}
 *
 * <p>GetDeployGraphResponse</p>
 */
public class GetDeployGraphResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeployGraphResponseBody body;

    private GetDeployGraphResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeployGraphResponse create() {
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
    public GetDeployGraphResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeployGraphResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeployGraphResponseBody body);

        @Override
        GetDeployGraphResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeployGraphResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeployGraphResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeployGraphResponse response) {
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
        public Builder body(GetDeployGraphResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeployGraphResponse build() {
            return new GetDeployGraphResponse(this);
        } 

    } 

}
