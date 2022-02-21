// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnDataResponse} extends {@link TeaModel}
 *
 * <p>GetConnDataResponse</p>
 */
public class GetConnDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConnDataResponseBody body;

    private GetConnDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConnDataResponse create() {
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
    public GetConnDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConnDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConnDataResponseBody body);

        @Override
        GetConnDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConnDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConnDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConnDataResponse response) {
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
        public Builder body(GetConnDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConnDataResponse build() {
            return new GetConnDataResponse(this);
        } 

    } 

}
