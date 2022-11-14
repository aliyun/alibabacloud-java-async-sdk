// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWeChSearchResponse} extends {@link TeaModel}
 *
 * <p>GetWeChSearchResponse</p>
 */
public class GetWeChSearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWeChSearchResponseBody body;

    private GetWeChSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWeChSearchResponse create() {
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
    public GetWeChSearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWeChSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWeChSearchResponseBody body);

        @Override
        GetWeChSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWeChSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWeChSearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWeChSearchResponse response) {
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
        public Builder body(GetWeChSearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWeChSearchResponse build() {
            return new GetWeChSearchResponse(this);
        } 

    } 

}
