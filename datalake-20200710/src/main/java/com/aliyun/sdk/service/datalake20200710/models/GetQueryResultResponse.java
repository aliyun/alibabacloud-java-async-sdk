// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryResultResponse} extends {@link TeaModel}
 *
 * <p>GetQueryResultResponse</p>
 */
public class GetQueryResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQueryResultResponseBody body;

    private GetQueryResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQueryResultResponse create() {
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
    public GetQueryResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQueryResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQueryResultResponseBody body);

        @Override
        GetQueryResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQueryResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQueryResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQueryResultResponse response) {
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
        public Builder body(GetQueryResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQueryResultResponse build() {
            return new GetQueryResultResponse(this);
        } 

    } 

}
