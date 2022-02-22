// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryResponse} extends {@link TeaModel}
 *
 * <p>GetDirectoryResponse</p>
 */
public class GetDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDirectoryResponseBody body;

    private GetDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDirectoryResponse create() {
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
    public GetDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDirectoryResponseBody body);

        @Override
        GetDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDirectoryResponse response) {
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
        public Builder body(GetDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDirectoryResponse build() {
            return new GetDirectoryResponse(this);
        } 

    } 

}
