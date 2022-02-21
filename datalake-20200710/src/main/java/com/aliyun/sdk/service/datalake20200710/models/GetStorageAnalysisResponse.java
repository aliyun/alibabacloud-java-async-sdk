// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageAnalysisResponse} extends {@link TeaModel}
 *
 * <p>GetStorageAnalysisResponse</p>
 */
public class GetStorageAnalysisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStorageAnalysisResponseBody body;

    private GetStorageAnalysisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStorageAnalysisResponse create() {
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
    public GetStorageAnalysisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStorageAnalysisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStorageAnalysisResponseBody body);

        @Override
        GetStorageAnalysisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStorageAnalysisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStorageAnalysisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStorageAnalysisResponse response) {
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
        public Builder body(GetStorageAnalysisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStorageAnalysisResponse build() {
            return new GetStorageAnalysisResponse(this);
        } 

    } 

}
