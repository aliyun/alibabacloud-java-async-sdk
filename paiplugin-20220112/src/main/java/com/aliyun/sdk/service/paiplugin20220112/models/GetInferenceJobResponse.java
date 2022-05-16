// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInferenceJobResponse} extends {@link TeaModel}
 *
 * <p>GetInferenceJobResponse</p>
 */
public class GetInferenceJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInferenceJobResponseBody body;

    private GetInferenceJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInferenceJobResponse create() {
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
    public GetInferenceJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInferenceJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInferenceJobResponseBody body);

        @Override
        GetInferenceJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInferenceJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInferenceJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInferenceJobResponse response) {
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
        public Builder body(GetInferenceJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInferenceJobResponse build() {
            return new GetInferenceJobResponse(this);
        } 

    } 

}
