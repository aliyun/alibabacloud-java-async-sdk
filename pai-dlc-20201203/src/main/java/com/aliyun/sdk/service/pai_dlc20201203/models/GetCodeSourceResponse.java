// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCodeSourceResponse} extends {@link TeaModel}
 *
 * <p>GetCodeSourceResponse</p>
 */
public class GetCodeSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCodeSourceResponseBody body;

    private GetCodeSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCodeSourceResponse create() {
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
    public GetCodeSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCodeSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCodeSourceResponseBody body);

        @Override
        GetCodeSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCodeSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCodeSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCodeSourceResponse response) {
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
        public Builder body(GetCodeSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCodeSourceResponse build() {
            return new GetCodeSourceResponse(this);
        } 

    } 

}
