// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdDataResponse} extends {@link TeaModel}
 *
 * <p>GetCrowdDataResponse</p>
 */
public class GetCrowdDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCrowdDataResponseBody body;

    private GetCrowdDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCrowdDataResponse create() {
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
    public GetCrowdDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCrowdDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCrowdDataResponseBody body);

        @Override
        GetCrowdDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCrowdDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCrowdDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCrowdDataResponse response) {
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
        public Builder body(GetCrowdDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCrowdDataResponse build() {
            return new GetCrowdDataResponse(this);
        } 

    } 

}
