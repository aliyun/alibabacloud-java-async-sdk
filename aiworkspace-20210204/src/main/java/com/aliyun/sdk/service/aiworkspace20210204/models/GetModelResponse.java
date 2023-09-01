// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelResponse} extends {@link TeaModel}
 *
 * <p>GetModelResponse</p>
 */
public class GetModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModelResponseBody body;

    private GetModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModelResponse create() {
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
    public GetModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModelResponseBody body);

        @Override
        GetModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModelResponse response) {
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
        public Builder body(GetModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModelResponse build() {
            return new GetModelResponse(this);
        } 

    } 

}
