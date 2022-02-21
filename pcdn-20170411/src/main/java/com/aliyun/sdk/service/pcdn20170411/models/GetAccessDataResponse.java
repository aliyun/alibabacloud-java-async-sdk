// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessDataResponse} extends {@link TeaModel}
 *
 * <p>GetAccessDataResponse</p>
 */
public class GetAccessDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccessDataResponseBody body;

    private GetAccessDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccessDataResponse create() {
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
    public GetAccessDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccessDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccessDataResponseBody body);

        @Override
        GetAccessDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccessDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccessDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccessDataResponse response) {
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
        public Builder body(GetAccessDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccessDataResponse build() {
            return new GetAccessDataResponse(this);
        } 

    } 

}
