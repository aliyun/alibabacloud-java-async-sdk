// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTextTo3DAvatarVideoTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitTextTo3DAvatarVideoTaskResponse</p>
 */
public class SubmitTextTo3DAvatarVideoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitTextTo3DAvatarVideoTaskResponseBody body;

    private SubmitTextTo3DAvatarVideoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitTextTo3DAvatarVideoTaskResponse create() {
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
    public SubmitTextTo3DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitTextTo3DAvatarVideoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitTextTo3DAvatarVideoTaskResponseBody body);

        @Override
        SubmitTextTo3DAvatarVideoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitTextTo3DAvatarVideoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitTextTo3DAvatarVideoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitTextTo3DAvatarVideoTaskResponse response) {
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
        public Builder body(SubmitTextTo3DAvatarVideoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitTextTo3DAvatarVideoTaskResponse build() {
            return new SubmitTextTo3DAvatarVideoTaskResponse(this);
        } 

    } 

}
