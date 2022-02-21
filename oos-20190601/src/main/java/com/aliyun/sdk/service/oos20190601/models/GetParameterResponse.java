// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParameterResponse} extends {@link TeaModel}
 *
 * <p>GetParameterResponse</p>
 */
public class GetParameterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetParameterResponseBody body;

    private GetParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetParameterResponse create() {
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
    public GetParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetParameterResponseBody body);

        @Override
        GetParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetParameterResponse response) {
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
        public Builder body(GetParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetParameterResponse build() {
            return new GetParameterResponse(this);
        } 

    } 

}
