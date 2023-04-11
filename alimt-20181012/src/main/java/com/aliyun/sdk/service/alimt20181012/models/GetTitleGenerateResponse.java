// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTitleGenerateResponse} extends {@link TeaModel}
 *
 * <p>GetTitleGenerateResponse</p>
 */
public class GetTitleGenerateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTitleGenerateResponseBody body;

    private GetTitleGenerateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTitleGenerateResponse create() {
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
    public GetTitleGenerateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTitleGenerateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTitleGenerateResponseBody body);

        @Override
        GetTitleGenerateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTitleGenerateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTitleGenerateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTitleGenerateResponse response) {
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
        public Builder body(GetTitleGenerateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTitleGenerateResponse build() {
            return new GetTitleGenerateResponse(this);
        } 

    } 

}
