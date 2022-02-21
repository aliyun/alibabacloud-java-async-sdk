// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKubernetesSourceResponse} extends {@link TeaModel}
 *
 * <p>GetKubernetesSourceResponse</p>
 */
public class GetKubernetesSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetKubernetesSourceResponseBody body;

    private GetKubernetesSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetKubernetesSourceResponse create() {
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
    public GetKubernetesSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetKubernetesSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetKubernetesSourceResponseBody body);

        @Override
        GetKubernetesSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetKubernetesSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetKubernetesSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetKubernetesSourceResponse response) {
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
        public Builder body(GetKubernetesSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetKubernetesSourceResponse build() {
            return new GetKubernetesSourceResponse(this);
        } 

    } 

}
