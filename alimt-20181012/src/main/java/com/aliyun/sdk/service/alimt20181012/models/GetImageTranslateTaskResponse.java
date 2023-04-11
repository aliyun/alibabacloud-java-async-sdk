// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageTranslateTaskResponse} extends {@link TeaModel}
 *
 * <p>GetImageTranslateTaskResponse</p>
 */
public class GetImageTranslateTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImageTranslateTaskResponseBody body;

    private GetImageTranslateTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImageTranslateTaskResponse create() {
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
    public GetImageTranslateTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageTranslateTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImageTranslateTaskResponseBody body);

        @Override
        GetImageTranslateTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageTranslateTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImageTranslateTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageTranslateTaskResponse response) {
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
        public Builder body(GetImageTranslateTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageTranslateTaskResponse build() {
            return new GetImageTranslateTaskResponse(this);
        } 

    } 

}
