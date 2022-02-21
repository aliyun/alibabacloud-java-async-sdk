// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImpProductStatusResponse} extends {@link TeaModel}
 *
 * <p>GetImpProductStatusResponse</p>
 */
public class GetImpProductStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImpProductStatusResponseBody body;

    private GetImpProductStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImpProductStatusResponse create() {
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
    public GetImpProductStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImpProductStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImpProductStatusResponseBody body);

        @Override
        GetImpProductStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImpProductStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImpProductStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImpProductStatusResponse response) {
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
        public Builder body(GetImpProductStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImpProductStatusResponse build() {
            return new GetImpProductStatusResponse(this);
        } 

    } 

}
