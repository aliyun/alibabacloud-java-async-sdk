// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterRunTimeInfoResponse} extends {@link TeaModel}
 *
 * <p>GetClusterRunTimeInfoResponse</p>
 */
public class GetClusterRunTimeInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterRunTimeInfoResponseBody body;

    private GetClusterRunTimeInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterRunTimeInfoResponse create() {
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
    public GetClusterRunTimeInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterRunTimeInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterRunTimeInfoResponseBody body);

        @Override
        GetClusterRunTimeInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterRunTimeInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterRunTimeInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterRunTimeInfoResponse response) {
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
        public Builder body(GetClusterRunTimeInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterRunTimeInfoResponse build() {
            return new GetClusterRunTimeInfoResponse(this);
        } 

    } 

}
