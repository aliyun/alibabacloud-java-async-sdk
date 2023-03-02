// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataResponse} extends {@link TeaModel}
 *
 * <p>GetDataResponse</p>
 */
public class GetDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataResponseBody body;

    private GetDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataResponse create() {
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
    public GetDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataResponseBody body);

        @Override
        GetDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataResponse response) {
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
        public Builder body(GetDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataResponse build() {
            return new GetDataResponse(this);
        } 

    } 

}
