// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUatSpecCtDataResponse} extends {@link TeaModel}
 *
 * <p>GetUatSpecCtDataResponse</p>
 */
public class GetUatSpecCtDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUatSpecCtDataResponseBody body;

    private GetUatSpecCtDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUatSpecCtDataResponse create() {
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
    public GetUatSpecCtDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUatSpecCtDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUatSpecCtDataResponseBody body);

        @Override
        GetUatSpecCtDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUatSpecCtDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUatSpecCtDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUatSpecCtDataResponse response) {
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
        public Builder body(GetUatSpecCtDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUatSpecCtDataResponse build() {
            return new GetUatSpecCtDataResponse(this);
        } 

    } 

}
