// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpMetadataResponse} extends {@link TeaModel}
 *
 * <p>GetSpMetadataResponse</p>
 */
public class GetSpMetadataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSpMetadataResponseBody body;

    private GetSpMetadataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSpMetadataResponse create() {
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
    public GetSpMetadataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSpMetadataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSpMetadataResponseBody body);

        @Override
        GetSpMetadataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSpMetadataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSpMetadataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSpMetadataResponse response) {
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
        public Builder body(GetSpMetadataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSpMetadataResponse build() {
            return new GetSpMetadataResponse(this);
        } 

    } 

}
