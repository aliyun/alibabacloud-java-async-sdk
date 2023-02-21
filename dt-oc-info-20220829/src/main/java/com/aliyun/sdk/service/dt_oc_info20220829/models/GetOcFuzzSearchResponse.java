// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcFuzzSearchResponse} extends {@link TeaModel}
 *
 * <p>GetOcFuzzSearchResponse</p>
 */
public class GetOcFuzzSearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcFuzzSearchResponseBody body;

    private GetOcFuzzSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcFuzzSearchResponse create() {
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
    public GetOcFuzzSearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcFuzzSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcFuzzSearchResponseBody body);

        @Override
        GetOcFuzzSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcFuzzSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcFuzzSearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcFuzzSearchResponse response) {
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
        public Builder body(GetOcFuzzSearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcFuzzSearchResponse build() {
            return new GetOcFuzzSearchResponse(this);
        } 

    } 

}
