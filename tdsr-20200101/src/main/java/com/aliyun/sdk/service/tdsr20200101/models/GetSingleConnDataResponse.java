// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSingleConnDataResponse} extends {@link TeaModel}
 *
 * <p>GetSingleConnDataResponse</p>
 */
public class GetSingleConnDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSingleConnDataResponseBody body;

    private GetSingleConnDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSingleConnDataResponse create() {
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
    public GetSingleConnDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSingleConnDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSingleConnDataResponseBody body);

        @Override
        GetSingleConnDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSingleConnDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSingleConnDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSingleConnDataResponse response) {
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
        public Builder body(GetSingleConnDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSingleConnDataResponse build() {
            return new GetSingleConnDataResponse(this);
        } 

    } 

}
