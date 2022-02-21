// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionCodeResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionCodeResponse</p>
 */
public class GetFunctionCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionCodeResponseBody body;

    private GetFunctionCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFunctionCodeResponse create() {
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
    public GetFunctionCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFunctionCodeResponseBody body);

        @Override
        GetFunctionCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionCodeResponse response) {
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
        public Builder body(GetFunctionCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionCodeResponse build() {
            return new GetFunctionCodeResponse(this);
        } 

    } 

}
