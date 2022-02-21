// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScoreInfoResponse} extends {@link TeaModel}
 *
 * <p>GetScoreInfoResponse</p>
 */
public class GetScoreInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetScoreInfoResponseBody body;

    private GetScoreInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetScoreInfoResponse create() {
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
    public GetScoreInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetScoreInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetScoreInfoResponseBody body);

        @Override
        GetScoreInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetScoreInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetScoreInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetScoreInfoResponse response) {
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
        public Builder body(GetScoreInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetScoreInfoResponse build() {
            return new GetScoreInfoResponse(this);
        } 

    } 

}
