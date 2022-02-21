// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMseSourceResponse} extends {@link TeaModel}
 *
 * <p>GetMseSourceResponse</p>
 */
public class GetMseSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMseSourceResponseBody body;

    private GetMseSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMseSourceResponse create() {
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
    public GetMseSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMseSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMseSourceResponseBody body);

        @Override
        GetMseSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMseSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMseSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMseSourceResponse response) {
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
        public Builder body(GetMseSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMseSourceResponse build() {
            return new GetMseSourceResponse(this);
        } 

    } 

}
