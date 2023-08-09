// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkReachableAnalysisResponse} extends {@link TeaModel}
 *
 * <p>DeleteNetworkReachableAnalysisResponse</p>
 */
public class DeleteNetworkReachableAnalysisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNetworkReachableAnalysisResponseBody body;

    private DeleteNetworkReachableAnalysisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNetworkReachableAnalysisResponse create() {
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
    public DeleteNetworkReachableAnalysisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNetworkReachableAnalysisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNetworkReachableAnalysisResponseBody body);

        @Override
        DeleteNetworkReachableAnalysisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNetworkReachableAnalysisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNetworkReachableAnalysisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNetworkReachableAnalysisResponse response) {
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
        public Builder body(DeleteNetworkReachableAnalysisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNetworkReachableAnalysisResponse build() {
            return new DeleteNetworkReachableAnalysisResponse(this);
        } 

    } 

}
