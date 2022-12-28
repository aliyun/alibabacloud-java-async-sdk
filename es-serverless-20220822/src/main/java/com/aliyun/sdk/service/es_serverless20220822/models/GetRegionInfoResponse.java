// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionInfoResponse} extends {@link TeaModel}
 *
 * <p>GetRegionInfoResponse</p>
 */
public class GetRegionInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRegionInfoResponseBody body;

    private GetRegionInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRegionInfoResponse create() {
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
    public GetRegionInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRegionInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRegionInfoResponseBody body);

        @Override
        GetRegionInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRegionInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRegionInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRegionInfoResponse response) {
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
        public Builder body(GetRegionInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRegionInfoResponse build() {
            return new GetRegionInfoResponse(this);
        } 

    } 

}
