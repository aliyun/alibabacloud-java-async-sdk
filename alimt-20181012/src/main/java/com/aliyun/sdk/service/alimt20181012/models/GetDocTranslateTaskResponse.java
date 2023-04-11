// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocTranslateTaskResponse} extends {@link TeaModel}
 *
 * <p>GetDocTranslateTaskResponse</p>
 */
public class GetDocTranslateTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDocTranslateTaskResponseBody body;

    private GetDocTranslateTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDocTranslateTaskResponse create() {
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
    public GetDocTranslateTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDocTranslateTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDocTranslateTaskResponseBody body);

        @Override
        GetDocTranslateTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDocTranslateTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDocTranslateTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDocTranslateTaskResponse response) {
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
        public Builder body(GetDocTranslateTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDocTranslateTaskResponse build() {
            return new GetDocTranslateTaskResponse(this);
        } 

    } 

}
